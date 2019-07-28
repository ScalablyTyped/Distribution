package typings.socketioDashJwtDashAuth

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object socketioDashJwtDashAuthMod {
  type verifyFunc = js.Function2[
    /* payload */ js.Any, 
    /* done */ js.Function3[
      /* err */ js.UndefOr[Error | Null], 
      /* user */ js.UndefOr[js.Any], 
      /* message */ js.UndefOr[String], 
      Unit
    ], 
    Unit
  ]
}
