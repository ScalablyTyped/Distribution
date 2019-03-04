package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AskQuery
  extends Query
     with BaseQuery {
  var queryType: sparqljsLib.sparqljsLibStrings.ASK
}

object AskQuery {
  @scala.inline
  def apply(
    prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queryType: sparqljsLib.sparqljsLibStrings.ASK,
    `type`: sparqljsLib.sparqljsLibStrings.query,
    base: java.lang.String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): AskQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes, queryType = queryType)
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base)
    if (values != null) __obj.updateDynamic("values")(values)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[AskQuery]
  }
}

