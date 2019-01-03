package typings
package sipDotJsLib.typesSIPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/SIP", "URI")
@js.native
class URI protected ()
  extends sipDotJsLib.typesUriMod.URI {
  def this(scheme: js.UndefOr[java.lang.String], user: js.UndefOr[java.lang.String], host: js.UndefOr[java.lang.String], port: js.UndefOr[scala.Double], parameters: js.UndefOr[js.Array[java.lang.String]], headers: js.UndefOr[js.Array[java.lang.String]]) = this()
}

@JSImport("sip.js/types/SIP", "URI")
@js.native
object URI extends js.Object {
  def parse(uri: java.lang.String): sipDotJsLib.typesUriMod.URI = js.native
}

