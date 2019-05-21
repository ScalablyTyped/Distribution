package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: propDashTypesLib.propDashTypesMod.Requireable[_]
  var array: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  var arrayOf: reactLib.Anon_TypeArray
  var bool: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var element: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike]
  var exact: reactLib.Anon_TypeAnyInferPropsP
  var func: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: reactLib.Anon_Args
  var node: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var number: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var `object`: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var objectOf: reactLib.Anon_TypeAny
  var oneOf: reactLib.Anon_Types
  var oneOfType: reactLib.Anon_TypesAny
  var shape: reactLib.Anon_TypeAnyInferProps
  var string: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: propDashTypesLib.propDashTypesMod.Requireable[_],
    array: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]],
    arrayOf: reactLib.Anon_TypeArray,
    bool: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    element: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike],
    exact: reactLib.Anon_TypeAnyInferPropsP,
    func: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: reactLib.Anon_Args,
    node: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    number: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    `object`: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    objectOf: reactLib.Anon_TypeAny,
    oneOf: reactLib.Anon_Types,
    oneOfType: reactLib.Anon_TypesAny,
    shape: reactLib.Anon_TypeAnyInferProps,
    string: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any, array = array, arrayOf = arrayOf, bool = bool, element = element, exact = exact, func = func, instanceOf = instanceOf, node = node, number = number, objectOf = objectOf, oneOf = oneOf, oneOfType = oneOfType, shape = shape, string = string)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[ReactPropTypes]
  }
}

