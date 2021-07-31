package typings.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait listenToCollectionOptions extends StObject {
  
  /**
    * The context of your component.
    */
  var context: js.Object
  
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * A function that receives the created ref as its only argument. You
    * can chain any Firestore queries you want to perform. See
    * [Using Firestore Queries](https://github.com/tylermcginnis/re-base#firestorequeries).
    */
  var query: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * A callback that will be called with the data.
    */
  def `then`(): Unit
  
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
object listenToCollectionOptions {
  
  @scala.inline
  def apply(context: js.Object, `then`: () => Unit): listenToCollectionOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[listenToCollectionOptions]
  }
  
  @scala.inline
  implicit class listenToCollectionOptionsMutableBuilder[Self <: listenToCollectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailure(value: () => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setThen(value: () => Unit): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithIds(value: Boolean): Self = StObject.set(x, "withIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithIdsUndefined: Self = StObject.set(x, "withIds", js.undefined)
    
    @scala.inline
    def setWithRefs(value: Boolean): Self = StObject.set(x, "withRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithRefsUndefined: Self = StObject.set(x, "withRefs", js.undefined)
  }
}
