package typings
package socketclusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scworkerMod {
  type middlewareFunction = js.Function2[
    /* options */ socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions, 
    /* next */ js.Function1[/* error */ js.UndefOr[java.lang.String | stdLib.Error], scala.Unit], 
    scala.Unit
  ]
}
