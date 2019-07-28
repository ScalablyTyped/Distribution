package typings.atStorybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: String
}

object Anon_Href {
  @scala.inline
  def apply(title: String, href: String = null, onClick: () => Unit = null): Anon_Href = {
    val __obj = js.Dynamic.literal(title = title)
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[Anon_Href]
  }
}

