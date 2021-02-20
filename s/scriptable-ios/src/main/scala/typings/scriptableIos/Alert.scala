package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alert extends StObject {
  
  /**
    * _Adds an action to the alert._
    *
    * Adds an action button to the alert. To check if an action was selected, you should use the first parameter provided when the promise returned by presentAlert() and presentSheet()
    * is resolved.
    * @param title - Title of the action.
    * @see https://docs.scriptable.app/alert/#-addaction
    */
  def addAction(title: String): Unit = js.native
  
  /**
    * _Adds a cancel action to the alert._
    *
    * Adds a cancel action to the alert. When a cancel action is selected, the index provided by presentAlert() or presentSheet() will always be -1. Please note that when running on the
    * iPad and presenting using presentSheet(), the action will not be shown in the list of actions. The operation is cancelled by tapping outside the sheet.
    * @param title - Title of the action.
    * @see https://docs.scriptable.app/alert/#-addcancelaction
    */
  def addCancelAction(title: String): Unit = js.native
  
  /**
    * _Adds a destructive action to the alert._
    *
    * Destructive action titles have a red text color, signaling that the action may modify or delete data.
    * @param title - Title of the action.
    * @see https://docs.scriptable.app/alert/#-adddestructiveaction
    */
  def addDestructiveAction(title: String): Unit = js.native
  
  /**
    * _Adds a secure text field prompting for user input._
    *
    * Adds a secure text field to the alert controller prompting for user input. Values entered into a secure text field will be hidden behind dots. Retrieve the value for the text field
    * using textFieldValue() and supply the index of the text field. Indices for text fields are assigned in the same order as they are added to the alert starting at 0.
    * @param placeholder - Optional placeholder that will be displayed when the text field is empty.
    * @param text - Optional default value for the text field.
    * @see https://docs.scriptable.app/alert/#-addsecuretextfield
    */
  def addSecureTextField(): Unit = js.native
  def addSecureTextField(placeholder: js.UndefOr[scala.Nothing], text: String): Unit = js.native
  def addSecureTextField(placeholder: String): Unit = js.native
  def addSecureTextField(placeholder: String, text: String): Unit = js.native
  
  /**
    * _Adds a text field prompting for user input._
    *
    * Adds a text field to the alert controller prompting for user input. Retrieve the value for the text field using textFieldValue() and supply the index of the text field. Indices
    * for text fields are assigned in the same order as they are added to the alert starting at 0.
    *
    * Text fields are not supported when using the sheet presentation.
    * @param placeholder - Optional placeholder that will be displayed when the text field is empty.
    * @param text - Optional default value for the text field.
    * @see https://docs.scriptable.app/alert/#-addtextfield
    */
  def addTextField(): Unit = js.native
  def addTextField(placeholder: js.UndefOr[scala.Nothing], text: String): Unit = js.native
  def addTextField(placeholder: String): Unit = js.native
  def addTextField(placeholder: String, text: String): Unit = js.native
  
  /**
    * _Detailed message displayed in the alert._
    * @see https://docs.scriptable.app/alert/#message
    */
  var message: String = js.native
  
  /**
    * _Presents the alert modally._
    *
    * This is a shorthand for presentAlert().
    * @see https://docs.scriptable.app/alert/#-present
    */
  def present(): js.Promise[Double] = js.native
  
  /**
    * _Presents the alert modally._
    * @see https://docs.scriptable.app/alert/#-presentalert
    */
  def presentAlert(): js.Promise[Double] = js.native
  
  /**
    * _Presents the alert as a sheet._
    * @see https://docs.scriptable.app/alert/#-presentsheet
    */
  def presentSheet(): js.Promise[Double] = js.native
  
  /**
    * _Retrieves value of a text field._
    *
    * Retrieves the value of a text field added using addTextField() or addSecureTextField(). Indices for text fields are assigned in the same order as they are added to the alert
    * starting at 0.
    * @param index - Index of text field to retrieve for value.
    * @see https://docs.scriptable.app/alert/#-textfieldvalue
    */
  def textFieldValue(index: Double): String = js.native
  
  /**
    * _Title displayed in the alert. Usually a short string._
    * @see https://docs.scriptable.app/alert/#title
    */
  var title: String = js.native
}
