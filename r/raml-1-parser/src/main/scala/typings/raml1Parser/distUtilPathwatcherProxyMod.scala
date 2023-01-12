package typings.raml1Parser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilPathwatcherProxyMod {
  
  @JSImport("raml-1-parser/dist/util/pathwatcherProxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/util/pathwatcherProxy", "File")
  @js.native
  open class File protected () extends StObject {
    def this(path: String) = this()
    
    def close(): Unit = js.native
    
    def getPath(): String = js.native
    
    /* private */ var path: Any = js.native
  }
  
  inline def watch(path: String, f: js.Function2[/* event */ Any, /* newFileName */ Any, Unit]): IPathWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[IPathWatcher]
  
  trait IPathWatcher extends StObject {
    
    def close(): Any
  }
  object IPathWatcher {
    
    inline def apply(close: () => Any): IPathWatcher = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[IPathWatcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPathWatcher] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Any): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
}
