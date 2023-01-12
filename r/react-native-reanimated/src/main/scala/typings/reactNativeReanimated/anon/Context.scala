package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[TContext /* <: typings.reactNativeReanimated.mod.Context */] extends StObject {
  
  var context: TContext
  
  var doDependenciesDiffer: Boolean
  
  var useWeb: Boolean
}
object Context {
  
  inline def apply[TContext /* <: typings.reactNativeReanimated.mod.Context */](context: TContext, doDependenciesDiffer: Boolean, useWeb: Boolean): Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], doDependenciesDiffer = doDependenciesDiffer.asInstanceOf[js.Any], useWeb = useWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context[?], TContext /* <: typings.reactNativeReanimated.mod.Context */] (val x: Self & Context[TContext]) extends AnyVal {
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDoDependenciesDiffer(value: Boolean): Self = StObject.set(x, "doDependenciesDiffer", value.asInstanceOf[js.Any])
    
    inline def setUseWeb(value: Boolean): Self = StObject.set(x, "useWeb", value.asInstanceOf[js.Any])
  }
}
