package typings.sjcl.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclPointJacobianStatic
  extends Instantiable1[/* curve */ SjclEllipticalCurve, SjclPointJacobian]
     with Instantiable2[/* curve */ SjclEllipticalCurve, /* x */ BigNumber, SjclPointJacobian]
     with Instantiable3[
      /* curve */ SjclEllipticalCurve, 
      js.UndefOr[/* x */ BigNumber], 
      /* y */ BigNumber, 
      SjclPointJacobian
    ]
     with Instantiable4[
      /* curve */ SjclEllipticalCurve, 
      js.UndefOr[/* x */ BigNumber], 
      js.UndefOr[/* y */ BigNumber], 
      /* z */ BigNumber, 
      SjclPointJacobian
    ] {
  def toAffineMultiple(points: js.Array[SjclPointJacobian]): js.Array[SjclEllipticalPoint] = js.native
}

