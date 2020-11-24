package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAudio extends IMedia {
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_IAudio: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_IAudio: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
}
object IAudio {
  
  @scala.inline
  def apply(): IAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAudio]
  }
  
  @scala.inline
  implicit class IAudioOps[Self <: IAudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCls(value: () => java.lang.String): Self = this.set("getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
  }
}
