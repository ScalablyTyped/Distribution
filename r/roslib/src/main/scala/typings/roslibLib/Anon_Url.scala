package typings
package roslibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Url extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Url {
  @scala.inline
  def apply(url: java.lang.String = null): Anon_Url = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Url]
  }
}

