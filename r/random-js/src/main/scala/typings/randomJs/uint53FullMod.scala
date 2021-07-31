package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uint53FullMod {
  
  @JSImport("random-js/dist/distribution/uint53Full", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def uint53Full(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uint53Full")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
}
