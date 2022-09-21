package typings.ranjs.mod

import typings.ranjs.mod._ts.Commons
import typings.ranjs.mod.la.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ts {
  
  @JSImport("ranjs", "ts.AC")
  @js.native
  open class AC ()
    extends StObject
       with Commons {
    def this(dimension: Double) = this()
    def this(dimension: Double, range: Double) = this()
    def this(dimension: Unit, range: Double) = this()
    def this(dimension: Double, range: Double, maxSize: Double) = this()
    def this(dimension: Double, range: Unit, maxSize: Double) = this()
    def this(dimension: Unit, range: Double, maxSize: Double) = this()
    def this(dimension: Unit, range: Unit, maxSize: Double) = this()
    
    def compute(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def update(x: js.Array[Double]): Unit = js.native
  }
  
  @JSImport("ranjs", "ts.Cov")
  @js.native
  open class Cov ()
    extends StObject
       with Commons {
    def this(dimension: Double) = this()
    
    def compute(): Matrix = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def update(x: js.Array[Double]): Unit = js.native
  }
}
