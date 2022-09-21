package typings.streamSeries

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: ReadableStream[Any] */](streams: T*): Any = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  @JSImport("stream-series", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
