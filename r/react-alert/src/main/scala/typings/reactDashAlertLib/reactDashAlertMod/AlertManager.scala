package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertManager extends js.Object {
  var alerts: js.Array[AlertComponentProps] = js.native
  var root: js.UndefOr[stdLib.HTMLElement] = js.native
  def error(): AlertComponentProps = js.native
  def error(message: reactLib.reactMod.ReactNs.ReactNode): AlertComponentProps = js.native
  def error(message: reactLib.reactMod.ReactNs.ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
  def info(): AlertComponentProps = js.native
  def info(message: reactLib.reactMod.ReactNs.ReactNode): AlertComponentProps = js.native
  def info(message: reactLib.reactMod.ReactNs.ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
  def remove(alert: AlertComponentProps): scala.Unit = js.native
  def show(): AlertComponentProps = js.native
  def show(message: reactLib.reactMod.ReactNs.ReactNode): AlertComponentProps = js.native
  def show(message: reactLib.reactMod.ReactNs.ReactNode, options: AlertCustomOptionsWithType): AlertComponentProps = js.native
  def success(): AlertComponentProps = js.native
  def success(message: reactLib.reactMod.ReactNs.ReactNode): AlertComponentProps = js.native
  def success(message: reactLib.reactMod.ReactNs.ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
}

