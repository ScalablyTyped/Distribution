package typings.reactNative.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableListViewProps extends js.Object {
  /**
    * To alert the user that swiping is possible, the first row can bounce
    * on component mount.
    */
  var bounceFirstRowOnMount: Boolean = js.native
  /**
    * Use `SwipeableListView.getNewDataSource()` to get a data source to use,
    * then use it just like you would a normal ListView data source
    */
  var dataSource: SwipeableListViewDataSource = js.native
  // Maximum distance to open to after a swipe
  var maxSwipeDistance: Double = js.native
  // Callback method to render the view that will be unveiled on swipe
  def renderQuickActions(rowData: js.Any, sectionID: String, rowID: String): ReactElement = js.native
  def renderQuickActions(rowData: js.Any, sectionID: String, rowID: Double): ReactElement = js.native
  def renderQuickActions(rowData: js.Any, sectionID: Double, rowID: String): ReactElement = js.native
  def renderQuickActions(rowData: js.Any, sectionID: Double, rowID: Double): ReactElement = js.native
  // Callback method to render the swipeable view
  def renderRow(rowData: js.Any, sectionID: String, rowID: String): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: String, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: Double): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: Double, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: String): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: String, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: Double): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: Double, highlightRow: Boolean): ReactElement = js.native
}

