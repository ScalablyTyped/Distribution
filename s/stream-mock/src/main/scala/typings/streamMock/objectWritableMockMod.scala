package typings.streamMock

import typings.node.streamMod.WritableOptions
import typings.streamMock.iwritablemockMod.IWritableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectWritableMockMod {
  
  @JSImport("stream-mock/lib/writable/ObjectWritableMock", JSImport.Default)
  @js.native
  class default () extends ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  trait ObjectWritableMock extends IWritableMock {
    
    @JSName("data")
    var data_ObjectWritableMock: js.Array[_] = js.native
    
    @JSName("flatData")
    var flatData_ObjectWritableMock: js.Array[_] = js.native
  }
}
