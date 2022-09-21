package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Text field in an alert._
  * @see https://docs.scriptable.app/textfield
  */
trait TextField extends StObject {
  
  /**
    * _Center aligns the text._
    * @see https://docs.scriptable.app/textfield/#-centeraligntext
    */
  def centerAlignText(): Unit
  
  /**
    * _Font of the text._
    * @see https://docs.scriptable.app/textfield/#font
    */
  var font: Font
  
  /**
    * _Hides the text that is entered when set to true._
    *
    * The default value is false.
    * @see https://docs.scriptable.app/textfield/#issecure
    */
  var isSecure: Boolean
  
  /**
    * _Left aligns the text._
    *
    * This is the default text alignment.
    * @see https://docs.scriptable.app/textfield/#-leftaligntext
    */
  def leftAlignText(): Unit
  
  /**
    * _Placeholder shown in the text field while it is empty._
    * @see https://docs.scriptable.app/textfield/#placeholder
    */
  var placeholder: String
  
  /**
    * _Right aligns the text._
    * @see https://docs.scriptable.app/textfield/#-rightaligntext
    */
  def rightAlignText(): Unit
  
  /**
    * _Use a numeric keyboard with a decimal point for entering text._
    * @see https://docs.scriptable.app/textfield/#-setdecimalpadkeyboard
    */
  def setDecimalPadKeyboard(): Unit
  
  /**
    * _Use the default keyboard for entering text._
    * @see https://docs.scriptable.app/textfield/#-setdefaultkeyboard
    */
  def setDefaultKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the @, period and space characters._
    * @see https://docs.scriptable.app/textfield/#-setemailaddresskeyboard
    */
  def setEmailAddressKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the numbers 0 through 9._
    * @see https://docs.scriptable.app/textfield/#-setnumberpadkeyboard
    */
  def setNumberPadKeyboard(): Unit
  
  /**
    * _Use a numeric keyboard with punctuation for entering text._
    * @see https://docs.scriptable.app/textfield/#-setnumbersandpunctuationkeyboard
    */
  def setNumbersAndPunctuationKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the numbers 0 through 9 and the * and # characters._
    * @see https://docs.scriptable.app/textfield/#-setphonepadkeyboard
    */
  def setPhonePadKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the @ and # characters._
    * @see https://docs.scriptable.app/textfield/#-settwitterkeyboard
    */
  def setTwitterKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the period and slash characters and the ".com" string._
    * @see https://docs.scriptable.app/textfield/#-seturlkeyboard
    */
  def setURLKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the space and period characters._
    * @see https://docs.scriptable.app/textfield/#-setwebsearchkeyboard
    */
  def setWebSearchKeyboard(): Unit
  
  /**
    * _Text in the text field._
    * @see https://docs.scriptable.app/textfield/#text
    */
  var text: String
  
  /**
    * _Color of the text._
    * @see https://docs.scriptable.app/textfield/#textcolor
    */
  var textColor: Color
}
object TextField {
  
  inline def apply(
    centerAlignText: () => Unit,
    font: Font,
    isSecure: Boolean,
    leftAlignText: () => Unit,
    placeholder: String,
    rightAlignText: () => Unit,
    setDecimalPadKeyboard: () => Unit,
    setDefaultKeyboard: () => Unit,
    setEmailAddressKeyboard: () => Unit,
    setNumberPadKeyboard: () => Unit,
    setNumbersAndPunctuationKeyboard: () => Unit,
    setPhonePadKeyboard: () => Unit,
    setTwitterKeyboard: () => Unit,
    setURLKeyboard: () => Unit,
    setWebSearchKeyboard: () => Unit,
    text: String,
    textColor: Color
  ): TextField = {
    val __obj = js.Dynamic.literal(centerAlignText = js.Any.fromFunction0(centerAlignText), font = font.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], leftAlignText = js.Any.fromFunction0(leftAlignText), placeholder = placeholder.asInstanceOf[js.Any], rightAlignText = js.Any.fromFunction0(rightAlignText), setDecimalPadKeyboard = js.Any.fromFunction0(setDecimalPadKeyboard), setDefaultKeyboard = js.Any.fromFunction0(setDefaultKeyboard), setEmailAddressKeyboard = js.Any.fromFunction0(setEmailAddressKeyboard), setNumberPadKeyboard = js.Any.fromFunction0(setNumberPadKeyboard), setNumbersAndPunctuationKeyboard = js.Any.fromFunction0(setNumbersAndPunctuationKeyboard), setPhonePadKeyboard = js.Any.fromFunction0(setPhonePadKeyboard), setTwitterKeyboard = js.Any.fromFunction0(setTwitterKeyboard), setURLKeyboard = js.Any.fromFunction0(setURLKeyboard), setWebSearchKeyboard = js.Any.fromFunction0(setWebSearchKeyboard), text = text.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextField]
  }
  
  extension [Self <: TextField](x: Self) {
    
    inline def setCenterAlignText(value: () => Unit): Self = StObject.set(x, "centerAlignText", js.Any.fromFunction0(value))
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    inline def setLeftAlignText(value: () => Unit): Self = StObject.set(x, "leftAlignText", js.Any.fromFunction0(value))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRightAlignText(value: () => Unit): Self = StObject.set(x, "rightAlignText", js.Any.fromFunction0(value))
    
    inline def setSetDecimalPadKeyboard(value: () => Unit): Self = StObject.set(x, "setDecimalPadKeyboard", js.Any.fromFunction0(value))
    
    inline def setSetDefaultKeyboard(value: () => Unit): Self = StObject.set(x, "setDefaultKeyboard", js.Any.fromFunction0(value))
    
    inline def setSetEmailAddressKeyboard(value: () => Unit): Self = StObject.set(x, "setEmailAddressKeyboard", js.Any.fromFunction0(value))
    
    inline def setSetNumberPadKeyboard(value: () => Unit): Self = StObject.set(x, "setNumberPadKeyboard", js.Any.fromFunction0(value))
    
    inline def setSetNumbersAndPunctuationKeyboard(value: () => Unit): Self = StObject.set(x, "setNumbersAndPunctuationKeyboard", js.Any.fromFunction0(value))
    
    inline def setSetPhonePadKeyboard(value: () => Unit): Self = StObject.set(x, "setPhonePadKeyboard", js.Any.fromFunction0(value))
    
    inline def setSetTwitterKeyboard(value: () => Unit): Self = StObject.set(x, "setTwitterKeyboard", js.Any.fromFunction0(value))
    
    inline def setSetURLKeyboard(value: () => Unit): Self = StObject.set(x, "setURLKeyboard", js.Any.fromFunction0(value))
    
    inline def setSetWebSearchKeyboard(value: () => Unit): Self = StObject.set(x, "setWebSearchKeyboard", js.Any.fromFunction0(value))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
