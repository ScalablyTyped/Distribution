package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends SparqlQuery {
  var prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var `type`: sparqljsLib.sparqljsLibStrings.update
  var updates: js.Array[UpdateOperation]
}

object Update {
  @scala.inline
  def apply(
    prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `type`: sparqljsLib.sparqljsLibStrings.update,
    updates: js.Array[UpdateOperation]
  ): Update = {
    val __obj = js.Dynamic.literal(prefixes = prefixes, updates = updates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Update]
  }
}

