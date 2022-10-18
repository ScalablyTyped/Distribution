package typings.standardAsCallback

import typings.standardAsCallback.builtTypesMod.CallbackFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("standard-as-callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](promise: js.Promise[T], nodeback: CallbackFunction[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], nodeback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def default[T](promise: js.Promise[T], nodeback: CallbackFunction[T], options: IOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], nodeback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait IOptions extends StObject {
    
    var spread: Boolean
  }
  object IOptions {
    
    inline def apply(spread: Boolean): IOptions = {
      val __obj = js.Dynamic.literal(spread = spread.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    }
  }
}
