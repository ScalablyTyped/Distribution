package typings.reduxLittleRouter

import typings.reduxLittleRouter.mod.Location
import typings.reduxLittleRouter.mod.ObjectLiteral
import typings.reduxLittleRouter.mod.Routes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BaseUrl extends StObject {
    
    var baseUrl: String = js.native
    
    var passRouterStateToReducer: js.UndefOr[Boolean] = js.native
    
    var path: String = js.native
    
    var query: ObjectLiteral[String] = js.native
    
    var url: String = js.native
  }
  object BaseUrl {
    
    @scala.inline
    def apply(baseUrl: String, path: String, query: ObjectLiteral[String], url: String): BaseUrl = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit class BaseUrlMutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassRouterStateToReducer(value: Boolean): Self = StObject.set(x, "passRouterStateToReducer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassRouterStateToReducerUndefined: Self = StObject.set(x, "passRouterStateToReducer", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: ObjectLiteral[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var options: UpdateRoutes = js.native
    
    var routes: Routes = js.native
  }
  object Options {
    
    @scala.inline
    def apply(options: UpdateRoutes, routes: Routes): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: UpdateRoutes): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    var path: String = js.native
    
    var query: ObjectLiteral[String] = js.native
    
    var url: String = js.native
  }
  object Path {
    
    @scala.inline
    def apply(path: String, query: ObjectLiteral[String], url: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: ObjectLiteral[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Payload extends StObject {
    
    var payload: Location = js.native
    
    var `type`: String = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(payload: Location, `type`: String): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Location): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateRoutes extends StObject {
    
    var updateRoutes: Boolean = js.native
  }
  object UpdateRoutes {
    
    @scala.inline
    def apply(updateRoutes: Boolean): UpdateRoutes = {
      val __obj = js.Dynamic.literal(updateRoutes = updateRoutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateRoutes]
    }
    
    @scala.inline
    implicit class UpdateRoutesMutableBuilder[Self <: UpdateRoutes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdateRoutes(value: Boolean): Self = StObject.set(x, "updateRoutes", value.asInstanceOf[js.Any])
    }
  }
}
