package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the user clicks the right mouse button in the client area, opening the context menu.
  * @param ev The mouse event.
  */
@JSGlobal("oncontextmenu")
@js.native
object oncontextmenu
  extends TopLevel[
      (js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MouseEvent, js.Any]) | Null
    ]

