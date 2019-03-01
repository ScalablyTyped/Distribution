package typings
package atStorybookAddonDashInfoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kind extends js.Object {
  var kind: java.lang.String
  var story: java.lang.String
}

object Anon_Kind {
  @scala.inline
  def apply(kind: java.lang.String, story: java.lang.String): Anon_Kind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("story")(story)
    __obj.asInstanceOf[Anon_Kind]
  }
}

