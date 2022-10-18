package typings.rcMenu

import typings.rcMenu.esInterfaceMod.RenderIconInfo
import typings.rcMenu.esInterfaceMod.RenderIconType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esIconMod {
  
  @JSImport("rc-menu/es/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasIconPropsChildren: IconProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIconPropsChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait IconProps extends StObject {
    
    /** Fallback of icon if provided */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var icon: js.UndefOr[RenderIconType] = js.undefined
    
    var props: RenderIconInfo
  }
  object IconProps {
    
    inline def apply(props: RenderIconInfo): IconProps = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIcon(value: RenderIconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setProps(value: RenderIconInfo): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
