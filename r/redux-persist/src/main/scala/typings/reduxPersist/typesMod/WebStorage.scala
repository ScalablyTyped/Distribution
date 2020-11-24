package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebStorage extends Storage {
  
  /**
    * @desc Fetches key and returns item in a promise.
    */
  def getItem(key: String): js.Promise[String | Null] = js.native
  
  /**
    * @desc Removes value for key.
    */
  def removeItem(key: String): js.Promise[Unit] = js.native
  
  /**
    * @desc Sets value for key and returns item in a promise.
    */
  def setItem(key: String, item: String): js.Promise[Unit] = js.native
}
object WebStorage {
  
  @scala.inline
  def apply(
    getItem: String => js.Promise[String | Null],
    removeItem: String => js.Promise[Unit],
    setItem: (String, String) => js.Promise[Unit]
  ): WebStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[WebStorage]
  }
  
  @scala.inline
  implicit class WebStorageOps[Self <: WebStorage] (val x: Self) extends AnyVal {
    
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
    def setGetItem(value: String => js.Promise[String | Null]): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItem(value: String => js.Promise[Unit]): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, String) => js.Promise[Unit]): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
}
