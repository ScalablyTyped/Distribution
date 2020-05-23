package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Occurs to indicate progress while downloading media data.
  * @param ev The event.
  */
@JSGlobal("onprogress")
@js.native
object onprogress
  extends TopLevel[
      (js.ThisFunction1[
        /* this */ Window, 
        /* ev */ typings.std.ProgressEvent[typings.std.EventTarget], 
        js.Any
      ]) | Null
    ]

