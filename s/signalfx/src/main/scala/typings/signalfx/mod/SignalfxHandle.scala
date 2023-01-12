package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalfxHandle extends StObject {
  
  def close(): Boolean
  
  def get_known_tsids(): js.Array[String]
  
  def get_metadata(): js.UndefOr[js.Object]
  
  def stream(callback: StreamCallback): Boolean
}
object SignalfxHandle {
  
  inline def apply(
    close: () => Boolean,
    get_known_tsids: () => js.Array[String],
    get_metadata: () => js.UndefOr[js.Object],
    stream: StreamCallback => Boolean
  ): SignalfxHandle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), get_known_tsids = js.Any.fromFunction0(get_known_tsids), get_metadata = js.Any.fromFunction0(get_metadata), stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[SignalfxHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignalfxHandle] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Boolean): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setGet_known_tsids(value: () => js.Array[String]): Self = StObject.set(x, "get_known_tsids", js.Any.fromFunction0(value))
    
    inline def setGet_metadata(value: () => js.UndefOr[js.Object]): Self = StObject.set(x, "get_metadata", js.Any.fromFunction0(value))
    
    inline def setStream(value: StreamCallback => Boolean): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
  }
}
