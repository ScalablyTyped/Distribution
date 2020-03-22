package typings.reactPlotlyJs

import typings.plotlyJs.mod.Annotations
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.ClickAnnotationEvent> */
trait ReadonlyClickAnnotationEv extends js.Object {
  val annotation: Annotations
  val event: MouseEvent
  val fullAnnotation: Annotations
  val index: Double
}

object ReadonlyClickAnnotationEv {
  @scala.inline
  def apply(annotation: Annotations, event: MouseEvent, fullAnnotation: Annotations, index: Double): ReadonlyClickAnnotationEv = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fullAnnotation = fullAnnotation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyClickAnnotationEv]
  }
}

