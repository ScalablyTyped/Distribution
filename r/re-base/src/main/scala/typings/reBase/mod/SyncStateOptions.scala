package typings.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncStateOptions extends StObject {
  
  /**
    * Returns the Firebase data at the specified endpoint as an Array
    * instead of an Object.
    */
  var asArray: js.UndefOr[Boolean] = js.native
  
  /**
    * The context of your component.
    */
  var context: js.Object = js.native
  
  /**
    * A default value to set when the Firebase endpoint has no value (i.e.,
    * on init) (use this if you want a value other than an empty object or
    * empty array)
    */
  var defaultValue: js.UndefOr[String | Boolean | Double | js.Object] = js.native
  
  /**
    * Will keep any firebase generated keys intact when manipulating data
    * using the asArray option.
    */
  var keepKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * A callback function that will be invoked if the current user does
    * not have read or write permissions at the location.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.native
  
  /**
    * The state property you want to sync with Firebase; can be an
    * arbitrarily nested property a là `foo.bar`.
    */
  var state: String = js.native
  
  /**
    * The callback function that will be invoked when the initial listener
    * is established with Firebase. Typically used (with syncState) to
    * change this.state.loading to false.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.native
}
object SyncStateOptions {
  
  @scala.inline
  def apply(context: js.Object, state: String): SyncStateOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncStateOptions]
  }
  
  @scala.inline
  implicit class SyncStateOptionsMutableBuilder[Self <: SyncStateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsArray(value: Boolean): Self = StObject.set(x, "asArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsArrayUndefined: Self = StObject.set(x, "asArray", js.undefined)
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String | Boolean | Double | js.Object): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setKeepKeys(value: Boolean): Self = StObject.set(x, "keepKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepKeysUndefined: Self = StObject.set(x, "keepKeys", js.undefined)
    
    @scala.inline
    def setOnFailure(value: () => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setQueries(value: js.Object): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThen(value: () => Unit): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
