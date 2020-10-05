package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableListViewDataSource extends js.Object {
  def cloneWithRowsAndSections(dataBlob: js.Any): SwipeableListViewDataSource = js.native
  def cloneWithRowsAndSections(
    dataBlob: js.Any,
    sectionIdentities: js.UndefOr[scala.Nothing],
    rowIdentities: js.Array[js.Array[String]]
  ): SwipeableListViewDataSource = js.native
  def cloneWithRowsAndSections(dataBlob: js.Any, sectionIdentities: js.Array[String]): SwipeableListViewDataSource = js.native
  def cloneWithRowsAndSections(dataBlob: js.Any, sectionIdentities: js.Array[String], rowIdentities: js.Array[js.Array[String]]): SwipeableListViewDataSource = js.native
  def getDataSource(): ListViewDataSource = js.native
  def getFirstRowID(): String = js.native
  def getOpenRowID(): String = js.native
  def setOpenRowID(rowID: String): SwipeableListViewDataSource = js.native
}

