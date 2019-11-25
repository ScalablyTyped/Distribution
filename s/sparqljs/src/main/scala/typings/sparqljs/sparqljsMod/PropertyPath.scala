package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.`!`
import typings.sparqljs.sparqljsStrings.`+`
import typings.sparqljs.sparqljsStrings.`/`
import typings.sparqljs.sparqljsStrings.`_backtick^_backtick`
import typings.sparqljs.sparqljsStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyPath extends js.Object {
  var items: js.Array[PropertyPath | Term]
  var pathType: typings.sparqljs.sparqljsStrings.`|` | `/` | `_backtick^_backtick` | `+` | typings.sparqljs.sparqljsStrings.`*` | `!`
  var `type`: path
}

object PropertyPath {
  @scala.inline
  def apply(
    items: js.Array[PropertyPath | Term],
    pathType: typings.sparqljs.sparqljsStrings.`|` | `/` | `_backtick^_backtick` | `+` | typings.sparqljs.sparqljsStrings.`*` | `!`,
    `type`: path
  ): PropertyPath = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPath]
  }
}

