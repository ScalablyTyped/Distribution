package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  /**
    * Title of the shared page. Note that if Pocket detects a title tag
    * on the page being saved, this parameter will be ignored
    * and the title tag of the saved page will be used instead.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Title {
  @scala.inline
  def apply(title: String = null): Anon_Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Title]
  }
}

