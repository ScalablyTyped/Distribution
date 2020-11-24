package typings.sindresorhusFnv1a.mod

import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`1024`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`128`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`256`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`32`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`512`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		The bit size of the hash.
  		@default 32
  		*/
  var size: js.UndefOr[`32` | `64` | `128` | `256` | `512` | `1024`] = js.native
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
    def setSize(value: `32` | `64` | `128` | `256` | `512` | `1024`): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
