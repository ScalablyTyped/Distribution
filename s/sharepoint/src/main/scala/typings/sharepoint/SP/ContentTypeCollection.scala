package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTypeCollection extends ClientObjectCollection[ContentType] {
  def add(parameters: ContentTypeCreationInformation): ContentType = js.native
  def addExistingContentType(contentType: ContentType): ContentType = js.native
  def getById(contentTypeId: String): ContentType = js.native
  def get_item(index: Double): ContentType = js.native
  def itemAt(index: Double): ContentType = js.native
}

