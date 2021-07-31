package typings.sjcl.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclPointJacobianStatic
  extends StObject
     with Instantiable1[/* curve */ SjclEllipticalCurve, SjclPointJacobian]
     with Instantiable2[/* curve */ SjclEllipticalCurve, /* x */ BigNumber, SjclPointJacobian]
     with Instantiable3[
      /* curve */ SjclEllipticalCurve, 
      (/* x */ BigNumber) | (/* x */ Unit), 
      /* y */ BigNumber, 
      SjclPointJacobian
    ]
     with Instantiable4[
      /* curve */ SjclEllipticalCurve, 
      (/* x */ BigNumber) | (/* x */ Unit), 
      (/* y */ BigNumber) | (/* y */ Unit), 
      /* z */ BigNumber, 
      SjclPointJacobian
    ] {
  
  def toAffineMultiple(points: js.Array[SjclPointJacobian]): js.Array[SjclEllipticalPoint] = js.native
}
