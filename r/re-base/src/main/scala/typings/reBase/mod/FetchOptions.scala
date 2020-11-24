package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchOptions extends js.Object {
  
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
    * The callback function that will be invoked with an error that occurs
    * reading data from the specified endpoint.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.native
  
  /**
    * The callback function that will be invoked with the data from the
    * specified endpoint when the endpoint changes.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
}
object FetchOptions {
  
  @scala.inline
  def apply(context: js.Object): FetchOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
  
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
    
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
    def setThen(value: /* result */ js.Any => Unit): Self = this.set("then", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
  }
}
