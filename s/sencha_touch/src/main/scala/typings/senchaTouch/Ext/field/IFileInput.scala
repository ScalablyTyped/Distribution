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
  var applyCapture: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Returns the value of accept
    * @returns Object
    */
  var getAccept: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of capture
    * @returns Object
    */
  var getCapture: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var me: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Function) */
  var newValue: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of accept
    * @param accept Object The new value.
    */
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of capture
    * @param capture Object The new value.
    */
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of multiple
    * @param multiple Boolean The new value.
    */
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of name
    * @param name Object The new value.
    */
  @JSName("setName")
  var setName_IFileInput: js.UndefOr[js.Function1[/* name */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called when the multiple property is updated  */
  var updateMultiple: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IFileInput {
  
  inline def apply(): IFileInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileInput]
  }
  
  extension [Self <: IFileInput](x: Self) {
    
    inline def setApplyCapture(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "applyCapture", js.Any.fromFunction1(value))
    
    inline def setApplyCaptureUndefined: Self = StObject.set(x, "applyCapture", js.undefined)
    
    inline def setGetAccept(value: () => Any): Self = StObject.set(x, "getAccept", js.Any.fromFunction0(value))
    
    inline def setGetAcceptUndefined: Self = StObject.set(x, "getAccept", js.undefined)
    
    inline def setGetCapture(value: () => Any): Self = StObject.set(x, "getCapture", js.Any.fromFunction0(value))
    
    inline def setGetCaptureUndefined: Self = StObject.set(x, "getCapture", js.undefined)
    
    inline def setGetFiles(value: () => FileList): Self = StObject.set(x, "getFiles", js.Any.fromFunction0(value))
    
    inline def setGetFilesUndefined: Self = StObject.set(x, "getFiles", js.undefined)
    
    inline def setGetMultiple(value: () => Boolean): Self = StObject.set(x, "getMultiple", js.Any.fromFunction0(value))
    
    inline def setGetMultipleUndefined: Self = StObject.set(x, "getMultiple", js.undefined)
    
    inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setMe(value: Any): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    inline def setMeUndefined: Self = StObject.set(x, "me", js.undefined)
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setSetAccept(value: /* accept */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAccept", js.Any.fromFunction1(value))
    
    inline def setSetAcceptUndefined: Self = StObject.set(x, "setAccept", js.undefined)
    
    inline def setSetCapture(value: /* capture */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setCapture", js.Any.fromFunction1(value))
    
    inline def setSetCaptureUndefined: Self = StObject.set(x, "setCapture", js.undefined)
    
    inline def setSetMultiple(value: /* multiple */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setMultiple", js.Any.fromFunction1(value))
    
    inline def setSetMultipleUndefined: Self = StObject.set(x, "setMultiple", js.undefined)
    
    inline def setSetName(value: /* name */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    inline def setUpdateMultiple(value: () => Unit): Self = StObject.set(x, "updateMultiple", js.Any.fromFunction0(value))
    
    inline def setUpdateMultipleUndefined: Self = StObject.set(x, "updateMultiple", js.undefined)
  }
}
