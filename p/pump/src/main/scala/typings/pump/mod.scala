package typings.pump

import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // callback have to be passed as last argument
  inline def apply(streams: (Stream | Callback)*): Stream = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream]
  inline def apply(streams: js.Array[Stream]): Stream = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any]).asInstanceOf[Stream]
  inline def apply(streams: js.Array[Stream], callback: Callback): Stream = (^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stream]
  
  @JSImport("pump", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error], Any]
  
  type Stream = ReadableStream[Any] | WritableStream[Any]
}
