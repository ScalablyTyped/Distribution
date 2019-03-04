package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSupressionListEntry extends js.Object {
  /** Short explanation of the suppression */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var non_transactional: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Email address to be suppressed
    *
    */
  var recipient: java.lang.String
  /**
    * Source responsible for inserting the list entry
    * no - entries created by the user are marked as Manually Added
    *
    */
  val source: js.UndefOr[
    (sparkpostLib.sparkpostLibStrings.`Spam Complaint`) | (sparkpostLib.sparkpostLibStrings.`List Unsubscribe`) | (sparkpostLib.sparkpostLibStrings.`Bounce Rule`) | (sparkpostLib.sparkpostLibStrings.`Unsubscribe Link`) | (sparkpostLib.sparkpostLibStrings.`Manually Added`) | sparkpostLib.sparkpostLibStrings.Compliance
  ] = js.undefined
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var transactional: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type of suppression record
    *
    */
  var `type`: js.UndefOr[
    sparkpostLib.sparkpostLibStrings.transactional | sparkpostLib.sparkpostLibStrings.non_transactional
  ] = js.undefined
}

object CreateSupressionListEntry {
  @scala.inline
  def apply(
    recipient: java.lang.String,
    description: java.lang.String = null,
    non_transactional: js.UndefOr[scala.Boolean] = js.undefined,
    source: (sparkpostLib.sparkpostLibStrings.`Spam Complaint`) | (sparkpostLib.sparkpostLibStrings.`List Unsubscribe`) | (sparkpostLib.sparkpostLibStrings.`Bounce Rule`) | (sparkpostLib.sparkpostLibStrings.`Unsubscribe Link`) | (sparkpostLib.sparkpostLibStrings.`Manually Added`) | sparkpostLib.sparkpostLibStrings.Compliance = null,
    transactional: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: sparkpostLib.sparkpostLibStrings.transactional | sparkpostLib.sparkpostLibStrings.non_transactional = null
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

