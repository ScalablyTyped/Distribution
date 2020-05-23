package typings.sipJs.coreMod

import typings.sipJs.bodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "fromBodyLegacy")
@js.native
object fromBodyLegacy extends js.Object {
  def apply(bodyLegacy: String): Body = js.native
  def apply(bodyLegacy: typings.sipJs.anon.Body): Body = js.native
}

