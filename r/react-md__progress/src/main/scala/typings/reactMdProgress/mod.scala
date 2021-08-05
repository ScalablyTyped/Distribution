package typings.reactMdProgress

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdProgress.circularProgressMod.CircularProgressProps
import typings.reactMdProgress.getProgressA11yMod.ProgressA11y
import typings.reactMdProgress.linearProgressMod.LinearProgressProps
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/progress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/progress", "CircularProgress")
  @js.native
  val CircularProgress: ForwardRefExoticComponent[CircularProgressProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/progress", "LinearProgress")
  @js.native
  val LinearProgress: ForwardRefExoticComponent[LinearProgressProps & RefAttributes[HTMLSpanElement]] = js.native
  
  inline def getProgressA11y(progressId: String, progressing: Boolean): js.UndefOr[ProgressA11y] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProgressA11y")(progressId.asInstanceOf[js.Any], progressing.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ProgressA11y]]
}
