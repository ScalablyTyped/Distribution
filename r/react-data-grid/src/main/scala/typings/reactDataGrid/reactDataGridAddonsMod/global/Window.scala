package typings.reactDataGrid.reactDataGridAddonsMod.global

import typings.reactDataGrid.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var ReactDataGridPlugins: Data
}

object Window {
  @scala.inline
  def apply(ReactDataGridPlugins: Data): Window = {
    val __obj = js.Dynamic.literal(ReactDataGridPlugins = ReactDataGridPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

