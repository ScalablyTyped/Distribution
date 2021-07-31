package typings.streamShift

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(stream: ReadableStream): Buffer | String | Null = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Buffer | String | Null]
  
  @JSImport("stream-shift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
