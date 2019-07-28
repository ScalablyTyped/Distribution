package typings.atPulumiAws.kmsGetAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAliasArgs extends js.Object {
  /**
    * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
    */
  val name: String
}

object GetAliasArgs {
  @scala.inline
  def apply(name: String): GetAliasArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetAliasArgs]
  }
}

