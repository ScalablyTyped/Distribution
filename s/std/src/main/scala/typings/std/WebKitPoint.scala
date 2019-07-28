package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebKitPoint extends js.Object {
  var x: Double
  var y: Double
}

@JSGlobal("WebKitPoint")
@js.native
class WebKitPointCls () extends WebKitPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
}

@JSGlobal("WebKitPoint")
@js.native
object WebKitPoint
  extends Instantiable0[WebKitPoint]
     with Instantiable1[/* x */ Double, WebKitPoint]
     with Instantiable2[/* x */ Double, /* y */ Double, WebKitPoint]

