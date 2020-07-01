package typings.rcTabs.tabsMod

import typings.rcTabs.anon.PartialTabsPropsRefAttrib
import typings.rcTabs.anon.WeakValidationMapTabsProp
import typings.rcTabs.tabPaneMod.TabPaneProps
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ForwardRefExoticComponent<rc-tabs.rc-tabs/lib/Tabs.TabsProps & react.react.RefAttributes<std.HTMLDivElement>> & {  TabPane  :(hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren : rc-tabs.rc-tabs/lib/TabPanelList/TabPane.TabPaneProps): react.react.<global>.JSX.Element} */
@js.native
trait ForwardTabsType extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  var TabPane: js.Function1[
    /* hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren */ TabPaneProps, 
    Element
  ] = js.native
  var defaultProps: js.UndefOr[PartialTabsPropsRefAttrib] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTabsProp] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: TabsProps with RefAttributes[HTMLDivElement]): ReactElement | Null = js.native
}

