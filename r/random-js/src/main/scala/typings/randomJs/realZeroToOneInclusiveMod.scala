package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realZeroToOneInclusiveMod {
  
  @JSImport("random-js/dist/distribution/realZeroToOneInclusive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def realZeroToOneInclusive(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("realZeroToOneInclusive")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
}
