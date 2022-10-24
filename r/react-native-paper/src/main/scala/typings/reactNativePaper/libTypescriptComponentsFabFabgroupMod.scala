package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.IconPropscolorstring
import typings.reactNativePaper.anon.LabelStyle
import typings.reactNativePaper.anon.Open
import typings.reactNativePaper.anon.PickPropsstylecoloronPres
import typings.reactNativePaper.anon.`18`
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsFabFabgroupMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/FAB/FABGroup", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstylecoloronPres] & (NonReactStatics[ComponentType[Props] & `18`, js.Object]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/FAB/FABGroup", "FABGroup")
  @js.native
  val FABGroup: ComponentType[PickPropsstylecoloronPres] & (NonReactStatics[ComponentType[Props] & `18`, js.Object]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Accessibility label for the FAB. This is read by the screen reader when the user taps the FAB.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Action items to display in the form of a speed dial.
      * An action item should contain the following properties:
      * - `icon`: icon to display (required)
      * - `label`: optional label text
      * - `accessibilityLabel`: accessibility label for the action, uses label by default if specified
      * - `color`: custom icon color of the action item
      * - `labelTextColor`: custom label text color of the action item
      * - `style`: pass additional styles for the fab item, for example, `backgroundColor`
      * - `labelStyle`: pass additional styles for the fab item label, for example, `backgroundColor`
      * - `small`: boolean describing whether small or normal sized FAB is rendered. Defaults to `true`
      * - `onPress`: callback that is called when `FAB` is pressed (required)
      */
    var actions: js.Array[LabelStyle]
    
    /**
      * Custom backdrop color for opened speed dial background.
      */
    var backdropColor: js.UndefOr[String] = js.undefined
    
    /**
      * Custom color for the `FAB`.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Style for the FAB. It allows to pass the FAB button styles, such as backgroundColor.
      */
    var fabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Icon to display for the `FAB`.
      * You can toggle it based on whether the speed dial is open to display a different icon.
      */
    var icon: IconSource
    
    /**
      * Function to execute on pressing the `FAB`.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback which is called on opening and closing the speed dial.
      * The open state needs to be updated when it's called, otherwise the change is dropped.
      */
    def onStateChange(state: Open): Unit
    
    /**
      * Whether the speed dial is open.
      */
    var open: Boolean
    
    /**
      * Style for the group. You can use it to pass additional styles if you need.
      * For example, you can set an additional padding if you have a tab bar at the bottom.
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Pass down testID from Group props to FAB.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Whether `FAB` is currently visible.
      */
    var visible: Boolean
  }
  object Props {
    
    inline def apply(
      actions: js.Array[LabelStyle],
      icon: IconSource,
      onStateChange: Open => Unit,
      open: Boolean,
      theme: Theme,
      visible: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onStateChange = js.Any.fromFunction1(onStateChange), open = open.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setActions(value: js.Array[LabelStyle]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: LabelStyle*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      inline def setBackdropColorUndefined: Self = StObject.set(x, "backdropColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "fabStyle", value.asInstanceOf[js.Any])
      
      inline def setFabStyleNull: Self = StObject.set(x, "fabStyle", null)
      
      inline def setFabStyleUndefined: Self = StObject.set(x, "fabStyle", js.undefined)
      
      inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOnStateChange(value: Open => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropsstylecoloronPres] & (NonReactStatics[ComponentType[Props] & `18`, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsFabFabgroupMod.foo` */
  override def _to: ComponentType[PickPropsstylecoloronPres] & (NonReactStatics[ComponentType[Props] & `18`, js.Object]) = default
}
