package typings.scBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object scbrokerMod {
  
  type PublishMiddleware = js.Function1[/* req */ typings.scBroker.scbrokerMod.PublishMiddlewareData, scala.Unit]
  
  type QueryFunction = js.Function3[
    /* dataMap */ typings.fleximap.mod.FlexiMap, 
    /* dataExpirer */ typings.expirymanager.mod.ExpiryManager, 
    /* subscriptions */ typings.scBroker.scbrokerMod.Subscriptions, 
    js.Any
  ]
  
  type SubscribeMiddleware = js.Function1[/* req */ typings.scBroker.scbrokerMod.SubscribeMiddlewareData, scala.Unit]
  
  type Subscriptions = org.scalablytyped.runtime.NumberDictionary[org.scalablytyped.runtime.StringDictionary[typings.ncom.mod.ComSocket]]
}
