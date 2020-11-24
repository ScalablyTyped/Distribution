package typings.senchaTouch.Ext.data.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRest extends IAjax {
  
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of actionMethods
    * @returns Object
    */
  var getActionMethods: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of appendId
    * @returns Boolean
    */
  var getAppendId: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of format
    * @returns String
    */
  var getFormat: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Sets the value of actionMethods
    * @param actionMethods Object The new value.
    */
  var setActionMethods: js.UndefOr[js.Function1[/* actionMethods */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of appendId
    * @param appendId Boolean The new value.
    */
  var setAppendId: js.UndefOr[js.Function1[/* appendId */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of format
    * @param format String The new value.
    */
  var setFormat: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], Unit]] = js.native
}
object IRest {
  
  @scala.inline
  def apply(): IRest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRest]
  }
  
  @scala.inline
  implicit class IRestOps[Self <: IRest] (val x: Self) extends AnyVal {
    
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
    def setAppendId(value: Boolean): Self = this.set("appendId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendId: Self = this.set("appendId", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGetActionMethods(value: () => _): Self = this.set("getActionMethods", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActionMethods: Self = this.set("getActionMethods", js.undefined)
    
    @scala.inline
    def setGetAppendId(value: () => Boolean): Self = this.set("getAppendId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAppendId: Self = this.set("getAppendId", js.undefined)
    
    @scala.inline
    def setGetFormat(value: () => String): Self = this.set("getFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFormat: Self = this.set("getFormat", js.undefined)
    
    @scala.inline
    def setSetActionMethods(value: /* actionMethods */ js.UndefOr[js.Any] => Unit): Self = this.set("setActionMethods", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActionMethods: Self = this.set("setActionMethods", js.undefined)
    
    @scala.inline
    def setSetAppendId(value: /* appendId */ js.UndefOr[Boolean] => Unit): Self = this.set("setAppendId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAppendId: Self = this.set("setAppendId", js.undefined)
    
    @scala.inline
    def setSetFormat(value: /* format */ js.UndefOr[String] => Unit): Self = this.set("setFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFormat: Self = this.set("setFormat", js.undefined)
  }
}
