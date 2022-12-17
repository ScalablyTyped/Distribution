package typings.ranjs.mod

import typings.ranjs.anon.Chi2
import typings.ranjs.anon.Passed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object test {
  
  @JSImport("ranjs", "test")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bartlett(dataSets: js.Array[js.Array[Double]], alpha: Double): Chi2 = (^.asInstanceOf[js.Dynamic].applyDynamic("bartlett")(dataSets.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Chi2]
  
  inline def mannWhitney(dataSets: js.Array[js.Array[Double]], alpha: Double): Passed = (^.asInstanceOf[js.Dynamic].applyDynamic("mannWhitney")(dataSets.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Passed]
}
