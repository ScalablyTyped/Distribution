package typings.reactMdProgress

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdProgress.circularProgressMod.CircularProgressProps
import typings.reactMdProgress.getProgressA11yMod.ProgressA11y
import typings.reactMdProgress.linearProgressMod.LinearProgressProps
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/progress", "CircularProgress")
  @js.native
  val CircularProgress: ForwardRefExoticComponent[CircularProgressProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/progress", "LinearProgress")
  @js.native
  val LinearProgress: ForwardRefExoticComponent[LinearProgressProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/progress", "getProgressA11y")
  @js.native
  def getProgressA11y(progressId: String, progressing: Boolean): js.UndefOr[ProgressA11y] = js.native
}
