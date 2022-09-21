package typings.stencilCore.stencilPrivateMod

import typings.std.Node
import typings.stencilCore.stencilPublicRuntimeMod.VNode
import typings.stencilCore.stencilPublicRuntimeMod.VNodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperscript extends StObject {
  
  def apply(sel: Any): VNode = js.native
  def apply(sel: Any, children: js.Array[js.UndefOr[VNode | Null]]): VNode = js.native
  def apply(sel: Any, data: VNodeData): VNode = js.native
  def apply(sel: Any, data: VNodeData, children: js.Array[js.UndefOr[VNode | Null]]): VNode = js.native
  def apply(sel: Any, data: VNodeData, children: VNode): VNode = js.native
  def apply(sel: Any, data: VNodeData, text: String): VNode = js.native
  def apply(sel: Any, text: String): VNode = js.native
  def apply(sel: Node, data: VNodeData): VNode = js.native
}
