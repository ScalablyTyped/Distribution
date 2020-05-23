package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends IDisposable

object Builder {
  @scala.inline
  def apply(dispose: () => scala.Unit): Builder = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Builder]
  }
}

