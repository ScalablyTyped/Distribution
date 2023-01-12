package typings.snabbdom

import typings.snabbdom.anon.Fragments
import typings.snabbdom.anon.PartialModule
import typings.snabbdom.buildHtmldomapiMod.DOMAPI
import typings.snabbdom.buildVnodeMod.VNode_
import typings.std.DocumentFragment
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInitMod {
  
  @JSImport("snabbdom/build/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: Unit, options: Options): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: DOMAPI, options: Options): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  
  trait Options extends StObject {
    
    var experimental: js.UndefOr[Fragments] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExperimental(value: Fragments): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    }
  }
}
