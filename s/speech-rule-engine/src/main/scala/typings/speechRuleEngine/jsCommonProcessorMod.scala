package typings.speechRuleEngine

import typings.speechRuleEngine.anon.Highlighter
import typings.speechRuleEngine.anon.Key
import typings.speechRuleEngine.anon.Postprocessor
import typings.speechRuleEngine.jsCommonEventUtilMod.KeyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonProcessorMod {
  
  @JSImport("speech-rule-engine/js/common/processor", "KeyProcessor")
  @js.native
  open class KeyProcessor[T] protected () extends Processor[T] {
    def this(name: String, methods: Key[T]) = this()
    
    def key(p1: String): KeyCode = js.native
    def key(p1: KeyCode): KeyCode = js.native
  }
  /* static members */
  object KeyProcessor {
    
    @JSImport("speech-rule-engine/js/common/processor", "KeyProcessor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/common/processor", "KeyProcessor.getKey_")
    @js.native
    def getKey_ : Any = js.native
    inline def getKey__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKey_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("speech-rule-engine/js/common/processor", "Processor")
  @js.native
  open class Processor[T] protected () extends StObject {
    def this(name: String, methods: Postprocessor[T]) = this()
    
    var name: String = js.native
    
    def postprocess(p1: T, p2: String): T = js.native
    
    def pprint(p1: T): String = js.native
    
    def print(p1: T): String = js.native
    
    def process(p1: String): T = js.native
    
    def processor(p1: String): T = js.native
  }
  /* static members */
  object Processor {
    
    @JSImport("speech-rule-engine/js/common/processor", "Processor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/common/processor", "Processor.LocalState")
    @js.native
    def LocalState: Highlighter = js.native
    inline def LocalState_=(x: Highlighter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalState")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/processor", "Processor.stringify_")
    @js.native
    def stringify_ : Any = js.native
    inline def stringify__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify_")(x.asInstanceOf[js.Any])
  }
}
