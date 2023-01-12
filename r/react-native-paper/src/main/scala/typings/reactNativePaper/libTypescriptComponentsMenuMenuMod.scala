package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.Animated.ValueXY
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.AnchorLayout
import typings.reactNativePaper.anon.PickPropsstyleanchorchild
import typings.reactNativePaper.anon.TypeofMenu
import typings.reactNativePaper.anon.X
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsMenuMenuMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Menu/Menu", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstyleanchorchild] & (NonReactStatics[ComponentType[Props] & TypeofMenu & Instantiable0[Menu], js.Object]) = js.native
  
  /* Inlined react-native-paper.react-native-paper/lib/typescript/types.$Omit<react-native-paper.react-native-paper/lib/typescript/types.$Omit<react-native.react-native.LayoutRectangle, 'x'>, 'y'> */
  trait Layout extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Layout {
    
    inline def apply(height: Double, width: Double): Layout = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Menus display a list of choices on temporary elevated surfaces. Their placement varies based on the element that opens them.
    *
    *  <div class="screenshots">
    *   <img class="medium" src="screenshots/menu-1.png" />
    *   <img class="medium" src="screenshots/menu-2.png" />
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { View } from 'react-native';
    * import { Button, Menu, Divider, Provider } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [visible, setVisible] = React.useState(false);
    *
    *   const openMenu = () => setVisible(true);
    *
    *   const closeMenu = () => setVisible(false);
    *
    *   return (
    *     <Provider>
    *       <View
    *         style={{
    *           paddingTop: 50,
    *           flexDirection: 'row',
    *           justifyContent: 'center',
    *         }}>
    *         <Menu
    *           visible={visible}
    *           onDismiss={closeMenu}
    *           anchor={<Button onPress={openMenu}>Show menu</Button>}>
    *           <Menu.Item onPress={() => {}} title="Item 1" />
    *           <Menu.Item onPress={() => {}} title="Item 2" />
    *           <Divider />
    *           <Menu.Item onPress={() => {}} title="Item 3" />
    *         </Menu>
    *       </View>
    *     </Provider>
    *   );
    * };
    *
    * export default MyComponent;
    * ```
    */
  @js.native
  trait Menu extends Component[Props, State, Any] {
    
    /* private */ var anchor: Any = js.native
    
    /* private */ var attachListeners: Any = js.native
    
    /* private */ var backHandlerSubscription: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMenu(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MMenu(): Unit = js.native
    
    /* private */ var dimensionsSubscription: Any = js.native
    
    /* private */ var focusFirstDOMNode: Any = js.native
    
    /* private */ var handleDismiss: Any = js.native
    
    /* private */ var handleKeypress: Any = js.native
    
    /* private */ var hide: Any = js.native
    
    /* private */ var isBrowser: Any = js.native
    
    /* private */ var isCoordinate: Any = js.native
    
    /* private */ var measureAnchorLayout: Any = js.native
    
    /* private */ var measureMenuLayout: Any = js.native
    
    /* private */ var menu: Any = js.native
    
    /* private */ var removeListeners: Any = js.native
    
    /* private */ var show: Any = js.native
    
    @JSName("state")
    var state_Menu: AnchorLayout = js.native
    
    /* private */ var updateVisibility: Any = js.native
  }
  
  trait Props extends StObject {
    
    /**
      * The anchor to open the menu from. In most cases, it will be a button that opens the menu.
      */
    var anchor: ReactNode | X
    
    /**
      * Content of the `Menu`.
      */
    var children: ReactNode
    
    /**
      * Style of menu's inner content.
      */
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Callback called when Menu is dismissed. The `visible` prop needs to be updated when this is called.
      */
    def onDismiss(): Unit
    
    /**
      * Accessibility label for the overlay. This is read by the screen reader when the user taps outside the menu.
      */
    var overlayAccessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Extra margin to add at the top of the menu to account for translucent status bar on Android.
      * If you are using Expo, we assume translucent status bar and set a height for status bar automatically.
      * Pass `0` or a custom value to and customize it.
      * This is automatically handled on iOS.
      */
    var statusBarHeight: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Whether the Menu is currently visible.
      */
    var visible: Boolean
  }
  object Props {
    
    inline def apply(onDismiss: () => Unit, theme: Theme, visible: Boolean): Props = {
      val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss), theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: ReactNode | X): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOverlayAccessibilityLabel(value: String): Self = StObject.set(x, "overlayAccessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setOverlayAccessibilityLabelUndefined: Self = StObject.set(x, "overlayAccessibilityLabel", js.undefined)
      
      inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
      
      inline def setStatusBarHeightUndefined: Self = StObject.set(x, "statusBarHeight", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var anchorLayout: Layout
    
    var left: Double
    
    var menuLayout: Layout
    
    var opacityAnimation: Value
    
    var rendered: Boolean
    
    var scaleAnimation: ValueXY
    
    var top: Double
  }
  object State {
    
    inline def apply(
      anchorLayout: Layout,
      left: Double,
      menuLayout: Layout,
      opacityAnimation: Value,
      rendered: Boolean,
      scaleAnimation: ValueXY,
      top: Double
    ): State = {
      val __obj = js.Dynamic.literal(anchorLayout = anchorLayout.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], menuLayout = menuLayout.asInstanceOf[js.Any], opacityAnimation = opacityAnimation.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scaleAnimation = scaleAnimation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setAnchorLayout(value: Layout): Self = StObject.set(x, "anchorLayout", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setMenuLayout(value: Layout): Self = StObject.set(x, "menuLayout", value.asInstanceOf[js.Any])
      
      inline def setOpacityAnimation(value: Value): Self = StObject.set(x, "opacityAnimation", value.asInstanceOf[js.Any])
      
      inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      inline def setScaleAnimation(value: ValueXY): Self = StObject.set(x, "scaleAnimation", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropsstyleanchorchild] & (NonReactStatics[ComponentType[Props] & TypeofMenu & Instantiable0[Menu], js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsMenuMenuMod.foo` */
  override def _to: ComponentType[PickPropsstyleanchorchild] & (NonReactStatics[ComponentType[Props] & TypeofMenu & Instantiable0[Menu], js.Object]) = default
}
