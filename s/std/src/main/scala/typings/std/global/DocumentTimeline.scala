package typings.std.global

import typings.std.DocumentTimelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DocumentTimeline")
@js.native
class DocumentTimeline ()
  extends StObject
     with typings.std.AnimationTimeline {
  def this(options: DocumentTimelineOptions) = this()
  
  /* CompleteClass */
  override val currentTime: Double | Null = js.native
}
