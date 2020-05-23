package typings.screeps.anon

import typings.screeps.screepsNumbers.`1.8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repair extends js.Object {
  var build: `1.8`
  var repair: `1.8`
}

object Repair {
  @scala.inline
  def apply(build: `1.8`, repair: `1.8`): Repair = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repair]
  }
}

