package typings.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Triple extends js.Object {
  var `object`: Term = js.native
  var predicate: PropertyPath | Term = js.native
  var subject: Term = js.native
}

object Triple {
  @scala.inline
  def apply(`object`: Term, predicate: PropertyPath | Term, subject: Term): Triple = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Triple]
  }
  @scala.inline
  implicit class TripleOps[Self <: Triple] (val x: Self) extends AnyVal {
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
    def setObject(value: Term): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(value: PropertyPath | Term): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Term): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

