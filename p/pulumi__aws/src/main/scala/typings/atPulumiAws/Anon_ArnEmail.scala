package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnEmail extends js.Object {
  var arn: String
  var email: String
  var id: String
  var name: String
}

object Anon_ArnEmail {
  @scala.inline
  def apply(arn: String, email: String, id: String, name: String): Anon_ArnEmail = {
    val __obj = js.Dynamic.literal(arn = arn, email = email, id = id, name = name)
  
    __obj.asInstanceOf[Anon_ArnEmail]
  }
}

