package typings.ranjs.ranjsMod

import typings.ranjs.Anon_Dim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "mc")
@js.native
object mc extends js.Object {
  @js.native
  class RWM protected ()
    extends typings.ranjs.ranjsMod._mc.MCMC {
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double]) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Anon_Dim) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Anon_Dim, initialState: State) = this()
  }
  
  def gr(samples: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = js.native
  def gr(samples: js.Array[js.Array[js.Array[Double]]], maxLength: Double): js.Array[js.Array[Double]] = js.native
  type MCMC = typings.ranjs.ranjsMod._mc.MCMC
  type State = typings.ranjs.ranjsMod._mc.State
}

