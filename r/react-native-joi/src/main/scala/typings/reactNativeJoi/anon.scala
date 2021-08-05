package typings.reactNativeJoi

import typings.reactNativeJoi.mod.Context
import typings.reactNativeJoi.mod.Err
import typings.reactNativeJoi.mod.State
import typings.reactNativeJoi.mod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arrays extends StObject {
    
    var arrays: js.UndefOr[Boolean] = js.undefined
    
    var objects: js.UndefOr[Boolean] = js.undefined
  }
  object Arrays {
    
    inline def apply(): Arrays = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Arrays]
    }
    
    extension [Self <: Arrays](x: Self) {
      
      inline def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    }
  }
  
  trait CreateError extends StObject {
    
    /**
      * Creates a joi error object.
      * Used in conjunction with custom rules.
      * @param type - the type of rule to create the error for.
      * @param context - provide properties that will be available in the `language` templates.
      * @param state - should the context passed into the `validate` function in a custom rule
      * @param options - should the context passed into the `validate` function in a custom rule
      */
    def createError(`type`: String, context: Context, state: State, options: ValidationOptions): Err
  }
  object CreateError {
    
    inline def apply(createError: (String, Context, State, ValidationOptions) => Err): CreateError = {
      val __obj = js.Dynamic.literal(createError = js.Any.fromFunction4(createError))
      __obj.asInstanceOf[CreateError]
    }
    
    extension [Self <: CreateError](x: Self) {
      
      inline def setCreateError(value: (String, Context, State, ValidationOptions) => Err): Self = StObject.set(x, "createError", js.Any.fromFunction4(value))
    }
  }
  
  trait WrapArrays extends StObject {
    
    var wrapArrays: js.UndefOr[Boolean] = js.undefined
  }
  object WrapArrays {
    
    inline def apply(): WrapArrays = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapArrays]
    }
    
    extension [Self <: WrapArrays](x: Self) {
      
      inline def setWrapArrays(value: Boolean): Self = StObject.set(x, "wrapArrays", value.asInstanceOf[js.Any])
      
      inline def setWrapArraysUndefined: Self = StObject.set(x, "wrapArrays", js.undefined)
    }
  }
}
