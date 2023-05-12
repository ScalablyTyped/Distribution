package typings.std

import org.scalablytyped.runtime.Instantiable1
import typings.std.stdStrings.`class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context provided to a class decorator.
  * @template Class The type of the decorated class associated with this context.
  */
trait ClassDecoratorContext[Class /* <: Instantiable1[/* args */ Any, Any] */] extends StObject {
  
  /**
    * Adds a callback to be invoked after the class definition has been finalized.
    *
    * @example
    * ```ts
    * function customElement(name: string): ClassDecoratorFunction {
    *   return (target, context) => {
    *     context.addInitializer(function () {
    *       customElements.define(name, this);
    *     });
    *   }
    * }
    *
    * @customElement("my-element")
    * class MyElement {}
    * ```
    */
  /* standard decorators */
  def addInitializer(initializer: js.ThisFunction0[/* this */ Class, Unit]): Unit
  
  /** The kind of element that was decorated. */
  /* standard decorators */
  val kind: `class`
  
  /** The name of the decorated class. */
  /* standard decorators */
  val name: js.UndefOr[java.lang.String] = js.undefined
}
object ClassDecoratorContext {
  
  inline def apply[Class /* <: Instantiable1[/* args */ Any, Any] */](addInitializer: js.ThisFunction0[/* this */ Class, Unit] => Unit): ClassDecoratorContext[Class] = {
    val __obj = js.Dynamic.literal(addInitializer = js.Any.fromFunction1(addInitializer), kind = "class")
    __obj.asInstanceOf[ClassDecoratorContext[Class]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassDecoratorContext[?], Class /* <: Instantiable1[/* args */ Any, Any] */] (val x: Self & ClassDecoratorContext[Class]) extends AnyVal {
    
    inline def setAddInitializer(value: js.ThisFunction0[/* this */ Class, Unit] => Unit): Self = StObject.set(x, "addInitializer", js.Any.fromFunction1(value))
    
    inline def setKind(value: `class`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
