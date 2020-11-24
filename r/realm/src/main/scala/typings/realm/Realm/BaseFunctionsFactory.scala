package typings.realm.Realm

import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of functions as defined on the MongoDB Server.
  */
@js.native
trait BaseFunctionsFactory extends js.Object {
  
  /**
    * Call a remote MongoDB Realm function by its name.
    * Consider using `functions[name]()` instead of calling this method.
    *
    * @param name Name of the function.
    * @param args Arguments passed to the function.
    */
  def callFunction(name: String, args: js.Any*): js.Promise[_] = js.native
  
  /**
    * Call a remote MongoDB Realm function by its name, in a streaming mode.
    * Consider using `functions[name]()` instead of calling this method.
    *
    * @param name Name of the function.
    * @param args Arguments passed to the function.
    */
  def callFunctionStreaming(name: String, args: js.Any*): js.Promise[AsyncIterable[Uint8Array]] = js.native
}
object BaseFunctionsFactory {
  
  @scala.inline
  def apply(
    callFunction: (String, /* repeated */ js.Any) => js.Promise[_],
    callFunctionStreaming: (String, /* repeated */ js.Any) => js.Promise[AsyncIterable[Uint8Array]]
  ): BaseFunctionsFactory = {
    val __obj = js.Dynamic.literal(callFunction = js.Any.fromFunction2(callFunction), callFunctionStreaming = js.Any.fromFunction2(callFunctionStreaming))
    __obj.asInstanceOf[BaseFunctionsFactory]
  }
  
  @scala.inline
  implicit class BaseFunctionsFactoryOps[Self <: BaseFunctionsFactory] (val x: Self) extends AnyVal {
    
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
    def setCallFunction(value: (String, /* repeated */ js.Any) => js.Promise[_]): Self = this.set("callFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallFunctionStreaming(value: (String, /* repeated */ js.Any) => js.Promise[AsyncIterable[Uint8Array]]): Self = this.set("callFunctionStreaming", js.Any.fromFunction2(value))
  }
}
