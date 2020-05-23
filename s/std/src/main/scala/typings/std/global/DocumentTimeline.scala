package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.DocumentTimelineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DocumentTimeline")
@js.native
class DocumentTimeline ()
  extends typings.std.AnimationTimeline {
  def this(options: DocumentTimelineOptions) = this()
  /* CompleteClass */
  override val currentTime: Double | Null = js.native
}

@JSGlobal("DocumentTimeline")
@js.native
object DocumentTimeline
  extends Instantiable0[typings.std.DocumentTimeline]
     with Instantiable1[/* options */ DocumentTimelineOptions, typings.std.DocumentTimeline]

