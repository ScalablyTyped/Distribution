package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.speechRuleEngine.jsCommonEventUtilMod.KeyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioAudioRendererMod {
  
  @js.native
  trait AudioRenderer extends StObject {
    
    def error(key: String): String | Null = js.native
    def error(key: KeyCode): String | Null = js.native
    
    def finalize(str: String): String = js.native
    
    def markup(descrs: js.Array[AuditoryDescription]): String = js.native
    
    def merge(strs: js.Array[Span]): String = js.native
    
    var separator: String = js.native
  }
}
