package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOML2DeprecatedColorProperty extends js.Object {
  
  var color: java.lang.String = js.native
}
object DOML2DeprecatedColorProperty {
  
  @scala.inline
  def apply(color: java.lang.String): DOML2DeprecatedColorProperty = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOML2DeprecatedColorProperty]
  }
  
  @scala.inline
  implicit class DOML2DeprecatedColorPropertyOps[Self <: DOML2DeprecatedColorProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: java.lang.String): Self = this.set("color", value.asInstanceOf[js.Any])
  }
}
