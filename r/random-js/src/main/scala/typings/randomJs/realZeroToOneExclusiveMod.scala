package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realZeroToOneExclusiveMod {
  
  @JSImport("random-js/dist/distribution/realZeroToOneExclusive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def realZeroToOneExclusive(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("realZeroToOneExclusive")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
}
