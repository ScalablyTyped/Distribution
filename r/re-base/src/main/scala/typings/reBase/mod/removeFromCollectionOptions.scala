package typings.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait removeFromCollectionOptions extends StObject {
  
  /**
    * A function that receives the created ref as its only argument. You
    * can chain any Firestore queries you want to perform. See
    * [Using Firestore Queries](https://github.com/tylermcginnis/re-base#firestorequeries).
    */
  var query: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object removeFromCollectionOptions {
  
  @scala.inline
  def apply(): removeFromCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[removeFromCollectionOptions]
  }
  
  @scala.inline
  implicit class removeFromCollectionOptionsMutableBuilder[Self <: removeFromCollectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
