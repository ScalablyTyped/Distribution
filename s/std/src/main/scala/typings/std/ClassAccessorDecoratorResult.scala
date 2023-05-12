package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the allowed return value from a class `accessor` field decorator.
  * @template This The `this` type to which the target applies.
  * @template Value The property type for the class `accessor` field.
  */
trait ClassAccessorDecoratorResult[This, Value] extends StObject {
  
  /**
    * An optional replacement getter function. If not provided, the existing getter function is used instead.
    */
  /* standard decorators */
  var get: js.UndefOr[js.ThisFunction0[/* this */ This, Value]] = js.undefined
  
  /**
    * An optional initializer mutator that is invoked when the underlying field initializer is evaluated.
    * @param value The incoming initializer value.
    * @returns The replacement initializer value.
    */
  /* standard decorators */
  var init: js.UndefOr[js.ThisFunction1[/* this */ This, /* value */ Value, Value]] = js.undefined
  
  /**
    * An optional replacement setter function. If not provided, the existing setter function is used instead.
    */
  /* standard decorators */
  var set: js.UndefOr[js.ThisFunction1[/* this */ This, /* value */ Value, Unit]] = js.undefined
}
object ClassAccessorDecoratorResult {
  
  inline def apply[This, Value](): ClassAccessorDecoratorResult[This, Value] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassAccessorDecoratorResult[This, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassAccessorDecoratorResult[?, ?], This, Value] (val x: Self & (ClassAccessorDecoratorResult[This, Value])) extends AnyVal {
    
    inline def setGet(value: js.ThisFunction0[/* this */ This, Value]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setInit(value: js.ThisFunction1[/* this */ This, /* value */ Value, Value]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setSet(value: js.ThisFunction1[/* this */ This, /* value */ Value, Unit]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
