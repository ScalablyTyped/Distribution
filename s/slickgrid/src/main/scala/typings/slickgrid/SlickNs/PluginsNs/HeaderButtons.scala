package typings.slickgrid.SlickNs.PluginsNs

import typings.slickgrid.SlickNs.Event
import typings.slickgrid.SlickNs.OnCommandEventArgs
import typings.slickgrid.SlickNs.Plugin
import typings.slickgrid.SlickNs.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Plugins.HeaderButtons")
@js.native
class HeaderButtons[T /* <: SlickData */] () extends Plugin[T] {
  var onCommand: Event[OnCommandEventArgs[T]] = js.native
}

