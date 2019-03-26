package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebKitPoint extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

@JSGlobal("WebKitPoint")
@js.native
class WebKitPointCls () extends WebKitPoint {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
}

@JSGlobal("WebKitPoint")
@js.native
object WebKitPoint
  extends org.scalablytyped.runtime.Instantiable0[WebKitPoint]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, WebKitPoint]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, WebKitPoint]

