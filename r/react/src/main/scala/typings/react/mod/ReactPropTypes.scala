package typings.react.mod

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.react.FnArgs
import typings.react.FnType
import typings.react.FnTypeAny
import typings.react.FnTypeAnyInferProps
import typings.react.FnTypeAnyInferPropsP
import typings.react.FnTypes
import typings.react.FnTypesAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: typings.propTypes.mod.Requireable[_]
  var array: typings.propTypes.mod.Requireable[js.Array[_]]
  var arrayOf: FnType
  var bool: typings.propTypes.mod.Requireable[Boolean]
  var element: typings.propTypes.mod.Requireable[ReactElementLike]
  var exact: FnTypeAnyInferPropsP
  var func: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: FnArgs
  var node: typings.propTypes.mod.Requireable[ReactNodeLike]
  var number: typings.propTypes.mod.Requireable[Double]
  var `object`: typings.propTypes.mod.Requireable[js.Object]
  var objectOf: FnTypeAny
  var oneOf: FnTypes
  var oneOfType: FnTypesAny
  var shape: FnTypeAnyInferProps
  var string: typings.propTypes.mod.Requireable[String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: typings.propTypes.mod.Requireable[_],
    array: typings.propTypes.mod.Requireable[js.Array[_]],
    arrayOf: FnType,
    bool: typings.propTypes.mod.Requireable[Boolean],
    element: typings.propTypes.mod.Requireable[ReactElementLike],
    exact: FnTypeAnyInferPropsP,
    func: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: FnArgs,
    node: typings.propTypes.mod.Requireable[ReactNodeLike],
    number: typings.propTypes.mod.Requireable[Double],
    `object`: typings.propTypes.mod.Requireable[js.Object],
    objectOf: FnTypeAny,
    oneOf: FnTypes,
    oneOfType: FnTypesAny,
    shape: FnTypeAnyInferProps,
    string: typings.propTypes.mod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
}

