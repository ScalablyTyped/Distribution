package typings.raphael.mod

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelElementByTechnologyMap[TSvg /* <: SVGElement */, TVml /* <: VMLElement */] extends StObject {
  
  var SVG: TSvg
  
  var VML: TVml
}
object RaphaelElementByTechnologyMap {
  
  @scala.inline
  def apply[TSvg /* <: SVGElement */, TVml /* <: VMLElement */](SVG: TSvg, VML: TVml): RaphaelElementByTechnologyMap[TSvg, TVml] = {
    val __obj = js.Dynamic.literal(SVG = SVG.asInstanceOf[js.Any], VML = VML.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementByTechnologyMap[TSvg, TVml]]
  }
  
  @scala.inline
  implicit class RaphaelElementByTechnologyMapMutableBuilder[Self <: RaphaelElementByTechnologyMap[?, ?], TSvg /* <: SVGElement */, TVml /* <: VMLElement */] (val x: Self & (RaphaelElementByTechnologyMap[TSvg, TVml])) extends AnyVal {
    
    @scala.inline
    def setSVG(value: TSvg): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVML(value: TVml): Self = StObject.set(x, "VML", value.asInstanceOf[js.Any])
  }
}
