package typings.snabbdom

import typings.snabbdom.vnodeMod.VNodeData
import typings.snabbdom.vnodeMod.VNode_
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hMod {
  
  @JSImport("snabbdom/build/h", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addNS(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addNS")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addNS(data: Any, children: js.Array[VNode_ | String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNS")(data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addNS(data: Any, children: js.Array[VNode_ | String], sel: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNS")(data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], sel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addNS(data: Any, children: Unit, sel: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNS")(data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], sel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fragment(children: VNodeChildren): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(children.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  
  inline def h(sel: String): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  inline def h(sel: String, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  inline def h(sel: String, data: Null, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  inline def h(sel: String, data: VNodeData): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  inline def h(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  
  type ArrayOrElement[T] = T | js.Array[T]
  
  type VNodeChildElement = js.UndefOr[VNode_ | String | Double | Number | Null]
  
  type VNodeChildren = ArrayOrElement[VNodeChildElement]
  
  type VNodes = js.Array[VNode_]
}
