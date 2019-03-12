package typings
package socketioDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object socketioDashJwtMod {
  type JwtAuthorizeCallback = js.Function0[scala.Unit]
  type JwtSecretFunc = js.Function3[
    /* request */ js.Any, 
    /* payload */ js.Any, 
    /* callback */ JwtSecretFuncCallback, 
    scala.Unit
  ]
  type JwtSecretFuncCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* secret */ java.lang.String, scala.Unit]
}
