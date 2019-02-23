package typings
package atPulumiAwsLib.codecommitTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  val triggers: atPulumiPulumiLib.outputMod.Input[
    js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BranchesCustomData]]
  ]
}

