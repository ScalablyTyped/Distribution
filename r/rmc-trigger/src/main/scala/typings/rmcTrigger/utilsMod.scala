package typings.rmcTrigger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("rmc-trigger/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAlignFromPlacement(builtinPlacements: js.Any, placementStr: js.Any, align: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignFromPlacement")(builtinPlacements.asInstanceOf[js.Any], placementStr.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getPopupClassNameFromAlign(builtinPlacements: js.Any, prefixCls: js.Any, align: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopupClassNameFromAlign")(builtinPlacements.asInstanceOf[js.Any], prefixCls.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def saveRef(name: js.Any, component: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveRef")(name.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
