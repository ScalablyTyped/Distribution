package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonDebuggerMod {
  
  @JSImport("speech-rule-engine/js/common/debugger", "Debugger")
  @js.native
  /* private */ open class Debugger () extends StObject {
    
    def exit(): Unit = js.native
    def exit(callback: js.Function0[Any]): Unit = js.native
    
    /* private */ var fileHandle: Any = js.native
    
    def generateOutput(func: js.Function0[js.Array[String]]): Unit = js.native
    
    def init(): Any = js.native
    def init(opt_file: String): Any = js.native
    
    /* private */ var isActive_ : Any = js.native
    
    def output(args: Any*): Unit = js.native
    
    /* private */ var outputFunction_ : Any = js.native
    
    /* private */ var output_ : Any = js.native
    
    /* private */ var startDebugFile_ : Any = js.native
    
    /* private */ var stream_ : Any = js.native
  }
  /* static members */
  object Debugger {
    
    @JSImport("speech-rule-engine/js/common/debugger", "Debugger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Debugger]
    
    @JSImport("speech-rule-engine/js/common/debugger", "Debugger.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
}
