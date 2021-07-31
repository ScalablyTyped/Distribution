package typings.raty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryRatyRoundingOptions extends StObject {
  
  var down: Double
  
  var full: Double
  
  var up: Double
}
object JQueryRatyRoundingOptions {
  
  @scala.inline
  def apply(down: Double, full: Double, up: Double): JQueryRatyRoundingOptions = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRatyRoundingOptions]
  }
  
  @scala.inline
  implicit class JQueryRatyRoundingOptionsMutableBuilder[Self <: JQueryRatyRoundingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull(value: Double): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
