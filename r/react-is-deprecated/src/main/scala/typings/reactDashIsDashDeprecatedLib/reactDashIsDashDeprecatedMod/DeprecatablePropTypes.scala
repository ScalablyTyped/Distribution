package typings
package reactDashIsDashDeprecatedLib.reactDashIsDashDeprecatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
// define a version that intersects in the Deprecatable interface into the keys.
trait DeprecatablePropTypes extends js.Object {
  var any: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  var array: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  var bool: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  var element: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  var func: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  var node: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  var number: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  var `object`: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  var string: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  def arrayOf(`type`: reactLib.reactMod.Validator[_]): reactLib.reactMod.Requireable[_] with Deprecatable[_]
  def instanceOf(expectedClass: js.Object): reactLib.reactMod.Requireable[_] with Deprecatable[_]
  def objectOf(`type`: reactLib.reactMod.Validator[_]): reactLib.reactMod.Requireable[_] with Deprecatable[_]
  def oneOf(types: js.Array[_]): reactLib.reactMod.Requireable[_] with Deprecatable[_]
  def oneOfType(types: js.Array[reactLib.reactMod.Validator[_]]): reactLib.reactMod.Requireable[_] with Deprecatable[_]
  def shape(`type`: reactLib.reactMod.ValidationMap[_]): reactLib.reactMod.Requireable[_] with Deprecatable[_]
}

object DeprecatablePropTypes {
  @scala.inline
  def apply(
    any: reactLib.reactMod.Requireable[_] with Deprecatable[_],
    array: reactLib.reactMod.Requireable[_] with Deprecatable[_],
    arrayOf: reactLib.reactMod.Validator[_] => reactLib.reactMod.Requireable[_] with Deprecatable[_],
    bool: reactLib.reactMod.Requireable[_] with Deprecatable[_],
    element: reactLib.reactMod.Requireable[_] with Deprecatable[_],
    func: reactLib.reactMod.Requireable[_] with Deprecatable[_],
    instanceOf: js.Object => reactLib.reactMod.Requireable[_] with Deprecatable[_],
    node: reactLib.reactMod.Requireable[_] with Deprecatable[_],
    number: reactLib.reactMod.Requireable[_] with Deprecatable[_],
    `object`: reactLib.reactMod.Requireable[_] with Deprecatable[_],
    objectOf: reactLib.reactMod.Validator[_] => reactLib.reactMod.Requireable[_] with Deprecatable[_],
    oneOf: js.Array[_] => reactLib.reactMod.Requireable[_] with Deprecatable[_],
    oneOfType: js.Array[reactLib.reactMod.Validator[_]] => reactLib.reactMod.Requireable[_] with Deprecatable[_],
    shape: reactLib.reactMod.ValidationMap[_] => reactLib.reactMod.Requireable[_] with Deprecatable[_],
    string: reactLib.reactMod.Requireable[_] with Deprecatable[_]
  ): DeprecatablePropTypes = {
    val __obj = js.Dynamic.literal(any = any, array = array, arrayOf = js.Any.fromFunction1(arrayOf), bool = bool, element = element, func = func, instanceOf = js.Any.fromFunction1(instanceOf), node = node, number = number, objectOf = js.Any.fromFunction1(objectOf), oneOf = js.Any.fromFunction1(oneOf), oneOfType = js.Any.fromFunction1(oneOfType), shape = js.Any.fromFunction1(shape), string = string)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[DeprecatablePropTypes]
  }
}

