package typings.sentryTypes

import typings.sentryTypes.typesStacktraceMod.Stacktrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesThreadMod {
  
  trait Thread extends StObject {
    
    var crashed: js.UndefOr[Boolean] = js.undefined
    
    var current: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var stacktrace: js.UndefOr[Stacktrace] = js.undefined
  }
  object Thread {
    
    inline def apply(): Thread = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Thread]
    }
    
    extension [Self <: Thread](x: Self) {
      
      inline def setCrashed(value: Boolean): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      inline def setCrashedUndefined: Self = StObject.set(x, "crashed", js.undefined)
      
      inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStacktrace(value: Stacktrace): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
    }
  }
}
