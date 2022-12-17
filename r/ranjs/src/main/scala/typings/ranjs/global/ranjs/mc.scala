package typings.ranjs.global.ranjs

import typings.ranjs.anon.Dim
import typings.ranjs.mod.mc.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mc {
  
  @JSGlobal("ranjs.mc")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ranjs.mc.RWM")
  @js.native
  open class RWM protected ()
    extends typings.ranjs.mod.mc.RWM {
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double]) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Dim) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Unit, initialState: State) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Dim, initialState: State) = this()
  }
  
  inline def gr(samples: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gr")(samples.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  inline def gr(samples: js.Array[js.Array[js.Array[Double]]], maxLength: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("gr")(samples.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
}
