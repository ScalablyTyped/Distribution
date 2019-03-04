package typings
package reactDashIsDashDeprecatedLib.reactDashIsDashDeprecatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
// define a version that intersects in the Deprecatable interface into the keys.
trait DeprecatablePropTypes extends js.Object {
  var any: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  var array: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  var bool: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  var element: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  var func: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  var node: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  var number: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  var `object`: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  var string: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  def arrayOf(`type`: reactLib.reactMod.ReactNs.Validator[_]): reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  def instanceOf(expectedClass: js.Object): reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  def objectOf(`type`: reactLib.reactMod.ReactNs.Validator[_]): reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  def oneOf(types: js.Array[_]): reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  def oneOfType(types: js.Array[reactLib.reactMod.ReactNs.Validator[_]]): reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  def shape(`type`: reactLib.reactMod.ReactNs.ValidationMap[_]): reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
}

object DeprecatablePropTypes {
  @scala.inline
  def apply(
    any: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_],
    array: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_],
    arrayOf: js.Function1[
      reactLib.reactMod.ReactNs.Validator[_], 
      reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
    ],
    bool: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_],
    element: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_],
    func: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_],
    instanceOf: js.Function1[js.Object, reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]],
    node: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_],
    number: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_],
    `object`: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_],
    objectOf: js.Function1[
      reactLib.reactMod.ReactNs.Validator[_], 
      reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
    ],
    oneOf: js.Function1[js.Array[_], reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]],
    oneOfType: js.Function1[
      js.Array[reactLib.reactMod.ReactNs.Validator[_]], 
      reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
    ],
    shape: js.Function1[
      reactLib.reactMod.ReactNs.ValidationMap[_], 
      reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
    ],
    string: reactLib.reactMod.ReactNs.Requireable[_] with Deprecatable[_]
  ): DeprecatablePropTypes = {
    val __obj = js.Dynamic.literal(any = any, array = array, arrayOf = arrayOf, bool = bool, element = element, func = func, instanceOf = instanceOf, node = node, number = number, objectOf = objectOf, oneOf = oneOf, oneOfType = oneOfType, shape = shape, string = string)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[DeprecatablePropTypes]
  }
}

