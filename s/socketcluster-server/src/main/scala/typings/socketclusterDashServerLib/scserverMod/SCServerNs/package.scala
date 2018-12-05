package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SCServerNs {
  type connectionListenerFunction = js.Function2[
    /* scSocket */ socketclusterDashServerLib.scserversocketMod.namespaced, 
    /* serverSocketStatus */ SCServerSocketStatus, 
    scala.Unit
  ]
  type nextAuthenticateMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[
      socketclusterDashServerLib.socketclusterDashServerLibNumbers.`true` | java.lang.String | nodeLib.Error | scala.Null
    ], 
    /* isBadToken */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type nextHandshakeSCMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[
      socketclusterDashServerLib.socketclusterDashServerLibNumbers.`true` | java.lang.String | nodeLib.Error | scala.Null
    ], 
    /* statusCode */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type nextMiddlewareFunction = js.Function1[
    /* error */ js.UndefOr[
      socketclusterDashServerLib.socketclusterDashServerLibNumbers.`true` | java.lang.String | nodeLib.Error
    ], 
    scala.Unit
  ]
}
