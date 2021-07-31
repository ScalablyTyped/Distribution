package typings.reactNativeNavigation.optionsMod

import typings.reactNative.mod.ImageRequireSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSystemSource extends StObject {
  
  var fallback: js.UndefOr[ImageRequireSource | String] = js.undefined
  
  var system: String
}
object ImageSystemSource {
  
  @scala.inline
  def apply(system: String): ImageSystemSource = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSystemSource]
  }
  
  @scala.inline
  implicit class ImageSystemSourceMutableBuilder[Self <: ImageSystemSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallback(value: ImageRequireSource | String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
