package typings.rmcTabs.tabsMod

import org.scalablytyped.runtime.StringDictionary
import typings.rcGesture.mod.IGestureStatus
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.rmcTabs.anon.OnPanMove
import typings.rmcTabs.anon.ReadonlychildrenReactNode
import typings.rmcTabs.anon.TypeofDefaultTabBar
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends typings.rmcTabs.tabsBaseMod.Tabs[PropsType, StateType] {
  def this(props: PropsType) = this()
  var layout: HTMLDivElement = js.native
  var onPan: OnPanMove = js.native
  def getContentPosByIndex(index: Double, isVertical: Boolean): String = js.native
  def getContentPosByIndex(index: Double, isVertical: Boolean, useLeft: Boolean): String = js.native
  def goToTab(index: Double, force: Boolean, usePaged: Boolean): Boolean = js.native
  def goToTab(index: Double, force: Boolean, usePaged: Boolean, props: ReadonlychildrenReactNode): Boolean = js.native
  def onSwipe(status: IGestureStatus): Unit = js.native
  def renderContent(): Element = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[String], 
      /* allPrefix */ js.UndefOr[String], 
      StringDictionary[ReactNode]
    ]
  ): Element = js.native
  def setContentLayout(div: HTMLDivElement): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

