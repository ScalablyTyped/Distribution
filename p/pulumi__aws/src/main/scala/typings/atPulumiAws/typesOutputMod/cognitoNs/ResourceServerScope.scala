package typings.atPulumiAws.typesOutputMod.cognitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServerScope extends js.Object {
  /**
    * The scope description.
    */
  var scopeDescription: String
  /**
    * The scope name.
    */
  var scopeName: String
}

object ResourceServerScope {
  @scala.inline
  def apply(scopeDescription: String, scopeName: String): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription, scopeName = scopeName)
  
    __obj.asInstanceOf[ResourceServerScope]
  }
}

