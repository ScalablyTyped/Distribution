package typings.std

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
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, js.Object | Null]] = js.undefined
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

object ProxyHandler {
  @scala.inline
  def apply[T](
    apply: (/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any]) => _ = null,
    construct: (/* target */ T, /* argArray */ js.Any, /* newTarget */ js.UndefOr[js.Any]) => js.Object = null,
    defineProperty: (/* target */ T, /* p */ PropertyKey, /* attributes */ PropertyDescriptor) => scala.Boolean = null,
    deleteProperty: (/* target */ T, /* p */ PropertyKey) => scala.Boolean = null,
    enumerate: /* target */ T => js.Array[PropertyKey] = null,
    get: (/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any) => _ = null,
    getOwnPropertyDescriptor: (/* target */ T, /* p */ PropertyKey) => js.UndefOr[PropertyDescriptor] = null,
    getPrototypeOf: /* target */ T => js.Object | Null = null,
    has: (/* target */ T, /* p */ PropertyKey) => scala.Boolean = null,
    isExtensible: /* target */ T => scala.Boolean = null,
    ownKeys: /* target */ T => js.Array[PropertyKey] = null,
    preventExtensions: /* target */ T => scala.Boolean = null,
    set: (/* target */ T, /* p */ PropertyKey, /* value */ js.Any, /* receiver */ js.Any) => scala.Boolean = null,
    setPrototypeOf: (/* target */ T, /* v */ js.Any) => scala.Boolean = null
  ): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction3(apply))
    if (construct != null) __obj.updateDynamic("construct")(js.Any.fromFunction3(construct))
    if (defineProperty != null) __obj.updateDynamic("defineProperty")(js.Any.fromFunction3(defineProperty))
    if (deleteProperty != null) __obj.updateDynamic("deleteProperty")(js.Any.fromFunction2(deleteProperty))
    if (enumerate != null) __obj.updateDynamic("enumerate")(js.Any.fromFunction1(enumerate))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction3(get))
    if (getOwnPropertyDescriptor != null) __obj.updateDynamic("getOwnPropertyDescriptor")(js.Any.fromFunction2(getOwnPropertyDescriptor))
    if (getPrototypeOf != null) __obj.updateDynamic("getPrototypeOf")(js.Any.fromFunction1(getPrototypeOf))
    if (has != null) __obj.updateDynamic("has")(js.Any.fromFunction2(has))
    if (isExtensible != null) __obj.updateDynamic("isExtensible")(js.Any.fromFunction1(isExtensible))
    if (ownKeys != null) __obj.updateDynamic("ownKeys")(js.Any.fromFunction1(ownKeys))
    if (preventExtensions != null) __obj.updateDynamic("preventExtensions")(js.Any.fromFunction1(preventExtensions))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction4(set))
    if (setPrototypeOf != null) __obj.updateDynamic("setPrototypeOf")(js.Any.fromFunction2(setPrototypeOf))
    __obj.asInstanceOf[ProxyHandler[T]]
  }
}

