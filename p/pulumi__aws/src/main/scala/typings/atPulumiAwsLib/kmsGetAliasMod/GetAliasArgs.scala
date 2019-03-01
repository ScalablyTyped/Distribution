package typings
package atPulumiAwsLib.kmsGetAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAliasArgs extends js.Object {
  /**
    * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
    */
  val name: java.lang.String
}

object GetAliasArgs {
  @scala.inline
  def apply(name: java.lang.String): GetAliasArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetAliasArgs]
  }
}

