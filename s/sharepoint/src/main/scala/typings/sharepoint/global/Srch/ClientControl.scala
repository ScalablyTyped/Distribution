package typings.sharepoint.global.Srch

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.ClientControl")
@js.native
class ClientControl protected ()
  extends typings.sharepoint.Srch.ClientControl {
  def this(elem: Element) = this()
}

/* static members */
@JSGlobal("Srch.ClientControl")
@js.native
object ClientControl extends js.Object {
  /** toggles visibility of children controls of the messageContainer */
  def toggleMessageDetails(messageContainer: Element): Unit = js.native
}

