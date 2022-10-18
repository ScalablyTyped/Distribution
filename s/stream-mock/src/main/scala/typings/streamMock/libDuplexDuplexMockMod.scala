package typings.streamMock

import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.nodeStrings.close
import typings.node.nodeStrings.data
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.finish
import typings.node.nodeStrings.pause
import typings.node.nodeStrings.pipe
import typings.node.nodeStrings.readable
import typings.node.nodeStrings.resume
import typings.node.nodeStrings.unpipe
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.std.ArrayLike
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDuplexDuplexMockMod {
  
  @JSImport("stream-mock/lib/duplex/DuplexMock", JSImport.Default)
  @js.native
  open class default () extends DuplexMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: DuplexOptions) = this()
    def this(source: Unit, options: DuplexOptions) = this()
    def this(source: ArrayLike[Any], options: DuplexOptions) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
  - typings.node.NodeJS.WritableStream because var conflicts: writable. Inlined 
  - typings.node.streamMod.Readable because Inheritance from two classes. Inlined readableDidRead, readableAborted, readableLength, readableEncoding, readableEnded, readableObjectMode, readableHighWaterMark, readableFlowing, _read, addListener_data, addListener_end, addListener_pause, addListener_readable, addListener_resume, emit_data, emit_end, emit_pause, emit_readable, emit_resume, on_data, on_end, on_pause, on_readable, on_resume, once_data, once_end, once_pause, once_readable, once_resume, prependListener_data, prependListener_end, prependListener_pause, prependListener_readable, prependListener_resume, prependOnceListener_data, prependOnceListener_end, prependOnceListener_pause, prependOnceListener_readable, prependOnceListener_resume, push, push, removeListener_data, removeListener_end, removeListener_pause, removeListener_readable, removeListener_resume, unshift, unshift
  - typings.node.streamMod.Writable because Inheritance from two classes. Inlined destroyed, _construct, _destroy, _destroy, _final, _write, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, cork, destroy, destroy, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, end, end, end, end, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, setDefaultEncoding, uncork, write, write, write, write
  - typings.streamMock.libReadableIreadablemockMod.IReadableMock because Inheritance from two classes. Inlined it
  - typings.streamMock.libWritableIwritablemockMod.IWritableMock because Inheritance from two classes. Inlined data, flatData */ @js.native
  trait DuplexMock
    extends Duplex
       with ReadableStream {
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _read(size: Double): Unit = js.native
    
    /* private */ var _readableState: Any = js.native
    
    /* private */ var _writableState: Any = js.native
    
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    var data: js.Array[Any] | Buffer = js.native
    
    /**
      * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the writable
      * stream has ended and subsequent calls to `write()` or `end()` will result in
      * an `ERR_STREAM_DESTROYED` error.
      * This is a destructive and immediate way to destroy a stream. Previous calls to`write()` may not have drained, and may trigger an `ERR_STREAM_DESTROYED` error.
      * Use `end()` instead of destroy if data should flush before close, or wait for
      * the `'drain'` event before destroying the stream.
      *
      * Once `destroy()` has been called any further calls will be a no-op and no
      * further errors except from `_destroy()` may be emitted as `'error'`.
      *
      * Implementors should not override this method,
      * but instead implement `writable._destroy()`.
      * @since v8.0.0
      * @param error Optional, an error to emit with `'error'` event.
      */
    def destroy(): this.type = js.native
    def destroy(error: js.Error): this.type = js.native
    
    /**
      * Is `true` after `writable.destroy()` has been called.
      * @since v8.0.0
      */
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: Any): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    var encoding: BufferEncoding = js.native
    
    var flatData: js.Array[Any] | Buffer = js.native
    
    var it: IterableIterator[Any] = js.native
    
    var objectMode: Boolean = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def push(chunk: Any): Boolean = js.native
    def push(chunk: Any, encoding: BufferEncoding): Boolean = js.native
    
    /**
      * Returns whether the stream was destroyed or errored before emitting `'end'`.
      * @since v16.8.0
      * @experimental
      */
    val readableAborted: Boolean = js.native
    
    /**
      * Returns whether `'data'` has been emitted.
      * @since v16.7.0, v14.18.0
      * @experimental
      */
    val readableDidRead: Boolean = js.native
    
    /**
      * Getter for the property `encoding` of a given `Readable` stream. The `encoding`property can be set using the `readable.setEncoding()` method.
      * @since v12.7.0
      */
    val readableEncoding: BufferEncoding | Null = js.native
    
    /**
      * Becomes `true` when `'end'` event is emitted.
      * @since v12.9.0
      */
    val readableEnded: Boolean = js.native
    
    /**
      * This property reflects the current state of a `Readable` stream as described
      * in the `Three states` section.
      * @since v9.4.0
      */
    val readableFlowing: Boolean | Null = js.native
    
    /**
      * Returns the value of `highWaterMark` passed when creating this `Readable`.
      * @since v9.3.0
      */
    val readableHighWaterMark: Double = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue
      * ready to be read. The value provides introspection data regarding
      * the status of the `highWaterMark`.
      * @since v9.4.0
      */
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /**
      * Passing `chunk` as `null` signals the end of the stream (EOF) and behaves the
      * same as `readable.push(null)`, after which no more data can be written. The EOF
      * signal is put at the end of the buffer and any buffered data will still be
      * flushed.
      *
      * The `readable.unshift()` method pushes a chunk of data back into the internal
      * buffer. This is useful in certain situations where a stream is being consumed by
      * code that needs to "un-consume" some amount of data that it has optimistically
      * pulled out of the source, so that the data can be passed on to some other party.
      *
      * The `stream.unshift(chunk)` method cannot be called after the `'end'` event
      * has been emitted or a runtime error will be thrown.
      *
      * Developers using `stream.unshift()` often should consider switching to
      * use of a `Transform` stream instead. See the `API for stream implementers` section for more information.
      *
      * ```js
      * // Pull off a header delimited by \n\n.
      * // Use unshift() if we get too much.
      * // Call the callback with (error, header, stream).
      * const { StringDecoder } = require('string_decoder');
      * function parseHeader(stream, callback) {
      *   stream.on('error', callback);
      *   stream.on('readable', onReadable);
      *   const decoder = new StringDecoder('utf8');
      *   let header = '';
      *   function onReadable() {
      *     let chunk;
      *     while (null !== (chunk = stream.read())) {
      *       const str = decoder.write(chunk);
      *       if (str.includes('\n\n')) {
      *         // Found the header boundary.
      *         const split = str.split(/\n\n/);
      *         header += split.shift();
      *         const remaining = split.join('\n\n');
      *         const buf = Buffer.from(remaining, 'utf8');
      *         stream.removeListener('error', callback);
      *         // Remove the 'readable' listener before unshifting.
      *         stream.removeListener('readable', onReadable);
      *         if (buf.length)
      *           stream.unshift(buf);
      *         // Now the body of the message can be read from the stream.
      *         callback(null, header, stream);
      *         return;
      *       }
      *       // Still reading the header.
      *       header += str;
      *     }
      *   }
      * }
      * ```
      *
      * Unlike {@link push}, `stream.unshift(chunk)` will not
      * end the reading process by resetting the internal reading state of the stream.
      * This can cause unexpected results if `readable.unshift()` is called during a
      * read (i.e. from within a {@link _read} implementation on a
      * custom stream). Following the call to `readable.unshift()` with an immediate {@link push} will reset the reading state appropriately,
      * however it is best to simply avoid calling `readable.unshift()` while in the
      * process of performing a read.
      * @since v0.9.11
      * @param chunk Chunk of data to unshift onto the read queue. For streams not operating in object mode, `chunk` must be a string, `Buffer`, `Uint8Array` or `null`. For object mode
      * streams, `chunk` may be any JavaScript value.
      * @param encoding Encoding of string chunks. Must be a valid `Buffer` encoding, such as `'utf8'` or `'ascii'`.
      */
    def unshift(chunk: Any): Unit = js.native
    def unshift(chunk: Any, encoding: BufferEncoding): Unit = js.native
  }
}
