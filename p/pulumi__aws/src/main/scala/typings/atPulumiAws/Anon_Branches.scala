package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Branches extends js.Object {
  var branches: js.UndefOr[js.Array[String]] = js.undefined
  var customData: js.UndefOr[String] = js.undefined
  var destinationArn: String
  var events: js.Array[String]
  var name: String
}

object Anon_Branches {
  @scala.inline
  def apply(
    destinationArn: String,
    events: js.Array[String],
    name: String,
    branches: js.Array[String] = null,
    customData: String = null
  ): Anon_Branches = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn, events = events, name = name)
    if (branches != null) __obj.updateDynamic("branches")(branches)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    __obj.asInstanceOf[Anon_Branches]
  }
}

