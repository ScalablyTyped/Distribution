package typings.sjcl.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclEllipticalPointStatic
  extends StObject
     with Instantiable1[/* curve */ SjclEllipticalCurve, SjclEllipticalPoint]
     with Instantiable2[/* curve */ SjclEllipticalCurve, /* x */ BigNumber, SjclEllipticalPoint]
     with Instantiable3[
      /* curve */ SjclEllipticalCurve, 
      (/* x */ BigNumber) | (/* x */ Unit), 
      /* y */ BigNumber, 
      SjclEllipticalPoint
    ]
