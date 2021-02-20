package typings.ranjs.mod

import typings.ranjs.anon.Dim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mc {
  
  @JSImport("ranjs", "mc.RWM")
  @js.native
  class RWM protected ()
    extends typings.ranjs.mod._mc.MCMC {
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double]) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Dim) = this()
    def this(
      logDensity: js.Function1[/* x */ js.Array[Double], Double],
      config: js.UndefOr[scala.Nothing],
      initialState: State
    ) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Dim, initialState: State) = this()
  }
  
  @JSImport("ranjs", "mc.gr")
  @js.native
  def gr(samples: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = js.native
  @JSImport("ranjs", "mc.gr")
  @js.native
  def gr(samples: js.Array[js.Array[js.Array[Double]]], maxLength: Double): js.Array[js.Array[Double]] = js.native
  
  type MCMC = typings.ranjs.mod._mc.MCMC
  
  type State = typings.ranjs.mod._mc.State
}
