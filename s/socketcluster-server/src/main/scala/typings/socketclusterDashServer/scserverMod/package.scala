package typings.socketclusterDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scserverMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.socketclusterDashServer.Anon_Channel
  import typings.socketclusterDashServer.socketclusterDashServerBooleans.`true`
  import typings.std.Error

  type AuthToken = StringDictionary[js.Any]
  type badSocketAuthTokenListenerFunction = js.Function2[
    /* scSocket */ typings.socketclusterDashServer.scserversocketMod.^, 
    /* status */ badAuthStatus, 
    Unit
  ]
  type connectionListenerFunction = js.Function2[
    /* scSocket */ typings.socketclusterDashServer.scserversocketMod.^, 
    /* serverSocketStatus */ SCServerSocketStatus, 
    Unit
  ]
  type disconnectionListenerFunction = js.Function3[
    /* scSocket */ typings.socketclusterDashServer.scserversocketMod.^, 
    /* code */ Double, 
    /* data */ js.Any, 
    Unit
  ]
  type handshakeListenerFunction = js.Function1[/* scSocket */ typings.socketclusterDashServer.scserversocketMod.^, Unit]
  type nextAuthenticateMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[`true` | String | Error | Null], 
    /* isBadToken */ js.UndefOr[Boolean], 
    Unit
  ]
  type nextHandshakeSCMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[`true` | String | Error | Null], 
    /* statusCode */ js.UndefOr[Double], 
    Unit
  ]
  type nextMiddlewareFunction = js.Function1[/* error */ js.UndefOr[`true` | String | Error], Unit]
  type subscriptionListenerFunction = js.Function3[
    /* scSocket */ typings.socketclusterDashServer.scserversocketMod.^, 
    /* name */ String, 
    /* options */ Anon_Channel, 
    Unit
  ]
  type unsubscriptionListenerFunction = js.Function2[
    /* scSocket */ typings.socketclusterDashServer.scserversocketMod.^, 
    /* channel */ String, 
    Unit
  ]
  type verifyHandshakeFunction = js.Function3[
    /* success */ Boolean, 
    /* errorCode */ js.UndefOr[Double], 
    /* errorMessage */ js.UndefOr[String], 
    Unit
  ]
}
