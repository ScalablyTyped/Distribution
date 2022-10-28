package typings.responseIterator

import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesReaderMod {
  
  @JSImport("response-iterator/dist/types/reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](reader: Any): AsyncIterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(reader.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[T]]
}
