package typings.streamMock

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iwritablemockMod {
  
  @js.native
  trait IWritableMock extends Writable {
    
    var data: js.Array[Any] | Buffer = js.native
    
    var flatData: js.Array[Any] | Buffer = js.native
  }
}
