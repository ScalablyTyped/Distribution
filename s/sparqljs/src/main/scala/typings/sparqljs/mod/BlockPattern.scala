package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import typings.sparqljs.sparqljsStrings.group
import typings.sparqljs.sparqljsStrings.minus
import typings.sparqljs.sparqljsStrings.optional
import typings.sparqljs.sparqljsStrings.service
import typings.sparqljs.sparqljsStrings.union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPattern extends Pattern {
  var patterns: js.Array[Pattern]
  var `type`: optional | union | group | minus | graph | service
}

object BlockPattern {
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: optional | union | group | minus | graph | service): BlockPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
}

