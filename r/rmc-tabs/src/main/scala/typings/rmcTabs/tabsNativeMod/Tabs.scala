package typings.rmcTabs.tabsNativeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ScrollView
import typings.rmcTabs.anon.Component
import typings.rmcTabs.anon.TypeofDefaultTabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
@js.native
class Tabs protected ()
  extends typings.rmcTabs.tabsBaseMod.Tabs[PropsType, StateType] {
  def this(props: PropsType) = this()
  var AnimatedScrollView: ScrollView = js.native
  var scrollView: Component = js.native
  def goToTab(index: Double, force: js.UndefOr[scala.Nothing], animated: Boolean): Boolean = js.native
  def goToTab(index: Double, force: Boolean, animated: Boolean): Boolean = js.native
  def handleLayout(
    e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.LayoutChangeEvent */ js.Any
  ): Unit = js.native
  def onMomentumScrollEnd(
    e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.NativeSyntheticEvent<RN.NativeScrollEvent> */ js.Any
  ): Unit = js.native
  def onScroll(): Unit = js.native
  def onScroll(
    evt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.NativeSyntheticEvent<RN.NativeScrollEvent> */ js.Any
  ): Unit = js.native
  def renderContent(): Element = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[String], 
      /* allPrefix */ js.UndefOr[String], 
      StringDictionary[ReactNode]
    ]
  ): Element = js.native
  def scrollTo(index: Double): Unit = js.native
  def scrollTo(index: Double, animated: Boolean): Unit = js.native
  def setScrollView(sv: js.Any): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

