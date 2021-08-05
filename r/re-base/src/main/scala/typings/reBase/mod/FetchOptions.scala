package typings.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchOptions extends StObject {
  
  /**
    * Returns the Firebase data at the specified endpoint as an Array
    * instead of an Object.
    */
  var asArray: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The context of your component.
    */
  var context: js.Object
  
  /**
    * The callback function that will be invoked with an error that occurs
    * reading data from the specified endpoint.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The callback function that will be invoked with the data from the
    * specified endpoint when the endpoint changes.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
}
object FetchOptions {
  
  inline def apply(context: js.Object): FetchOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
  
  extension [Self <: FetchOptions](x: Self) {
    
    inline def setAsArray(value: Boolean): Self = StObject.set(x, "asArray", value.asInstanceOf[js.Any])
    
    inline def setAsArrayUndefined: Self = StObject.set(x, "asArray", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setOnFailure(value: () => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction0(value))
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setQueries(value: js.Object): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setThen(value: /* result */ js.Any => Unit): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
