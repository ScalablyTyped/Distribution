package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Animation")
@js.native
/* standard dom */
open class Animation ()
  extends StObject
     with typings.std.Animation {
  def this(effect: typings.std.AnimationEffect) = this()
  def this(effect: Null, timeline: typings.std.AnimationTimeline) = this()
  def this(effect: Unit, timeline: typings.std.AnimationTimeline) = this()
  def this(effect: typings.std.AnimationEffect, timeline: typings.std.AnimationTimeline) = this()
}
