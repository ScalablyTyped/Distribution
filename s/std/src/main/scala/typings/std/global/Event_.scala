package typings.std.global

import typings.std.Event
import typings.std.EventInit
import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Event")
@js.native
open class Event_ protected ()
  extends StObject
     with Event {
  /* standard dom */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: EventInit) = this()
}
object Event_ {
  
  /* standard dom */
  @JSGlobal("Event.AT_TARGET")
  @js.native
  val AT_TARGET: `2` = js.native
  
  /* standard dom */
  @JSGlobal("Event.BUBBLING_PHASE")
  @js.native
  val BUBBLING_PHASE: `3` = js.native
  
  /* standard dom */
  @JSGlobal("Event.CAPTURING_PHASE")
  @js.native
  val CAPTURING_PHASE: `1` = js.native
  
  /* standard dom */
  @JSGlobal("Event.NONE")
  @js.native
  val NONE: `0` = js.native
}
