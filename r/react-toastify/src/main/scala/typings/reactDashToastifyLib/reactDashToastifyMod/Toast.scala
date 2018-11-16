package typings
package reactDashToastifyLib.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toast extends js.Object {
  var POSITION: reactDashToastifyLib.Anon_TOPRIGHT = js.native
  var TYPE: reactDashToastifyLib.Anon_WARNING = js.native
  /**
       * @return The ID of the toast, for future reference.
       */
  def apply(
    content: js.Function1[
      /* props */ reactDashToastifyLib.Anon_CloseToast, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ): java.lang.String = js.native
  /**
       * @return The ID of the toast, for future reference.
       */
  def apply(
    content: js.Function1[
      /* props */ reactDashToastifyLib.Anon_CloseToast, 
      reactLib.reactMod.ReactNs.ReactNode
    ],
    options: ToastOptions
  ): java.lang.String = js.native
  /**
       * @return The ID of the toast, for future reference.
       */
  def apply(content: reactLib.reactMod.ReactNs.ReactNode): java.lang.String = js.native
  /**
       * @return The ID of the toast, for future reference.
       */
  def apply(content: reactLib.reactMod.ReactNs.ReactNode, options: ToastOptions): java.lang.String = js.native
  /**
       * Dismiss the toast with the given ID, or all toasts if no ID is given.
       */
  def dismiss(): scala.Unit = js.native
  /**
       * Dismiss the toast with the given ID, or all toasts if no ID is given.
       */
  def dismiss(toastId: java.lang.String): scala.Unit = js.native
  /**
       * Shorthand for a toast with `type: toast.TYPE.ERROR`.
       */
  def error(content: reactLib.reactMod.ReactNs.ReactNode): java.lang.String = js.native
  /**
       * Shorthand for a toast with `type: toast.TYPE.ERROR`.
       */
  def error(content: reactLib.reactMod.ReactNs.ReactNode, options: ToastOptions): java.lang.String = js.native
  /**
       * Shorthand for a toast with `type: toast.TYPE.INFO`.
       */
  def info(content: reactLib.reactMod.ReactNs.ReactNode): java.lang.String = js.native
  /**
       * Shorthand for a toast with `type: toast.TYPE.INFO`.
       */
  def info(content: reactLib.reactMod.ReactNs.ReactNode, options: ToastOptions): java.lang.String = js.native
  /**
       * Test if the toast with the given ID is active.
       */
  def isActive(): scala.Boolean = js.native
  /**
       * Test if the toast with the given ID is active.
       */
  def isActive(toastId: java.lang.String): scala.Boolean = js.native
  /**
       * Shorthand for a toast with `type: toast.TYPE.SUCCESS`.
       */
  def success(content: reactLib.reactMod.ReactNs.ReactNode): java.lang.String = js.native
  /**
       * Shorthand for a toast with `type: toast.TYPE.SUCCESS`.
       */
  def success(content: reactLib.reactMod.ReactNs.ReactNode, options: ToastOptions): java.lang.String = js.native
  /**
       * Update an existing toast by ID.
       */
  def update(id: java.lang.String, options: ToastOptions with reactDashToastifyLib.Anon_Render): scala.Unit = js.native
  /**
       * Shorthand for a toast with `type: toast.TYPE.WARNING`.
       */
  def warning(content: reactLib.reactMod.ReactNs.ReactNode): java.lang.String = js.native
  /**
       * Shorthand for a toast with `type: toast.TYPE.WARNING`.
       */
  def warning(content: reactLib.reactMod.ReactNs.ReactNode, options: ToastOptions): java.lang.String = js.native
}

