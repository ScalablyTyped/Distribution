package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAbstractAudioRendererMod.AbstractAudioRenderer
import typings.speechRuleEngine.jsAudioAudioUtilMod.Pause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioMarkupRendererMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/audio/markup_renderer", "MarkupRenderer")
  @js.native
  open class MarkupRenderer () extends AbstractAudioRenderer {
    
    def applyScaleFunction(value: Double): Double = js.native
    
    /* protected */ def ignoreElement(key: String): Boolean = js.native
    
    /* protected */ var ignoreElements: js.Array[String] = js.native
    
    def pause(pause: Pause): Unit = js.native
    
    def prosodyElement(key: String, value: Double): Unit = js.native
    
    /* private */ var scaleFunction: Any = js.native
    
    def setScaleFunction(a: Double, b: Double, c: Double, d: Double): Unit = js.native
    def setScaleFunction(a: Double, b: Double, c: Double, d: Double, decimals: Double): Unit = js.native
  }
}
