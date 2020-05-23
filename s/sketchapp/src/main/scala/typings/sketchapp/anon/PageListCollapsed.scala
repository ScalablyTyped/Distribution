package typings.sketchapp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageListCollapsed extends js.Object {
  var pageListCollapsed: Double
  var pageListHeight: Double
}

object PageListCollapsed {
  @scala.inline
  def apply(pageListCollapsed: Double, pageListHeight: Double): PageListCollapsed = {
    val __obj = js.Dynamic.literal(pageListCollapsed = pageListCollapsed.asInstanceOf[js.Any], pageListHeight = pageListHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageListCollapsed]
  }
}

