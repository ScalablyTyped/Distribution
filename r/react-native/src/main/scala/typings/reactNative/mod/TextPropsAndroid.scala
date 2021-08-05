package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.all_
import typings.reactNative.reactNativeStrings.balanced
import typings.reactNative.reactNativeStrings.email
import typings.reactNative.reactNativeStrings.highQuality
import typings.reactNative.reactNativeStrings.link
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.phoneNumber
import typings.reactNative.reactNativeStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPropsAndroid extends StObject {
  
  /**
    * Determines the types of data converted to clickable URLs in the text element.
    * By default no data types are detected.
    */
  var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none | all_] = js.undefined
  
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
}
object TextPropsAndroid {
  
  inline def apply(): TextPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropsAndroid]
  }
  
  extension [Self <: TextPropsAndroid](x: Self) {
    
    inline def setDataDetectorType(value: phoneNumber | link | email | none | all_): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    inline def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
  }
}
