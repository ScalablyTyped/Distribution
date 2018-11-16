package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormFeedbackMod {
  type FormFeedback[T] = reactLib.reactMod.Component[FormFeedbackProps[T], js.Object, js.Any]
  type FormFeedbackProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameValid with T
}
