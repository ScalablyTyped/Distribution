package typings.snabbdom

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.anon.Key
import typings.snabbdom.buildHMod.ArrayOrElement
import typings.snabbdom.buildVnodeMod.VNodeData
import typings.snabbdom.buildVnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildJsxMod {
  
  @JSImport("snabbdom/build/jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Fragment(data: Null, children: JsxVNodeChildren*): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(scala.List(data.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VNode_]
  inline def Fragment(data: Key, children: JsxVNodeChildren*): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(scala.List(data.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VNode_]
  
  inline def jsx(tag: String, data: Null, children: JsxVNodeChildren*): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(tag.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode_]
  inline def jsx(tag: String, data: VNodeData, children: JsxVNodeChildren*): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(tag.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode_]
  inline def jsx(tag: FunctionComponent, data: Null, children: JsxVNodeChildren*): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(tag.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode_]
  inline def jsx(tag: FunctionComponent, data: VNodeData, children: JsxVNodeChildren*): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(tag.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode_]
  
  type FunctionComponent = js.Function2[
    /* props */ StringDictionary[Any] | Null, 
    /* children */ js.UndefOr[js.Array[VNode_]], 
    VNode_
  ]
  
  object JSXInternal {
    
    type Element = VNode_
    
    type IntrinsicElements = StringDictionary[VNodeData]
  }
  
  type JsxVNodeChild = js.UndefOr[VNode_ | String | Double | Boolean | Null]
  
  type JsxVNodeChildren = ArrayOrElement[JsxVNodeChild]
}
