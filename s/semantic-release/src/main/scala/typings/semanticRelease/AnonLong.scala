package typings.semanticRelease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLong extends js.Object {
  /**
  			 * The commit tree hash.
  			 */
  var long: String
  /**
  			 * The commit abbreviated tree hash.
  			 */
  var short: String
}

object AnonLong {
  @scala.inline
  def apply(long: String, short: String): AnonLong = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLong]
  }
}

