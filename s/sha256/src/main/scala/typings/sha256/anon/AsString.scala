package typings.sha256.anon

import typings.sha256.sha256Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsString extends js.Object {
  
  var asString: `true` = js.native
}
object AsString {
  
  @scala.inline
  def apply(asString: `true`): AsString = {
    val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsString]
  }
  
  @scala.inline
  implicit class AsStringOps[Self <: AsString] (val x: Self) extends AnyVal {
    
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
    def setAsString(value: `true`): Self = this.set("asString", value.asInstanceOf[js.Any])
  }
}
