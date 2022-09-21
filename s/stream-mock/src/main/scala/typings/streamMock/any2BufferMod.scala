package typings.streamMock

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object any2BufferMod {
  
  @JSImport("stream-mock/lib/helpers/converters/any2Buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def any2Buffer(value: Any, encoding: BufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("any2Buffer")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
