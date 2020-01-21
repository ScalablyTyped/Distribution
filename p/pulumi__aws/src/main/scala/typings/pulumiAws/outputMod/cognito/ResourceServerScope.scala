package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerScope extends js.Object {
  /**
    * The scope description.
    */
  var scopeDescription: String = js.native
  /**
    * The scope name.
    */
  var scopeName: String = js.native
}

object ResourceServerScope {
  @scala.inline
  def apply(scopeDescription: String, scopeName: String): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceServerScope]
  }
}

