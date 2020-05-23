package typings.semanticRelease.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Long extends js.Object {
  /**
    * The commit tree hash.
    */
  var long: String
  /**
    * The commit abbreviated tree hash.
    */
  var short: String
}

object Long {
  @scala.inline
  def apply(long: String, short: String): Long = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
}

