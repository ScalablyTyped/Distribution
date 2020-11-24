package typings.senchaTouch.Ext.field

import typings.std.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileInput extends IInput {
  
  /** [Method] Updated the capture attribute with the  ink capture configuration
    * @param value Object
    */
  var applyCapture: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns the value of accept
    * @returns Object
    */
  var getAccept: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of capture
    * @returns Object
    */
  var getCapture: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the field files
    * @returns FileList List of the files selected.
    */
  var getFiles: js.UndefOr[js.Function0[FileList]] = js.native
  
  /** [Method] Returns the value of multiple
    * @returns Boolean
    */
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the field data value
    * @returns String value The field value.
    */
  @JSName("getValue")
  var getValue_IFileInput: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Function) */
  var me: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Function) */
  var newValue: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of accept
    * @param accept Object The new value.
    */
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of capture
    * @param capture Object The new value.
    */
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of multiple
    * @param multiple Boolean The new value.
    */
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of name
    * @param name Object The new value.
    */
  @JSName("setName")
  var setName_IFileInput: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called when the multiple property is updated  */
  var updateMultiple: js.UndefOr[js.Function0[Unit]] = js.native
}
object IFileInput {
  
  @scala.inline
  def apply(): IFileInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileInput]
  }
  
  @scala.inline
  implicit class IFileInputOps[Self <: IFileInput] (val x: Self) extends AnyVal {
    
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
    def setApplyCapture(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("applyCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApplyCapture: Self = this.set("applyCapture", js.undefined)
    
    @scala.inline
    def setGetAccept(value: () => _): Self = this.set("getAccept", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAccept: Self = this.set("getAccept", js.undefined)
    
    @scala.inline
    def setGetCapture(value: () => _): Self = this.set("getCapture", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCapture: Self = this.set("getCapture", js.undefined)
    
    @scala.inline
    def setGetFiles(value: () => FileList): Self = this.set("getFiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFiles: Self = this.set("getFiles", js.undefined)
    
    @scala.inline
    def setGetMultiple(value: () => Boolean): Self = this.set("getMultiple", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMultiple: Self = this.set("getMultiple", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setMe(value: js.Any): Self = this.set("me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMe: Self = this.set("me", js.undefined)
    
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setSetAccept(value: /* accept */ js.UndefOr[js.Any] => Unit): Self = this.set("setAccept", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAccept: Self = this.set("setAccept", js.undefined)
    
    @scala.inline
    def setSetCapture(value: /* capture */ js.UndefOr[js.Any] => Unit): Self = this.set("setCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCapture: Self = this.set("setCapture", js.undefined)
    
    @scala.inline
    def setSetMultiple(value: /* multiple */ js.UndefOr[Boolean] => Unit): Self = this.set("setMultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMultiple: Self = this.set("setMultiple", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    
    @scala.inline
    def setUpdateMultiple(value: () => Unit): Self = this.set("updateMultiple", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUpdateMultiple: Self = this.set("updateMultiple", js.undefined)
  }
}
