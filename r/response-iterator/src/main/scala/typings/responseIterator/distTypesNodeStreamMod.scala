package typings.responseIterator

import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodeStreamMod {
  
  @JSImport("response-iterator/dist/types/nodeStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](stream: Readable): AsyncIterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stream.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[T]]
}
