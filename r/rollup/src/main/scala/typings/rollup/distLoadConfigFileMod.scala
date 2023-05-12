package typings.rollup

import typings.rollup.anon.Options
import typings.rollup.mod.RollupWarning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoadConfigFileMod {
  
  @JSImport("rollup/dist/loadConfigFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfigFile(fileName: String, commandOptions: Any): js.Promise[Options] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFile")(fileName.asInstanceOf[js.Any], commandOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Options]]
  
  trait BatchWarnings extends StObject {
    
    def add(warning: RollupWarning): Unit
    
    val count: Double
    
    def flush(): Unit
    
    val warningOccurred: Boolean
  }
  object BatchWarnings {
    
    inline def apply(add: RollupWarning => Unit, count: Double, flush: () => Unit, warningOccurred: Boolean): BatchWarnings = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), count = count.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), warningOccurred = warningOccurred.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchWarnings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchWarnings] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: RollupWarning => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setWarningOccurred(value: Boolean): Self = StObject.set(x, "warningOccurred", value.asInstanceOf[js.Any])
    }
  }
  
  type LoadConfigFile_ = js.Function2[/* fileName */ String, /* commandOptions */ Any, js.Promise[Options]]
}
