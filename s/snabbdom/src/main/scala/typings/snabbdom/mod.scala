package typings.snabbdom

import typings.snabbdom.vnodeMod.VNodeData
import typings.snabbdom.vnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snabbdom/build/package/h", "h")
  @js.native
  def h(sel: String): VNode_ = js.native
  @JSImport("snabbdom/build/package/h", "h")
  @js.native
  def h(sel: String, children: VNodeChildren): VNode_ = js.native
  @JSImport("snabbdom/build/package/h", "h")
  @js.native
  def h(sel: String, data: Null, children: VNodeChildren): VNode_ = js.native
  @JSImport("snabbdom/build/package/h", "h")
  @js.native
  def h(sel: String, data: VNodeData): VNode_ = js.native
  @JSImport("snabbdom/build/package/h", "h")
  @js.native
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = js.native
  
  type ArrayOrElement[T] = T | js.Array[T]
  
  type VNodeChildElement = js.UndefOr[VNode_ | String | Double | Null]
  
  type VNodeChildren = ArrayOrElement[VNodeChildElement]
  
  type VNodes = js.Array[VNode_]
}
