package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JsonPath extends js.Object {
  var jsonPath: String
  var matchEquals: String
}

object Anon_JsonPath {
  @scala.inline
  def apply(jsonPath: String, matchEquals: String): Anon_JsonPath = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath, matchEquals = matchEquals)
  
    __obj.asInstanceOf[Anon_JsonPath]
  }
}

