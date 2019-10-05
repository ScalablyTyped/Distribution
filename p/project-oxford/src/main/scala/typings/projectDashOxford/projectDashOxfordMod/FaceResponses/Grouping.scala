package typings.projectDashOxford.projectDashOxfordMod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grouping extends js.Object {
  var groups: js.Array[String]
  var messyGroup: js.Array[String]
}

object Grouping {
  @scala.inline
  def apply(groups: js.Array[String], messyGroup: js.Array[String]): Grouping = {
    val __obj = js.Dynamic.literal(groups = groups, messyGroup = messyGroup)
  
    __obj.asInstanceOf[Grouping]
  }
}

