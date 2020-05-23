package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.Event
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires immediately after the browser loads the object.
  * @param ev The event.
  */
@JSGlobal("onload")
@js.native
object onload
  extends TopLevel[(js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null]

