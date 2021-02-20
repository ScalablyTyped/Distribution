package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBackgroundPropType extends StObject {
  
  var `type`: String = js.native
}
object BaseBackgroundPropType {
  
  @scala.inline
  def apply(`type`: String): BaseBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBackgroundPropType]
  }
  
  @scala.inline
  implicit class BaseBackgroundPropTypeMutableBuilder[Self <: BaseBackgroundPropType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
