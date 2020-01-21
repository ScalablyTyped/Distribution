package typings.socketioJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JwtAuthorizeCallback = js.Function0[scala.Unit]
  type JwtSecretFunc = js.Function3[
    /* request */ js.Any, 
    /* payload */ js.Any, 
    /* callback */ typings.socketioJwt.mod.JwtSecretFuncCallback, 
    scala.Unit
  ]
  type JwtSecretFuncCallback = js.Function2[/* err */ typings.std.Error | scala.Null, /* secret */ java.lang.String, scala.Unit]
}
