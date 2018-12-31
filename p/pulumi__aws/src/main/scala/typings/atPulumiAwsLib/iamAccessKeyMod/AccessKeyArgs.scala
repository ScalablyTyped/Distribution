package typings
package atPulumiAwsLib.iamAccessKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessKeyArgs extends js.Object {
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`.
    */
  val pgpKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM user to associate with this access key.
    */
  val user: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

