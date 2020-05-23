package typings.react.mod

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.react.anon.Fn0
import typings.react.anon.Fn1
import typings.react.anon.Fn2
import typings.react.anon.Fn3
import typings.react.anon.FnCall
import typings.react.anon.FnCallType
import typings.react.anon.FnCallTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: typings.propTypes.mod.Requireable[_]
  var array: typings.propTypes.mod.Requireable[js.Array[_]]
  var arrayOf: FnCallType
  var bool: typings.propTypes.mod.Requireable[Boolean]
  var element: typings.propTypes.mod.Requireable[ReactElementLike]
  var exact: Fn3
  var func: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: FnCall
  var node: typings.propTypes.mod.Requireable[ReactNodeLike]
  var number: typings.propTypes.mod.Requireable[Double]
  var `object`: typings.propTypes.mod.Requireable[js.Object]
  var objectOf: Fn1
  var oneOf: FnCallTypes
  var oneOfType: Fn0
  var shape: Fn2
  var string: typings.propTypes.mod.Requireable[String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: typings.propTypes.mod.Requireable[_],
    array: typings.propTypes.mod.Requireable[js.Array[_]],
    arrayOf: FnCallType,
    bool: typings.propTypes.mod.Requireable[Boolean],
    element: typings.propTypes.mod.Requireable[ReactElementLike],
    exact: Fn3,
    func: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: FnCall,
    node: typings.propTypes.mod.Requireable[ReactNodeLike],
    number: typings.propTypes.mod.Requireable[Double],
    `object`: typings.propTypes.mod.Requireable[js.Object],
    objectOf: Fn1,
    oneOf: FnCallTypes,
    oneOfType: Fn0,
    shape: Fn2,
    string: typings.propTypes.mod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
}

