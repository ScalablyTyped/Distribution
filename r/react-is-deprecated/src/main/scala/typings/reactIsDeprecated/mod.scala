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
  
  @scala.inline
  def addIsDeprecated(propTypes: ReactPropTypes): DeprecatablePropTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("addIsDeprecated")(propTypes.asInstanceOf[js.Any]).asInstanceOf[DeprecatablePropTypes]
  
  @scala.inline
  def deprecate[T](validator: Validator[T], message: String): Validator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(validator.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Validator[T]]
  
  trait Deprecatable[T] extends StObject {
    
    def isDeprecated(message: String): Validator[T]
  }
  object Deprecatable {
    
    @scala.inline
    def apply[T](isDeprecated: String => Validator[T]): Deprecatable[T] = {
      val __obj = js.Dynamic.literal(isDeprecated = js.Any.fromFunction1(isDeprecated))
      __obj.asInstanceOf[Deprecatable[T]]
    }
    
    @scala.inline
    implicit class DeprecatableMutableBuilder[Self <: Deprecatable[?], T] (val x: Self & Deprecatable[T]) extends AnyVal {
      
      @scala.inline
      def setIsDeprecated(value: String => Validator[T]): Self = StObject.set(x, "isDeprecated", js.Any.fromFunction1(value))
    }
  }
  
  // Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
  // define a version that intersects in the Deprecatable interface into the keys.
  trait DeprecatablePropTypes extends StObject {
    
    var any: Requireable[js.Any] & Deprecatable[js.Any]
    
    var array: Requireable[js.Any] & Deprecatable[js.Any]
    
    def arrayOf(`type`: Validator[js.Any]): Requireable[js.Any] & Deprecatable[js.Any]
    
    var bool: Requireable[js.Any] & Deprecatable[js.Any]
    
    var element: Requireable[js.Any] & Deprecatable[js.Any]
    
    var func: Requireable[js.Any] & Deprecatable[js.Any]
    
    def instanceOf(expectedClass: js.Object): Requireable[js.Any] & Deprecatable[js.Any]
    
    var node: Requireable[js.Any] & Deprecatable[js.Any]
    
    var number: Requireable[js.Any] & Deprecatable[js.Any]
    
    var `object`: Requireable[js.Any] & Deprecatable[js.Any]
    
    def objectOf(`type`: Validator[js.Any]): Requireable[js.Any] & Deprecatable[js.Any]
    
    def oneOf(types: js.Array[js.Any]): Requireable[js.Any] & Deprecatable[js.Any]
    
    def oneOfType(types: js.Array[Validator[js.Any]]): Requireable[js.Any] & Deprecatable[js.Any]
    
    def shape(`type`: ValidationMap[js.Any]): Requireable[js.Any] & Deprecatable[js.Any]
    
    var string: Requireable[js.Any] & Deprecatable[js.Any]
  }
  object DeprecatablePropTypes {
    
    @scala.inline
    def apply(
      any: Requireable[js.Any] & Deprecatable[js.Any],
      array: Requireable[js.Any] & Deprecatable[js.Any],
      arrayOf: Validator[js.Any] => Requireable[js.Any] & Deprecatable[js.Any],
      bool: Requireable[js.Any] & Deprecatable[js.Any],
      element: Requireable[js.Any] & Deprecatable[js.Any],
      func: Requireable[js.Any] & Deprecatable[js.Any],
      instanceOf: js.Object => Requireable[js.Any] & Deprecatable[js.Any],
      node: Requireable[js.Any] & Deprecatable[js.Any],
      number: Requireable[js.Any] & Deprecatable[js.Any],
      `object`: Requireable[js.Any] & Deprecatable[js.Any],
      objectOf: Validator[js.Any] => Requireable[js.Any] & Deprecatable[js.Any],
      oneOf: js.Array[js.Any] => Requireable[js.Any] & Deprecatable[js.Any],
      oneOfType: js.Array[Validator[js.Any]] => Requireable[js.Any] & Deprecatable[js.Any],
      shape: ValidationMap[js.Any] => Requireable[js.Any] & Deprecatable[js.Any],
      string: Requireable[js.Any] & Deprecatable[js.Any]
    ): DeprecatablePropTypes = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = js.Any.fromFunction1(arrayOf), bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = js.Any.fromFunction1(instanceOf), node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = js.Any.fromFunction1(objectOf), oneOf = js.Any.fromFunction1(oneOf), oneOfType = js.Any.fromFunction1(oneOfType), shape = js.Any.fromFunction1(shape), string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecatablePropTypes]
    }
    
    @scala.inline
    implicit class DeprecatablePropTypesMutableBuilder[Self <: DeprecatablePropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAny(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArray(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayOf(value: Validator[js.Any] => Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "arrayOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBool(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunc(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceOf(value: js.Object => Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "instanceOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNode(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectOf(value: Validator[js.Any] => Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "objectOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOneOf(value: js.Array[js.Any] => Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "oneOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOneOfType(value: js.Array[Validator[js.Any]] => Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "oneOfType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShape(value: ValidationMap[js.Any] => Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setString(value: Requireable[js.Any] & Deprecatable[js.Any]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
