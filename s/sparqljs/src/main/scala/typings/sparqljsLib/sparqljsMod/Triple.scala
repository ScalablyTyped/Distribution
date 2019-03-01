package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triple extends js.Object {
  var `object`: Term
  var predicate: PropertyPath | Term
  var subject: Term
}

object Triple {
  @scala.inline
  def apply(`object`: Term, predicate: PropertyPath | Term, subject: Term): Triple = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("predicate")(predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Triple]
  }
}

