package typings.streamFork

import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-fork", JSImport.Namespace)
  @js.native
  class ^ protected () extends Fork_ {
    /**
      * A specialized Writable stream. It propagates every piece of data downstream to its dependent Writable streams (including Transform and Duplex streams).
      * @param outputs outputs is an array of Writable streams, which will be used duplicate written chunks or items.
      * @param options options is an options object, which is used to create a Writable stream.
      * Read all about it in Implementing a Writable stream. If it is not specified or falsy, {objectMode: true} is assumed. This default is useful for creating object mode streams.
      */
    def this(outputs: js.Array[Writable]) = this()
    def this(outputs: js.Array[Writable], options: ForkOptions) = this()
  }
  @JSImport("stream-fork", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * It is a factory function, which accepts the same arguments as the constructor, and returns a fully constructed Fork object.
    */
  /* static member */
  @scala.inline
  def fork(outputs: js.Array[Writable]): Fork_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(outputs.asInstanceOf[js.Any]).asInstanceOf[Fork_]
  @scala.inline
  def fork(outputs: js.Array[Writable], options: ForkOptions): Fork_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(outputs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Fork_]
  
  trait ForkOptions
    extends StObject
       with WritableOptions {
    
    /**
      * ignoreErrors is a flag. When its value is truthy, a Fork instance never fails on write() silently ignoring downstream errors.
      * Otherwise, the first encountered downstream error is reported upstream as its own error. The default: false.
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  }
  object ForkOptions {
    
    @scala.inline
    def apply(): ForkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForkOptions]
    }
    
    @scala.inline
    implicit class ForkOptionsMutableBuilder[Self <: ForkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    }
  }
  
  @js.native
  trait Fork_ extends Writable {
    
    /**
      * It returns true if outputs property is empty, and false otherwise. If isEmpty() is true, it means that the stream do not duplicate data.
      */
    def isEmpty(): Boolean = js.native
  }
}
