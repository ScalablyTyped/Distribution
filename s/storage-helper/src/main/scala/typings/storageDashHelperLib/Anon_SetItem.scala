package typings
package storageDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SetItem extends js.Object {
  var clear: js.Function0[scala.Unit]
  var getItem: Anon_False
  var removeItem: js.Function1[/* key */ java.lang.String, scala.Unit]
  var setItem: js.Function3[
    /* key */ java.lang.String, 
    /* value */ java.lang.String, 
    /* permanent */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
}

