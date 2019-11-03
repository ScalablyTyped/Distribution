package typings.reactDashToastify.reactDashToastifyMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toast extends js.Object {
  /**
    * Helper to set position
    */
  var POSITION: Position = js.native
  /**
    * Helper to set notification type
    */
  var TYPE: Type = js.native
  /**
    * Display a toast without a specific type.
    */
  def apply(content: ToastContent): ToastId = js.native
  def apply(content: ToastContent, options: ToastOptions): ToastId = js.native
  /**
    * Let you define `ToastContainer` props when lazy mounted.
    * When called enable lazy mounted container
    */
  def configure(): Unit = js.native
  def configure(config: ToastContainerProps): Unit = js.native
  /**
    * Remove a toast. If no `toastId` is used, all the active toast
    * will be removed.
    */
  def dismiss(): Unit = js.native
  def dismiss(toastId: ToastId): Unit = js.native
  /**
    * Set a controlled progress bar value to 100% then close the toast
    */
  def done(toastId: ToastId): Unit = js.native
  /**
    * Shorthand to display toast of type 'error'.
    */
  def error(content: ToastContent): ToastId = js.native
  def error(content: ToastContent, options: ToastOptions): ToastId = js.native
  /**
    * Shorthand to display toast of type 'info'.
    */
  def info(content: ToastContent): ToastId = js.native
  def info(content: ToastContent, options: ToastOptions): ToastId = js.native
  /**
    * Check if a toast is active by passing the `toastId`.
    * Each time you display a toast you receive a `toastId`.
    */
  def isActive(toastId: ToastId): Boolean = js.native
  /**
    * Listen for change when a toast is added or removed. The number of toast displayed is passed as paran to the callback
    */
  def onChange(callback: js.Function1[/* count */ js.UndefOr[Double], Unit]): Unit = js.native
  /**
    * Shorthand to display toast of type 'success'.
    */
  def success(content: ToastContent): ToastId = js.native
  def success(content: ToastContent, options: ToastOptions): ToastId = js.native
  /**
    * Update an existing toast. By default, we keep the initial content and options of the toast.
    */
  def update(toastId: ToastId): Unit = js.native
  def update(toastId: ToastId, options: UpdateOptions): Unit = js.native
  /**
    * Shorthand to display toast of type 'warning'.
    */
  def warn(content: ToastContent): ToastId = js.native
  def warn(content: ToastContent, options: ToastOptions): ToastId = js.native
}

@JSImport("react-toastify", "toast")
@js.native
object toast extends TopLevel[Toast]

