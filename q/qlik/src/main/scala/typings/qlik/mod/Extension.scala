package typings.qlik.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension extends StObject {
  
  var definition: Definition
  
  var initialProperties: InitialProperties
  
  def paint(
    $element: js.UndefOr[JQuery[HTMLElement]],
    layout: js.UndefOr[Layout],
    qDimensionInfo: js.UndefOr[NxDimensionInfo],
    qMeasureInfo: js.UndefOr[NxDimensionInfo],
    qMatrix: js.UndefOr[js.Array[NxCellRows]],
    dimensions: js.UndefOr[js.Array[NxCell]],
    measures: js.UndefOr[js.Array[NxCell]],
    qSize: js.UndefOr[Size],
    qId: js.UndefOr[String],
    qSelectionInfo: js.UndefOr[Selectionobject]
  ): Unit
  @JSName("paint")
  var paint_Original: Paint
  
  var support: js.UndefOr[Support] = js.undefined
}
object Extension {
  
  inline def apply(definition: Definition, initialProperties: InitialProperties, paint: Paint): Extension = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], initialProperties = initialProperties.asInstanceOf[js.Any], paint = paint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setInitialProperties(value: InitialProperties): Self = StObject.set(x, "initialProperties", value.asInstanceOf[js.Any])
    
    inline def setPaint(value: Paint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: Support): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
  }
}
