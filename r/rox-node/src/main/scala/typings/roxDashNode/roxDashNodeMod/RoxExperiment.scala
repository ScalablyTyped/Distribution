package typings.roxDashNode.roxDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxExperiment extends js.Object {
  var identifier: String
  var isArchived: Boolean
  var labels: js.Array[String]
   //  experiment id
  var name: String
}

object RoxExperiment {
  @scala.inline
  def apply(identifier: String, isArchived: Boolean, labels: js.Array[String], name: String): RoxExperiment = {
    val __obj = js.Dynamic.literal(identifier = identifier, isArchived = isArchived, labels = labels, name = name)
  
    __obj.asInstanceOf[RoxExperiment]
  }
}

