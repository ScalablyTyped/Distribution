package typings.reactNavigationDrawer.typesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigationDrawer.anon.Focused
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerNavigatorItemsProps & {  navigation :react-navigation.react-navigation.NavigationScreenProp<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.NavigationDrawerState, react-navigation.react-navigation.NavigationParams>,   descriptors :react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.SceneDescriptorMap,   drawerOpenProgress :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any,   screenProps :unknown} */
@js.native
trait DrawerContentComponentProps extends js.Object {
  var activeBackgroundColor: js.UndefOr[String | ThemedColor] = js.native
  var activeItemKey: js.UndefOr[String | Null] = js.native
  var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var activeTintColor: js.UndefOr[String | ThemedColor] = js.native
  var descriptors: SceneDescriptorMap = js.native
  var drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  var drawerPosition: left | right = js.native
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inactiveBackgroundColor: js.UndefOr[String | ThemedColor] = js.native
  var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var inactiveTintColor: js.UndefOr[String | ThemedColor] = js.native
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var items: js.Array[NavigationRoute[NavigationParams]] = js.native
  var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams] = js.native
  var screenProps: js.Any = js.native
  def getLabel(scene: Scene): ReactNode = js.native
  def onItemPress(scene: Focused): Unit = js.native
  def renderIcon(scene: Scene): ReactNode = js.native
}

object DrawerContentComponentProps {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    drawerPosition: left | right,
    getLabel: Scene => ReactNode,
    items: js.Array[NavigationRoute[NavigationParams]],
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    onItemPress: Focused => Unit,
    renderIcon: Scene => ReactNode,
    screenProps: js.Any
  ): DrawerContentComponentProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1(onItemPress), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerContentComponentProps]
  }
  @scala.inline
  implicit class DrawerContentComponentPropsOps[Self <: DrawerContentComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescriptors(value: SceneDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawerOpenProgress(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self = this.set("drawerOpenProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawerPosition(value: left | right): Self = this.set("drawerPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLabel(value: Scene => ReactNode): Self = this.set("getLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setItemsVarargs(value: NavigationRoute[NavigationParams]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[NavigationRoute[NavigationParams]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: NavigationScreenProp[NavigationDrawerState, NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnItemPress(value: Focused => Unit): Self = this.set("onItemPress", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderIcon(value: Scene => ReactNode): Self = this.set("renderIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveBackgroundColor(value: String | ThemedColor): Self = this.set("activeBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveBackgroundColor: Self = this.set("activeBackgroundColor", js.undefined)
    @scala.inline
    def setActiveItemKey(value: String): Self = this.set("activeItemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveItemKey: Self = this.set("activeItemKey", js.undefined)
    @scala.inline
    def setActiveItemKeyNull: Self = this.set("activeItemKey", null)
    @scala.inline
    def setActiveLabelStyle(value: StyleProp[TextStyle]): Self = this.set("activeLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveLabelStyle: Self = this.set("activeLabelStyle", js.undefined)
    @scala.inline
    def setActiveLabelStyleNull: Self = this.set("activeLabelStyle", null)
    @scala.inline
    def setActiveTintColor(value: String | ThemedColor): Self = this.set("activeTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveTintColor: Self = this.set("activeTintColor", js.undefined)
    @scala.inline
    def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("iconContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconContainerStyle: Self = this.set("iconContainerStyle", js.undefined)
    @scala.inline
    def setIconContainerStyleNull: Self = this.set("iconContainerStyle", null)
    @scala.inline
    def setInactiveBackgroundColor(value: String | ThemedColor): Self = this.set("inactiveBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveBackgroundColor: Self = this.set("inactiveBackgroundColor", js.undefined)
    @scala.inline
    def setInactiveLabelStyle(value: StyleProp[TextStyle]): Self = this.set("inactiveLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveLabelStyle: Self = this.set("inactiveLabelStyle", js.undefined)
    @scala.inline
    def setInactiveLabelStyleNull: Self = this.set("inactiveLabelStyle", null)
    @scala.inline
    def setInactiveTintColor(value: String | ThemedColor): Self = this.set("inactiveTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveTintColor: Self = this.set("inactiveTintColor", js.undefined)
    @scala.inline
    def setItemStyle(value: StyleProp[ViewStyle]): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setItemStyleNull: Self = this.set("itemStyle", null)
    @scala.inline
    def setItemsContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("itemsContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsContainerStyle: Self = this.set("itemsContainerStyle", js.undefined)
    @scala.inline
    def setItemsContainerStyleNull: Self = this.set("itemsContainerStyle", null)
    @scala.inline
    def setLabelStyle(value: StyleProp[TextStyle]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLabelStyleNull: Self = this.set("labelStyle", null)
  }
  
}

