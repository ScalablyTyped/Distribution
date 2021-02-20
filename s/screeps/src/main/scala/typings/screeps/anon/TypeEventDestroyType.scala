package typings.screeps.anon

import typings.screeps.EventDestroyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeEventDestroyType extends StObject {
  
  var `type`: EventDestroyType = js.native
}
object TypeEventDestroyType {
  
  @scala.inline
  def apply(`type`: EventDestroyType): TypeEventDestroyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEventDestroyType]
  }
  
  @scala.inline
  implicit class TypeEventDestroyTypeMutableBuilder[Self <: TypeEventDestroyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EventDestroyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
