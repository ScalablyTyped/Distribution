package typings.promiseInflight

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-inflight", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * @param unique A globally-unique key that is used to identify the call to this
    * function. It determines how to cache the inlfight request. eg. a url or
    * filename or whatever.
    * @param doFly The function that actually carries out the request, eg. fetches
    * the url or whatever.
    * @returns One promise as long as the `doFly()` promise is pending. Note that
    * if `bluebird` is installed, this promise will be a Bluebird promise.
    */
  def apply[T](unique: Resolvable[js.Array[Resolvable[String]] | String], doFly: js.Function0[Resolvable[T]]): js.Promise[T] = js.native
  
  @js.native
  object active
    extends /* key */ StringDictionary[js.Promise[_]]
  
  type Resolvable[T] = js.Thenable[T] | T
}
