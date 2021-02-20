package typings.snabbdom

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.mod.ArrayOrElement
import typings.snabbdom.vnodeMod.VNodeData
import typings.snabbdom.vnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxMod {
  
  @JSImport("snabbdom/build/package/jsx", "jsx")
  @js.native
  def jsx(tag: String, data: Null, children: JsxVNodeChildren*): VNode_ = js.native
  @JSImport("snabbdom/build/package/jsx", "jsx")
  @js.native
  def jsx(tag: String, data: VNodeData, children: JsxVNodeChildren*): VNode_ = js.native
  @JSImport("snabbdom/build/package/jsx", "jsx")
  @js.native
  def jsx(tag: FunctionComponent, data: Null, children: JsxVNodeChildren*): VNode_ = js.native
  @JSImport("snabbdom/build/package/jsx", "jsx")
  @js.native
  def jsx(tag: FunctionComponent, data: VNodeData, children: JsxVNodeChildren*): VNode_ = js.native
  
  type FunctionComponent = js.Function2[
    /* props */ StringDictionary[js.Any] | Null, 
    /* children */ js.UndefOr[js.Array[VNode_]], 
    VNode_
  ]
  
  type JsxVNodeChild = js.UndefOr[VNode_ | String | Double | Boolean | Null]
  
  type JsxVNodeChildren = ArrayOrElement[JsxVNodeChild]
}
