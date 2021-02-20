package typings.reactIsDeprecated

import typings.react.mod.ReactPropTypes
import typings.react.mod.Requireable
import typings.react.mod.ValidationMap
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-is-deprecated", "addIsDeprecated")
  @js.native
  def addIsDeprecated(propTypes: ReactPropTypes): DeprecatablePropTypes = js.native
  
  @JSImport("react-is-deprecated", "deprecate")
  @js.native
  def deprecate[T](validator: Validator[T], message: String): Validator[T] = js.native
  
  @js.native
  trait Deprecatable[T] extends StObject {
    
    def isDeprecated(message: String): Validator[T] = js.native
  }
  object Deprecatable {
    
    @scala.inline
    def apply[T](isDeprecated: String => Validator[T]): Deprecatable[T] = {
      val __obj = js.Dynamic.literal(isDeprecated = js.Any.fromFunction1(isDeprecated))
      __obj.asInstanceOf[Deprecatable[T]]
    }
    
    @scala.inline
    implicit class DeprecatableMutableBuilder[Self <: Deprecatable[_], T] (val x: Self with Deprecatable[T]) extends AnyVal {
      
      @scala.inline
      def setIsDeprecated(value: String => Validator[T]): Self = StObject.set(x, "isDeprecated", js.Any.fromFunction1(value))
    }
  }
  
  // Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
  // define a version that intersects in the Deprecatable interface into the keys.
  @js.native
  trait DeprecatablePropTypes extends StObject {
    
    var any: Requireable[_] with Deprecatable[_] = js.native
    
    var array: Requireable[_] with Deprecatable[_] = js.native
    
    def arrayOf(`type`: Validator[_]): Requireable[_] with Deprecatable[_] = js.native
    
    var bool: Requireable[_] with Deprecatable[_] = js.native
    
    var element: Requireable[_] with Deprecatable[_] = js.native
    
    var func: Requireable[_] with Deprecatable[_] = js.native
    
    def instanceOf(expectedClass: js.Object): Requireable[_] with Deprecatable[_] = js.native
    
    var node: Requireable[_] with Deprecatable[_] = js.native
    
    var number: Requireable[_] with Deprecatable[_] = js.native
    
    var `object`: Requireable[_] with Deprecatable[_] = js.native
    
    def objectOf(`type`: Validator[_]): Requireable[_] with Deprecatable[_] = js.native
    
    def oneOf(types: js.Array[_]): Requireable[_] with Deprecatable[_] = js.native
    
    def oneOfType(types: js.Array[Validator[_]]): Requireable[_] with Deprecatable[_] = js.native
    
    def shape(`type`: ValidationMap[_]): Requireable[_] with Deprecatable[_] = js.native
    
    var string: Requireable[_] with Deprecatable[_] = js.native
  }
  object DeprecatablePropTypes {
    
    @scala.inline
    def apply(
      any: Requireable[_] with Deprecatable[_],
      array: Requireable[_] with Deprecatable[_],
      arrayOf: Validator[_] => Requireable[_] with Deprecatable[_],
      bool: Requireable[_] with Deprecatable[_],
      element: Requireable[_] with Deprecatable[_],
      func: Requireable[_] with Deprecatable[_],
      instanceOf: js.Object => Requireable[_] with Deprecatable[_],
      node: Requireable[_] with Deprecatable[_],
      number: Requireable[_] with Deprecatable[_],
      `object`: Requireable[_] with Deprecatable[_],
      objectOf: Validator[_] => Requireable[_] with Deprecatable[_],
      oneOf: js.Array[_] => Requireable[_] with Deprecatable[_],
      oneOfType: js.Array[Validator[_]] => Requireable[_] with Deprecatable[_],
      shape: ValidationMap[_] => Requireable[_] with Deprecatable[_],
      string: Requireable[_] with Deprecatable[_]
    ): DeprecatablePropTypes = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = js.Any.fromFunction1(arrayOf), bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = js.Any.fromFunction1(instanceOf), node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = js.Any.fromFunction1(objectOf), oneOf = js.Any.fromFunction1(oneOf), oneOfType = js.Any.fromFunction1(oneOfType), shape = js.Any.fromFunction1(shape), string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecatablePropTypes]
    }
    
    @scala.inline
    implicit class DeprecatablePropTypesMutableBuilder[Self <: DeprecatablePropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAny(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArray(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayOf(value: Validator[_] => Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "arrayOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBool(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunc(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceOf(value: js.Object => Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "instanceOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNode(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectOf(value: Validator[_] => Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "objectOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOneOf(value: js.Array[_] => Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "oneOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOneOfType(value: js.Array[Validator[_]] => Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "oneOfType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShape(value: ValidationMap[_] => Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setString(value: Requireable[_] with Deprecatable[_]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
