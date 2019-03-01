package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQuery extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var `type`: sparqljsLib.sparqljsLibStrings.query
  var values: js.UndefOr[js.Array[ValuePatternRow]] = js.undefined
  var where: js.UndefOr[js.Array[Pattern]] = js.undefined
}

object BaseQuery {
  @scala.inline
  def apply(
    prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `type`: sparqljsLib.sparqljsLibStrings.query,
    base: java.lang.String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): BaseQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("prefixes")(prefixes)
    if (base != null) __obj.updateDynamic("base")(base)
    if (values != null) __obj.updateDynamic("values")(values)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[BaseQuery]
  }
}

