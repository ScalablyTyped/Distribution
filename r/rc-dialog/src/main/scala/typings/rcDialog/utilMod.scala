package typings.rcDialog

import typings.rcDialog.anon.Left
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-dialog/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getMotionName(prefixCls: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMotionName")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getMotionName(prefixCls: String, transitionName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotionName")(prefixCls.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getMotionName(prefixCls: String, transitionName: String, animationName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotionName")(prefixCls.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any], animationName.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getMotionName(prefixCls: String, transitionName: Unit, animationName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotionName")(prefixCls.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any], animationName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getUUID(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUUID")().asInstanceOf[Double]
  
  @scala.inline
  def offset(el: Element): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(el.asInstanceOf[js.Any]).asInstanceOf[Left]
}
