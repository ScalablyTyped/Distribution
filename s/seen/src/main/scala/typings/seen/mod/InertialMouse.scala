package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "InertialMouse")
@js.native
open class InertialMouse () extends StObject {
  
  def damp(): this.type = js.native
  
  def get(): js.Tuple2[Double, Double] = js.native
  
  def reset(): this.type = js.native
  
  def update(xy: js.Tuple2[Double, Double]): this.type = js.native
  
  var xy: js.Array[Double] = js.native
}
/* static members */
object InertialMouse {
  
  @JSImport("seen", "InertialMouse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("seen", "InertialMouse.inertiaExtinction")
  @js.native
  def inertiaExtinction: Double = js.native
  inline def inertiaExtinction_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inertiaExtinction")(x.asInstanceOf[js.Any])
  
  @JSImport("seen", "InertialMouse.inertiaMsecDelay")
  @js.native
  def inertiaMsecDelay: Double = js.native
  inline def inertiaMsecDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inertiaMsecDelay")(x.asInstanceOf[js.Any])
  
  @JSImport("seen", "InertialMouse.smoothingTimeout")
  @js.native
  def smoothingTimeout: Double = js.native
  inline def smoothingTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smoothingTimeout")(x.asInstanceOf[js.Any])
}
