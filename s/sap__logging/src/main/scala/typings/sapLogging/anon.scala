package typings.sapLogging

import typings.expressServeStaticCore.mod.PathParams
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.RequestHandlerParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppContext extends StObject {
    
    /**
      * An application context object
      */
    var appContext: typings.sapLogging.mod.AppContext
    
    /**
      * boolean specifying whether an entry containing request metrics will be logged for every finished HTTP request.
      * @default false
      */
    var logNetwork: js.UndefOr[Boolean] = js.undefined
  }
  object AppContext {
    
    inline def apply(appContext: typings.sapLogging.mod.AppContext): AppContext = {
      val __obj = js.Dynamic.literal(appContext = appContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppContext] (val x: Self) extends AnyVal {
      
      inline def setAppContext(value: typings.sapLogging.mod.AppContext): Self = StObject.set(x, "appContext", value.asInstanceOf[js.Any])
      
      inline def setLogNetwork(value: Boolean): Self = StObject.set(x, "logNetwork", value.asInstanceOf[js.Any])
      
      inline def setLogNetworkUndefined: Self = StObject.set(x, "logNetwork", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    def apply(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  }
}
