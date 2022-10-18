package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNativePaper.anon.PickPropschildrenthemeDee
import typings.reactNativePaper.anon.TypeofPortal
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsPortalPortalMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/Portal", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropschildrenthemeDee] & (NonReactStatics[ComponentType[Props] & TypeofPortal & Instantiable0[Portal], js.Object]) = js.native
  
  /**
    * Portal allows to render a component at a different place in the parent tree.
    * You can use it to render content which should appear above other elements, similar to `Modal`.
    * It requires a [`Portal.Host`](portal-host.html) component to be rendered somewhere in the parent tree.
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Portal, Text } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <Portal>
    *     <Text>This is rendered at a different place</Text>
    *   </Portal>
    * );
    *
    * export default MyComponent;
    * ```
    */
  @js.native
  trait Portal
    extends Component[Props, js.Object, Any]
  object Portal {
    
    /* was `typeof PortalHost` */
    type Host = typings.reactNativePaper.libTypescriptComponentsPortalPortalHostMod.default
  }
  
  trait Props extends StObject {
    
    /**
      * Content of the `Portal`.
      */
    var children: ReactNode
    
    /**
      * @optional
      */
    var theme: Theme
  }
  object Props {
    
    inline def apply(theme: Theme): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropschildrenthemeDee] & (NonReactStatics[ComponentType[Props] & TypeofPortal & Instantiable0[Portal], js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsPortalPortalMod.foo` */
  override def _to: ComponentType[PickPropschildrenthemeDee] & (NonReactStatics[ComponentType[Props] & TypeofPortal & Instantiable0[Portal], js.Object]) = default
}
