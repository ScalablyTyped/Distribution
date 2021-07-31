package typings.streamSeries

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: ReadableStream */](streams: T*): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("stream-series", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
