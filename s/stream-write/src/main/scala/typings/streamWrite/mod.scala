package typings.streamWrite

import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: Writable, chunk: Any): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], chunk.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("stream-write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
