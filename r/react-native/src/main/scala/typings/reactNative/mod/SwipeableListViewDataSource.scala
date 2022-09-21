package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableListViewDataSource extends StObject {
  
  def cloneWithRowsAndSections(dataBlob: Any): SwipeableListViewDataSource = js.native
  def cloneWithRowsAndSections(dataBlob: Any, sectionIdentities: js.Array[String]): SwipeableListViewDataSource = js.native
  def cloneWithRowsAndSections(dataBlob: Any, sectionIdentities: js.Array[String], rowIdentities: js.Array[js.Array[String]]): SwipeableListViewDataSource = js.native
  def cloneWithRowsAndSections(dataBlob: Any, sectionIdentities: Unit, rowIdentities: js.Array[js.Array[String]]): SwipeableListViewDataSource = js.native
  
  def getDataSource(): ListViewDataSource = js.native
  
  def getFirstRowID(): String = js.native
  
  def getOpenRowID(): String = js.native
  
  def setOpenRowID(rowID: String): SwipeableListViewDataSource = js.native
}
