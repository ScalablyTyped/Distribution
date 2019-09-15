package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.SwipeableListViewDataSource
import typings.reactDashNative.reactDashNativeMod.SwipeableListViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwipeableListView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.SwipeableListView] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.SwipeableListView].asInstanceOf[String | js.Object]
  def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (js.Any, String, String) => ReactElement,
    renderRow: (js.Any, String, String) => ReactElement
  ): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.SwipeableListView] = {
    val __obj = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount, dataSource = dataSource, maxSwipeDistance = maxSwipeDistance, renderQuickActions = js.Any.fromFunction3(renderQuickActions), renderRow = js.Any.fromFunction3(renderRow))
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwipeableListViewProps
}

