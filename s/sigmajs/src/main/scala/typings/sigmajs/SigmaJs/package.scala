package typings.sigmajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SigmaJs {
  type GexfParser = js.Function3[
    /* target */ java.lang.String, 
    /* sigma */ typings.sigmajs.SigmaJs.Sigma, 
    /* callback */ js.Function1[/* graph */ typings.sigmajs.SigmaJs.Sigma, scala.Unit], 
    scala.Unit
  ]
  type JsonParser = js.Function3[
    /* target */ java.lang.String, 
    /* sigma */ typings.sigmajs.SigmaJs.Sigma, 
    /* callback */ js.Function1[/* graph */ typings.sigmajs.SigmaJs.Sigma, scala.Unit], 
    scala.Unit
  ]
  type SVGEdgeLabels = org.scalablytyped.runtime.StringDictionary[typings.sigmajs.SigmaJs.SVGObject[typings.sigmajs.SigmaJs.Edge]]
}
