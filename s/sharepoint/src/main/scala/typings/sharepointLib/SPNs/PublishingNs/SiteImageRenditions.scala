package typings
package sharepointLib.SPNs.PublishingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.SiteImageRenditions")
@js.native
class SiteImageRenditions () extends js.Object

@JSGlobal("SP.Publishing.SiteImageRenditions")
@js.native
object SiteImageRenditions extends js.Object {
  def getRenditions(context: sharepointLib.SPNs.ClientContext): js.Array[sharepointLib.SPNs.PublishingNs.ImageRendition] = js.native
  def setRenditions(
    context: sharepointLib.SPNs.ClientContext,
    renditions: js.Array[sharepointLib.SPNs.PublishingNs.ImageRendition]
  ): scala.Unit = js.native
}

