package typings.atPulumiKubernetes.typesOutputMod.authorization.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NonResourceAttributes includes the authorization attributes available for non-resource
  * requests to the Authorizer interface
  */
trait NonResourceAttributes extends js.Object {
  /**
    * Path is the URL path of the request
    */
  val path: String
  /**
    * Verb is the standard HTTP verb
    */
  val verb: String
}

object NonResourceAttributes {
  @scala.inline
  def apply(path: String, verb: String): NonResourceAttributes = {
    val __obj = js.Dynamic.literal(path = path, verb = verb)
  
    __obj.asInstanceOf[NonResourceAttributes]
  }
}

