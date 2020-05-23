package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
  * @param ev The drag event.
  */
@JSGlobal("ondragleave")
@js.native
object ondragleave
  extends TopLevel[
      (js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, js.Any]) | Null
    ]

