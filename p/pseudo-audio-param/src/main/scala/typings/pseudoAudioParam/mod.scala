package typings.pseudoAudioParam

import typings.std.AudioParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Simulate scheduled AudioParam values */
  @JSImport("pseudo-audio-param", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with PseudoAudioParam {
    def this(defaultValue: Double) = this()
  }
  
  /** Simulate scheduled AudioParam values */
  @js.native
  trait PseudoAudioParam extends StObject {
    
    /**
      * Apply scheduled methods to the provided audioParam. If reset is `true`,
      * cancel all events of AudioParam before applying
      */
    def applyTo(audioParam: AudioParam): PseudoAudioParam = js.native
    def applyTo(audioParam: AudioParam, reset: Boolean): PseudoAudioParam = js.native
    
    def cancelAndHoldAtTime(time: Double): PseudoAudioParam = js.native
    
    def cancelScheduledValues(time: Double): PseudoAudioParam = js.native
    
    var events: js.Array[PseudoAudioParamEvent] = js.native
    
    def exponentialRampToValueAtTime(value: Double, time: Double): PseudoAudioParam = js.native
    
    /**
      * Return scheduled value at time
      */
    def getValueAtTime(time: Double): Double = js.native
    
    def linearRampToValueAtTime(value: Double, time: Double): PseudoAudioParam = js.native
    
    def setTargetAtTime(value: Double, time: Double, timeConstant: Double): PseudoAudioParam = js.native
    
    def setValueAtTime(value: Double, time: Double): PseudoAudioParam = js.native
    
    def setValueCurveAtTime(values: js.Array[Double], time: Double, duration: Double): PseudoAudioParam = js.native
  }
  
  trait PseudoAudioParamEvent extends StObject {
    
    var time: Double
    
    var `type`: String
  }
  object PseudoAudioParamEvent {
    
    @scala.inline
    def apply(time: Double, `type`: String): PseudoAudioParamEvent = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PseudoAudioParamEvent]
    }
    
    @scala.inline
    implicit class PseudoAudioParamEventMutableBuilder[Self <: PseudoAudioParamEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
