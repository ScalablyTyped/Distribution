package typings.snabbdom

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.buildVnodeMod.VNode_
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildHelpersAttachtoMod {
  
  @JSImport("snabbdom/build/helpers/attachto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachTo(target: Element, vnode: VNode_): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(target.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  
  trait AttachData
    extends StObject
       with /* i */ NumberDictionary[Any]
       with /* key */ StringDictionary[Any] {
    
    var placeholder: js.UndefOr[Any] = js.undefined
    
    var real: js.UndefOr[Node] = js.undefined
  }
  object AttachData {
    
    inline def apply(): AttachData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttachData] (val x: Self) extends AnyVal {
      
      inline def setPlaceholder(value: Any): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReal(value: Node): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
      
      inline def setRealUndefined: Self = StObject.set(x, "real", js.undefined)
    }
  }
}
