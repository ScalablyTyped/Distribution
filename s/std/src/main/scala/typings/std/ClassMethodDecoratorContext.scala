package typings.std

import typings.std.anon.Get
import typings.std.stdStrings.method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context provided to a class method decorator.
  * @template This The type on which the class element will be defined. For a static class element, this will be
  * the type of the constructor. For a non-static class element, this will be the type of the instance.
  * @template Value The type of the decorated class method.
  */
trait ClassMethodDecoratorContext[This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */] extends StObject {
  
  /** An object that can be used to access the current value of the class element at runtime. */
  /* standard decorators */
  val access: Get[This, Value]
  
  /**
    * Adds a callback to be invoked either before static initializers are run (when
    * decorating a `static` element), or before instance initializers are run (when
    * decorating a non-`static` element).
    *
    * @example
    * ```ts
    * const bound: ClassMethodDecoratorFunction = (value, context) {
    *   if (context.private) throw new TypeError("Not supported on private methods.");
    *   context.addInitializer(function () {
    *     this[context.name] = this[context.name].bind(this);
    *   });
    * }
    *
    * class C {
    *   message = "Hello";
    *
    *   @bound
    *   m() {
    *     console.log(this.message);
    *   }
    * }
    * ```
    */
  /* standard decorators */
  def addInitializer(initializer: js.ThisFunction0[/* this */ This, Unit]): Unit
  
  /** The kind of class element that was decorated. */
  /* standard decorators */
  val kind: method
  
  /** The name of the decorated class element. */
  /* standard decorators */
  val name: java.lang.String | js.Symbol
  
  /** A value indicating whether the class element has a private name. */
  /* standard decorators */
  val `private`: scala.Boolean
  
  /** A value indicating whether the class element is a static (`true`) or instance (`false`) element. */
  /* standard decorators */
  val static: scala.Boolean
}
object ClassMethodDecoratorContext {
  
  inline def apply[This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */](
    access: Get[This, Value],
    addInitializer: js.ThisFunction0[/* this */ This, Unit] => Unit,
    name: java.lang.String | js.Symbol,
    `private`: scala.Boolean,
    static: scala.Boolean
  ): ClassMethodDecoratorContext[This, Value] = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], addInitializer = js.Any.fromFunction1(addInitializer), kind = "method", name = name.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMethodDecoratorContext[This, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassMethodDecoratorContext[?, ?], This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */] (val x: Self & (ClassMethodDecoratorContext[This, Value])) extends AnyVal {
    
    inline def setAccess(value: Get[This, Value]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAddInitializer(value: js.ThisFunction0[/* this */ This, Unit] => Unit): Self = StObject.set(x, "addInitializer", js.Any.fromFunction1(value))
    
    inline def setKind(value: method): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: scala.Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: scala.Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
  }
}
