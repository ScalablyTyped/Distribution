package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyHandler[T /* <: js.Object */] extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.native
  var construct: js.UndefOr[
    js.Function3[/* target */ T, /* argArray */ js.Any, /* newTarget */ js.UndefOr[js.Any], js.Object]
  ] = js.native
  var defineProperty: js.UndefOr[
    js.Function3[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* attributes */ PropertyDescriptor, 
      scala.Boolean
    ]
  ] = js.native
  var deleteProperty: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.native
  var enumerate: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.native
  var get: js.UndefOr[js.Function3[/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any, _]] = js.native
  var getOwnPropertyDescriptor: js.UndefOr[
    js.Function2[/* target */ T, /* p */ PropertyKey, js.UndefOr[PropertyDescriptor]]
  ] = js.native
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, js.Object | Null]] = js.native
  var has: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.native
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.native
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.native
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.native
  var set: js.UndefOr[
    js.Function4[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* value */ js.Any, 
      /* receiver */ js.Any, 
      scala.Boolean
    ]
  ] = js.native
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ js.Any, scala.Boolean]] = js.native
}

object ProxyHandler {
  @scala.inline
  def apply[/* <: js.Object */ T](): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyHandler[T]]
  }
  @scala.inline
  implicit class ProxyHandlerOps[Self <: ProxyHandler[_], /* <: js.Object */ T] (val x: Self with ProxyHandler[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApply(value: (/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any]) => _): Self = this.set("apply", js.Any.fromFunction3(value))
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    @scala.inline
    def setConstruct(value: (/* target */ T, /* argArray */ js.Any, /* newTarget */ js.UndefOr[js.Any]) => js.Object): Self = this.set("construct", js.Any.fromFunction3(value))
    @scala.inline
    def deleteConstruct: Self = this.set("construct", js.undefined)
    @scala.inline
    def setDefineProperty(value: (/* target */ T, /* p */ PropertyKey, /* attributes */ PropertyDescriptor) => scala.Boolean): Self = this.set("defineProperty", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDefineProperty: Self = this.set("defineProperty", js.undefined)
    @scala.inline
    def setDeleteProperty(value: (/* target */ T, /* p */ PropertyKey) => scala.Boolean): Self = this.set("deleteProperty", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeleteProperty: Self = this.set("deleteProperty", js.undefined)
    @scala.inline
    def setEnumerate(value: /* target */ T => js.Array[PropertyKey]): Self = this.set("enumerate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnumerate: Self = this.set("enumerate", js.undefined)
    @scala.inline
    def setGet(value: (/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any) => _): Self = this.set("get", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setGetOwnPropertyDescriptor(value: (/* target */ T, /* p */ PropertyKey) => js.UndefOr[PropertyDescriptor]): Self = this.set("getOwnPropertyDescriptor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetOwnPropertyDescriptor: Self = this.set("getOwnPropertyDescriptor", js.undefined)
    @scala.inline
    def setGetPrototypeOf(value: /* target */ T => js.Object | Null): Self = this.set("getPrototypeOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPrototypeOf: Self = this.set("getPrototypeOf", js.undefined)
    @scala.inline
    def setHas(value: (/* target */ T, /* p */ PropertyKey) => scala.Boolean): Self = this.set("has", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHas: Self = this.set("has", js.undefined)
    @scala.inline
    def setIsExtensible(value: /* target */ T => scala.Boolean): Self = this.set("isExtensible", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsExtensible: Self = this.set("isExtensible", js.undefined)
    @scala.inline
    def setOwnKeys(value: /* target */ T => js.Array[PropertyKey]): Self = this.set("ownKeys", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOwnKeys: Self = this.set("ownKeys", js.undefined)
    @scala.inline
    def setPreventExtensions(value: /* target */ T => scala.Boolean): Self = this.set("preventExtensions", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreventExtensions: Self = this.set("preventExtensions", js.undefined)
    @scala.inline
    def setSet(
      value: (/* target */ T, /* p */ PropertyKey, /* value */ js.Any, /* receiver */ js.Any) => scala.Boolean
    ): Self = this.set("set", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSetPrototypeOf(value: (/* target */ T, /* v */ js.Any) => scala.Boolean): Self = this.set("setPrototypeOf", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetPrototypeOf: Self = this.set("setPrototypeOf", js.undefined)
  }
  
}

