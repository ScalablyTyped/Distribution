package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sparqljs.mod.Pattern because Already inherited */ @js.native
trait GraphPattern extends BlockPattern {
  var name: IriTerm = js.native
  @JSName("type")
  var type_GraphPattern: graph = js.native
}

object GraphPattern {
  @scala.inline
  def apply(name: IriTerm, patterns: js.Array[Pattern], `type`: graph): GraphPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphPattern]
  }
  @scala.inline
  implicit class GraphPatternOps[Self <: GraphPattern] (val x: Self) extends AnyVal {
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
    def setName(value: IriTerm): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: graph): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

