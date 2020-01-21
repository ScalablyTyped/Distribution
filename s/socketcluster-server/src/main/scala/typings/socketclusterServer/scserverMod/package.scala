package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scserverMod {
  type AuthToken = org.scalablytyped.runtime.StringDictionary[js.Any]
  type badSocketAuthTokenListenerFunction = js.Function2[
    /* scSocket */ typings.socketclusterServer.scserversocketMod.^, 
    /* status */ typings.socketclusterServer.scserverMod.badAuthStatus, 
    scala.Unit
  ]
  type connectionListenerFunction = js.Function2[
    /* scSocket */ typings.socketclusterServer.scserversocketMod.^, 
    /* serverSocketStatus */ typings.socketclusterServer.scserverMod.SCServerSocketStatus, 
    scala.Unit
  ]
  type disconnectionListenerFunction = js.Function3[
    /* scSocket */ typings.socketclusterServer.scserversocketMod.^, 
    /* code */ scala.Double, 
    /* data */ js.Any, 
    scala.Unit
  ]
  type handshakeListenerFunction = js.Function1[/* scSocket */ typings.socketclusterServer.scserversocketMod.^, scala.Unit]
  type nextAuthenticateMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[
      typings.socketclusterServer.socketclusterServerBooleans.`true` | java.lang.String | typings.std.Error | scala.Null
    ], 
    /* isBadToken */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type nextHandshakeSCMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[
      typings.socketclusterServer.socketclusterServerBooleans.`true` | java.lang.String | typings.std.Error | scala.Null
    ], 
    /* statusCode */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type nextMiddlewareFunction = js.Function1[
    /* error */ js.UndefOr[
      typings.socketclusterServer.socketclusterServerBooleans.`true` | java.lang.String | typings.std.Error
    ], 
    scala.Unit
  ]
  type subscriptionListenerFunction = js.Function3[
    /* scSocket */ typings.socketclusterServer.scserversocketMod.^, 
    /* name */ java.lang.String, 
    /* options */ typings.socketclusterServer.AnonChannel, 
    scala.Unit
  ]
  type unsubscriptionListenerFunction = js.Function2[
    /* scSocket */ typings.socketclusterServer.scserversocketMod.^, 
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
