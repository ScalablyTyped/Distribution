package typings.reduxLittleRouter

import typings.reduxLittleRouter.mod.Location
import typings.reduxLittleRouter.mod.ObjectLiteral
import typings.reduxLittleRouter.mod.Routes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseUrl extends StObject {
    
    var baseUrl: String
    
    var passRouterStateToReducer: js.UndefOr[Boolean] = js.undefined
    
    var path: String
    
    var query: ObjectLiteral[String]
    
    var url: String
  }
  object BaseUrl {
    
    inline def apply(baseUrl: String, path: String, query: ObjectLiteral[String], url: String): BaseUrl = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setPassRouterStateToReducer(value: Boolean): Self = StObject.set(x, "passRouterStateToReducer", value.asInstanceOf[js.Any])
      
      inline def setPassRouterStateToReducerUndefined: Self = StObject.set(x, "passRouterStateToReducer", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: ObjectLiteral[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: UpdateRoutes
    
    var routes: Routes
  }
  object Options {
    
    inline def apply(options: UpdateRoutes, routes: Routes): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: UpdateRoutes): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var path: String
    
    var query: ObjectLiteral[String]
    
    var url: String
  }
  object Path {
    
    inline def apply(path: String, query: ObjectLiteral[String], url: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: ObjectLiteral[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload extends StObject {
    
    var payload: Location
    
    var `type`: String
  }
  object Payload {
    
    inline def apply(payload: Location, `type`: String): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: Location): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateRoutes extends StObject {
    
    var updateRoutes: Boolean
  }
  object UpdateRoutes {
    
    inline def apply(updateRoutes: Boolean): UpdateRoutes = {
      val __obj = js.Dynamic.literal(updateRoutes = updateRoutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateRoutes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateRoutes] (val x: Self) extends AnyVal {
      
      inline def setUpdateRoutes(value: Boolean): Self = StObject.set(x, "updateRoutes", value.asInstanceOf[js.Any])
    }
  }
}
