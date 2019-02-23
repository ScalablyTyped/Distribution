package typings
package atPulumiAwsLib.codecommitRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryArgs extends js.Object {
  /**
    * The default branch of the repository. The branch specified here needs to exist.
    */
  val defaultBranch: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the repository. This needs to be less than 1000 characters
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

