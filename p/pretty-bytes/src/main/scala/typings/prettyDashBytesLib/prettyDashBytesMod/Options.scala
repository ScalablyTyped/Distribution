package typings
package prettyDashBytesLib.prettyDashBytesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Format the number as [bits](https://en.wikipedia.org/wiki/Bit) instead of [bytes](https://en.wikipedia.org/wiki/Byte). This can be useful when, for example, referring to [bit rate](https://en.wikipedia.org/wiki/Bit_rate).
  		
  		@default false
  		
  		```
  		import prettyBytes = require('pretty-bytes');
  		prettyBytes(1337, {bits: true});
  		//=> '1.34 kbit'
  		```
  		*/
  val bits: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		- If `false`: Output won't be localized.
  		- If `true`: Localize the output using the system/browser locale.
  		- If `string`: Expects a [BCP 47 language tag](https://en.wikipedia.org/wiki/IETF_language_tag) (For example: `en`, `de`, …)
  		__Note:__ Localization should generally work in browsers. Node.js needs to be [built](https://github.com/nodejs/node/wiki/Intl) with `full-icu` or `system-icu`. Alternatively, the [`full-icu`](https://github.com/unicode-org/full-icu-npm) module can be used to provide support at runtime.
  		@default false
  		*/
  val locale: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
  		Include plus sign for positive numbers. If the difference is exactly zero a space character will be prepended instead for better alignment.
  		@default false
  		*/
  val signed: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bits: js.UndefOr[scala.Boolean] = js.undefined,
    locale: scala.Boolean | java.lang.String = null,
    signed: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bits)) __obj.updateDynamic("bits")(bits)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[Options]
  }
}

