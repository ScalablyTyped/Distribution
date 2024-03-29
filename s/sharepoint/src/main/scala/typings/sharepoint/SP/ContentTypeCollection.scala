package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTypeCollection
  extends StObject
     with ClientObjectCollection[ContentType] {
  
  def add(parameters: ContentTypeCreationInformation): ContentType = js.native
  
  def addExistingContentType(contentType: ContentType): ContentType = js.native
  
  def getById(contentTypeId: String): ContentType = js.native
  
  def get_item(index: Double): ContentType = js.native
  
  def itemAt(index: Double): ContentType = js.native
}
