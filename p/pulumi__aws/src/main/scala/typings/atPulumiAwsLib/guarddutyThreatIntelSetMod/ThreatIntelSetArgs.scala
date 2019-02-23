package typings
package atPulumiAwsLib.guarddutyThreatIntelSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatIntelSetArgs extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
    */
  val activate: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The URI of the file that contains the ThreatIntelSet.
    */
  val location: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The friendly name to identify the ThreatIntelSet.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

