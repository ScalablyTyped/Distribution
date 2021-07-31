package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int53Mod {
  
  @JSImport("random-js/dist/distribution/int53", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def int53(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int53")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
}
