package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uint53Mod {
  
  @JSImport("random-js/dist/distribution/uint53", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def uint53(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uint53")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
}
