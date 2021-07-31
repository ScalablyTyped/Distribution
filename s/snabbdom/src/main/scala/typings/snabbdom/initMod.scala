package typings.snabbdom

import typings.snabbdom.anon.PartialModule
import typings.snabbdom.htmldomapiMod.DOMAPI
import typings.snabbdom.vnodeMod.VNode_
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initMod {
  
  @JSImport("snabbdom/build/package/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_]]
  @scala.inline
  def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_]]
}
