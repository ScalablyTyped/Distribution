package typings.router5

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  type CancelFn = js.Function0[Unit]
  
  type DoneFn = js.Function2[/* err */ js.UndefOr[Any], /* state */ js.UndefOr[State], Unit]
  
  trait NavigationOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var reload: js.UndefOr[Boolean] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var skipTransition: js.UndefOr[Boolean] = js.undefined
  }
  object NavigationOptions {
    
    inline def apply(): NavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOptions]
    }
    
    extension [Self <: NavigationOptions](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSkipTransition(value: Boolean): Self = StObject.set(x, "skipTransition", value.asInstanceOf[js.Any])
      
      inline def setSkipTransitionUndefined: Self = StObject.set(x, "skipTransition", js.undefined)
    }
  }
  
  type Params = Record[String, Any]
  
  trait SimpleState extends StObject {
    
    var name: String
    
    var params: Params
  }
  object SimpleState {
    
    inline def apply(name: String, params: Params): SimpleState = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleState]
    }
    
    extension [Self <: SimpleState](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var meta: js.UndefOr[StateMeta] = js.undefined
    
    var name: String
    
    var params: Params
    
    var path: String
  }
  object State {
    
    inline def apply(name: String, params: Params, path: String): State = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setMeta(value: StateMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateMeta extends StObject {
    
    var id: Double
    
    var options: NavigationOptions
    
    var params: Params
    
    var redirected: Boolean
    
    var source: js.UndefOr[String] = js.undefined
  }
  object StateMeta {
    
    inline def apply(id: Double, options: NavigationOptions, params: Params, redirected: Boolean): StateMeta = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateMeta]
    }
    
    extension [Self <: StateMeta](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: NavigationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
