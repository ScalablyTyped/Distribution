package typings.sindresorhusChunkify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sindresorhus/chunkify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](iterable: js.Iterable[T], chunkSize: Double): js.Iterable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[js.Array[T]]]
}
