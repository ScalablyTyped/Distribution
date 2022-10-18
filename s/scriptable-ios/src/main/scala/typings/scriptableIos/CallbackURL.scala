package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Open x-callback-url requests._
  *
  * Constructs an object that opens x-callback-url requests and waits for a response from the target app.
  * @see https://docs.scriptable.app/callbackurl/#-new-callbackurl
  */
trait CallbackURL[T /* <: String */] extends StObject {
  
  /**
    * _Construct CallbackURL._
    *
    * Appends a key/value pair to the base URL as a query parameter. The name and value are automatically encoded. Do not add the x-callback-url paramters, i.e. x-source, x-success,
    * x-error and x-cancel as Scriptable will add those.
    * @param name - Name of the query parameter to add.
    * @param value - Value of the query parameter to add.
    * @see https://docs.scriptable.app/callbackurl/#-addparameter
    */
  def addParameter(name: String, value: String): Unit
  
  /**
    * _Creates the callback URL._
    *
    * Creates a callback URL with the specified base URL and query parameters.
    * @see https://docs.scriptable.app/callbackurl/#-geturl
    */
  def getURL(): String
  
  /**
    * _Opens the callback URL._
    *
    * Opens the target app and waits for the target app to perform the action. The returned promise contains the query parameters supplied by the target app when it invokes the callback.
    * If the action failed in the target app or the action was cancelled, the promise will be rejected. The promise is also rejected if the action times out because the target app did
    * not invoke the callback.
    * @see https://docs.scriptable.app/callbackurl/#-open
    */
  def open(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: shortcuts://x-callback-url/${string} * / string ? {  result :string | number | boolean | null} : std.Record<string, string | number | boolean | null> */ js.Any
  ]
}
object CallbackURL {
  
  inline def apply[T /* <: String */](
    addParameter: (String, String) => Unit,
    getURL: () => String,
    open: () => js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: shortcuts://x-callback-url/${string} * / string ? {  result :string | number | boolean | null} : std.Record<string, string | number | boolean | null> */ js.Any
    ]
  ): CallbackURL[T] = {
    val __obj = js.Dynamic.literal(addParameter = js.Any.fromFunction2(addParameter), getURL = js.Any.fromFunction0(getURL), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[CallbackURL[T]]
  }
  
  extension [Self <: CallbackURL[?], T /* <: String */](x: Self & CallbackURL[T]) {
    
    inline def setAddParameter(value: (String, String) => Unit): Self = StObject.set(x, "addParameter", js.Any.fromFunction2(value))
    
    inline def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
    
    inline def setOpen(
      value: () => js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: shortcuts://x-callback-url/${string} * / string ? {  result :string | number | boolean | null} : std.Record<string, string | number | boolean | null> */ js.Any
        ]
    ): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
