package typings.snabbdom

import typings.snabbdom.anon.PartialModule
import typings.snabbdom.htmldomapiMod.DOMAPI
import typings.snabbdom.vnodeMod.VNode_
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initMod {
  
  @JSImport("snabbdom/build/package/init", "init")
  @js.native
  def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_] = js.native
  @JSImport("snabbdom/build/package/init", "init")
  @js.native
  def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_] = js.native
}
