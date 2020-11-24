package typings.sha1.mod

import typings.sha1.sha1Booleans.`false`
import typings.sha1.sha1Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha1AsBytesOptions extends Sha1Options {
  
  var asBytes: `true` = js.native
  
  var asString: js.UndefOr[`false`] = js.native
}
object Sha1AsBytesOptions {
  
  @scala.inline
  def apply(asBytes: `true`): Sha1AsBytesOptions = {
    val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1AsBytesOptions]
  }
  
  @scala.inline
  implicit class Sha1AsBytesOptionsOps[Self <: Sha1AsBytesOptions] (val x: Self) extends AnyVal {
    
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
    def setAsBytes(value: `true`): Self = this.set("asBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsString(value: `false`): Self = this.set("asString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsString: Self = this.set("asString", js.undefined)
  }
}
