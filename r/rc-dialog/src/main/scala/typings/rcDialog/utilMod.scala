package typings.rcDialog

import typings.rcDialog.anon.Left
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-dialog/es/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def getMotionName(prefixCls: String): String = js.native
  def getMotionName(prefixCls: String, transitionName: js.UndefOr[scala.Nothing], animationName: String): String = js.native
  def getMotionName(prefixCls: String, transitionName: String): String = js.native
  def getMotionName(prefixCls: String, transitionName: String, animationName: String): String = js.native
  
  def getUUID(): Double = js.native
  
  def offset(el: Element): Left = js.native
}
