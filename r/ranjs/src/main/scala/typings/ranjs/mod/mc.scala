package typings.ranjs.mod

import typings.ranjs.anon.Dim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ranjs", "mc")
@js.native
object mc extends js.Object {
  
  def gr(samples: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = js.native
  def gr(samples: js.Array[js.Array[js.Array[Double]]], maxLength: Double): js.Array[js.Array[Double]] = js.native
  
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
  
  type MCMC = typings.ranjs.mod._mc.MCMC
  
  type State = typings.ranjs.mod._mc.State
}
