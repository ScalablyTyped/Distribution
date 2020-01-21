package typings.reactIsDeprecated.mod

import typings.react.mod.Requireable
import typings.react.mod.ValidationMap
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
// define a version that intersects in the Deprecatable interface into the keys.
trait DeprecatablePropTypes extends js.Object {
  var any: Requireable[_] with Deprecatable[_]
  var array: Requireable[_] with Deprecatable[_]
  var bool: Requireable[_] with Deprecatable[_]
  var element: Requireable[_] with Deprecatable[_]
  var func: Requireable[_] with Deprecatable[_]
  var node: Requireable[_] with Deprecatable[_]
  var number: Requireable[_] with Deprecatable[_]
  var `object`: Requireable[_] with Deprecatable[_]
  var string: Requireable[_] with Deprecatable[_]
  def arrayOf(`type`: Validator[_]): Requireable[_] with Deprecatable[_]
  def instanceOf(expectedClass: js.Object): Requireable[_] with Deprecatable[_]
  def objectOf(`type`: Validator[_]): Requireable[_] with Deprecatable[_]
  def oneOf(types: js.Array[_]): Requireable[_] with Deprecatable[_]
  def oneOfType(types: js.Array[Validator[_]]): Requireable[_] with Deprecatable[_]
  def shape(`type`: ValidationMap[_]): Requireable[_] with Deprecatable[_]
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
}

