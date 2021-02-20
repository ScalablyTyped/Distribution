package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RNFetchBlobWriteStream extends StObject {
  
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
  implicit class RNFetchBlobWriteStreamMutableBuilder[Self <: RNFetchBlobWriteStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: String => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
