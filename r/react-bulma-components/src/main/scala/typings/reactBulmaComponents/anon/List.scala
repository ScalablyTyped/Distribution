package typings.reactBulmaComponents.anon

import typings.reactBulmaComponents.reactBulmaComponentsStrings.ul
import typings.reactBulmaComponents.srcComponentsMenuMod.MenuListComponentProps
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponentWithoutRenderAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List extends StObject {
  
  var List: (BulmaComponentWithoutRenderAs[MenuListComponentProps, ul]) & `1`
}
object List {
  
  inline def apply(List: (BulmaComponentWithoutRenderAs[MenuListComponentProps, ul]) & `1`): typings.reactBulmaComponents.anon.List = {
    val __obj = js.Dynamic.literal(List = List.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBulmaComponents.anon.List]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typings.reactBulmaComponents.anon.List] (val x: Self) extends AnyVal {
    
    inline def setList(value: (BulmaComponentWithoutRenderAs[MenuListComponentProps, ul]) & `1`): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
  }
}
