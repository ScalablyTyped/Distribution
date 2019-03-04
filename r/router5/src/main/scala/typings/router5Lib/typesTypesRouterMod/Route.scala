package typings
package router5Lib.typesTypesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var canActivate: js.UndefOr[ActivationFnFactory] = js.undefined
  var children: js.UndefOr[js.Array[Route]] = js.undefined
  var decodeParams: js.UndefOr[
    js.Function1[
      /* pathParams */ router5Lib.typesTypesBaseMod.Params, 
      router5Lib.typesTypesBaseMod.Params
    ]
  ] = js.undefined
  var defaultParams: js.UndefOr[router5Lib.typesTypesBaseMod.Params] = js.undefined
  var encodeParams: js.UndefOr[
    js.Function1[
      /* stateParams */ router5Lib.typesTypesBaseMod.Params, 
      router5Lib.typesTypesBaseMod.Params
    ]
  ] = js.undefined
  var forwardTo: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var path: java.lang.String
}

object Route {
  @scala.inline
  def apply(
    name: java.lang.String,
    path: java.lang.String,
    canActivate: ActivationFnFactory = null,
    children: js.Array[Route] = null,
    decodeParams: js.Function1[
      /* pathParams */ router5Lib.typesTypesBaseMod.Params, 
      router5Lib.typesTypesBaseMod.Params
    ] = null,
    defaultParams: router5Lib.typesTypesBaseMod.Params = null,
    encodeParams: js.Function1[
      /* stateParams */ router5Lib.typesTypesBaseMod.Params, 
      router5Lib.typesTypesBaseMod.Params
    ] = null,
    forwardTo: java.lang.String = null
  ): Route = {
    val __obj = js.Dynamic.literal(name = name, path = path)
    if (canActivate != null) __obj.updateDynamic("canActivate")(canActivate)
    if (children != null) __obj.updateDynamic("children")(children)
    if (decodeParams != null) __obj.updateDynamic("decodeParams")(decodeParams)
    if (defaultParams != null) __obj.updateDynamic("defaultParams")(defaultParams)
    if (encodeParams != null) __obj.updateDynamic("encodeParams")(encodeParams)
    if (forwardTo != null) __obj.updateDynamic("forwardTo")(forwardTo)
    __obj.asInstanceOf[Route]
  }
}

