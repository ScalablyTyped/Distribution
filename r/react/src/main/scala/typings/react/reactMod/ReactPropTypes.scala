package typings.react.reactMod

import typings.propDashTypes.propDashTypesMod.ReactElementLike
import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.react.Fn_Args
import typings.react.Fn_Type
import typings.react.Fn_TypeAny
import typings.react.Fn_TypeAnyInferProps
import typings.react.Fn_TypeAnyInferPropsP
import typings.react.Fn_Types
import typings.react.Fn_TypesAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: typings.propDashTypes.propDashTypesMod.Requireable[_]
  var array: typings.propDashTypes.propDashTypesMod.Requireable[js.Array[_]]
  var arrayOf: Fn_Type
  var bool: typings.propDashTypes.propDashTypesMod.Requireable[Boolean]
  var element: typings.propDashTypes.propDashTypesMod.Requireable[ReactElementLike]
  var exact: Fn_TypeAnyInferPropsP
  var func: typings.propDashTypes.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: Fn_Args
  var node: typings.propDashTypes.propDashTypesMod.Requireable[ReactNodeLike]
  var number: typings.propDashTypes.propDashTypesMod.Requireable[Double]
  var `object`: typings.propDashTypes.propDashTypesMod.Requireable[js.Object]
  var objectOf: Fn_TypeAny
  var oneOf: Fn_Types
  var oneOfType: Fn_TypesAny
  var shape: Fn_TypeAnyInferProps
  var string: typings.propDashTypes.propDashTypesMod.Requireable[String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: typings.propDashTypes.propDashTypesMod.Requireable[_],
    array: typings.propDashTypes.propDashTypesMod.Requireable[js.Array[_]],
    arrayOf: Fn_Type,
    bool: typings.propDashTypes.propDashTypesMod.Requireable[Boolean],
    element: typings.propDashTypes.propDashTypesMod.Requireable[ReactElementLike],
    exact: Fn_TypeAnyInferPropsP,
    func: typings.propDashTypes.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: Fn_Args,
    node: typings.propDashTypes.propDashTypesMod.Requireable[ReactNodeLike],
    number: typings.propDashTypes.propDashTypesMod.Requireable[Double],
    `object`: typings.propDashTypes.propDashTypesMod.Requireable[js.Object],
    objectOf: Fn_TypeAny,
    oneOf: Fn_Types,
    oneOfType: Fn_TypesAny,
    shape: Fn_TypeAnyInferProps,
    string: typings.propDashTypes.propDashTypesMod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any, array = array, arrayOf = arrayOf, bool = bool, element = element, exact = exact, func = func, instanceOf = instanceOf, node = node, number = number, objectOf = objectOf, oneOf = oneOf, oneOfType = oneOfType, shape = shape, string = string)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[ReactPropTypes]
  }
}

