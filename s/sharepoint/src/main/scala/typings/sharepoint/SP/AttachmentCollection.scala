package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentCollection
  extends StObject
     with ClientObjectCollection[Attachment] {
  
  def getByFileName(fileName: String): Attachment = js.native
  
  def get_item(index: Double): Attachment = js.native
  
  def itemAt(index: Double): Attachment = js.native
}
