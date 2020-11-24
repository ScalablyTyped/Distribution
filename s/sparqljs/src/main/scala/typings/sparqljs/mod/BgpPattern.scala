package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.bgp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BgpPattern
  extends Pattern
     with Quads
     with _Expression {
  
  var triples: js.Array[Triple] = js.native
  
  var `type`: bgp = js.native
}
object BgpPattern {
  
  @scala.inline
  def apply(triples: js.Array[Triple], `type`: bgp): BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgpPattern]
  }
  
  @scala.inline
  implicit class BgpPatternOps[Self <: BgpPattern] (val x: Self) extends AnyVal {
    
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
    def setTriplesVarargs(value: Triple*): Self = this.set("triples", js.Array(value :_*))
    
    @scala.inline
    def setTriples(value: js.Array[Triple]): Self = this.set("triples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bgp): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
