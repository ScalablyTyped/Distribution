package typings.streamMock

import typings.node.streamMod.WritableOptions
import typings.streamMock.libWritableIwritablemockMod.IWritableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWritableWritableMockMod {
  
  @JSImport("stream-mock/lib/writable/WritableMock", JSImport.Default)
  @js.native
  open class default () extends WritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  trait WritableMock extends IWritableMock {
    
    /* private */ var _writableState: Any = js.native
    
    @JSName("data")
    var data_WritableMock: js.Array[Any] = js.native
    
    var objectMode: Boolean = js.native
  }
}
