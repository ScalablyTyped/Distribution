package typings.reduxImmutableStateInvariant

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-immutable-state-invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-immutable-state-invariant", JSImport.Default)
  @js.native
  def default: immutableStateInvariantMiddlewareInterface = js.native
  @scala.inline
  def default_=(x: immutableStateInvariantMiddlewareInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  type immutableStateInvariantMiddlewareInterface = js.Function1[
    /* options */ js.UndefOr[immutableStateInvariantMiddlewareOptions], 
    Middleware[js.Object, js.Any, Dispatch[AnyAction]]
  ]
  
  @js.native
  trait immutableStateInvariantMiddlewareOptions extends StObject {
    
    var ignore: js.UndefOr[js.Array[String]] = js.native
    
    var isImmutable: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
  }
  object immutableStateInvariantMiddlewareOptions {
    
    @scala.inline
    def apply(): immutableStateInvariantMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[immutableStateInvariantMiddlewareOptions]
    }
    
    @scala.inline
    implicit class immutableStateInvariantMiddlewareOptionsMutableBuilder[Self <: immutableStateInvariantMiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setIsImmutable(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "isImmutable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsImmutableUndefined: Self = StObject.set(x, "isImmutable", js.undefined)
    }
  }
}
