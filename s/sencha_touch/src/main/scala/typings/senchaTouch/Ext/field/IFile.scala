package typings.senchaTouch.Ext.field

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFile extends IField {
  
  /** [Config Option] (String) */
  var accept: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var capture: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of accept
    * @returns String
    */
  var getAccept: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of capture
    * @returns String
    */
  var getCapture: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of multiple
    * @returns Boolean
    */
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Boolean) */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the value of accept
    * @param accept String The new value.
    */
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of capture
    * @param capture String The new value.
    */
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of multiple
    * @param multiple Boolean The new value.
    */
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.native
}
object IFile {
  
  @scala.inline
  def apply(): IFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFile]
  }
  
  @scala.inline
  implicit class IFileMutableBuilder[Self <: IFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    @scala.inline
    def setCapture(value: String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setGetAccept(value: () => String): Self = StObject.set(x, "getAccept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAcceptUndefined: Self = StObject.set(x, "getAccept", js.undefined)
    
    @scala.inline
    def setGetCapture(value: () => String): Self = StObject.set(x, "getCapture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCaptureUndefined: Self = StObject.set(x, "getCapture", js.undefined)
    
    @scala.inline
    def setGetMultiple(value: () => Boolean): Self = StObject.set(x, "getMultiple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMultipleUndefined: Self = StObject.set(x, "getMultiple", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setSetAccept(value: /* accept */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setAccept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAcceptUndefined: Self = StObject.set(x, "setAccept", js.undefined)
    
    @scala.inline
    def setSetCapture(value: /* capture */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCaptureUndefined: Self = StObject.set(x, "setCapture", js.undefined)
    
    @scala.inline
    def setSetMultiple(value: /* multiple */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setMultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMultipleUndefined: Self = StObject.set(x, "setMultiple", js.undefined)
  }
}
