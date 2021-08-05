package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceSearchHelperParams extends StObject {
  
  var language: js.UndefOr[String] = js.undefined
  
  def onQueryChange(query: String): Unit
  
  def onStateChange(): Unit
  
  var searchAsYouSpeak: Boolean
}
object VoiceSearchHelperParams {
  
  inline def apply(onQueryChange: String => Unit, onStateChange: () => Unit, searchAsYouSpeak: Boolean): VoiceSearchHelperParams = {
    val __obj = js.Dynamic.literal(onQueryChange = js.Any.fromFunction1(onQueryChange), onStateChange = js.Any.fromFunction0(onStateChange), searchAsYouSpeak = searchAsYouSpeak.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSearchHelperParams]
  }
  
  extension [Self <: VoiceSearchHelperParams](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setOnQueryChange(value: String => Unit): Self = StObject.set(x, "onQueryChange", js.Any.fromFunction1(value))
    
    inline def setOnStateChange(value: () => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction0(value))
    
    inline def setSearchAsYouSpeak(value: Boolean): Self = StObject.set(x, "searchAsYouSpeak", value.asInstanceOf[js.Any])
  }
}
