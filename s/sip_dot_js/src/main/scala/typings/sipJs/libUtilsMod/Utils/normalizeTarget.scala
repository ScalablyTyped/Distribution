package typings.sipJs.libUtilsMod.Utils

import typings.sipJs.uriMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Utils", "Utils.normalizeTarget")
@js.native
object normalizeTarget extends js.Object {
  def apply(target: String): js.UndefOr[URI] = js.native
  def apply(target: String, domain: String): js.UndefOr[URI] = js.native
  def apply(target: URI): js.UndefOr[URI] = js.native
  def apply(target: URI, domain: String): js.UndefOr[URI] = js.native
}

