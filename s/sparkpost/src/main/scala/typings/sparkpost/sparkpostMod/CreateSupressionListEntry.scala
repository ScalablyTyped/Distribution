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

trait CreateSupressionListEntry extends js.Object {
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
    * no - entries created by the user are marked as Manually Added
    *
    */
  val source: js.UndefOr[
    (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
  ] = js.undefined
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var transactional: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of suppression record
    *
    */
  var `type`: js.UndefOr[transactional | non_transactional] = js.undefined
}

object CreateSupressionListEntry {
  @scala.inline
  def apply(
    recipient: String,
    description: String = null,
    non_transactional: js.UndefOr[Boolean] = js.undefined,
    source: (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance = null,
    transactional: js.UndefOr[Boolean] = js.undefined,
    `type`: transactional | non_transactional = null
  ): CreateSupressionListEntry = {
    val __obj = js.Dynamic.literal(recipient = recipient)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(non_transactional)) __obj.updateDynamic("non_transactional")(non_transactional)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(transactional)) __obj.updateDynamic("transactional")(transactional)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSupressionListEntry]
  }
}

