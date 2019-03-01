package typings
package prosemirrorDashCollabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientID extends js.Object {
  var clientID: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  var version: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object Anon_ClientID {
  @scala.inline
  def apply(clientID: scala.Double | java.lang.String = null, version: scala.Int | scala.Double = null): Anon_ClientID = {
    val __obj = js.Dynamic.literal()
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientID]
  }
}

