package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.PickPropsstylechildrenvis
import typings.reactNativePaper.anon.ScrollArea
import typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Dialog/Dialog", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstylechildrenvis] & (NonReactStatics[ComponentType[Props] & ScrollArea, js.Object]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Content of the `Dialog`.
      */
    var children: ReactNode
    
    /**
      * Determines whether clicking outside the dialog dismiss it.
      */
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that is called when the user dismisses the dialog.
      */
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Determines Whether the dialog is visible.
      */
    var visible: Boolean
  }
  object Props {
    
    inline def apply(theme: Theme, visible: Boolean): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropsstylechildrenvis] & (NonReactStatics[ComponentType[Props] & ScrollArea, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `dialogMod.foo` */
  override def _to: ComponentType[PickPropsstylechildrenvis] & (NonReactStatics[ComponentType[Props] & ScrollArea, js.Object]) = default
}
