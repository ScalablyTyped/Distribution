package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProxyHandler[T /* <: js.Object */] extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.undefined
  var construct: js.UndefOr[
    js.Function3[/* target */ T, /* argArray */ js.Any, /* newTarget */ js.UndefOr[js.Any], js.Object]
  ] = js.undefined
  var defineProperty: js.UndefOr[
    js.Function3[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* attributes */ PropertyDescriptor, 
      scala.Boolean
    ]
  ] = js.undefined
  var deleteProperty: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.undefined
  var enumerate: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.undefined
  var get: js.UndefOr[js.Function3[/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any, _]] = js.undefined
  var getOwnPropertyDescriptor: js.UndefOr[
    js.Function2[/* target */ T, /* p */ PropertyKey, js.UndefOr[PropertyDescriptor]]
  ] = js.undefined
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, js.Object | scala.Null]] = js.undefined
  var has: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.undefined
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.undefined
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.undefined
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.undefined
  var set: js.UndefOr[
    js.Function4[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* value */ js.Any, 
      /* receiver */ js.Any, 
      scala.Boolean
    ]
  ] = js.undefined
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ js.Any, scala.Boolean]] = js.undefined
}

