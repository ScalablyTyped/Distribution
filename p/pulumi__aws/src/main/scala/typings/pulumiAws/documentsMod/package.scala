package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object documentsMod {
  type ConditionArguments = /**
    * Examples:
    *  - `{ "aws:MultiFactorAuthPresent": "true" }`
    *  - `{ "aws:SourceIp": [ "203.0.113.0/24", "2001:DB8:1234:5678::/64" ]}`
    */
  org.scalablytyped.runtime.StringDictionary[
    typings.pulumiPulumi.outputMod.Input[
      js.Array[typings.pulumiPulumi.outputMod.Input[java.lang.String]] | java.lang.String
    ]
  ]
  type Conditions = /**
    *
    * A map of condition operators and their arguments. Condition operators are the "verbs" of conditions and specify
    * the type of comparison that IAM performs. The condition operators are grouped into the following categorties:
    *
    *     - String
    *     - Numeric
    *     - Date and time
    *     - Boolean
    *     - Binary
    *     - IP address
    *     - Amazon Resource (ARN) (available for some services)
    *     - ...IfExists (checks if the key value exists as part of another check)
    *     - Null check (checks if the key value exists as a standalone check)
    *
    * For details on all of the available operators and their arguments, please refer to the AWS documentation:
    * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html.
    */
  org.scalablytyped.runtime.StringDictionary[typings.pulumiAws.documentsMod.ConditionArguments]
}
