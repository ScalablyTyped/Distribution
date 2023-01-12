package typings.sentryNode

import typings.sentryNode.anon.CustomRoute
import typings.sentryNode.anon.Include
import typings.sentryNode.anon.Ip
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typings.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestdataMod {
  
  @JSImport("@sentry/node/types/requestdata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/node/types/requestdata", "DEFAULT_USER_INCLUDES")
  @js.native
  val DEFAULT_USER_INCLUDES: js.Array[String] = js.native
  
  inline def addRequestDataToEvent(event: Event, req: PolymorphicRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def addRequestDataToEvent(event: Event, req: PolymorphicRequest, options: AddRequestDataToEventOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def addRequestDataToTransaction(transaction: Unit, req: PolymorphicRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Transaction, req: PolymorphicRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extractPathForTransaction(req: PolymorphicRequest): js.Tuple2[String, TransactionSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPathForTransaction")(req.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, TransactionSource]]
  inline def extractPathForTransaction(req: PolymorphicRequest, options: CustomRoute): js.Tuple2[String, TransactionSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractPathForTransaction")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, TransactionSource]]
  
  inline def extractRequestData(req: PolymorphicRequest): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(req: PolymorphicRequest, options: Include): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  trait AddRequestDataToEventOptions extends StObject {
    
    /** Flags controlling whether each type of data should be added to the event */
    var include: js.UndefOr[Ip] = js.undefined
  }
  object AddRequestDataToEventOptions {
    
    inline def apply(): AddRequestDataToEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddRequestDataToEventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddRequestDataToEventOptions] (val x: Self) extends AnyVal {
      
      inline def setInclude(value: Ip): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryNode.sentryNodeStrings.path
    - typings.sentryNode.sentryNodeStrings.methodPath
    - typings.sentryNode.sentryNodeStrings.handler
  */
  trait TransactionNamingScheme extends StObject
  object TransactionNamingScheme {
    
    inline def handler: typings.sentryNode.sentryNodeStrings.handler = "handler".asInstanceOf[typings.sentryNode.sentryNodeStrings.handler]
    
    inline def methodPath: typings.sentryNode.sentryNodeStrings.methodPath = "methodPath".asInstanceOf[typings.sentryNode.sentryNodeStrings.methodPath]
    
    inline def path: typings.sentryNode.sentryNodeStrings.path = "path".asInstanceOf[typings.sentryNode.sentryNodeStrings.path]
  }
}
