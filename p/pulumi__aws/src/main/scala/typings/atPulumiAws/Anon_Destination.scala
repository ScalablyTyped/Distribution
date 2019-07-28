package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var destination: Anon_AccessControlTranslation
  var filter: js.UndefOr[Anon_KeyPrefix] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var sourceSelectionCriteria: js.UndefOr[Anon_SseKmsEncryptedObjects] = js.undefined
  var status: String
}

object Anon_Destination {
  @scala.inline
  def apply(
    destination: Anon_AccessControlTranslation,
    status: String,
    filter: Anon_KeyPrefix = null,
    id: String = null,
    prefix: String = null,
    priority: Int | Double = null,
    sourceSelectionCriteria: Anon_SseKmsEncryptedObjects = null
  ): Anon_Destination = {
    val __obj = js.Dynamic.literal(destination = destination, status = status)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (id != null) __obj.updateDynamic("id")(id)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (sourceSelectionCriteria != null) __obj.updateDynamic("sourceSelectionCriteria")(sourceSelectionCriteria)
    __obj.asInstanceOf[Anon_Destination]
  }
}

