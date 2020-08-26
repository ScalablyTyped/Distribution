package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.std.DOMRectInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMRect")
@js.native
class DOMRect ()
  extends typings.std.DOMRect {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}

@JSGlobal("DOMRect")
@js.native
object DOMRect
  extends Instantiable0[typings.std.DOMRect]
     with Instantiable1[/* x */ Double, typings.std.DOMRect]
     with Instantiable2[js.UndefOr[/* x */ Double], /* y */ Double, typings.std.DOMRect]
     with Instantiable3[
      js.UndefOr[/* x */ Double], 
      js.UndefOr[/* y */ Double], 
      /* width */ Double, 
      typings.std.DOMRect
    ]
     with Instantiable4[
      js.UndefOr[/* x */ Double], 
      js.UndefOr[/* y */ Double], 
      js.UndefOr[/* width */ Double], 
      /* height */ Double, 
      typings.std.DOMRect
    ] {
  def fromRect(): typings.std.DOMRect = js.native
  def fromRect(other: DOMRectInit): typings.std.DOMRect = js.native
}

