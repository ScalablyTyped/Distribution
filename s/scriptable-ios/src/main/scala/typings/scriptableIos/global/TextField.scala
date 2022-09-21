package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Text field in an alert._
  * @see https://docs.scriptable.app/textfield
  */
@JSGlobal("TextField")
@js.native
open class TextField ()
  extends StObject
     with typings.scriptableIos.TextField {
  
  /**
    * _Center aligns the text._
    * @see https://docs.scriptable.app/textfield/#-centeraligntext
    */
  /* CompleteClass */
  override def centerAlignText(): Unit = js.native
  
  /**
    * _Font of the text._
    * @see https://docs.scriptable.app/textfield/#font
    */
  /* CompleteClass */
  var font: typings.scriptableIos.Font = js.native
  
  /**
    * _Hides the text that is entered when set to true._
    *
    * The default value is false.
    * @see https://docs.scriptable.app/textfield/#issecure
    */
  /* CompleteClass */
  var isSecure: Boolean = js.native
  
  /**
    * _Left aligns the text._
    *
    * This is the default text alignment.
    * @see https://docs.scriptable.app/textfield/#-leftaligntext
    */
  /* CompleteClass */
  override def leftAlignText(): Unit = js.native
  
  /**
    * _Placeholder shown in the text field while it is empty._
    * @see https://docs.scriptable.app/textfield/#placeholder
    */
  /* CompleteClass */
  var placeholder: String = js.native
  
  /**
    * _Right aligns the text._
    * @see https://docs.scriptable.app/textfield/#-rightaligntext
    */
  /* CompleteClass */
  override def rightAlignText(): Unit = js.native
  
  /**
    * _Use a numeric keyboard with a decimal point for entering text._
    * @see https://docs.scriptable.app/textfield/#-setdecimalpadkeyboard
    */
  /* CompleteClass */
  override def setDecimalPadKeyboard(): Unit = js.native
  
  /**
    * _Use the default keyboard for entering text._
    * @see https://docs.scriptable.app/textfield/#-setdefaultkeyboard
    */
  /* CompleteClass */
  override def setDefaultKeyboard(): Unit = js.native
  
  /**
    * _Use a keyboard that prominently features the @, period and space characters._
    * @see https://docs.scriptable.app/textfield/#-setemailaddresskeyboard
    */
  /* CompleteClass */
  override def setEmailAddressKeyboard(): Unit = js.native
  
  /**
    * _Use a keyboard that prominently features the numbers 0 through 9._
    * @see https://docs.scriptable.app/textfield/#-setnumberpadkeyboard
    */
  /* CompleteClass */
  override def setNumberPadKeyboard(): Unit = js.native
  
  /**
    * _Use a numeric keyboard with punctuation for entering text._
    * @see https://docs.scriptable.app/textfield/#-setnumbersandpunctuationkeyboard
    */
  /* CompleteClass */
  override def setNumbersAndPunctuationKeyboard(): Unit = js.native
  
  /**
    * _Use a keyboard that prominently features the numbers 0 through 9 and the * and # characters._
    * @see https://docs.scriptable.app/textfield/#-setphonepadkeyboard
    */
  /* CompleteClass */
  override def setPhonePadKeyboard(): Unit = js.native
  
  /**
    * _Use a keyboard that prominently features the @ and # characters._
    * @see https://docs.scriptable.app/textfield/#-settwitterkeyboard
    */
  /* CompleteClass */
  override def setTwitterKeyboard(): Unit = js.native
  
  /**
    * _Use a keyboard that prominently features the period and slash characters and the ".com" string._
    * @see https://docs.scriptable.app/textfield/#-seturlkeyboard
    */
  /* CompleteClass */
  override def setURLKeyboard(): Unit = js.native
  
  /**
    * _Use a keyboard that prominently features the space and period characters._
    * @see https://docs.scriptable.app/textfield/#-setwebsearchkeyboard
    */
  /* CompleteClass */
  override def setWebSearchKeyboard(): Unit = js.native
  
  /**
    * _Text in the text field._
    * @see https://docs.scriptable.app/textfield/#text
    */
  /* CompleteClass */
  var text: String = js.native
  
  /**
    * _Color of the text._
    * @see https://docs.scriptable.app/textfield/#textcolor
    */
  /* CompleteClass */
  var textColor: typings.scriptableIos.Color = js.native
}
