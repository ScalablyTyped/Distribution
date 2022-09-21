package typings.readableStream.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReadable
  extends StObject
     with IEventEmitter {
  
  def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  
  def _read(size: Double): Unit = js.native
  
  def destroy(): this.type = js.native
  def destroy(error: js.Error): this.type = js.native
  
  def isPaused(): Boolean = js.native
  
  def pause(): this.type = js.native
  
  def push(chunk: Any): Boolean = js.native
  def push(chunk: Any, encoding: String): Boolean = js.native
  
  def read(): Any = js.native
  def read(size: Double): Any = js.native
  
  def resume(): this.type = js.native
  
  def setEncoding(encoding: String): this.type = js.native
  
  def unpipe(): this.type = js.native
  def unpipe(destination: Writable): this.type = js.native
  
  def unshift(chunk: Any): Unit = js.native
  
  def wrap(oldStream: Readable): this.type = js.native
}
