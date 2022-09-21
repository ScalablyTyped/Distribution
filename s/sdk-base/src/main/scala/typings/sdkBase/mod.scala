package typings.sdkBase

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sdk-base", JSImport.Default)
  @js.native
  open class default () extends Base {
    def this(option: BaseOptions) = this()
  }
  
  @js.native
  trait Base extends EventEmitter {
    
    def await(args: Any*): js.Promise[Any] = js.native
    
    def awaitFirst(args: Any*): js.Promise[Any] = js.native
    
    var isReady: Boolean = js.native
    
    var options: BaseOptions = js.native
    
    def ready(): js.Promise[Any] = js.native
    def ready(err: js.Error): Unit = js.native
    def ready(readyCallback: js.Function): Unit = js.native
    def ready(ready: Boolean): Unit = js.native
  }
  
  trait BaseOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var initMethod: js.UndefOr[String] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setInitMethod(value: String): Self = StObject.set(x, "initMethod", value.asInstanceOf[js.Any])
      
      inline def setInitMethodUndefined: Self = StObject.set(x, "initMethod", js.undefined)
    }
  }
}
