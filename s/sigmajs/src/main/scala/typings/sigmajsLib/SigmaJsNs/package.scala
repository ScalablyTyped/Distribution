package typings
package sigmajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SigmaJsNs {
  type GexfParser = js.Function3[
    /* target */ java.lang.String, 
    /* sigma */ Sigma, 
    /* callback */ js.Function1[/* graph */ Sigma, scala.Unit], 
    scala.Unit
  ]
  type JsonParser = js.Function3[
    /* target */ java.lang.String, 
    /* sigma */ Sigma, 
    /* callback */ js.Function1[/* graph */ Sigma, scala.Unit], 
    scala.Unit
  ]
}
