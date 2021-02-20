package typings.sdkBase

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sdk-base", JSImport.Default)
  @js.native
  class default () extends Base {
    def this(option: BaseOptions) = this()
  }
  
  @js.native
  trait Base extends EventEmitter {
    
    def await(args: js.Any*): js.Promise[_] = js.native
    
    def awaitFirst(args: js.Any*): js.Promise[_] = js.native
    
    var isReady: Boolean = js.native
    
    var options: BaseOptions = js.native
    
    def ready(): js.Promise[_] = js.native
    def ready(err: Error): Unit = js.native
    def ready(readyCallback: js.Function): Unit = js.native
    def ready(ready: Boolean): Unit = js.native
  }
  
  @js.native
  trait BaseOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var initMethod: js.UndefOr[String] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitMethod(value: String): Self = StObject.set(x, "initMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitMethodUndefined: Self = StObject.set(x, "initMethod", js.undefined)
    }
  }
}
