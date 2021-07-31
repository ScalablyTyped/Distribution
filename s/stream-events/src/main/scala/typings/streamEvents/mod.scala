package typings.streamEvents

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[StreamType /* <: Stream */](stream: StreamType): StreamType = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[StreamType]
  
  @JSImport("stream-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
