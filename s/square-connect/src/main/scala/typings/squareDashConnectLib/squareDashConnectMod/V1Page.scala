package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Page")
@js.native
class V1Page () extends js.Object {
  /**
    * The cells included on the page.
    */
  var cells: js.UndefOr[js.Array[V1PageCell]] = js.native
  /**
    * The page's unique identifier.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The page's name, if any.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The page's position in the merchant's list of pages. Always an integer between 0 and 6, inclusive.
    */
  var page_index: js.UndefOr[scala.Double] = js.native
}

