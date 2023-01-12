package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyHandler[T /* <: js.Object */] extends StObject {
  
  /**
    * A trap method for a function call.
    * @param target The original callable object which is being proxied.
    */
  /* standard es2015.proxy */
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ Any, /* argArray */ js.Array[Any], Any]
  ] = js.undefined
  
  /**
    * A trap for the `new` operator.
    * @param target The original object which is being proxied.
    * @param newTarget The constructor that was originally called.
    */
  /* standard es2015.proxy */
  var construct: js.UndefOr[
    js.Function3[/* target */ T, /* argArray */ js.Array[Any], /* newTarget */ js.Function, js.Object]
  ] = js.undefined
  
  /**
    * A trap for `Object.defineProperty()`.
    * @param target The original object which is being proxied.
    * @returns A `Boolean` indicating whether or not the property has been defined.
    */
  /* standard es2015.proxy */
  var defineProperty: js.UndefOr[
    js.Function3[
      /* target */ T, 
      /* property */ java.lang.String | js.Symbol, 
      /* attributes */ js.PropertyDescriptor, 
      scala.Boolean
    ]
  ] = js.undefined
  
  /**
    * A trap for the `delete` operator.
    * @param target The original object which is being proxied.
    * @param p The name or `Symbol` of the property to delete.
    * @returns A `Boolean` indicating whether or not the property was deleted.
    */
  /* standard es2015.proxy */
  var deleteProperty: js.UndefOr[
    js.Function2[/* target */ T, /* p */ java.lang.String | js.Symbol, scala.Boolean]
  ] = js.undefined
  
  /**
    * A trap for getting a property value.
    * @param target The original object which is being proxied.
    * @param p The name or `Symbol` of the property to get.
    * @param receiver The proxy or an object that inherits from the proxy.
    */
  /* standard es2015.proxy */
  var get: js.UndefOr[
    js.Function3[/* target */ T, /* p */ java.lang.String | js.Symbol, /* receiver */ Any, Any]
  ] = js.undefined
  
  /**
    * A trap for `Object.getOwnPropertyDescriptor()`.
    * @param target The original object which is being proxied.
    * @param p The name of the property whose description should be retrieved.
    */
  /* standard es2015.proxy */
  var getOwnPropertyDescriptor: js.UndefOr[
    js.Function2[
      /* target */ T, 
      /* p */ java.lang.String | js.Symbol, 
      js.UndefOr[js.PropertyDescriptor]
    ]
  ] = js.undefined
  
  /**
    * A trap for the `[[GetPrototypeOf]]` internal method.
    * @param target The original object which is being proxied.
    */
  /* standard es2015.proxy */
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, js.Object | Null]] = js.undefined
  
  /**
    * A trap for the `in` operator.
    * @param target The original object which is being proxied.
    * @param p The name or `Symbol` of the property to check for existence.
    */
  /* standard es2015.proxy */
  var has: js.UndefOr[
    js.Function2[/* target */ T, /* p */ java.lang.String | js.Symbol, scala.Boolean]
  ] = js.undefined
  
  /**
    * A trap for `Object.isExtensible()`.
    * @param target The original object which is being proxied.
    */
  /* standard es2015.proxy */
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.undefined
  
  /**
    * A trap for `Reflect.ownKeys()`.
    * @param target The original object which is being proxied.
    */
  /* standard es2015.proxy */
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, ArrayLike[java.lang.String | js.Symbol]]] = js.undefined
  
  /**
    * A trap for `Object.preventExtensions()`.
    * @param target The original object which is being proxied.
    */
  /* standard es2015.proxy */
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.undefined
  
  /**
    * A trap for setting a property value.
    * @param target The original object which is being proxied.
    * @param p The name or `Symbol` of the property to set.
    * @param receiver The object to which the assignment was originally directed.
    * @returns A `Boolean` indicating whether or not the property was set.
    */
  /* standard es2015.proxy */
  var set: js.UndefOr[
    js.Function4[
      /* target */ T, 
      /* p */ java.lang.String | js.Symbol, 
      /* newValue */ Any, 
      /* receiver */ Any, 
      scala.Boolean
    ]
  ] = js.undefined
  
  /**
    * A trap for `Object.setPrototypeOf()`.
    * @param target The original object which is being proxied.
    * @param newPrototype The object's new prototype or `null`.
    */
  /* standard es2015.proxy */
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ js.Object | Null, scala.Boolean]] = js.undefined
}
object ProxyHandler {
  
  inline def apply[T /* <: js.Object */](): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyHandler[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProxyHandler[?], T /* <: js.Object */] (val x: Self & ProxyHandler[T]) extends AnyVal {
    
    inline def setApply(value: (/* target */ T, /* thisArg */ Any, /* argArray */ js.Array[Any]) => Any): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setConstruct(value: (/* target */ T, /* argArray */ js.Array[Any], /* newTarget */ js.Function) => js.Object): Self = StObject.set(x, "construct", js.Any.fromFunction3(value))
    
    inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
    
    inline def setDefineProperty(
      value: (/* target */ T, /* property */ java.lang.String | js.Symbol, /* attributes */ js.PropertyDescriptor) => scala.Boolean
    ): Self = StObject.set(x, "defineProperty", js.Any.fromFunction3(value))
    
    inline def setDefinePropertyUndefined: Self = StObject.set(x, "defineProperty", js.undefined)
    
    inline def setDeleteProperty(value: (/* target */ T, /* p */ java.lang.String | js.Symbol) => scala.Boolean): Self = StObject.set(x, "deleteProperty", js.Any.fromFunction2(value))
    
    inline def setDeletePropertyUndefined: Self = StObject.set(x, "deleteProperty", js.undefined)
    
    inline def setGet(value: (/* target */ T, /* p */ java.lang.String | js.Symbol, /* receiver */ Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
    
    inline def setGetOwnPropertyDescriptor(value: (/* target */ T, /* p */ java.lang.String | js.Symbol) => js.UndefOr[js.PropertyDescriptor]): Self = StObject.set(x, "getOwnPropertyDescriptor", js.Any.fromFunction2(value))
    
    inline def setGetOwnPropertyDescriptorUndefined: Self = StObject.set(x, "getOwnPropertyDescriptor", js.undefined)
    
    inline def setGetPrototypeOf(value: /* target */ T => js.Object | Null): Self = StObject.set(x, "getPrototypeOf", js.Any.fromFunction1(value))
    
    inline def setGetPrototypeOfUndefined: Self = StObject.set(x, "getPrototypeOf", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setHas(value: (/* target */ T, /* p */ java.lang.String | js.Symbol) => scala.Boolean): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
    
    inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    
    inline def setIsExtensible(value: /* target */ T => scala.Boolean): Self = StObject.set(x, "isExtensible", js.Any.fromFunction1(value))
    
    inline def setIsExtensibleUndefined: Self = StObject.set(x, "isExtensible", js.undefined)
    
    inline def setOwnKeys(value: /* target */ T => ArrayLike[java.lang.String | js.Symbol]): Self = StObject.set(x, "ownKeys", js.Any.fromFunction1(value))
    
    inline def setOwnKeysUndefined: Self = StObject.set(x, "ownKeys", js.undefined)
    
    inline def setPreventExtensions(value: /* target */ T => scala.Boolean): Self = StObject.set(x, "preventExtensions", js.Any.fromFunction1(value))
    
    inline def setPreventExtensionsUndefined: Self = StObject.set(x, "preventExtensions", js.undefined)
    
    inline def setSet(
      value: (/* target */ T, /* p */ java.lang.String | js.Symbol, /* newValue */ Any, /* receiver */ Any) => scala.Boolean
    ): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
    
    inline def setSetPrototypeOf(value: (/* target */ T, /* v */ js.Object | Null) => scala.Boolean): Self = StObject.set(x, "setPrototypeOf", js.Any.fromFunction2(value))
    
    inline def setSetPrototypeOfUndefined: Self = StObject.set(x, "setPrototypeOf", js.undefined)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
