package typings.scriptableIos.global

import typings.scriptableIos.anon.Result
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Open x-callback-url requests._
  *
  * Constructs an object that opens x-callback-url requests and waits for a response from the target app.
  * @see https://docs.scriptable.app/callbackurl/#-new-callbackurl
  */
@JSGlobal("CallbackURL")
@js.native
open class CallbackURL[T /* <: String */] protected ()
  extends StObject
     with typings.scriptableIos.CallbackURL[T] {
  /**
    * _Open x-callback-url requests._
    *
    * Constructs an object that opens x-callback-url requests and waits for a response from the target app.
    * @param baseURL - Base URL of the request. This is usally something like my-app://x-callback-url/action
    * @see https://docs.scriptable.app/callbackurl/#-new-callbackurl
    */
  def this(baseURL: T) = this()
  
  /**
    * _Construct CallbackURL._
    *
    * Appends a key/value pair to the base URL as a query parameter. The name and value are automatically encoded. Do not add the x-callback-url paramters, i.e. x-source, x-success,
    * x-error and x-cancel as Scriptable will add those.
    * @param name - Name of the query parameter to add.
    * @param value - Value of the query parameter to add.
    * @see https://docs.scriptable.app/callbackurl/#-addparameter
    */
  /* CompleteClass */
  override def addParameter(name: String, value: String): Unit = js.native
  
  /**
    * _Creates the callback URL._
    *
    * Creates a callback URL with the specified base URL and query parameters.
    * @see https://docs.scriptable.app/callbackurl/#-geturl
    */
  /* CompleteClass */
  override def getURL(): String = js.native
  
  /**
    * _Opens the callback URL._
    *
    * Opens the target app and waits for the target app to perform the action. The returned promise contains the query parameters supplied by the target app when it invokes the callback.
    * If the action failed in the target app or the action was cancelled, the promise will be rejected. The promise is also rejected if the action times out because the target app did
    * not invoke the callback.
    * @see https://docs.scriptable.app/callbackurl/#-open
    */
  /* CompleteClass */
  override def open(): js.Promise[(Record[String, String | Double | Boolean | Null]) | Result] = js.native
}
