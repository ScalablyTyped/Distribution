package typings.sparkpost.sparkpostMod

import typings.sparkpost.sparkpostStrings.Compliance
import typings.sparkpost.sparkpostStrings.`Bounce Rule`
import typings.sparkpost.sparkpostStrings.`List Unsubscribe`
import typings.sparkpost.sparkpostStrings.`Manually Added`
import typings.sparkpost.sparkpostStrings.`Spam Complaint`
import typings.sparkpost.sparkpostStrings.`Unsubscribe Link`
import typings.sparkpost.sparkpostStrings.non_transactional
import typings.sparkpost.sparkpostStrings.transactional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupressionListEntry extends js.Object {
  var created: String
  /** Short explanation of the suppression */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var non_transactional: js.UndefOr[Boolean] = js.undefined
  /**
    * Email address to be suppressed
    *
    */
  var recipient: String
  /**
    * Source responsible for inserting the list entry
    *
    * no - entries created by the user are marked as Manually Added
    *
    */
  var source: js.UndefOr[
    (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
  ] = js.undefined
  /**
    * Whether the recipient requested to not receive any transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var transactional: js.UndefOr[Boolean] = js.undefined
  /** Type of suppression record: transactional or non_transactional */
  var `type`: js.UndefOr[transactional | non_transactional] = js.undefined
  var updated: String
}

object SupressionListEntry {
  @scala.inline
  def apply(
    created: String,
    recipient: String,
    updated: String,
    description: String = null,
    non_transactional: js.UndefOr[Boolean] = js.undefined,
    source: (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance = null,
    transactional: js.UndefOr[Boolean] = js.undefined,
    `type`: transactional | non_transactional = null
  ): SupressionListEntry = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(non_transactional)) __obj.updateDynamic("non_transactional")(non_transactional.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(transactional)) __obj.updateDynamic("transactional")(transactional.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupressionListEntry]
  }
}

