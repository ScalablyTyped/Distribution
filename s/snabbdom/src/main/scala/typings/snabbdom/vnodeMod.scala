package typings.snabbdom

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.attachtoMod.AttachData
import typings.snabbdom.attributesMod.Attrs
import typings.snabbdom.classMod.Classes
import typings.snabbdom.datasetMod.Dataset
import typings.snabbdom.eventlistenersMod.On
import typings.snabbdom.heroMod.Hero
import typings.snabbdom.hooksMod.Hooks
import typings.snabbdom.propsMod.Props
import typings.snabbdom.styleMod.VNodeStyle
import typings.std.Element
import typings.std.Node
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeMod {
  
  @JSImport("snabbdom/build/package/vnode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def vnode(): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("vnode")().asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: js.Array[VNode_ | String]): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: js.Array[VNode_ | String], text: String): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: js.Array[VNode_ | String], text: String, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: js.Array[VNode_ | String], text: String, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: js.Array[VNode_ | String], text: Unit, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: js.Array[VNode_ | String], text: Unit, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: Unit, text: String): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: Unit, text: String, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: Unit, text: String, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: Unit, text: Unit, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: js.Any, children: Unit, text: Unit, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: js.Array[VNode_ | String]): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: js.Array[VNode_ | String], text: String): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: js.Array[VNode_ | String], text: String, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: js.Array[VNode_ | String], text: String, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: js.Array[VNode_ | String], text: Unit, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: js.Array[VNode_ | String], text: Unit, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: Unit, text: String): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: Unit, text: String, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: Unit, text: String, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: Unit, text: Unit, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: String, data: Unit, children: Unit, text: Unit, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: js.Array[VNode_ | String]): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: js.Array[VNode_ | String], text: String): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: js.Array[VNode_ | String], text: String, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: js.Array[VNode_ | String], text: String, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: js.Array[VNode_ | String], text: Unit, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: js.Array[VNode_ | String], text: Unit, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: Unit, text: String): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: Unit, text: String, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: Unit, text: String, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: Unit, text: Unit, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: js.Any, children: Unit, text: Unit, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: js.Array[VNode_ | String]): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: js.Array[VNode_ | String], text: String): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: js.Array[VNode_ | String], text: String, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: js.Array[VNode_ | String], text: String, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: js.Array[VNode_ | String], text: Unit, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: js.Array[VNode_ | String], text: Unit, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: Unit, text: String): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: Unit, text: String, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: Unit, text: String, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: Unit, text: Unit, elm: Element): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def vnode(sel: Unit, data: Unit, children: Unit, text: Unit, elm: Text): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  
  type Key = String | Double
  
  trait VNodeData
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var args: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var attachData: js.UndefOr[AttachData] = js.undefined
    
    var attrs: js.UndefOr[Attrs] = js.undefined
    
    var `class`: js.UndefOr[Classes] = js.undefined
    
    var dataset: js.UndefOr[Dataset] = js.undefined
    
    var fn: js.UndefOr[js.Function0[VNode_]] = js.undefined
    
    var hero: js.UndefOr[Hero] = js.undefined
    
    var hook: js.UndefOr[Hooks] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var ns: js.UndefOr[String] = js.undefined
    
    var on: js.UndefOr[On] = js.undefined
    
    var props: js.UndefOr[Props] = js.undefined
    
    var style: js.UndefOr[VNodeStyle] = js.undefined
  }
  object VNodeData {
    
    @scala.inline
    def apply(): VNodeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNodeData]
    }
    
    @scala.inline
    implicit class VNodeDataMutableBuilder[Self <: VNodeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setAttachData(value: AttachData): Self = StObject.set(x, "attachData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachDataUndefined: Self = StObject.set(x, "attachData", js.undefined)
      
      @scala.inline
      def setAttrs(value: Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setClass(value: Classes): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      @scala.inline
      def setFn(value: () => VNode_): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setHero(value: Hero): Self = StObject.set(x, "hero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeroUndefined: Self = StObject.set(x, "hero", js.undefined)
      
      @scala.inline
      def setHook(value: Hooks): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      @scala.inline
      def setOn(value: On): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setStyle(value: VNodeStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait VNode_ extends StObject {
    
    var children: js.UndefOr[js.Array[VNode_ | String]] = js.undefined
    
    var data: js.UndefOr[VNodeData] = js.undefined
    
    var elm: js.UndefOr[Node] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var sel: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object VNode_ {
    
    @scala.inline
    def apply(): VNode_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNode_]
    }
    
    @scala.inline
    implicit class VNode_MutableBuilder[Self <: VNode_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[VNode_ | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: (VNode_ | String)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: VNodeData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setElm(value: Node): Self = StObject.set(x, "elm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElmUndefined: Self = StObject.set(x, "elm", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setSel(value: String): Self = StObject.set(x, "sel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelUndefined: Self = StObject.set(x, "sel", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
