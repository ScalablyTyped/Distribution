package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.distComponentsTypesMod.KnobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDebounce[T /* <: KnobType */] extends StObject {
  
  var disableDebounce: js.UndefOr[Boolean] = js.undefined
  
  var disableForceUpdate: js.UndefOr[Boolean] = js.undefined
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var `type`: T
}
object DisableDebounce {
  
  inline def apply[T /* <: KnobType */](`type`: T): DisableDebounce[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDebounce[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableDebounce[?], T /* <: KnobType */] (val x: Self & DisableDebounce[T]) extends AnyVal {
    
    inline def setDisableDebounce(value: Boolean): Self = StObject.set(x, "disableDebounce", value.asInstanceOf[js.Any])
    
    inline def setDisableDebounceUndefined: Self = StObject.set(x, "disableDebounce", js.undefined)
    
    inline def setDisableForceUpdate(value: Boolean): Self = StObject.set(x, "disableForceUpdate", value.asInstanceOf[js.Any])
    
    inline def setDisableForceUpdateUndefined: Self = StObject.set(x, "disableForceUpdate", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
