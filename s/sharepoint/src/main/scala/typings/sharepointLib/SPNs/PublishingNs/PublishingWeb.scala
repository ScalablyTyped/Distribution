package typings
package sharepointLib.SPNs.PublishingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingWeb")
@js.native
class PublishingWeb ()
  extends sharepointLib.SPNs.ClientObject {
  def addPublishingPage(pageInformation: PublishingPageInformation): PublishingPage = js.native
  def get_web(): sharepointLib.SPNs.Web = js.native
}

@JSGlobal("SP.Publishing.PublishingWeb")
@js.native
object PublishingWeb extends js.Object {
  def getPublishingWeb(context: sharepointLib.SPNs.ClientContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.PublishingNs.PublishingWeb = js.native
}

