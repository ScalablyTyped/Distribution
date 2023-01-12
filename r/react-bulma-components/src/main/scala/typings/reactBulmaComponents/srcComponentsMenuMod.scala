package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import typings.reactBulmaComponents.reactBulmaComponentsStrings.aside
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsMenuMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/menu", JSImport.Default)
  @js.native
  val default: (BulmaComponent[js.Object, aside]) & typings.reactBulmaComponents.anon.List = js.native
  
  trait MenuListComponentProps extends StObject {
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object MenuListComponentProps {
    
    inline def apply(): MenuListComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuListComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuListComponentProps] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait MenuListItemProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object MenuListItemProps {
    
    inline def apply(): MenuListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuListItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuListItemProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[js.Object, aside]) & typings.reactBulmaComponents.anon.List
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsMenuMod.foo` */
  override def _to: (BulmaComponent[js.Object, aside]) & typings.reactBulmaComponents.anon.List = default
}
