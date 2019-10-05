package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectReadOnly extends js.Object {
  val bottom: Double
  val height: Double
  val left: Double
  val right: Double
  val top: Double
  val width: Double
  val x: Double
  val y: Double
  def toJSON(): js.Any
}

@JSGlobal("DOMRectReadOnly")
@js.native
object DOMRectReadOnly
  extends Instantiable0[DOMRectReadOnly]
     with Instantiable1[/* x */ Double, DOMRectReadOnly]
     with Instantiable2[/* x */ Double, /* y */ Double, DOMRectReadOnly]
     with Instantiable3[/* x */ Double, /* y */ Double, /* width */ Double, DOMRectReadOnly]
     with Instantiable4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, DOMRectReadOnly] {
  def fromRect(): DOMRectReadOnly = js.native
  def fromRect(other: DOMRectInit): DOMRectReadOnly = js.native
}

