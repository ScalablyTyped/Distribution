package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildRepair extends js.Object {
  var build: typings.screeps.screepsNumbers.`2`
  var repair: typings.screeps.screepsNumbers.`2`
}

object BuildRepair {
  @scala.inline
  def apply(build: typings.screeps.screepsNumbers.`2`, repair: typings.screeps.screepsNumbers.`2`): BuildRepair = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRepair]
  }
}

