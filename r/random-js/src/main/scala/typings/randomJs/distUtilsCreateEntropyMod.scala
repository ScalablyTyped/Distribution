package typings.randomJs

import typings.randomJs.distTypesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCreateEntropyMod {
  
  @JSImport("random-js/dist/utils/createEntropy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEntropy(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEntropy")().asInstanceOf[js.Array[Double]]
  inline def createEntropy(engine: Unit, length: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEntropy")(engine.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def createEntropy(engine: Engine): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEntropy")(engine.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def createEntropy(engine: Engine, length: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEntropy")(engine.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
