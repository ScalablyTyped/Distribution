package typings.skilja

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("skilja", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chunkArray[T](original: js.Array[T], limit: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("chunkArray")(original.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
}
