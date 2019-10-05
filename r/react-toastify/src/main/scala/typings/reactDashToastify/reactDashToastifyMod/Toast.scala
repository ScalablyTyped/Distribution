package typings.reactDashToastify.reactDashToastifyMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.ReactNode
import typings.reactDashToastify.Anon_BOTTOMCENTER
import typings.reactDashToastify.Anon_CloseToast
import typings.reactDashToastify.Anon_DEFAULT
import typings.reactDashToastify.Anon_Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toast extends js.Object {
  var POSITION: Anon_BOTTOMCENTER = js.native
  var TYPE: Anon_DEFAULT = js.native
  def apply(content: js.Function1[/* props */ Anon_CloseToast, ReactNode]): String = js.native
  def apply(content: js.Function1[/* props */ Anon_CloseToast, ReactNode], options: ToastOptions): String = js.native
  /**
    * @return The ID of the toast, for future reference.
    */
  def apply(content: ReactNode): String = js.native
  def apply(content: ReactNode, options: ToastOptions): String = js.native
  /**
    * Dismiss the toast with the given ID, or all toasts if no ID is given.
    */
  def dismiss(): Unit = js.native
  def dismiss(toastId: String): Unit = js.native
  /**
    * Shorthand for a toast with `type: toast.TYPE.ERROR`.
    */
  def error(content: ReactNode): String = js.native
  def error(content: ReactNode, options: ToastOptions): String = js.native
  /**
    * Shorthand for a toast with `type: toast.TYPE.INFO`.
    */
  def info(content: ReactNode): String = js.native
  def info(content: ReactNode, options: ToastOptions): String = js.native
  /**
    * Test if the toast with the given ID is active.
    */
  def isActive(): Boolean = js.native
  def isActive(toastId: String): Boolean = js.native
  /**
    * Shorthand for a toast with `type: toast.TYPE.SUCCESS`.
    */
  def success(content: ReactNode): String = js.native
  def success(content: ReactNode, options: ToastOptions): String = js.native
  /**
    * Update an existing toast by ID.
    */
  def update(id: String, options: ToastOptions with Anon_Render): Unit = js.native
  /**
    * Shorthand for a toast with `type: toast.TYPE.WARNING`.
    */
  def warning(content: ReactNode): String = js.native
  def warning(content: ReactNode, options: ToastOptions): String = js.native
}

@JSImport("react-toastify", "toast")
@js.native
object toast extends TopLevel[Toast]

