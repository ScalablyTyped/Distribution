package typings.readableStream.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.readableStream.readableStreamStrings.close
import typings.readableStream.readableStreamStrings.data
import typings.readableStream.readableStreamStrings.end
import typings.readableStream.readableStreamStrings.error
import typings.readableStream.readableStreamStrings.pause
import typings.readableStream.readableStreamStrings.readable
import typings.readableStream.readableStreamStrings.resume
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// if (process.env.READABLE_STREAM === 'disable' && Stream)
/* Inlined node.stream.Readable & {  Readable :node.stream.Readable,   Writable :node.stream.Writable,   Duplex :node.stream.Duplex,   Transform :node.stream.Transform,   PassThrough :node.stream.PassThrough,   Stream :node.stream.^} */
object NodeBaseExport {
  
  @JSImport("readable-stream", "NodeBaseExport")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.Duplex")
  @js.native
  def Duplex: typings.node.streamMod.Duplex = js.native
  @scala.inline
  def Duplex_=(x: typings.node.streamMod.Duplex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Duplex")(x.asInstanceOf[js.Any])
  
  @JSImport("readable-stream", "NodeBaseExport.PassThrough")
  @js.native
  def PassThrough: typings.node.streamMod.PassThrough = js.native
  @scala.inline
  def PassThrough_=(x: typings.node.streamMod.PassThrough): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PassThrough")(x.asInstanceOf[js.Any])
  
  @JSImport("readable-stream", "NodeBaseExport.Readable")
  @js.native
  def Readable_ : typings.node.streamMod.Readable = js.native
  
  @scala.inline
  def Readable__=(x: typings.node.streamMod.Readable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Readable")(x.asInstanceOf[js.Any])
  
  @JSImport("readable-stream", "NodeBaseExport.Stream")
  @js.native
  def Stream: typings.node.streamMod.^ = js.native
  @scala.inline
  def Stream_=(x: typings.node.streamMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stream")(x.asInstanceOf[js.Any])
  
  @JSImport("readable-stream", "NodeBaseExport.Transform")
  @js.native
  def Transform: typings.node.streamMod.Transform = js.native
  @scala.inline
  def Transform_=(x: typings.node.streamMod.Transform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
  
  @JSImport("readable-stream", "NodeBaseExport.Writable")
  @js.native
  def Writable: typings.node.streamMod.Writable = js.native
  @scala.inline
  def Writable_=(x: typings.node.streamMod.Writable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Writable")(x.asInstanceOf[js.Any])
  
  @JSImport("readable-stream", "NodeBaseExport._destroy")
  @js.native
  def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  @JSImport("readable-stream", "NodeBaseExport._destroy")
  @js.native
  def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  
  @JSImport("readable-stream", "NodeBaseExport._read")
  @js.native
  def _read(size: Double): Unit = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. data
    * 3. end
    * 4. error
    * 5. pause
    * 6. readable
    * 7. resume
    */
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.addListener")
  @js.native
  def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.constructor")
  @js.native
  def constructor(): js.Any = js.native
  @JSImport("readable-stream", "NodeBaseExport.constructor")
  @js.native
  def constructor(options: EventEmitterOptions): js.Any = js.native
  @JSImport("readable-stream", "NodeBaseExport.constructor")
  @js.native
  def constructor(opts: typings.node.streamMod.ReadableOptions): js.Any = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.destroy")
  @js.native
  def destroy(): Unit = js.native
  @JSImport("readable-stream", "NodeBaseExport.destroy")
  @js.native
  def destroy(error: Error): Unit = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.destroyed")
  @js.native
  def destroyed: Boolean = js.native
  @scala.inline
  def destroyed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(x.asInstanceOf[js.Any])
  
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit_close(event: close): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit_end(event: end): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit_pause(event: pause): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit_readable(event: readable): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.emit")
  @js.native
  def emit_resume(event: resume): Boolean = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.eventNames")
  @js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.getMaxListeners")
  @js.native
  def getMaxListeners(): Double = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.isPaused")
  @js.native
  def isPaused(): Boolean = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.listenerCount")
  @js.native
  def listenerCount(event: String): Double = js.native
  @JSImport("readable-stream", "NodeBaseExport.listenerCount")
  @js.native
  def listenerCount(event: js.Symbol): Double = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.listeners")
  @js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  @JSImport("readable-stream", "NodeBaseExport.listeners")
  @js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.off")
  @js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.off")
  @js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.on")
  @js.native
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.once")
  @js.native
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.pause")
  @js.native
  def pause(): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.pipe")
  @js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  @JSImport("readable-stream", "NodeBaseExport.pipe")
  @js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  
  // Added in Node 6...
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependListener")
  @js.native
  def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.prependOnceListener")
  @js.native
  def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.push")
  @js.native
  def push(chunk: js.Any): Boolean = js.native
  @JSImport("readable-stream", "NodeBaseExport.push")
  @js.native
  def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.rawListeners")
  @js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  @JSImport("readable-stream", "NodeBaseExport.rawListeners")
  @js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.read")
  @js.native
  def read(): js.Any = js.native
  @JSImport("readable-stream", "NodeBaseExport.read")
  @js.native
  def read(size: Double): js.Any = js.native
  @JSImport("readable-stream", "NodeBaseExport.read")
  @js.native
  def read_Union(): String | Buffer = js.native
  @JSImport("readable-stream", "NodeBaseExport.read")
  @js.native
  def read_Union(size: Double): String | Buffer = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.readable")
  @js.native
  def readable: Boolean = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.readableEncoding")
  @js.native
  val readableEncoding: BufferEncoding | Null = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.readableEnded")
  @js.native
  val readableEnded: Boolean = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.readableFlowing")
  @js.native
  val readableFlowing: Boolean | Null = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.readableHighWaterMark")
  @js.native
  val readableHighWaterMark: Double = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.readableLength")
  @js.native
  val readableLength: Double = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.readableObjectMode")
  @js.native
  val readableObjectMode: Boolean = js.native
  
  @scala.inline
  def readable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readable")(x.asInstanceOf[js.Any])
  
  @JSImport("readable-stream", "NodeBaseExport.removeAllListeners")
  @js.native
  def removeAllListeners(): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeAllListeners")
  @js.native
  def removeAllListeners(event: String): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeAllListeners")
  @js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.removeListener")
  @js.native
  def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.resume")
  @js.native
  def resume(): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.setEncoding")
  @js.native
  def setEncoding(encoding: BufferEncoding): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.setMaxListeners")
  @js.native
  def setMaxListeners(n: Double): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.unpipe")
  @js.native
  def unpipe(): this.type = js.native
  @JSImport("readable-stream", "NodeBaseExport.unpipe")
  @js.native
  def unpipe(destination: WritableStream): this.type = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.unshift")
  @js.native
  def unshift(chunk: String): Unit = js.native
  @JSImport("readable-stream", "NodeBaseExport.unshift")
  @js.native
  def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
  @JSImport("readable-stream", "NodeBaseExport.unshift")
  @js.native
  def unshift(chunk: js.Any): Unit = js.native
  @JSImport("readable-stream", "NodeBaseExport.unshift")
  @js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  @JSImport("readable-stream", "NodeBaseExport.unshift")
  @js.native
  def unshift(chunk: Uint8Array): Unit = js.native
  @JSImport("readable-stream", "NodeBaseExport.unshift")
  @js.native
  def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
  
  @JSImport("readable-stream", "NodeBaseExport.wrap")
  @js.native
  def wrap(oldStream: ReadableStream): this.type = js.native
}
