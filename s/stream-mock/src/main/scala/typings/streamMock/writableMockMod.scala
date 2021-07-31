package typings.streamMock

import typings.node.streamMod.WritableOptions
import typings.streamMock.iwritablemockMod.IWritableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writableMockMod {
  
  @JSImport("stream-mock/lib/writable/WritableMock", JSImport.Default)
  @js.native
  class default () extends WritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  trait WritableMock extends IWritableMock {
    
    var _writableState: js.Any = js.native
    
    @JSName("data")
    var data_WritableMock: js.Array[js.Any] = js.native
    
    var objectMode: Boolean = js.native
  }
}
