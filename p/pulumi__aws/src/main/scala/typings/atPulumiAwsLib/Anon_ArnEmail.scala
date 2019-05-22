package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnEmail extends js.Object {
  var arn: java.lang.String
  var email: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
}

object Anon_ArnEmail {
  @scala.inline
  def apply(arn: java.lang.String, email: java.lang.String, id: java.lang.String, name: java.lang.String): Anon_ArnEmail = {
    val __obj = js.Dynamic.literal(arn = arn, email = email, id = id, name = name)
  
    __obj.asInstanceOf[Anon_ArnEmail]
  }
}

