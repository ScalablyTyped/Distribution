package typings
package storageDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_SetItem extends js.Object {
  var clear: js.Function0[scala.Unit]
  var getItem: js.Function3[
    /* key */ java.lang.String, 
    /* parse */ js.UndefOr[scala.Boolean], 
    /* fallback */ js.UndefOr[js.Any], 
    java.lang.String | stdLib.NonNullable[_] | scala.Null
  ]
  var removeItem: js.Function1[/* key */ java.lang.String, scala.Unit]
  var setItem: js.Function3[
    /* key */ java.lang.String, 
    /* value */ java.lang.String, 
    /* permanent */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
}

