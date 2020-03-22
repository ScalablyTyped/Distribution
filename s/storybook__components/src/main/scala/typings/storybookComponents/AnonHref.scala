package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHref extends js.Object {
  var href: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var title: String = js.native
}

object AnonHref {
  @scala.inline
  def apply(title: String, href: String = null, onClick: () => Unit = null): AnonHref = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[AnonHref]
  }
}

