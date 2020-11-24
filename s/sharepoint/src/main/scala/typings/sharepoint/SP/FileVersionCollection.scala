package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileVersionCollection extends ClientObjectCollection[FileVersion] {
  
  def deleteAll(): Unit = js.native
  
  def deleteByID(vid: Double): Unit = js.native
  
  def deleteByLabel(versionlabel: String): Unit = js.native
  
  def getById(versionid: Double): FileVersion = js.native
  
  def get_item(index: Double): FileVersion = js.native
  
  def itemAt(index: Double): FileVersion = js.native
  
  def restoreByLabel(versionlabel: String): Unit = js.native
}
