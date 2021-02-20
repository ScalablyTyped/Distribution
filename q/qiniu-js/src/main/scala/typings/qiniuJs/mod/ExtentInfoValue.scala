package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtentInfoValue extends StObject {
  
  var `type`: Double = js.native
  
  var `val`: String = js.native
}
object ExtentInfoValue {
  
  @scala.inline
  def apply(`type`: Double, `val`: String): ExtentInfoValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentInfoValue]
  }
  
  @scala.inline
  implicit class ExtentInfoValueMutableBuilder[Self <: ExtentInfoValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
