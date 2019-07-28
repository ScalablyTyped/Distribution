package typings.atStorybookAddonDashLinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kind extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var story: String
}

object Anon_Kind {
  @scala.inline
  def apply(story: String, kind: String = null): Anon_Kind = {
    val __obj = js.Dynamic.literal(story = story)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Anon_Kind]
  }
}

