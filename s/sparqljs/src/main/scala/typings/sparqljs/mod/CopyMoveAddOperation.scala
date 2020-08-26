package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.add
import typings.sparqljs.sparqljsStrings.copy
import typings.sparqljs.sparqljsStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyMoveAddOperation extends ManagementOperation {
  var destination: GraphOrDefault = js.native
  var silent: Boolean = js.native
  var source: GraphOrDefault = js.native
  var `type`: copy | move | add = js.native
}

object CopyMoveAddOperation {
  @scala.inline
  def apply(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): CopyMoveAddOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyMoveAddOperation]
  }
  @scala.inline
  implicit class CopyMoveAddOperationOps[Self <: CopyMoveAddOperation] (val x: Self) extends AnyVal {
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
    def setDestination(value: GraphOrDefault): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: GraphOrDefault): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: copy | move | add): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

