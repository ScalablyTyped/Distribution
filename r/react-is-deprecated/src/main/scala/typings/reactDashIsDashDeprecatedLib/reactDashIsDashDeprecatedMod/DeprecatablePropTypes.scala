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

