package typings.reactMdAlert.toastMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a very low-level component that can be used to animate a new toast in
  * to a `Snackbar` as it is mainly just a wrapper of the `CSSTransition`
  * component. If you are using this component, it is generally recommended to
  * provide the `onEntered` callback as a function to start the hide visibility
  * timer and the `onExited` callback to remove the current toast from your
  * queue.
  */
@JSImport("@react-md/alert/types/Toast", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[ToastProps with RefAttributes[HTMLDivElement]]]

