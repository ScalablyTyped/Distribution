package typings.atPulumiAws.apigatewayGetRestApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRestApiArgs extends js.Object {
  /**
    * The name of the REST API to look up. If no REST API is found with this name, an error will be returned.
    * If multiple REST APIs are found with this name, an error will be returned.
    */
  val name: String
}

object GetRestApiArgs {
  @scala.inline
  def apply(name: String): GetRestApiArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetRestApiArgs]
  }
}

