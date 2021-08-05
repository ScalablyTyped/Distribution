package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Annotations
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.ClickAnnotationEvent> */
trait ReadonlyClickAnnotationEv extends StObject {
  
  val annotation: Annotations
  
  val event: MouseEvent
  
  val fullAnnotation: Annotations
  
  val index: Double
}
object ReadonlyClickAnnotationEv {
  
  inline def apply(annotation: Annotations, event: MouseEvent, fullAnnotation: Annotations, index: Double): ReadonlyClickAnnotationEv = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fullAnnotation = fullAnnotation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyClickAnnotationEv]
  }
  
  extension [Self <: ReadonlyClickAnnotationEv](x: Self) {
    
    inline def setAnnotation(value: Annotations): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setFullAnnotation(value: Annotations): Self = StObject.set(x, "fullAnnotation", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
