package typings.senchaTouch.Ext.field

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
  implicit class IFileOps[Self <: IFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setCapture(value: String): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setGetAccept(value: () => String): Self = this.set("getAccept", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAccept: Self = this.set("getAccept", js.undefined)
    
    @scala.inline
    def setGetCapture(value: () => String): Self = this.set("getCapture", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCapture: Self = this.set("getCapture", js.undefined)
    
    @scala.inline
    def setGetMultiple(value: () => Boolean): Self = this.set("getMultiple", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMultiple: Self = this.set("getMultiple", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setSetAccept(value: /* accept */ js.UndefOr[String] => Unit): Self = this.set("setAccept", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAccept: Self = this.set("setAccept", js.undefined)
    
    @scala.inline
    def setSetCapture(value: /* capture */ js.UndefOr[String] => Unit): Self = this.set("setCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCapture: Self = this.set("setCapture", js.undefined)
    
    @scala.inline
    def setSetMultiple(value: /* multiple */ js.UndefOr[Boolean] => Unit): Self = this.set("setMultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMultiple: Self = this.set("setMultiple", js.undefined)
  }
}
