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

@js.native
trait BlockPattern extends Pattern {
  var patterns: js.Array[Pattern] = js.native
  var `type`: optional | union | group | minus | graph | service = js.native
}

object BlockPattern {
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: optional | union | group | minus | graph | service): BlockPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
  @scala.inline
  implicit class BlockPatternOps[Self <: BlockPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPatternsVarargs(value: Pattern*): Self = this.set("patterns", js.Array(value :_*))
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: optional | union | group | minus | graph | service): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

