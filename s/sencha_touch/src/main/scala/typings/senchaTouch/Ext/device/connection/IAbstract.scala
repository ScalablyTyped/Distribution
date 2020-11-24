package typings.senchaTouch.Ext.device.connection

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstract extends IEvented {
  
  /** [Property] (String) */
  var CELL_2G: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var CELL_3G: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var CELL_4G: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var ETHERNET: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var NONE: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var UNKNOWN: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var WIFI: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of online
    * @returns Boolean
    */
  var getOnline: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the current connection type
    * @returns String type
    */
  var getType: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] True if the device is currently online
    * @returns Boolean online
    */
  var isOnline: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Sets the value of online
    * @param online Boolean The new value.
    */
  var setOnline: js.UndefOr[js.Function1[/* online */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of type
    * @param type Object The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[js.Any], Unit]] = js.native
}
object IAbstract {
  
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    
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
    def setCELL_2G(value: String): Self = this.set("CELL_2G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCELL_2G: Self = this.set("CELL_2G", js.undefined)
    
    @scala.inline
    def setCELL_3G(value: String): Self = this.set("CELL_3G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCELL_3G: Self = this.set("CELL_3G", js.undefined)
    
    @scala.inline
    def setCELL_4G(value: String): Self = this.set("CELL_4G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCELL_4G: Self = this.set("CELL_4G", js.undefined)
    
    @scala.inline
    def setETHERNET(value: String): Self = this.set("ETHERNET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETHERNET: Self = this.set("ETHERNET", js.undefined)
    
    @scala.inline
    def setNONE(value: String): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNONE: Self = this.set("NONE", js.undefined)
    
    @scala.inline
    def setUNKNOWN(value: String): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUNKNOWN: Self = this.set("UNKNOWN", js.undefined)
    
    @scala.inline
    def setWIFI(value: String): Self = this.set("WIFI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWIFI: Self = this.set("WIFI", js.undefined)
    
    @scala.inline
    def setGetOnline(value: () => Boolean): Self = this.set("getOnline", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOnline: Self = this.set("getOnline", js.undefined)
    
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetType: Self = this.set("getType", js.undefined)
    
    @scala.inline
    def setIsOnline(value: () => Boolean): Self = this.set("isOnline", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsOnline: Self = this.set("isOnline", js.undefined)
    
    @scala.inline
    def setSetOnline(value: /* online */ js.UndefOr[Boolean] => Unit): Self = this.set("setOnline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOnline: Self = this.set("setOnline", js.undefined)
    
    @scala.inline
    def setSetType(value: /* type */ js.UndefOr[js.Any] => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetType: Self = this.set("setType", js.undefined)
  }
}
