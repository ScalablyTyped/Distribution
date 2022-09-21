package typings.readableStream.mod

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.readableStream.mod.IEventEmitter because Already inherited
- typings.readableStream.mod.IWritable because Already inherited
- typings.readableStream.mod.IReadable because Already inherited
- typings.readableStream.mod.IDuplex because var conflicts: writable. Inlined  */ @JSImport("readable-stream", "Duplex")
@js.native
// end-Readable
open class Duplex () extends _Writable {
  def this(options: DuplexOptions) = this()
  
  def _read(): Unit = js.native
  
  var allowHalfOpen: Boolean = js.native
  
  def destroy(err: js.Error, callback: js.Function1[/* error */ js.Error | Null, Unit]): this.type = js.native
  def destroy(err: Unit, callback: js.Function1[/* error */ js.Error | Null, Unit]): this.type = js.native
  
  def push(chunk: Any, encoding: BufferEncoding): Boolean = js.native
  
  val readableEncoding: BufferEncoding | Null = js.native
  
  val readableEnded: Boolean = js.native
  
  val readableObjectMode: Boolean = js.native
  
  def setEncoding(enc: BufferEncoding): this.type = js.native
  
  val writableObjectMode: Boolean = js.native
}
object Duplex {
  
  @JSImport("readable-stream", "Duplex")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This is a dummy function required to retain type compatibility to node.
    * @deprecated DO NOT USE
    */
  /* static member */
  inline def from(source: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[Any]
}
