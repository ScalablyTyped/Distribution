package typings.promiseInflight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param unique A globally-unique key that is used to identify the call to this
    * function. It determines how to cache the inlfight request. eg. a url or
    * filename or whatever.
    * @param doFly The function that actually carries out the request, eg. fetches
    * the url or whatever.
    * @returns One promise as long as the `doFly()` promise is pending. Note that
    * if `bluebird` is installed, this promise will be a Bluebird promise.
    */
  inline def apply[T](unique: Resolvable[String], doFly: js.Function0[Resolvable[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(unique.asInstanceOf[js.Any], doFly.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def apply[T](unique: Resolvable[js.Array[Resolvable[String]]], doFly: js.Function0[Resolvable[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(unique.asInstanceOf[js.Any], doFly.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("promise-inflight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Resolvable[T] = js.Thenable[T] | T
}
