package typings.reactIsDeprecated

import typings.react.mod.ReactPropTypes
import typings.react.mod.Requireable
import typings.react.mod.ValidationMap
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-is-deprecated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addIsDeprecated(propTypes: ReactPropTypes): DeprecatablePropTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("addIsDeprecated")(propTypes.asInstanceOf[js.Any]).asInstanceOf[DeprecatablePropTypes]
  
  inline def deprecate[T](validator: Validator[T], message: String): Validator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(validator.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Validator[T]]
  
  trait Deprecatable[T] extends StObject {
    
    def isDeprecated(message: String): Validator[T]
  }
  object Deprecatable {
    
    inline def apply[T](isDeprecated: String => Validator[T]): Deprecatable[T] = {
      val __obj = js.Dynamic.literal(isDeprecated = js.Any.fromFunction1(isDeprecated))
      __obj.asInstanceOf[Deprecatable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deprecatable[?], T] (val x: Self & Deprecatable[T]) extends AnyVal {
      
      inline def setIsDeprecated(value: String => Validator[T]): Self = StObject.set(x, "isDeprecated", js.Any.fromFunction1(value))
    }
  }
  
  // Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
  // define a version that intersects in the Deprecatable interface into the keys.
  trait DeprecatablePropTypes extends StObject {
    
    var any: Requireable[Any] & Deprecatable[Any]
    
    var array: Requireable[Any] & Deprecatable[Any]
    
    def arrayOf(`type`: Validator[Any]): Requireable[Any] & Deprecatable[Any]
    
    var bool: Requireable[Any] & Deprecatable[Any]
    
    var element: Requireable[Any] & Deprecatable[Any]
    
    var func: Requireable[Any] & Deprecatable[Any]
    
    def instanceOf(expectedClass: js.Object): Requireable[Any] & Deprecatable[Any]
    
    var node: Requireable[Any] & Deprecatable[Any]
    
    var number: Requireable[Any] & Deprecatable[Any]
    
    var `object`: Requireable[Any] & Deprecatable[Any]
    
    def objectOf(`type`: Validator[Any]): Requireable[Any] & Deprecatable[Any]
    
    def oneOf(types: js.Array[Any]): Requireable[Any] & Deprecatable[Any]
    
    def oneOfType(types: js.Array[Validator[Any]]): Requireable[Any] & Deprecatable[Any]
    
    def shape(`type`: ValidationMap[Any]): Requireable[Any] & Deprecatable[Any]
    
    var string: Requireable[Any] & Deprecatable[Any]
  }
  object DeprecatablePropTypes {
    
    inline def apply(
      any: Requireable[Any] & Deprecatable[Any],
      array: Requireable[Any] & Deprecatable[Any],
      arrayOf: Validator[Any] => Requireable[Any] & Deprecatable[Any],
      bool: Requireable[Any] & Deprecatable[Any],
      element: Requireable[Any] & Deprecatable[Any],
      func: Requireable[Any] & Deprecatable[Any],
      instanceOf: js.Object => Requireable[Any] & Deprecatable[Any],
      node: Requireable[Any] & Deprecatable[Any],
      number: Requireable[Any] & Deprecatable[Any],
      `object`: Requireable[Any] & Deprecatable[Any],
      objectOf: Validator[Any] => Requireable[Any] & Deprecatable[Any],
      oneOf: js.Array[Any] => Requireable[Any] & Deprecatable[Any],
      oneOfType: js.Array[Validator[Any]] => Requireable[Any] & Deprecatable[Any],
      shape: ValidationMap[Any] => Requireable[Any] & Deprecatable[Any],
      string: Requireable[Any] & Deprecatable[Any]
    ): DeprecatablePropTypes = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = js.Any.fromFunction1(arrayOf), bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = js.Any.fromFunction1(instanceOf), node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = js.Any.fromFunction1(objectOf), oneOf = js.Any.fromFunction1(oneOf), oneOfType = js.Any.fromFunction1(oneOfType), shape = js.Any.fromFunction1(shape), string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecatablePropTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeprecatablePropTypes] (val x: Self) extends AnyVal {
      
      inline def setAny(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setArray(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayOf(value: Validator[Any] => Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "arrayOf", js.Any.fromFunction1(value))
      
      inline def setBool(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFunc(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setInstanceOf(value: js.Object => Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "instanceOf", js.Any.fromFunction1(value))
      
      inline def setNode(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectOf(value: Validator[Any] => Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "objectOf", js.Any.fromFunction1(value))
      
      inline def setOneOf(value: js.Array[Any] => Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "oneOf", js.Any.fromFunction1(value))
      
      inline def setOneOfType(value: js.Array[Validator[Any]] => Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "oneOfType", js.Any.fromFunction1(value))
      
      inline def setShape(value: ValidationMap[Any] => Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
      
      inline def setString(value: Requireable[Any] & Deprecatable[Any]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
