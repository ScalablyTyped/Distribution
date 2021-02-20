package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickProperties extends ViewProps {
  
  var fillColor: js.UndefOr[String] = js.native
  
  var inset: js.UndefOr[Double] = js.native
}
object TickProperties {
  
  @scala.inline
  def apply(): TickProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickProperties]
  }
  
  @scala.inline
  implicit class TickPropertiesMutableBuilder[Self <: TickProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setInset(value: Double): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
  }
}
