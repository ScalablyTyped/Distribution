package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RNFetchBlobWriteStream extends js.Object {
  
  var append: Boolean = js.native
  
  def close(): Unit = js.native
  
  var encoding: String = js.native
  
  var id: String = js.native
  
  def write(data: String): js.Promise[Unit] = js.native
}
object RNFetchBlobWriteStream {
  
  @scala.inline
  def apply(
    append: Boolean,
    close: () => Unit,
    encoding: String,
    id: String,
    write: String => js.Promise[Unit]
  ): RNFetchBlobWriteStream = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), encoding = encoding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RNFetchBlobWriteStream]
  }
  
  @scala.inline
  implicit class RNFetchBlobWriteStreamOps[Self <: RNFetchBlobWriteStream] (val x: Self) extends AnyVal {
    
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: String => js.Promise[Unit]): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
