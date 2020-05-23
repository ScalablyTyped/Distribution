package typings.semanticRelease.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  /**
    * The committer email.
    */
  var email: String
  /**
    * The committer name.
    */
  var name: String
  /**
    * The committer date.
    */
  var short: String
}

object Email {
  @scala.inline
  def apply(email: String, name: String, short: String): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

