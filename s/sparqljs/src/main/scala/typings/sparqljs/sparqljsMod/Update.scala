package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends SparqlQuery {
  var prefixes: StringDictionary[String]
  var `type`: update
  var updates: js.Array[UpdateOperation]
}

object Update {
  @scala.inline
  def apply(prefixes: StringDictionary[String], `type`: update, updates: js.Array[UpdateOperation]): Update = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
}

