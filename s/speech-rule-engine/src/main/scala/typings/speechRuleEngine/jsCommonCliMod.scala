package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.std.DOMParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonCliMod {
  
  @JSImport("speech-rule-engine/js/common/cli", "Cli")
  @js.native
  open class Cli () extends StObject {
    
    def commandLine(): js.Promise[Unit] = js.native
    
    var dp: DOMParser = js.native
    
    def enumerate(): js.Promise[Unit] = js.native
    def enumerate(all: Boolean): js.Promise[Unit] = js.native
    
    def execute(input: String): Unit = js.native
    
    /* private */ var loadLocales: Any = js.native
    
    /* private */ var output: Any = js.native
    
    var process: Any = js.native
    
    def processor(processor: String): Unit = js.native
    
    var processors: js.Array[String] = js.native
    
    /* private */ var readExpression_ : Any = js.native
    
    def readline(): Unit = js.native
    
    /* private */ var runProcessors_ : Any = js.native
    
    def set(arg: String, value: String, _def: String): Unit = js.native
    def set(arg: String, value: Boolean, _def: String): Unit = js.native
    
    var setup: StringDictionary[String | Boolean] = js.native
  }
}
