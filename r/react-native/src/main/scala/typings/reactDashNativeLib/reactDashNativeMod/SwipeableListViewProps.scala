package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableListViewProps extends js.Object {
  /**
    * To alert the user that swiping is possible, the first row can bounce
    * on component mount.
    */
  var bounceFirstRowOnMount: scala.Boolean = js.native
  /**
    * Use `SwipeableListView.getNewDataSource()` to get a data source to use,
    * then use it just like you would a normal ListView data source
    */
  var dataSource: SwipeableListViewDataSource = js.native
  // Maximum distance to open to after a swipe
  var maxSwipeDistance: scala.Double = js.native
  // Callback method to render the view that will be unveiled on swipe
  def renderQuickActions(rowData: js.Any, sectionID: java.lang.String, rowID: java.lang.String): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderQuickActions(rowData: js.Any, sectionID: java.lang.String, rowID: scala.Double): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderQuickActions(rowData: js.Any, sectionID: scala.Double, rowID: java.lang.String): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderQuickActions(rowData: js.Any, sectionID: scala.Double, rowID: scala.Double): reactLib.reactMod.ReactNs.ReactElement = js.native
  // Callback method to render the swipeable view
  def renderRow(rowData: js.Any, sectionID: java.lang.String, rowID: java.lang.String): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: java.lang.String, rowID: java.lang.String, highlightRow: scala.Boolean): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: java.lang.String, rowID: scala.Double): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: java.lang.String, rowID: scala.Double, highlightRow: scala.Boolean): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: scala.Double, rowID: java.lang.String): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: scala.Double, rowID: java.lang.String, highlightRow: scala.Boolean): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: scala.Double, rowID: scala.Double): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: scala.Double, rowID: scala.Double, highlightRow: scala.Boolean): reactLib.reactMod.ReactNs.ReactElement = js.native
}

