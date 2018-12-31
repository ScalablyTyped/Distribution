package typings
package stringifyDashObjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SingleQuotes extends js.Object {
  var filter: js.UndefOr[
    js.Function2[/* o */ js.Any, /* prop */ java.lang.String | js.Symbol, scala.Boolean]
  ] = js.undefined
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var inlineCharacterLimit: js.UndefOr[scala.Double] = js.undefined
  var singleQuotes: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function3[
      /* val */ js.Array[_] | js.Object, 
      /* i */ scala.Double | java.lang.String | js.Symbol, 
      /* value */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
}

