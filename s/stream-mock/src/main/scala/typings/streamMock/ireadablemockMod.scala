package typings.streamMock

import typings.node.streamMod.Readable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-mock/lib/readable/IReadableMock", JSImport.Namespace)
@js.native
object ireadablemockMod extends js.Object {
  
  @js.native
  trait IReadableMock extends Readable {
    
    var it: IterableIterator[_] = js.native
  }
}
