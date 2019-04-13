package typings
package socketclusterDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scserverMod {
  type AuthToken = org.scalablytyped.runtime.StringDictionary[js.Any]
  type badSocketAuthTokenListenerFunction = js.Function2[
    /* scSocket */ socketclusterDashServerLib.scserversocketMod.^, 
    /* status */ badAuthStatus, 
    scala.Unit
  ]
  type connectionListenerFunction = js.Function2[
    /* scSocket */ socketclusterDashServerLib.scserversocketMod.^, 
    /* serverSocketStatus */ SCServerSocketStatus, 
    scala.Unit
  ]
  type disconnectionListenerFunction = js.Function3[
    /* scSocket */ socketclusterDashServerLib.scserversocketMod.^, 
    /* code */ scala.Double, 
    /* data */ js.Any, 
    scala.Unit
  ]
  type handshakeListenerFunction = js.Function1[/* scSocket */ socketclusterDashServerLib.scserversocketMod.^, scala.Unit]
  type nextAuthenticateMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[
      socketclusterDashServerLib.socketclusterDashServerLibNumbers.`true` | java.lang.String | stdLib.Error | scala.Null
    ], 
    /* isBadToken */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type nextHandshakeSCMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[
      socketclusterDashServerLib.socketclusterDashServerLibNumbers.`true` | java.lang.String | stdLib.Error | scala.Null
    ], 
    /* statusCode */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type nextMiddlewareFunction = js.Function1[
    /* error */ js.UndefOr[
      socketclusterDashServerLib.socketclusterDashServerLibNumbers.`true` | java.lang.String | stdLib.Error
    ], 
    scala.Unit
  ]
  type subscriptionListenerFunction = js.Function3[
    /* scSocket */ socketclusterDashServerLib.scserversocketMod.^, 
    /* name */ java.lang.String, 
    /* options */ socketclusterDashServerLib.Anon_Channel, 
    scala.Unit
  ]
  type unsubscriptionListenerFunction = js.Function2[
    /* scSocket */ socketclusterDashServerLib.scserversocketMod.^, 
    /* channel */ java.lang.String, 
    scala.Unit
  ]
  type verifyHandshakeFunction = js.Function3[
    /* success */ scala.Boolean, 
    /* errorCode */ js.UndefOr[scala.Double], 
    /* errorMessage */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
