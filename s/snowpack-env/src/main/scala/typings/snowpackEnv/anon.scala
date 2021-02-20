package typings.snowpackEnv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Deps extends StObject {
    
    /** The newer version of dependencies. Order is same as the first argument. */
    var deps: js.Array[_] = js.native
    
    /** The newer version of the current module */
    var module: js.Any = js.native
  }
  object Deps {
    
    @scala.inline
    def apply(deps: js.Array[_], module: js.Any): Deps = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deps]
    }
    
    @scala.inline
    implicit class DepsMutableBuilder[Self <: Deps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[_]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setModule(value: js.Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    val MODE: String = js.native
    
    val NODE_ENV: String = js.native
    
    val SNOWPACK_PUBLIC_API_URL: String = js.native
    
    val SSR: js.UndefOr[Boolean] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(MODE: String, NODE_ENV: String, SNOWPACK_PUBLIC_API_URL: String): Dictkey = {
      val __obj = js.Dynamic.literal(MODE = MODE.asInstanceOf[js.Any], NODE_ENV = NODE_ENV.asInstanceOf[js.Any], SNOWPACK_PUBLIC_API_URL = SNOWPACK_PUBLIC_API_URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMODE(value: String): Self = StObject.set(x, "MODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNODE_ENV(value: String): Self = StObject.set(x, "NODE_ENV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSNOWPACK_PUBLIC_API_URL(value: String): Self = StObject.set(x, "SNOWPACK_PUBLIC_API_URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSR(value: Boolean): Self = StObject.set(x, "SSR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSRUndefined: Self = StObject.set(x, "SSR", js.undefined)
    }
  }
  
  @js.native
  trait Module extends StObject {
    
    /** The newer version of the current module */
    var module: js.Any = js.native
  }
  object Module {
    
    @scala.inline
    def apply(module: js.Any): Module = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule(value: js.Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
}
