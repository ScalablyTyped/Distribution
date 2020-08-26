package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQuads extends Quads {
  var name: IriTerm = js.native
  var triples: js.Array[Triple] = js.native
  var `type`: graph = js.native
}

object GraphQuads {
  @scala.inline
  def apply(name: IriTerm, triples: js.Array[Triple], `type`: graph): GraphQuads = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQuads]
  }
  @scala.inline
  implicit class GraphQuadsOps[Self <: GraphQuads] (val x: Self) extends AnyVal {
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
    def setTriplesVarargs(value: Triple*): Self = this.set("triples", js.Array(value :_*))
    @scala.inline
    def setTriples(value: js.Array[Triple]): Self = this.set("triples", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: graph): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

