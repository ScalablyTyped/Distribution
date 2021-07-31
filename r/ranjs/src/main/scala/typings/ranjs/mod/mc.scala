package typings.ranjs.mod

import typings.ranjs.anon.Dim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mc {
  
  @JSImport("ranjs", "mc")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ranjs", "mc.RWM")
  @js.native
  class RWM protected ()
    extends StObject
       with typings.ranjs.mod._mc.MCMC {
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double]) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Dim) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Unit, initialState: State) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Dim, initialState: State) = this()
  }
  
  @scala.inline
  def gr(samples: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gr")(samples.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  @scala.inline
  def gr(samples: js.Array[js.Array[js.Array[Double]]], maxLength: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("gr")(samples.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  type MCMC = typings.ranjs.mod._mc.MCMC
  
  type State = typings.ranjs.mod._mc.State
}
