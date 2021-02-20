package typings.routie

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routie {
  
  @js.native
  trait RouteOptions extends StObject {
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object RouteOptions {
    
    @scala.inline
    def apply(): RouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit class RouteOptionsMutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  @js.native
  trait Routie extends RoutieStatic {
    
    def apply(path: String): Unit = js.native
    def apply(path: String, fn: js.Function): Unit = js.native
    def apply(routes: StringDictionary[js.Function]): Unit = js.native
  }
  
  @js.native
  trait RoutieStatic extends StObject {
    
    def lookup(name: String, fn: js.Function): String = js.native
    
    def navigate(path: String): Unit = js.native
    def navigate(path: String, options: RouteOptions): Unit = js.native
    
    def noConflict(): Routie = js.native
    
    def remove(path: String, fn: js.Function): Unit = js.native
    
    def removeAll(): Unit = js.native
  }
}
