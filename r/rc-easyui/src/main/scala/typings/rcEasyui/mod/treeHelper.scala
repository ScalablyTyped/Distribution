package typings.rcEasyui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeHelper {
  
  @JSImport("rc-easyui", "treeHelper")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def adjustCheck(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustCheck")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def calcNodeState(e: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("calcNodeState")(e.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("rc-easyui", "treeHelper.cascadeCheck")
  @js.native
  val cascadeCheck: Boolean = js.native
  
  @scala.inline
  def checkNode(e: js.Any, t: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNode")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def findNode(e: js.Any, t: js.Any, n: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def forNodes(e: js.Any, t: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forNodes")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setCheckState(e: js.Any, t: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCheckState")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setChildCheckbox(e: js.Any, t: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setChildCheckbox")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setParentCheckbox(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setParentCheckbox")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def uncheckAllNodes(e: js.Any, t: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uncheckAllNodes")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def uncheckNode(e: js.Any, t: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uncheckNode")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
