package typings
package socketioDashJwtDashAuthLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object socketioDashJwtDashAuthMod {
  type verifyFunc = js.Function2[
    /* payload */ js.Any, 
    /* done */ js.Function3[
      /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
      /* user */ js.UndefOr[js.Any], 
      /* message */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
