package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindToStateOptions extends js.Object {
  
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
    * A callback function that will be invoked if the current user does
    * not have read permissions at the location.
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
    * arbitrarily nested property a là `foo.bar` (no arrays).
    */
  var state: String = js.native
  
  /**
    * The callback function that will be invoked when the initial listener
    * is established with Firebase. Typically used (with bindToState) to
    * change this.state.loading to false.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.native
}
object BindToStateOptions {
  
  @scala.inline
  def apply(context: js.Object, state: String): BindToStateOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindToStateOptions]
  }
  
  @scala.inline
  implicit class BindToStateOptionsOps[Self <: BindToStateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsArray(value: Boolean): Self = this.set("asArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsArray: Self = this.set("asArray", js.undefined)
    
    @scala.inline
    def setOnFailure(value: () => Unit): Self = this.set("onFailure", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setQueries(value: js.Object): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    
    @scala.inline
    def setThen(value: () => Unit): Self = this.set("then", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
  }
}
