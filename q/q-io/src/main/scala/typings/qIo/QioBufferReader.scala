package typings.qIo

import org.scalablytyped.runtime.Instantiable0
import typings.node.bufferMod.global.Buffer
import typings.qIo.Qio.Reader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QioBufferReader
  extends StObject
     with Instantiable0[Reader] {
  
  def join(buffers: js.Array[Buffer]): Buffer = js.native
  
  def read(stream: Reader): Buffer = js.native
  def read(stream: Reader, charset: String): String = js.native
}
