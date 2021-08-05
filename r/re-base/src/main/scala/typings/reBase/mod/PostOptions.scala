package typings.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostOptions extends StObject {
  
  /**
    * The data you're wanting to persist to Firebase.
    */
  var data: js.Any
  
  /**
    * A callback that will get invoked once the new data has been saved to
    * Firebase. If there is an error, it will be the only argument to this
    * function.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
}
object PostOptions {
  
  inline def apply(data: js.Any): PostOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostOptions]
  }
  
  extension [Self <: PostOptions](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setThen(value: /* result */ js.Any => Unit): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
