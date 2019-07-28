package typings.sharepoint.SPNs.PublishingNs

import typings.sharepoint.SPNs.ClientContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.SiteImageRenditions")
@js.native
class SiteImageRenditions () extends js.Object

/* static members */
@JSGlobal("SP.Publishing.SiteImageRenditions")
@js.native
object SiteImageRenditions extends js.Object {
  def getRenditions(context: ClientContext): js.Array[ImageRendition] = js.native
  def setRenditions(context: ClientContext, renditions: js.Array[ImageRendition]): Unit = js.native
}

