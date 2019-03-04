package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructQuery
  extends Query
     with BaseQuery {
  var queryType: sparqljsLib.sparqljsLibStrings.CONSTRUCT
  var template: js.UndefOr[js.Array[Triple]] = js.undefined
}

object ConstructQuery {
  @scala.inline
  def apply(
    prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queryType: sparqljsLib.sparqljsLibStrings.CONSTRUCT,
    `type`: sparqljsLib.sparqljsLibStrings.query,
    base: java.lang.String = null,
    template: js.Array[Triple] = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes, queryType = queryType)
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base)
    if (template != null) __obj.updateDynamic("template")(template)
    if (values != null) __obj.updateDynamic("values")(values)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[ConstructQuery]
  }
}

