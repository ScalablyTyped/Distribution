package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryListEvent extends Event_ {
  val matches: scala.Boolean = js.native
  val media: java.lang.String = js.native
}

@JSGlobal("MediaQueryListEvent")
@js.native
object MediaQueryListEvent
  extends Instantiable1[/* type */ java.lang.String, MediaQueryListEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaQueryListEventInit, 
      MediaQueryListEvent
    ]

