package typings.senchaTouch.Ext.field

import typings.std.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileInput
  extends StObject
     with IInput {
  
  /** [Method] Updated the capture attribute with the  ink capture configuration
    * @param value Object
    */
  var applyCapture: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Returns the value of accept
    * @returns Object
    */
  var getAccept: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of capture
    * @returns Object
    */
  var getCapture: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the field files
    * @returns FileList List of the files selected.
    */
  var getFiles: js.UndefOr[js.Function0[FileList]] = js.undefined
  
  /** [Method] Returns the value of multiple
    * @returns Boolean
    */
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the field data value
    * @returns String value The field value.
    */
  @JSName("getValue")
  var getValue_IFileInput: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Function) */
  var me: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Function) */
  var newValue: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Sets the value of accept
    * @param accept Object The new value.
    */
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of capture
    * @param capture Object The new value.
    */
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of multiple
    * @param multiple Boolean The new value.
    */
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of name
    * @param name Object The new value.
    */
  @JSName("setName")
  var setName_IFileInput: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Called when the multiple property is updated  */
  var updateMultiple: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IFileInput {
  
  @scala.inline
  def apply(): IFileInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileInput]
  }
  
  @scala.inline
  implicit class IFileInputMutableBuilder[Self <: IFileInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyCapture(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "applyCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplyCaptureUndefined: Self = StObject.set(x, "applyCapture", js.undefined)
    
    @scala.inline
    def setGetAccept(value: () => js.Any): Self = StObject.set(x, "getAccept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAcceptUndefined: Self = StObject.set(x, "getAccept", js.undefined)
    
    @scala.inline
    def setGetCapture(value: () => js.Any): Self = StObject.set(x, "getCapture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCaptureUndefined: Self = StObject.set(x, "getCapture", js.undefined)
    
    @scala.inline
    def setGetFiles(value: () => FileList): Self = StObject.set(x, "getFiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilesUndefined: Self = StObject.set(x, "getFiles", js.undefined)
    
    @scala.inline
    def setGetMultiple(value: () => Boolean): Self = StObject.set(x, "getMultiple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMultipleUndefined: Self = StObject.set(x, "getMultiple", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setMe(value: js.Any): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeUndefined: Self = StObject.set(x, "me", js.undefined)
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setSetAccept(value: /* accept */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAccept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAcceptUndefined: Self = StObject.set(x, "setAccept", js.undefined)
    
    @scala.inline
    def setSetCapture(value: /* capture */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCaptureUndefined: Self = StObject.set(x, "setCapture", js.undefined)
    
    @scala.inline
    def setSetMultiple(value: /* multiple */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setMultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMultipleUndefined: Self = StObject.set(x, "setMultiple", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    @scala.inline
    def setUpdateMultiple(value: () => Unit): Self = StObject.set(x, "updateMultiple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateMultipleUndefined: Self = StObject.set(x, "updateMultiple", js.undefined)
  }
}
