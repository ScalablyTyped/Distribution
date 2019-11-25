package typings.semanticDashRelease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
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

object Anon_Email {
  @scala.inline
  def apply(email: String, name: String, short: String): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Email]
  }
}

