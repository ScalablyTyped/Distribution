package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputOptions extends StObject {
  
  /** Force format output, otherwise attempt to use input format (optional, default true) */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /** Quality, integer 1-100 (optional, default 80) */
  var quality: js.UndefOr[Double] = js.undefined
}
object OutputOptions {
  
  @scala.inline
  def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  
  @scala.inline
  implicit class OutputOptionsMutableBuilder[Self <: OutputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
