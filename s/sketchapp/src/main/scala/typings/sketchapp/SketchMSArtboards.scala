package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSArtboards extends StObject {
  
  var artboards: SketchMSArtboard
  
  var name: String
}
object SketchMSArtboards {
  
  @scala.inline
  def apply(artboards: SketchMSArtboard, name: String): SketchMSArtboards = {
    val __obj = js.Dynamic.literal(artboards = artboards.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSArtboards]
  }
  
  @scala.inline
  implicit class SketchMSArtboardsMutableBuilder[Self <: SketchMSArtboards] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtboards(value: SketchMSArtboard): Self = StObject.set(x, "artboards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
