package typings.rollup

import typings.rollup.anon.Options
import typings.rollup.mod.LogHandler
import typings.rollup.mod.LogLevel
import typings.rollup.mod.RollupLog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoadConfigFileMod {
  
  @JSImport("rollup/dist/loadConfigFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfigFile(fileName: String, commandOptions: Any): js.Promise[Options] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFile")(fileName.asInstanceOf[js.Any], commandOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Options]]
  inline def loadConfigFile(fileName: String, commandOptions: Any, watchMode: Boolean): js.Promise[Options] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFile")(fileName.asInstanceOf[js.Any], commandOptions.asInstanceOf[js.Any], watchMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Options]]
  
  trait BatchWarnings extends StObject {
    
    def add(warning: RollupLog): Unit
    
    val count: Double
    
    def flush(): Unit
    
    def log(level: LogLevel, log: RollupLog): Unit
    @JSName("log")
    var log_Original: LogHandler
    
    val warningOccurred: Boolean
  }
  object BatchWarnings {
    
    inline def apply(
      add: RollupLog => Unit,
      count: Double,
      flush: () => Unit,
      log: (/* level */ LogLevel, /* log */ RollupLog) => Unit,
      warningOccurred: Boolean
    ): BatchWarnings = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), count = count.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), log = js.Any.fromFunction2(log), warningOccurred = warningOccurred.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchWarnings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchWarnings] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: RollupLog => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setLog(value: (/* level */ LogLevel, /* log */ RollupLog) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setWarningOccurred(value: Boolean): Self = StObject.set(x, "warningOccurred", value.asInstanceOf[js.Any])
    }
  }
  
  type LoadConfigFile_ = js.Function3[
    /* fileName */ String, 
    /* commandOptions */ Any, 
    /* watchMode */ js.UndefOr[Boolean], 
    js.Promise[Options]
  ]
}
