package typings.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait getOptions extends StObject {
  
  /**
    * A function that receives the created ref as its only argument. You
    * can chain any Firestore queries you want to perform. See
    * [Using Firestore Queries](https://github.com/tylermcginnis/re-base#firestorequeries).
    */
  var query: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Will embed firestore generated document ids inside each document in
    * your collections on the `id` property.
    */
  var withIds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * will embed the DocumentReference inside each document in your
    * collection on the `ref` property.
    */
  var withRefs: js.UndefOr[Boolean] = js.undefined
}
object getOptions {
  
  inline def apply(): getOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[getOptions]
  }
  
  extension [Self <: getOptions](x: Self) {
    
    inline def setQuery(value: () => Unit): Self = StObject.set(x, "query", js.Any.fromFunction0(value))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setWithIds(value: Boolean): Self = StObject.set(x, "withIds", value.asInstanceOf[js.Any])
    
    inline def setWithIdsUndefined: Self = StObject.set(x, "withIds", js.undefined)
    
    inline def setWithRefs(value: Boolean): Self = StObject.set(x, "withRefs", value.asInstanceOf[js.Any])
    
    inline def setWithRefsUndefined: Self = StObject.set(x, "withRefs", js.undefined)
  }
}
