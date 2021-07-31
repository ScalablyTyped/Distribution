package typings.streamMock

import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamMock.ireadablemockMod.IReadableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectReadableMockMod {
  
  @JSImport("stream-mock/lib/readable/ObjectReadableMock", JSImport.Default)
  @js.native
  class default protected () extends ObjectReadableMock {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: ArrayLike[js.Any], options: ReadableOptions) = this()
    def this(source: Iterable[js.Any], options: ReadableOptions) = this()
  }
  
  @js.native
  trait ObjectReadableMock extends IReadableMock {
    
    def _read(): Unit = js.native
  }
}
