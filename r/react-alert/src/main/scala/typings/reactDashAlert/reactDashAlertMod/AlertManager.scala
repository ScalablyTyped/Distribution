package typings.reactDashAlert.reactDashAlertMod

import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertManager extends js.Object {
  var alerts: js.Array[AlertComponentProps] = js.native
  var root: js.UndefOr[HTMLElement] = js.native
  def error(): AlertComponentProps = js.native
  def error(message: ReactNode): AlertComponentProps = js.native
  def error(message: ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
  def info(): AlertComponentProps = js.native
  def info(message: ReactNode): AlertComponentProps = js.native
  def info(message: ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
  def remove(alert: AlertComponentProps): Unit = js.native
  def show(): AlertComponentProps = js.native
  def show(message: ReactNode): AlertComponentProps = js.native
  def show(message: ReactNode, options: AlertCustomOptionsWithType): AlertComponentProps = js.native
  def success(): AlertComponentProps = js.native
  def success(message: ReactNode): AlertComponentProps = js.native
  def success(message: ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
}

