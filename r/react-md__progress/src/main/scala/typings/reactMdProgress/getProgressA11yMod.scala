package typings.reactMdProgress

import typings.reactMdProgress.reactMdProgressBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getProgressA11yMod {
  
  @JSImport("@react-md/progress/types/getProgressA11y", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getProgressA11y(progressId: String, progressing: Boolean): js.UndefOr[ProgressA11y] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProgressA11y")(progressId.asInstanceOf[js.Any], progressing.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ProgressA11y]]
  
  trait ProgressA11y extends StObject {
    
    var `aria-busy`: `true`
    
    var `aria-describedby`: String
  }
  object ProgressA11y {
    
    @scala.inline
    def apply(`aria-describedby`: String): ProgressA11y = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("aria-busy")(true)
      __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressA11y]
    }
    
    @scala.inline
    implicit class ProgressA11yMutableBuilder[Self <: ProgressA11y] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-busy`(value: `true`): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    }
  }
}
