package typings.sigmajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SigmaJsNs {
  import org.scalablytyped.runtime.StringDictionary

  type GexfParser = js.Function3[
    /* target */ String, 
    /* sigma */ Sigma, 
    /* callback */ js.Function1[/* graph */ Sigma, Unit], 
    Unit
  ]
  type JsonParser = js.Function3[
    /* target */ String, 
    /* sigma */ Sigma, 
    /* callback */ js.Function1[/* graph */ Sigma, Unit], 
    Unit
  ]
  type SVGEdgeLabels = StringDictionary[SVGObject[Edge]]
}
