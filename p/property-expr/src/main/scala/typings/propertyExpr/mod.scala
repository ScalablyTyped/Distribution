package typings.propertyExpr

import org.scalablytyped.runtime.Shortcut
import typings.propertyExpr.anon.ContentSecurityPolicy
import typings.propertyExpr.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("property-expr", JSImport.Namespace)
  @js.native
  val ^ : Expr = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("property-expr", "Cache")
  @js.native
  open class CacheCls protected ()
    extends StObject
       with Cache {
    def this(maxSize: Double) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: String): Any = js.native
    
    /* CompleteClass */
    override def set(key: String, value: Any): Any = js.native
  }
  
  trait Cache extends StObject {
    
    def clear(): Unit
    
    def get(key: String): Any
    
    def set(key: String, value: Any): Any
  }
  object Cache {
    
    inline def apply(clear: () => Unit, get: String => Any, set: (String, Any) => Any): Cache = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cache]
    }
    
    extension [Self <: Cache](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Expr extends StObject {
    
    var Cache: Instantiable = js.native
    
    def forEach(
      path: String,
      callback: js.Function5[
          /* part */ String, 
          /* isBracket */ Boolean, 
          /* isArray */ Boolean, 
          /* idx */ Double, 
          /* parts */ js.Array[String], 
          Any
        ]
    ): Unit = js.native
    def forEach(
      path: js.Array[String],
      callback: js.Function5[
          /* part */ String, 
          /* isBracket */ Boolean, 
          /* isArray */ Boolean, 
          /* idx */ Double, 
          /* parts */ js.Array[String], 
          Any
        ]
    ): Unit = js.native
    
    def getter(path: String): js.Function1[/* data */ Any, Any] = js.native
    def getter(path: String, safe: Boolean): js.Function1[/* data */ Any, Any] = js.native
    
    def join(segments: js.Array[String]): String = js.native
    
    def setConfig(config: ContentSecurityPolicy): Unit = js.native
    
    def setter(path: String): js.Function2[/* data */ Any, /* value */ Any, Any] = js.native
    
    def split(path: String): js.Array[String] = js.native
  }
  
  type _To = Expr
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Expr = ^
}
