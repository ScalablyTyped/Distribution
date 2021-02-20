package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderCollection extends ClientObjectCollection[Folder] {
  
  def add(url: String): Folder = js.native
  
  def getByUrl(url: String): Folder = js.native
  
  def get_item(index: Double): Folder = js.native
  
  def itemAt(index: Double): Folder = js.native
}
