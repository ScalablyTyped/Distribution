package typings
package rmcDashTabsLib.esTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/es/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends rmcDashTabsLib.esTabsDotBaseMod.Tabs[PropsType, StateType] {
  def this(props: PropsType) = this()
  var layout: stdLib.HTMLDivElement = js.native
  var onPan: rmcDashTabsLib.Anon_OffsetOnPanEnd = js.native
  def getContentPosByIndex(index: scala.Double, isVertical: scala.Boolean): java.lang.String = js.native
  def getContentPosByIndex(index: scala.Double, isVertical: scala.Boolean, useLeft: scala.Boolean): java.lang.String = js.native
  def goToTab(
    index: scala.Double,
    force: scala.Boolean,
    usePaged: js.UndefOr[scala.Nothing],
    props: rmcDashTabsLib.Anon_Children with PropsType
  ): scala.Boolean = js.native
  def goToTab(index: scala.Double, force: scala.Boolean, usePaged: scala.Boolean): scala.Boolean = js.native
  def goToTab(
    index: scala.Double,
    force: scala.Boolean,
    usePaged: scala.Boolean,
    props: rmcDashTabsLib.Anon_Children with PropsType
  ): scala.Boolean = js.native
  def onSwipe(status: rcDashGestureLib.rcDashGestureMod.IGestureStatus): scala.Unit = js.native
  def renderContent(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[java.lang.String], 
      /* allPrefix */ js.UndefOr[java.lang.String], 
      org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNode]
    ]
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setContentLayout(div: stdLib.HTMLDivElement): scala.Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/es/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: rmcDashTabsLib.TypeofClassDefaultTabBar = js.native
  var defaultProps: rmcDashTabsLib.esTabsMod.PropsType = js.native
}

