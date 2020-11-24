package typings.reactAlert.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertManager extends js.Object {
  
  var alerts: js.Array[AlertComponentProps] = js.native
  
  def error(): AlertComponentProps = js.native
  def error(message: js.UndefOr[ReactNode], options: AlertCustomOptions): AlertComponentProps = js.native
  def error(message: ReactNode): AlertComponentProps = js.native
  
  def info(): AlertComponentProps = js.native
  def info(message: js.UndefOr[ReactNode], options: AlertCustomOptions): AlertComponentProps = js.native
  def info(message: ReactNode): AlertComponentProps = js.native
  
  def remove(alert: AlertComponentProps): Unit = js.native
  
  var root: js.UndefOr[HTMLElement] = js.native
  
  def show(): AlertComponentProps = js.native
  def show(message: js.UndefOr[ReactNode], options: AlertCustomOptionsWithType): AlertComponentProps = js.native
  def show(message: ReactNode): AlertComponentProps = js.native
  
  def success(): AlertComponentProps = js.native
  def success(message: js.UndefOr[ReactNode], options: AlertCustomOptions): AlertComponentProps = js.native
  def success(message: ReactNode): AlertComponentProps = js.native
}
