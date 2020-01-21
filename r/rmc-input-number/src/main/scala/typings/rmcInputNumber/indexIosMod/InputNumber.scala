package typings.rmcInputNumber.indexIosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputNumber
  extends typings.rmcInputNumber.baseMod.default[PropsType, StateType] {
  var _stepDown: js.Any = js.native
  var _stepDownText: js.Any = js.native
  var _stepUp: js.Any = js.native
  var _stepUpText: js.Any = js.native
  def onPressIn(`type`: String): Unit = js.native
  def onPressInDown(e: js.Any): Unit = js.native
  def onPressInUp(e: js.Any): Unit = js.native
  def onPressOut(`type`: js.Any): Unit = js.native
  def onPressOutDown(): Unit = js.native
  def onPressOutUp(): Unit = js.native
}

