package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishingWeb extends ClientObject {
  def addPublishingPage(pageInformation: PublishingPageInformation): PublishingPage = js.native
  def get_web(): Web = js.native
}

