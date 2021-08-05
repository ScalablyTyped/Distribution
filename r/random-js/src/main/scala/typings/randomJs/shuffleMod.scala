package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shuffleMod {
  
  @JSImport("random-js/dist/distribution/shuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shuffle[T](engine: Engine, array: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(engine.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def shuffle[T](engine: Engine, array: js.Array[T], downTo: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(engine.asInstanceOf[js.Any], array.asInstanceOf[js.Any], downTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
