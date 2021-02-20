package typings.snabbdom

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.vnodeMod.VNode_
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachtoMod {
  
  @JSImport("snabbdom/build/package/helpers/attachto", "attachTo")
  @js.native
  def attachTo(target: Element, vnode: VNode_): VNode_ = js.native
  
  @js.native
  trait AttachData
    extends /* i */ NumberDictionary[js.Any]
       with /* key */ StringDictionary[js.Any] {
    
    var placeholder: js.UndefOr[js.Any] = js.native
    
    var real: js.UndefOr[Node] = js.native
  }
  object AttachData {
    
    @scala.inline
    def apply(): AttachData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachData]
    }
    
    @scala.inline
    implicit class AttachDataMutableBuilder[Self <: AttachData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholder(value: js.Any): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReal(value: Node): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealUndefined: Self = StObject.set(x, "real", js.undefined)
    }
  }
}
