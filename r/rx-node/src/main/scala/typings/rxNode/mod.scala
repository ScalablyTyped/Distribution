package typings.rxNode

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.rxLite.Rx.Disposable
import typings.rxLiteAggregates.Rx.Observable
import typings.rxNode.RxNode.PublishableEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rx-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a flowing readline stream to an Observable sequence.
    * @param {Stream} stream A stream to convert to a observable sequence.
    * @returns {Observable} An observable sequence which fires on each 'data' event as well as handling 'error' and 'end' events.
    */
  inline def fromReadLineStream[T](stream: ReadableStream): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReadLineStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  /**
    * Converts a flowing readable stream to an Observable sequence.
    * @param {Stream} stream A stream to convert to a observable sequence.
    * @param {String} [dataEventName] Event that notifies about incoming data. ("data" by default)
    * @returns {Observable} An observable sequence which fires on each 'data' event as well as handling 'error' and 'end' events.
    */
  inline def fromReadableStream[T](stream: ReadableStream): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReadableStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromReadableStream[T](stream: ReadableStream, dataEventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromReadableStream")(stream.asInstanceOf[js.Any], dataEventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  /**
    * Converts a flowing stream to an Observable sequence.
    * @param {Stream} stream A stream to convert to a observable sequence.
    * @param {String} [finishEventName] Event that notifies about closed stream. ("end" by default)
    * @param {String} [dataEventName] Event that notifies about incoming data. ("data" by default)
    * @returns {Observable} An observable sequence which fires on each 'data' event as well as handling 'error' and finish events like `end` or `finish`.
    */
  inline def fromStream[T](stream: ReadableStream): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromStream[T](stream: ReadableStream, finishEventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], finishEventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromStream[T](stream: ReadableStream, finishEventName: String, dataEventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], finishEventName.asInstanceOf[js.Any], dataEventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromStream[T](stream: ReadableStream, finishEventName: Unit, dataEventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], finishEventName.asInstanceOf[js.Any], dataEventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  /**
    * Converts a flowing transform stream to an Observable sequence.
    * @param {Stream} stream A stream to convert to a observable sequence.
    * @param {String} [dataEventName] Event that notifies about incoming data. ("data" by default)
    * @returns {Observable} An observable sequence which fires on each 'data' event as well as handling 'error' and 'finish' events.
    */
  inline def fromTransformStream[T](stream: ReadWriteStream): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTransformStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromTransformStream[T](stream: ReadWriteStream, dataEventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTransformStream")(stream.asInstanceOf[js.Any], dataEventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  /**
    * Converts a flowing writeable stream to an Observable sequence.
    * @param {Stream} stream A stream to convert to a observable sequence.
    * @returns {Observable} An observable sequence which fires on each 'data' event as well as handling 'error' and 'finish' events.
    */
  inline def fromWritableStream[T](stream: WritableStream): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWritableStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  /**
    * Converts the given observable sequence to an event emitter with the given event name.
    * The errors are handled on the 'error' event and completion on the 'end' event.
    * You must call publish in order to invoke the subscription on the Observable sequence.
    * @param {Observable} observable The observable sequence to convert to an EventEmitter.
    * @param {String} eventName The event name to emit onNext calls.
    * @returns {EventEmitter} An EventEmitter which emits the given eventName for each onNext call in addition to 'error' and 'end' events.
    */
  inline def toEventEmitter[T](observable: Observable[T], eventName: String): PublishableEventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("toEventEmitter")(observable.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[PublishableEventEmitter]
  
  /**
    * Writes an observable sequence to a stream
    * @param {Observable} observable Observable sequence to write to a stream.
    * @param {Stream} stream The stream to write to.
    * @param {String} [encoding] The encoding of the item to write.
    * @returns {Disposable} The subscription handle.
    */
  inline def writeToStream[T](observable: Observable[T], stream: WritableStream, encoding: String): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(observable.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
