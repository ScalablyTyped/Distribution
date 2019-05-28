package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: propDashTypesLib.propDashTypesMod.Requireable[_]
  var array: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  var arrayOf: reactLib.Fn_Type
  var bool: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var element: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike]
  var exact: reactLib.Fn_TypeAnyInferPropsP
  var func: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: reactLib.Fn_Args
  var node: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var number: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var `object`: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var objectOf: reactLib.Fn_TypeAny
  var oneOf: reactLib.Fn_Types
  var oneOfType: reactLib.Fn_TypesAny
  var shape: reactLib.Fn_TypeAnyInferProps
  var string: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: propDashTypesLib.propDashTypesMod.Requireable[_],
    array: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]],
    arrayOf: reactLib.Fn_Type,
    bool: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    element: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike],
    exact: reactLib.Fn_TypeAnyInferPropsP,
    func: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: reactLib.Fn_Args,
    node: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    number: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    `object`: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    objectOf: reactLib.Fn_TypeAny,
    oneOf: reactLib.Fn_Types,
    oneOfType: reactLib.Fn_TypesAny,
    shape: reactLib.Fn_TypeAnyInferProps,
    string: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any, array = array, arrayOf = arrayOf, bool = bool, element = element, exact = exact, func = func, instanceOf = instanceOf, node = node, number = number, objectOf = objectOf, oneOf = oneOf, oneOfType = oneOfType, shape = shape, string = string)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[ReactPropTypes]
  }
}

