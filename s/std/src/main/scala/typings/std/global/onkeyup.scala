package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the user releases a key.
  * @param ev The keyboard event
  */
@JSGlobal("onkeyup")
@js.native
object onkeyup
  extends TopLevel[
      (js.ThisFunction1[/* this */ Window, /* ev */ typings.std.KeyboardEvent, js.Any]) | Null
    ]

