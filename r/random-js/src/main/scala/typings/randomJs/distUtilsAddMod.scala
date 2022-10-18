package typings.randomJs

import typings.randomJs.distTypesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsAddMod {
  
  @JSImport("random-js/dist/utils/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(distribution: Distribution[Double], addend: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(distribution.asInstanceOf[js.Any], addend.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
}
