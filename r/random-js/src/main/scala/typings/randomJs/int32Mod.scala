package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int32Mod {
  
  @JSImport("random-js/dist/distribution/int32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def int32(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
}
