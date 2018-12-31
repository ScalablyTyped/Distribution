package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectQuery extends BaseQuery {
  var distinct: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[sparqljsLib.Anon_Default] = js.undefined
  var group: js.UndefOr[js.Array[Grouping]] = js.undefined
  var having: js.UndefOr[js.Array[Expression]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[js.Array[Ordering]] = js.undefined
  var queryType: sparqljsLib.sparqljsLibStrings.SELECT
  var reduced: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.Array[Variable] | js.Array[sparqljsLib.sparqljsLibStrings.`*`]
}

