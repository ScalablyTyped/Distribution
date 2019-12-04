package typings.rmcDashTabs.libTabsDotNativeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNative.reactDashNativeMod.ScrollView
import typings.rmcDashTabs.Anon_Component
import typings.rmcDashTabs.TypeofClassDefaultTabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
@js.native
class Tabs protected ()
  extends typings.rmcDashTabs.libTabsDotBaseMod.Tabs[PropsType, StateType] {
  def this(props: PropsType) = this()
  var AnimatedScrollView: ScrollView = js.native
  var scrollView: Anon_Component = js.native
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
  var DefaultTabBar: TypeofClassDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

