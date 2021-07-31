package typings.sentryTypes

import typings.sentryTypes.stackframeMod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stacktraceMod {
  
  trait Stacktrace extends StObject {
    
    var frames: js.UndefOr[js.Array[StackFrame]] = js.undefined
    
    var frames_omitted: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Stacktrace {
    
    @scala.inline
    def apply(): Stacktrace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stacktrace]
    }
    
    @scala.inline
    implicit class StacktraceMutableBuilder[Self <: Stacktrace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: js.Array[StackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      @scala.inline
      def setFramesVarargs(value: StackFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setFrames_omitted(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "frames_omitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrames_omittedUndefined: Self = StObject.set(x, "frames_omitted", js.undefined)
    }
  }
}
