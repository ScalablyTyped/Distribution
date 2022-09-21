package typings.readableStream.mod

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWritable
  extends StObject
     with IEventEmitter {
  
  def end(): this.type = js.native
  def end(cb: js.Function0[Unit]): this.type = js.native
  def end(data: String): this.type = js.native
  def end(data: String, cb: js.Function0[Unit]): this.type = js.native
  def end(data: js.typedarray.Uint8Array): this.type = js.native
  def end(data: js.typedarray.Uint8Array, cb: js.Function0[Unit]): this.type = js.native
  def end(str: String, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
  def end(str: String, encoding: BufferEncoding): this.type = js.native
  def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): this.type = js.native
  
  var writable: Boolean = js.native
  
  def write(chunk: Any): Boolean = js.native
  def write(chunk: Any, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(chunk: Any, encoding: String): Boolean = js.native
  def write(chunk: Any, encoding: String, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(chunk: Any, encoding: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
}
