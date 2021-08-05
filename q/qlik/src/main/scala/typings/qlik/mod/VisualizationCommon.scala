package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualizationCommon extends StObject {
  
  var footnote: String
  
  var qHyperCubeDef: HyperCubeDef
  
  var showTitles: Boolean
  
  var subtitle: String
  
  var title: String
}
object VisualizationCommon {
  
  inline def apply(
    footnote: String,
    qHyperCubeDef: HyperCubeDef,
    showTitles: Boolean,
    subtitle: String,
    title: String
  ): VisualizationCommon = {
    val __obj = js.Dynamic.literal(footnote = footnote.asInstanceOf[js.Any], qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any], showTitles = showTitles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualizationCommon]
  }
  
  extension [Self <: VisualizationCommon](x: Self) {
    
    inline def setFootnote(value: String): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
    
    inline def setQHyperCubeDef(value: HyperCubeDef): Self = StObject.set(x, "qHyperCubeDef", value.asInstanceOf[js.Any])
    
    inline def setShowTitles(value: Boolean): Self = StObject.set(x, "showTitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
