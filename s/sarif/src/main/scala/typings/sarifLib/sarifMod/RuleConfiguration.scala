package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleConfiguration extends js.Object {
  /**
    * Specifies the default severity level of the result.
    */
  var defaultLevel: js.UndefOr[sarifLib.sarifMod.RuleConfigurationNs.defaultLevel] = js.undefined
  /**
    * Specifies whether the rule will be evaluated during the scan.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Contains configuration information specific to this rule.
    */
  var parameters: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Key/value pairs that provide additional information about the rule configuration.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

