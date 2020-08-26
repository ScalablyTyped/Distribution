package typings.snabbdom

import typings.snabbdom.anon.PartialModule
import typings.snabbdom.htmldomapiMod.DOMAPI
import typings.snabbdom.vnodeMod.VNode_
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/build/package/init", JSImport.Namespace)
@js.native
object initMod extends js.Object {
  def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_] = js.native
  def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_] = js.native
}

