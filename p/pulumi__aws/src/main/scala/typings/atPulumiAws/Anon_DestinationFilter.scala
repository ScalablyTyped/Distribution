package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationFilter extends js.Object {
  var destination: Input[Anon_AccessControlTranslationAccountId]
  var filter: js.UndefOr[Input[Anon_KeyPrefixTags]] = js.undefined
  var id: js.UndefOr[Input[String]] = js.undefined
  var prefix: js.UndefOr[Input[String]] = js.undefined
  var priority: js.UndefOr[Input[Double]] = js.undefined
  var sourceSelectionCriteria: js.UndefOr[Input[Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput2072549229]] = js.undefined
  var status: Input[String]
}

object Anon_DestinationFilter {
  @scala.inline
  def apply(
    destination: Input[Anon_AccessControlTranslationAccountId],
    status: Input[String],
    filter: Input[Anon_KeyPrefixTags] = null,
    id: Input[String] = null,
    prefix: Input[String] = null,
    priority: Input[Double] = null,
    sourceSelectionCriteria: Input[Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput2072549229] = null
  ): Anon_DestinationFilter = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (sourceSelectionCriteria != null) __obj.updateDynamic("sourceSelectionCriteria")(sourceSelectionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationFilter]
  }
}

