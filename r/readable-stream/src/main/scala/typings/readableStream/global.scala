package typings.readableStream

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.readableStream.mod.DuplexOptions
import typings.readableStream.mod.ReadableOptions
import typings.readableStream.mod.TransformOptions
import typings.readableStream.mod.WritableOptions
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

object global {
  
  object Readable {
    
    @JSGlobal("_Readable")
    @js.native
    class ^ ()
      extends typings.readableStream.mod.^ {
      def this(options: ReadableOptions) = this()
    }
    
    @JSGlobal("_Readable.Duplex")
    @js.native
    // end-Readable
    class Duplex ()
      extends typings.readableStream.mod.Duplex {
      def this(options: DuplexOptions) = this()
    }
    object Duplex {
      
      @JSGlobal("_Readable.Duplex")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * This is a dummy function required to retain type compatibility to node.
        * @deprecated DO NOT USE
        */
      /* static member */
      inline def from(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    }
    
    // if (process.env.READABLE_STREAM === 'disable' && Stream)
    /* Inlined node.stream.Readable & {  Readable :node.stream.Readable,   Writable :node.stream.Writable,   Duplex :node.stream.Duplex,   Transform :node.stream.Transform,   PassThrough :node.stream.PassThrough,   Stream :node.stream.^} */
    object NodeBaseExport {
      
      @JSGlobal("_Readable.NodeBaseExport")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("_Readable.NodeBaseExport.Duplex")
      @js.native
      def Duplex: typings.node.streamMod.Duplex = js.native
      inline def Duplex_=(x: typings.node.streamMod.Duplex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Duplex")(x.asInstanceOf[js.Any])
      
      @JSGlobal("_Readable.NodeBaseExport.PassThrough")
      @js.native
      def PassThrough: typings.node.streamMod.PassThrough = js.native
      inline def PassThrough_=(x: typings.node.streamMod.PassThrough): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PassThrough")(x.asInstanceOf[js.Any])
      
      @JSGlobal("_Readable.NodeBaseExport.Readable")
      @js.native
      def Readable_ : typings.node.streamMod.Readable = js.native
      
      inline def Readable__=(x: typings.node.streamMod.Readable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Readable")(x.asInstanceOf[js.Any])
      
      @JSGlobal("_Readable.NodeBaseExport.Stream")
      @js.native
      def Stream: typings.node.streamMod.^ = js.native
      inline def Stream_=(x: typings.node.streamMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stream")(x.asInstanceOf[js.Any])
      
      @JSGlobal("_Readable.NodeBaseExport.Transform")
      @js.native
      def Transform: typings.node.streamMod.Transform = js.native
      inline def Transform_=(x: typings.node.streamMod.Transform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
      
      @JSGlobal("_Readable.NodeBaseExport.Writable")
      @js.native
      def Writable: typings.node.streamMod.Writable = js.native
      inline def Writable_=(x: typings.node.streamMod.Writable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Writable")(x.asInstanceOf[js.Any])
      
      inline def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_destroy")(error.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_destroy")(error.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def _read(size: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_read")(size.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      inline def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
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
      inline def addListener_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def addListener_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
      inline def constructor(options: EventEmitterOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def constructor(opts: typings.node.streamMod.ReadableOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
      inline def destroy(error: Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSGlobal("_Readable.NodeBaseExport.destroyed")
      @js.native
      def destroyed: Boolean = js.native
      inline def destroyed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(x.asInstanceOf[js.Any])
      
      inline def emit(event: String, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def emit(event: js.Symbol, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def emit_close(event: close): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def emit_data(event: data, chunk: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], chunk.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def emit_end(event: end): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def emit_error(event: error, err: Error): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def emit_pause(event: pause): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def emit_readable(event: readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def emit_resume(event: resume): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def eventNames(): js.Array[String | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventNames")().asInstanceOf[js.Array[String | js.Symbol]]
      
      inline def getMaxListeners(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxListeners")().asInstanceOf[Double]
      
      inline def isPaused(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPaused")().asInstanceOf[Boolean]
      
      inline def listenerCount(event: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def listenerCount(event: js.Symbol): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def listeners(event: String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
      inline def listeners(event: js.Symbol): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
      
      inline def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      inline def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      inline def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def on_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def on_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def on_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def on_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def on_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      inline def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def once_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def once_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def once_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def once_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def once_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def pause(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[this.type]
      
      inline def pipe[T /* <: WritableStream */](destination: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(destination.asInstanceOf[js.Any]).asInstanceOf[T]
      inline def pipe[T /* <: WritableStream */](destination: T, options: End): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
      
      // Added in Node 6...
      inline def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      inline def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      inline def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def push(chunk: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(chunk.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def push(chunk: js.Any, encoding: BufferEncoding): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(chunk.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def rawListeners(event: String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawListeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
      inline def rawListeners(event: js.Symbol): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawListeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
      
      inline def read(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[js.Any]
      inline def read(size: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(size.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      inline def read_Union(): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[String | Buffer]
      inline def read_Union(size: Double): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(size.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
      
      @JSGlobal("_Readable.NodeBaseExport.readable")
      @js.native
      def readable: Boolean = js.native
      
      @JSGlobal("_Readable.NodeBaseExport.readableEncoding")
      @js.native
      val readableEncoding: BufferEncoding | Null = js.native
      
      @JSGlobal("_Readable.NodeBaseExport.readableEnded")
      @js.native
      val readableEnded: Boolean = js.native
      
      @JSGlobal("_Readable.NodeBaseExport.readableFlowing")
      @js.native
      val readableFlowing: Boolean | Null = js.native
      
      @JSGlobal("_Readable.NodeBaseExport.readableHighWaterMark")
      @js.native
      val readableHighWaterMark: Double = js.native
      
      @JSGlobal("_Readable.NodeBaseExport.readableLength")
      @js.native
      val readableLength: Double = js.native
      
      @JSGlobal("_Readable.NodeBaseExport.readableObjectMode")
      @js.native
      val readableObjectMode: Boolean = js.native
      
      inline def readable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readable")(x.asInstanceOf[js.Any])
      
      inline def removeAllListeners(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[this.type]
      inline def removeAllListeners(event: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[this.type]
      inline def removeAllListeners(event: js.Symbol): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      inline def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
      
      inline def resume(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")().asInstanceOf[this.type]
      
      inline def setEncoding(encoding: BufferEncoding): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("setEncoding")(encoding.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def setMaxListeners(n: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(n.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def unpipe(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("unpipe")().asInstanceOf[this.type]
      inline def unpipe(destination: WritableStream): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("unpipe")(destination.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def unshift(chunk: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def unshift(chunk: String, encoding: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def unshift(chunk: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def unshift(chunk: Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(chunk.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def wrap(oldStream: ReadableStream): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldStream.asInstanceOf[js.Any]).asInstanceOf[this.type]
    }
    
    // ==== _stream_passthrough ====
    @JSGlobal("_Readable.PassThrough")
    @js.native
    class PassThrough ()
      extends typings.readableStream.mod.PassThrough {
      def this(options: TransformOptions) = this()
    }
    
    @JSGlobal("_Readable.Readable")
    @js.native
    class Readable ()
      extends typings.readableStream.mod.Readable {
      def this(options: ReadableOptions) = this()
    }
    
    @JSGlobal("_Readable.Stream")
    @js.native
    class Stream ()
      extends typings.readableStream.mod.Stream {
      def this(options: ReadableOptions) = this()
    }
    
    @JSGlobal("_Readable.Transform")
    @js.native
    class Transform ()
      extends typings.readableStream.mod.Transform {
      def this(options: TransformOptions) = this()
    }
    
    @JSGlobal("_Readable.Writable")
    @js.native
    class Writable ()
      extends typings.readableStream.mod.Writable {
      def this(options: WritableOptions) = this()
    }
  }
}
