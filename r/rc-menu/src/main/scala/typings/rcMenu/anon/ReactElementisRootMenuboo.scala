package typings.rcMenu.anon

import typings.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ReactElement & {  isRootMenu :boolean,   subMenuInstance :react.react.ReactInstance} */
@js.native
trait ReactElementisRootMenuboo extends StObject {
  
  var isRootMenu: Boolean = js.native
  
  var key: typings.react.mod.Key | Null = js.native
  
  var props: js.Any = js.native
  
  var subMenuInstance: ReactInstance = js.native
  
  var `type`: js.Any = js.native
}
object ReactElementisRootMenuboo {
  
  @scala.inline
  def apply(isRootMenu: Boolean, props: js.Any, subMenuInstance: ReactInstance, `type`: js.Any): ReactElementisRootMenuboo = {
    val __obj = js.Dynamic.literal(isRootMenu = isRootMenu.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], subMenuInstance = subMenuInstance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElementisRootMenuboo]
  }
  
  @scala.inline
  implicit class ReactElementisRootMenubooMutableBuilder[Self <: ReactElementisRootMenuboo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRootMenu(value: Boolean): Self = StObject.set(x, "isRootMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuInstance(value: ReactInstance): Self = StObject.set(x, "subMenuInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
