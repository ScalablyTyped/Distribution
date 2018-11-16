package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SupressionListEntry extends js.Object {
  var created: java.lang.String
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
           *
           * no - entries created by the user are marked as Manually Added
           *
           */
  var source: js.UndefOr[
    (sparkpostLib.sparkpostLibStrings.`Spam Complaint`) | (sparkpostLib.sparkpostLibStrings.`List Unsubscribe`) | (sparkpostLib.sparkpostLibStrings.`Bounce Rule`) | (sparkpostLib.sparkpostLibStrings.`Unsubscribe Link`) | (sparkpostLib.sparkpostLibStrings.`Manually Added`) | sparkpostLib.sparkpostLibStrings.Compliance
  ] = js.undefined
  /**
           * Whether the recipient requested to not receive any transactional messages
           * Not required if a valid type is passed
           *
           * @deprecated Available, but deprecated in favor of type
           */
  var transactional: js.UndefOr[scala.Boolean] = js.undefined
  /** Type of suppression record: transactional or non_transactional */
  var `type`: js.UndefOr[
    sparkpostLib.sparkpostLibStrings.transactional | sparkpostLib.sparkpostLibStrings.non_transactional
  ] = js.undefined
  var updated: java.lang.String
}

