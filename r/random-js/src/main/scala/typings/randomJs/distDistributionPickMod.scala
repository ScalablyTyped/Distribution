package typings.randomJs

import typings.randomJs.distTypesMod.Engine
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistributionPickMod {
  
  @JSImport("random-js/dist/distribution/pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pick[T](engine: Engine, source: ArrayLike[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(engine.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pick[T](engine: Engine, source: ArrayLike[T], begin: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(engine.asInstanceOf[js.Any], source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pick[T](engine: Engine, source: ArrayLike[T], begin: Double, end: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(engine.asInstanceOf[js.Any], source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pick[T](engine: Engine, source: ArrayLike[T], begin: Unit, end: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(engine.asInstanceOf[js.Any], source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[T]
}
