package typings.promiseMemoize

import typings.promiseMemoize.anon.Clear
import typings.promiseMemoize.promiseMemoizeStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Function1[/* repeated */ Any, js.Thenable[Any]] */](fn: T): T & Clear = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[T & Clear]
  inline def apply[T /* <: js.Function1[/* repeated */ Any, js.Thenable[Any]] */](fn: T, options: Options): T & Clear = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & Clear]
  
  @JSImport("promise-memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.promiseMemoize.promiseMemoizeStrings.simple
    - typings.promiseMemoize.promiseMemoizeStrings.json
    - js.Function1[/ * args * / js.Array[scala.Any], scala.Any]
    - js.Array[
  typings.promiseMemoize.promiseMemoizeStrings.json | (js.Function1[/ * arg * / scala.Any, scala.Any])]
  */
  type KeyResolver = _KeyResolver | (js.Function1[/* args */ js.Array[Any], Any]) | (js.Array[json | (js.Function1[/* arg */ Any, Any])])
  
  trait Options extends StObject {
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var maxErrorAge: js.UndefOr[Double] = js.undefined
    
    var resolve: js.UndefOr[KeyResolver] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMaxErrorAge(value: Double): Self = StObject.set(x, "maxErrorAge", value.asInstanceOf[js.Any])
      
      inline def setMaxErrorAgeUndefined: Self = StObject.set(x, "maxErrorAge", js.undefined)
      
      inline def setResolve(value: KeyResolver): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveFunction1(value: /* args */ js.Array[Any] => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setResolveVarargs(value: (json | (js.Function1[/* arg */ Any, Any]))*): Self = StObject.set(x, "resolve", js.Array(value*))
    }
  }
  
  trait _KeyResolver extends StObject
}
