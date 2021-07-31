package typings.reactToastify

import typings.reactToastify.reactToastifyBooleans.`false`
import typings.reactToastify.reactToastifyBooleans.`true`
import typings.reactToastify.typesMod.Id
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propValidatorMod {
  
  @JSImport("react-toastify/dist/utils/propValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canBeRendered[T](content: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canBeRendered")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("react-toastify/dist/utils/propValidator", "canUseDom")
  @js.native
  val canUseDom: Boolean = js.native
  
  @scala.inline
  def getAutoCloseDelay(): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")().asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay(toastAutoClose: Double): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay(toastAutoClose: Double, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay(toastAutoClose: Unit, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: Double, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: Unit, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: `false`): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  
  @scala.inline
  def hasToastId(): js.UndefOr[String | Double | `true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasToastId")().asInstanceOf[js.UndefOr[String | Double | `true`]]
  @scala.inline
  def hasToastId(toastId: Id): js.UndefOr[String | Double | `true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasToastId")(toastId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Double | `true`]]
  
  @scala.inline
  def isBool(v: js.Any): /* is std.Boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBool")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Boolean */ Boolean]
  
  @scala.inline
  def isFn(v: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFn")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isNum(v: js.Any): /* is std.Number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNum")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Number */ Boolean]
  
  @scala.inline
  def isStr(v: js.Any): /* is std.String */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStr")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.String */ Boolean]
  
  @scala.inline
  def objectValues[T](obj: Record[String, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def parseClassName(v: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClassName")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
