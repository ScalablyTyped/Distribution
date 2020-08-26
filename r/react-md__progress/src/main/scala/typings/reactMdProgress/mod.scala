package typings.reactMdProgress

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdProgress.circularProgressMod.CircularProgressProps
import typings.reactMdProgress.getProgressA11yMod.ProgressA11y
import typings.reactMdProgress.linearProgressMod.LinearProgressProps
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/progress", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val CircularProgress: ForwardRefExoticComponent[CircularProgressProps with RefAttributes[HTMLSpanElement]] = js.native
  val LinearProgress: ForwardRefExoticComponent[LinearProgressProps with RefAttributes[HTMLSpanElement]] = js.native
  def getProgressA11y(progressId: String, progressing: Boolean): js.UndefOr[ProgressA11y] = js.native
}

