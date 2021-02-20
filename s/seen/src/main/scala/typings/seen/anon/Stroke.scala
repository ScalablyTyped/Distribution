package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stroke extends StObject {
  
  var stroke: js.UndefOr[String] = js.native
  
  var `stroke-width`: js.UndefOr[Double] = js.native
  
  var `text-anchor`: js.UndefOr[String] = js.native
}
object Stroke {
  
  @scala.inline
  def apply(): Stroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stroke]
  }
  
  @scala.inline
  implicit class StrokeMutableBuilder[Self <: Stroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-width`(value: Double): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def `setText-anchor`(value: String): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
  }
}
