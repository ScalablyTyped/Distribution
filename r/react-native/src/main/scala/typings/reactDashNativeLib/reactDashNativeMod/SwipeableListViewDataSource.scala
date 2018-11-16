package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableListViewDataSource extends js.Object {
  def cloneWithRowsAndSections(dataBlob: js.Any): SwipeableListViewDataSource = js.native
  def cloneWithRowsAndSections(dataBlob: js.Any, sectionIdentities: js.Array[java.lang.String]): SwipeableListViewDataSource = js.native
  def cloneWithRowsAndSections(
    dataBlob: js.Any,
    sectionIdentities: js.Array[java.lang.String],
    rowIdentities: js.Array[js.Array[java.lang.String]]
  ): SwipeableListViewDataSource = js.native
  def getDataSource(): ListViewDataSource = js.native
  def getFirstRowID(): java.lang.String = js.native
  def getOpenRowID(): java.lang.String = js.native
  def setOpenRowID(rowID: java.lang.String): SwipeableListViewDataSource = js.native
}

