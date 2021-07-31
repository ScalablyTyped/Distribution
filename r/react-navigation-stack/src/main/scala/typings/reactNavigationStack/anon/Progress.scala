package typings.reactNavigationStack.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  /**
    * Animated node representing the progress value of the next screen.
    */
  var progress: AnimatedInterpolation
}
object Progress {
  
  @scala.inline
  def apply(progress: AnimatedInterpolation): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: AnimatedInterpolation): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
