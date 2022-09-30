package typings.reactBulmaComponents.anon

import typings.reactBulmaComponents.componentsMod.BulmaComponentWithoutRenderAs
import typings.reactBulmaComponents.menuMod.MenuListComponentProps
import typings.reactBulmaComponents.reactBulmaComponentsStrings.ul
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
  
  extension [Self <: typings.reactBulmaComponents.anon.List](x: Self) {
    
    inline def setList(value: (BulmaComponentWithoutRenderAs[MenuListComponentProps, ul]) & `1`): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
  }
}
