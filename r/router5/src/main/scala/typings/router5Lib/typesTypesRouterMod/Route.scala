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

