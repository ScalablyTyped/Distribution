package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StereoPannerOptions
  extends StObject
     with AudioNodeOptions {
  
  var pan: js.UndefOr[Double] = js.undefined
}
object StereoPannerOptions {
  
  @scala.inline
  def apply(): StereoPannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StereoPannerOptions]
  }
  
  @scala.inline
  implicit class StereoPannerOptionsMutableBuilder[Self <: StereoPannerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
  }
}
