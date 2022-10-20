package typings.sentryNode

import org.scalablytyped.runtime.StringDictionary
import typings.sentryNode.anon.Ip
import typings.sentryNode.anon.ServerName
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typings.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestDataDeprecatedMod {
  
  @JSImport("@sentry/node/types/requestDataDeprecated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractRequestData(req: StringDictionary[Any]): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(req: StringDictionary[Any], keys: js.Array[String]): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def parseRequest(event: Event, req: ExpressRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def parseRequest(event: Event, req: ExpressRequest, options: ParseRequestOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  type ExpressRequest = PolymorphicRequest
  
  type ParseRequestOptions = js.UndefOr[Ip] & ServerName
}
