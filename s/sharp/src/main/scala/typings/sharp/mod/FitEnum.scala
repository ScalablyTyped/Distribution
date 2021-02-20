package typings.sharp.mod

import typings.sharp.sharpStrings.contain
import typings.sharp.sharpStrings.cover
import typings.sharp.sharpStrings.fill
import typings.sharp.sharpStrings.inside
import typings.sharp.sharpStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FitEnum extends StObject {
  
  var contain: typings.sharp.sharpStrings.contain = js.native
  
  var cover: typings.sharp.sharpStrings.cover = js.native
  
  var fill: typings.sharp.sharpStrings.fill = js.native
  
  var inside: typings.sharp.sharpStrings.inside = js.native
  
  var outside: typings.sharp.sharpStrings.outside = js.native
}
object FitEnum {
  
  @scala.inline
  def apply(contain: contain, cover: cover, fill: fill, inside: inside, outside: outside): FitEnum = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitEnum]
  }
  
  @scala.inline
  implicit class FitEnumMutableBuilder[Self <: FitEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContain(value: contain): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover(value: cover): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInside(value: inside): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutside(value: outside): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
  }
}
