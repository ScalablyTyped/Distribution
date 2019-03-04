package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Owner extends js.Object {
  var owner: java.lang.String
  var sourceDetails: js.UndefOr[js.Array[Anon_EventSource]] = js.undefined
  var sourceIdentifier: java.lang.String
}

object Anon_Owner {
  @scala.inline
  def apply(
    owner: java.lang.String,
    sourceIdentifier: java.lang.String,
    sourceDetails: js.Array[Anon_EventSource] = null
  ): Anon_Owner = {
    val __obj = js.Dynamic.literal(owner = owner, sourceIdentifier = sourceIdentifier)
    if (sourceDetails != null) __obj.updateDynamic("sourceDetails")(sourceDetails)
    __obj.asInstanceOf[Anon_Owner]
  }
}

