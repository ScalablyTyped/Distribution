package typings.ranjs.mod

import typings.ranjs.anon.Chi2
import typings.ranjs.anon.Passed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object test {
  
  @JSImport("ranjs", "test.bartlett")
  @js.native
  def bartlett(dataSets: js.Array[js.Array[Double]], alpha: Double): Chi2 = js.native
  
  @JSImport("ranjs", "test.mannWhitney")
  @js.native
  def mannWhitney(dataSets: js.Array[js.Array[Double]], alpha: Double): Passed = js.native
}
