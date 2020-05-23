package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires on the source object when the user starts to drag a text selection or selected object.
  * @param ev The event.
  */
@JSGlobal("ondragstart")
@js.native
object ondragstart
  extends TopLevel[
      (js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, js.Any]) | Null
    ]

