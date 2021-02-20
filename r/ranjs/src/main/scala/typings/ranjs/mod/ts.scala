package typings.ranjs.mod

import typings.ranjs.mod._ts.Commons
import typings.ranjs.mod.la.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ts {
  
  @JSImport("ranjs", "ts.AC")
  @js.native
  class AC () extends Commons {
    def this(dimension: Double) = this()
    def this(dimension: js.UndefOr[scala.Nothing], range: Double) = this()
    def this(dimension: Double, range: Double) = this()
    def this(dimension: js.UndefOr[scala.Nothing], range: js.UndefOr[scala.Nothing], maxSize: Double) = this()
    def this(dimension: js.UndefOr[scala.Nothing], range: Double, maxSize: Double) = this()
    def this(dimension: Double, range: js.UndefOr[scala.Nothing], maxSize: Double) = this()
    def this(dimension: Double, range: Double, maxSize: Double) = this()
    
    def compute(): js.Array[js.Array[Double]] = js.native
  }
  
  @JSImport("ranjs", "ts.Cov")
  @js.native
  class Cov () extends Commons {
    def this(dimension: Double) = this()
    
    def compute(): Matrix = js.native
  }
}
