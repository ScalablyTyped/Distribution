package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the user presses an alphanumeric key.
  * @param ev The event.
  */
@JSGlobal("onkeypress")
@js.native
object onkeypress
  extends TopLevel[
      (js.ThisFunction1[/* this */ Window, /* ev */ typings.std.KeyboardEvent, js.Any]) | Null
    ]

