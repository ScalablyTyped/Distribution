package typings.prettyBytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Format the number using the [Binary Prefix](https://en.wikipedia.org/wiki/Binary_prefix) instead of the [SI Prefix](https://en.wikipedia.org/wiki/SI_Prefix). This can be useful for presenting memory amounts. However, this should not be used for presenting file sizes.
  		@default false
  		```
  		import prettyBytes = require('pretty-bytes');
  		prettyBytes(1000, {binary: true});
  		//=> '1000 bit'
  		prettyBytes(1024, {binary: true});
  		//=> '1 kiB'
  		```
  		*/
  val binary: js.UndefOr[Boolean] = js.native
  
  /**
  		Format the number as [bits](https://en.wikipedia.org/wiki/Bit) instead of [bytes](https://en.wikipedia.org/wiki/Byte). This can be useful when, for example, referring to [bit rate](https://en.wikipedia.org/wiki/Bit_rate).
  		@default false
  		```
  		import prettyBytes = require('pretty-bytes');
  		prettyBytes(1337, {bits: true});
  		//=> '1.34 kbit'
  		```
  		*/
  val bits: js.UndefOr[Boolean] = js.native
  
  /**
  		- If `false`: Output won't be localized.
  		- If `true`: Localize the output using the system/browser locale.
  		- If `string`: Expects a [BCP 47 language tag](https://en.wikipedia.org/wiki/IETF_language_tag) (For example: `en`, `de`, …)
  		__Note:__ Localization should generally work in browsers. Node.js needs to be [built](https://github.com/nodejs/node/wiki/Intl) with `full-icu` or `system-icu`. Alternatively, the [`full-icu`](https://github.com/unicode-org/full-icu-npm) module can be used to provide support at runtime.
  		@default false
  		*/
  val locale: js.UndefOr[Boolean | String] = js.native
  
  /**
  		Include plus sign for positive numbers. If the difference is exactly zero a space character will be prepended instead for better alignment.
  		@default false
  		*/
  val signed: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setBits(value: Boolean): Self = this.set("bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBits: Self = this.set("bits", js.undefined)
    
    @scala.inline
    def setLocale(value: Boolean | String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
}
