package typings.sentryUtils

import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typings.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionSource
import typings.sentryUtils.anon.Cookie
import typings.sentryUtils.anon.CustomRoute
import typings.sentryUtils.anon.Deps
import typings.sentryUtils.anon.Ip
import typings.sentryUtils.anon.Parse
import typings.sentryUtils.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestdataMod {
  
  @JSImport("@sentry/utils/types/requestdata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRequestDataToEvent(event: Event, req: PolymorphicRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def addRequestDataToEvent(event: Event, req: PolymorphicRequest, options: AddRequestDataToEventOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def addRequestDataToTransaction(transaction: Unit, req: PolymorphicRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Unit, req: PolymorphicRequest, deps: InjectedNodeDeps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Transaction, req: PolymorphicRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Transaction, req: PolymorphicRequest, deps: InjectedNodeDeps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extractPathForTransaction(req: PolymorphicRequest): js.Tuple2[String, TransactionSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPathForTransaction")(req.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, TransactionSource]]
  inline def extractPathForTransaction(req: PolymorphicRequest, options: CustomRoute): js.Tuple2[String, TransactionSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractPathForTransaction")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, TransactionSource]]
  
  inline def extractRequestData(req: PolymorphicRequest): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(req: PolymorphicRequest, options: Deps): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  trait AddRequestDataToEventOptions extends StObject {
    
    /** Injected platform-specific dependencies */
    var deps: js.UndefOr[Cookie] = js.undefined
    
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
      
      inline def setDeps(value: Cookie): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
      
      inline def setInclude(value: Ip): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    }
  }
  
  trait InjectedNodeDeps extends StObject {
    
    var cookie: Parse
    
    var url: `0`
  }
  object InjectedNodeDeps {
    
    inline def apply(cookie: Parse, url: `0`): InjectedNodeDeps = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedNodeDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectedNodeDeps] (val x: Self) extends AnyVal {
      
      inline def setCookie(value: Parse): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: `0`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryUtils.sentryUtilsStrings.path
    - typings.sentryUtils.sentryUtilsStrings.methodPath
    - typings.sentryUtils.sentryUtilsStrings.handler
  */
  trait TransactionNamingScheme extends StObject
  object TransactionNamingScheme {
    
    inline def handler: typings.sentryUtils.sentryUtilsStrings.handler = "handler".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.handler]
    
    inline def methodPath: typings.sentryUtils.sentryUtilsStrings.methodPath = "methodPath".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.methodPath]
    
    inline def path: typings.sentryUtils.sentryUtilsStrings.path = "path".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.path]
  }
}
