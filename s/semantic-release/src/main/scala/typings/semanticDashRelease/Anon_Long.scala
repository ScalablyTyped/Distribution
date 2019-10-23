package typings.semanticDashRelease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Long extends js.Object {
  /**
  			 * The commit tree hash.
  			 */
  var long: String
  /**
  			 * The commit abbreviated tree hash.
  			 */
  var short: String
}

object Anon_Long {
  @scala.inline
  def apply(long: String, short: String): Anon_Long = {
    val __obj = js.Dynamic.literal(long = long, short = short)
  
    __obj.asInstanceOf[Anon_Long]
  }
}

