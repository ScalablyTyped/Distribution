package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamPipeOptions extends StObject {
  
  /* standard dom */
  var preventAbort: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var preventCancel: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * Pipes this readable stream to a given writable stream destination. The way in which the piping process behaves under various error conditions can be customized with a number of passed options. It returns a promise that fulfills when the piping process completes successfully, or rejects if any errors were encountered.
    *
    * Piping a stream will lock it for the duration of the pipe, preventing any other consumer from acquiring a reader.
    *
    * Errors and closures of the source and destination streams propagate as follows:
    *
    * An error in this source readable stream will abort destination, unless preventAbort is truthy. The returned promise will be rejected with the source's error, or with any error that occurs during aborting the destination.
    *
    * An error in destination will cancel this source readable stream, unless preventCancel is truthy. The returned promise will be rejected with the destination's error, or with any error that occurs during canceling the source.
    *
    * When this source readable stream closes, destination will be closed, unless preventClose is truthy. The returned promise will be fulfilled once this process completes, unless an error is encountered while closing the destination, in which case it will be rejected with that error.
    *
    * If destination starts out closed or closing, this source readable stream will be canceled, unless preventCancel is true. The returned promise will be rejected with an error indicating piping to a closed stream failed, or with any error that occurs during canceling the source.
    *
    * The signal option can be set to an AbortSignal to allow aborting an ongoing pipe operation via the corresponding AbortController. In this case, this source readable stream will be canceled, and destination aborted, unless the respective options preventCancel or preventAbort are set.
    */
  /* standard dom */
  var preventClose: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object StreamPipeOptions {
  
  inline def apply(): StreamPipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamPipeOptions]
  }
  
  extension [Self <: StreamPipeOptions](x: Self) {
    
    inline def setPreventAbort(value: scala.Boolean): Self = StObject.set(x, "preventAbort", value.asInstanceOf[js.Any])
    
    inline def setPreventAbortUndefined: Self = StObject.set(x, "preventAbort", js.undefined)
    
    inline def setPreventCancel(value: scala.Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    inline def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
    
    inline def setPreventClose(value: scala.Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
