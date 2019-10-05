package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRect extends DOMRectReadOnly

@JSGlobal("DOMRect")
@js.native
object DOMRect
  extends Instantiable0[DOMRect]
     with Instantiable1[/* x */ Double, DOMRect]
     with Instantiable2[/* x */ Double, /* y */ Double, DOMRect]
     with Instantiable3[/* x */ Double, /* y */ Double, /* width */ Double, DOMRect]
     with Instantiable4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, DOMRect] {
  def fromRect(): DOMRect = js.native
  def fromRect(other: DOMRectInit): DOMRect = js.native
}

