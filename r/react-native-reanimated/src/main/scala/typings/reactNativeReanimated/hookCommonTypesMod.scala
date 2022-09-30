package typings.reactNativeReanimated

import typings.reactNativeReanimated.coreMod._WorkletValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hookCommonTypesMod {
  
  type Context = Record[String, Any]
  
  trait ContextWithDependencies[TContext /* <: Context */] extends StObject {
    
    var context: TContext
    
    var savedDependencies: DependencyList
  }
  object ContextWithDependencies {
    
    inline def apply[TContext /* <: Context */](context: TContext): ContextWithDependencies[TContext] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextWithDependencies[TContext]]
    }
    
    extension [Self <: ContextWithDependencies[?], TContext /* <: Context */](x: Self & ContextWithDependencies[TContext]) {
      
      inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setSavedDependencies(value: DependencyList): Self = StObject.set(x, "savedDependencies", value.asInstanceOf[js.Any])
      
      inline def setSavedDependenciesUndefined: Self = StObject.set(x, "savedDependencies", js.undefined)
      
      inline def setSavedDependenciesVarargs(value: Any*): Self = StObject.set(x, "savedDependencies", js.Array(value*))
    }
  }
  
  type DependencyList = js.UndefOr[js.Array[Any]]
  
  trait Descriptor
    extends StObject
       with _WorkletValue {
    
    var name: String
    
    var tag: Double
  }
  object Descriptor {
    
    inline def apply(name: String, tag: Double): Descriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptor]
    }
    
    extension [Self <: Descriptor](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RefObjectFunction[T] extends StObject {
    
    def apply(): Double = js.native
    def apply(component: T): Double = js.native
    
    var current: T | Null = js.native
  }
}
