package typings
package rmcDashTriggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AfterPopupVisibleChange extends js.Object {
  @JSName("afterPopupVisibleChange")
  var afterPopupVisibleChange_Original: js.Function0[scala.Unit] = js.native
  var defaultPopupVisible: scala.Boolean = js.native
  var destroyPopupOnHide: scala.Boolean = js.native
  @JSName("getDocument")
  var getDocument_Original: js.Function0[stdLib.Document] = js.native
  @JSName("getPopupClassNameFromAlign")
  var getPopupClassNameFromAlign_Original: js.Function0[java.lang.String] = js.native
  var mask: scala.Boolean = js.native
  var maskClosable: scala.Boolean = js.native
  @JSName("onPopupAlign")
  var onPopupAlign_Original: js.Function0[scala.Unit] = js.native
  @JSName("onPopupVisibleChange")
  var onPopupVisibleChange_Original: js.Function0[scala.Unit] = js.native
  var popupClassName: java.lang.String = js.native
  var prefixCls: java.lang.String = js.native
  def afterPopupVisibleChange(): scala.Unit = js.native
  def getDocument(): stdLib.Document = js.native
  def getPopupClassNameFromAlign(): java.lang.String = js.native
  def onPopupAlign(): scala.Unit = js.native
  def onPopupVisibleChange(): scala.Unit = js.native
}

