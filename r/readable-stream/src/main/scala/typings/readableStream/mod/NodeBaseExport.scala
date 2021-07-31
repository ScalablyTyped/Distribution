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
  
  @scala.inline
  def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_destroy")(error.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_destroy")(error.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def _read(size: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_read")(size.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
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
  @scala.inline
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
  @scala.inline
  def constructor(options: EventEmitterOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def constructor(opts: typings.node.streamMod.ReadableOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  @scala.inline
  def destroy(error: Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("readable-stream", "NodeBaseExport.destroyed")
  @js.native
  def destroyed: Boolean = js.native
  @scala.inline
  def destroyed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def emit(event: String, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def emit(event: js.Symbol, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_close(event: close): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_data(event: data, chunk: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], chunk.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_end(event: end): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_error(event: error, err: Error): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_pause(event: pause): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_readable(event: readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_resume(event: resume): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def eventNames(): js.Array[String | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventNames")().asInstanceOf[js.Array[String | js.Symbol]]
  
  @scala.inline
  def getMaxListeners(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxListeners")().asInstanceOf[Double]
  
  @scala.inline
  def isPaused(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPaused")().asInstanceOf[Boolean]
  
  @scala.inline
  def listenerCount(event: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def listenerCount(event: js.Symbol): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def listeners(event: String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def listeners(event: js.Symbol): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  
  @scala.inline
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def pause(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[this.type]
  
  @scala.inline
  def pipe[T /* <: WritableStream */](destination: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(destination.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // Added in Node 6...
  @scala.inline
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def push(chunk: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(chunk.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def push(chunk: js.Any, encoding: BufferEncoding): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(chunk.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def rawListeners(event: String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawListeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def rawListeners(event: js.Symbol): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawListeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  
  @scala.inline
  def read(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[js.Any]
  @scala.inline
  def read(size: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(size.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def read_Union(): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[String | Buffer]
  @scala.inline
  def read_Union(size: Double): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(size.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  
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
  
  @scala.inline
  def removeAllListeners(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[this.type]
  @scala.inline
  def removeAllListeners(event: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[this.type]
  @scala.inline
  def removeAllListeners(event: js.Symbol): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def resume(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")().asInstanceOf[this.type]
  
  @scala.inline
  def setEncoding(encoding: BufferEncoding): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("setEncoding")(encoding.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @scala.inline
  def setMaxListeners(n: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(n.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @scala.inline
  def unpipe(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("unpipe")().asInstanceOf[this.type]
  @scala.inline
  def unpipe(destination: WritableStream): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("unpipe")(destination.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @scala.inline
  def unshift(chunk: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unshift(chunk: String, encoding: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unshift(chunk: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unshift(chunk: Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def wrap(oldStream: ReadableStream): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldStream.asInstanceOf[js.Any]).asInstanceOf[this.type]
}
