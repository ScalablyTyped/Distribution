package typings.snabbdom

import typings.snabbdom.vnodeMod.VNodeData
import typings.snabbdom.vnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snabbdom/build/package/h", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def h(sel: String): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  @scala.inline
  def h(sel: String, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def h(sel: String, data: Null, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def h(sel: String, data: VNodeData): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  @scala.inline
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  
  type ArrayOrElement[T] = T | js.Array[T]
  
  type VNodeChildElement = js.UndefOr[VNode_ | String | Double | Null]
  
  type VNodeChildren = ArrayOrElement[VNodeChildElement]
  
  type VNodes = js.Array[VNode_]
}
