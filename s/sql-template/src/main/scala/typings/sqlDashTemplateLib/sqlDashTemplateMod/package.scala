package typings
package sqlDashTemplateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqlDashTemplateMod {
  type ChainFn = js.Function2[/* values */ js.Array[js.Any], /* part */ java.lang.String, java.lang.String]
  type Transformer = js.Function3[
    /* values */ js.Array[js.Any], 
    /* str */ java.lang.String, 
    /* chain */ ChainFn, 
    scala.Unit
  ]
}
