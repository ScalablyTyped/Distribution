package typings.snowpackEnv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Deps extends StObject {
    
    /** The newer version of dependencies. Order is same as the first argument. */
    var deps: js.Array[Any]
    
    /** The newer version of the current module */
    var module: Any
  }
  object Deps {
    
    inline def apply(deps: js.Array[Any], module: Any): Deps = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deps]
    }
    
    extension [Self <: Deps](x: Self) {
      
      inline def setDeps(value: js.Array[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsVarargs(value: Any*): Self = StObject.set(x, "deps", js.Array(value*))
      
      inline def setModule(value: Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    val MODE: String
    
    val NODE_ENV: String
    
    val SNOWPACK_PUBLIC_API_URL: String
    
    val SSR: js.UndefOr[Boolean] = js.undefined
  }
  object Dictkey {
    
    inline def apply(MODE: String, NODE_ENV: String, SNOWPACK_PUBLIC_API_URL: String): Dictkey = {
      val __obj = js.Dynamic.literal(MODE = MODE.asInstanceOf[js.Any], NODE_ENV = NODE_ENV.asInstanceOf[js.Any], SNOWPACK_PUBLIC_API_URL = SNOWPACK_PUBLIC_API_URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setMODE(value: String): Self = StObject.set(x, "MODE", value.asInstanceOf[js.Any])
      
      inline def setNODE_ENV(value: String): Self = StObject.set(x, "NODE_ENV", value.asInstanceOf[js.Any])
      
      inline def setSNOWPACK_PUBLIC_API_URL(value: String): Self = StObject.set(x, "SNOWPACK_PUBLIC_API_URL", value.asInstanceOf[js.Any])
      
      inline def setSSR(value: Boolean): Self = StObject.set(x, "SSR", value.asInstanceOf[js.Any])
      
      inline def setSSRUndefined: Self = StObject.set(x, "SSR", js.undefined)
    }
  }
  
  trait Module extends StObject {
    
    /** The newer version of the current module */
    var module: Any
  }
  object Module {
    
    inline def apply(module: Any): Module = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setModule(value: Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
}
