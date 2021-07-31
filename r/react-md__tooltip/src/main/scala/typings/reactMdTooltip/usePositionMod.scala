package typings.reactMdTooltip

import typings.reactMdUtils.typesMod.SimplePosition
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePositionMod {
  
  @JSImport("@react-md/tooltip/types/usePosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def usePosition(hasDeterminedPositionDefaultPositionThreshold: PositionOptions): PositionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("usePosition")(hasDeterminedPositionDefaultPositionThreshold.asInstanceOf[js.Any]).asInstanceOf[PositionResult]
  
  trait PositionOptions extends StObject {
    
    var defaultPosition: SimplePosition
    
    var position: js.UndefOr[SimplePosition] = js.undefined
    
    var threshold: Double
  }
  object PositionOptions {
    
    @scala.inline
    def apply(defaultPosition: SimplePosition, threshold: Double): PositionOptions = {
      val __obj = js.Dynamic.literal(defaultPosition = defaultPosition.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionOptions]
    }
    
    @scala.inline
    implicit class PositionOptionsMutableBuilder[Self <: PositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultPosition(value: SimplePosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositionResult extends StObject {
    
    var position: SimplePosition
    
    def setEstimatedPosition(container: HTMLElement): Unit
  }
  object PositionResult {
    
    @scala.inline
    def apply(position: SimplePosition, setEstimatedPosition: HTMLElement => Unit): PositionResult = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], setEstimatedPosition = js.Any.fromFunction1(setEstimatedPosition))
      __obj.asInstanceOf[PositionResult]
    }
    
    @scala.inline
    implicit class PositionResultMutableBuilder[Self <: PositionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetEstimatedPosition(value: HTMLElement => Unit): Self = StObject.set(x, "setEstimatedPosition", js.Any.fromFunction1(value))
    }
  }
}
