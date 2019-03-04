package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Branches extends js.Object {
  var branches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var customData: js.UndefOr[java.lang.String] = js.undefined
  var destinationArn: java.lang.String
  var events: js.Array[java.lang.String]
  var name: java.lang.String
}

object Anon_Branches {
  @scala.inline
  def apply(
    destinationArn: java.lang.String,
    events: js.Array[java.lang.String],
    name: java.lang.String,
    branches: js.Array[java.lang.String] = null,
    customData: java.lang.String = null
  ): Anon_Branches = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn, events = events, name = name)
    if (branches != null) __obj.updateDynamic("branches")(branches)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    __obj.asInstanceOf[Anon_Branches]
  }
}

