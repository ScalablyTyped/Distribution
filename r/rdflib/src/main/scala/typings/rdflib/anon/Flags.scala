package typings.rdflib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  /**
    * A string of letters, each of which set an options
    * e.g. `deinprstux`
    */
  var flags: String
}

object Flags {
  @scala.inline
  def apply(flags: String): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
}

