package typings.ranjs.ranjsMod

import typings.ranjs.ranjsMod._ts.Commons
import typings.ranjs.ranjsMod.la.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "ts")
@js.native
object ts extends js.Object {
  @js.native
  class AC () extends Commons {
    def this(dimension: Double) = this()
    def this(dimension: Double, range: Double) = this()
    def this(dimension: Double, range: Double, maxSize: Double) = this()
    def compute(): js.Array[js.Array[Double]] = js.native
    /* CompleteClass */
    override def reset(): Unit = js.native
    /* CompleteClass */
    override def update(x: js.Array[Double]): Unit = js.native
  }
  
  @js.native
  class Cov () extends Commons {
    def this(dimension: Double) = this()
    def compute(): Matrix = js.native
    /* CompleteClass */
    override def reset(): Unit = js.native
    /* CompleteClass */
    override def update(x: js.Array[Double]): Unit = js.native
  }
  
}

