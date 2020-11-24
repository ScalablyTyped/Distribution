package typings.senchaTouch.Ext.data.writer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJson extends IWriter {
  
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of allowSingle
    * @returns Boolean
    */
  var getAllowSingle: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of encode
    * @returns Boolean
    */
  var getEncode: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of encodeRequest
    * @returns Boolean
    */
  var getEncodeRequest: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of rootProperty
    * @returns String
    */
  var getRootProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of allowSingle
    * @param allowSingle Boolean The new value.
    */
  var setAllowSingle: js.UndefOr[js.Function1[/* allowSingle */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of encode
    * @param encode Boolean The new value.
    */
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of encodeRequest
    * @param encodeRequest Boolean The new value.
    */
  var setEncodeRequest: js.UndefOr[js.Function1[/* encodeRequest */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of rootProperty
    * @param rootProperty String The new value.
    */
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.native
}
object IJson {
  
  @scala.inline
  def apply(): IJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJson]
  }
  
  @scala.inline
  implicit class IJsonOps[Self <: IJson] (val x: Self) extends AnyVal {
    
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
    def setAllowSingle(value: Boolean): Self = this.set("allowSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSingle: Self = this.set("allowSingle", js.undefined)
    
    @scala.inline
    def setEncode(value: Boolean): Self = this.set("encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setGetAllowSingle(value: () => Boolean): Self = this.set("getAllowSingle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAllowSingle: Self = this.set("getAllowSingle", js.undefined)
    
    @scala.inline
    def setGetEncode(value: () => Boolean): Self = this.set("getEncode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEncode: Self = this.set("getEncode", js.undefined)
    
    @scala.inline
    def setGetEncodeRequest(value: () => Boolean): Self = this.set("getEncodeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEncodeRequest: Self = this.set("getEncodeRequest", js.undefined)
    
    @scala.inline
    def setGetRootProperty(value: () => String): Self = this.set("getRootProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRootProperty: Self = this.set("getRootProperty", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootProperty(value: String): Self = this.set("rootProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootProperty: Self = this.set("rootProperty", js.undefined)
    
    @scala.inline
    def setSetAllowSingle(value: /* allowSingle */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowSingle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAllowSingle: Self = this.set("setAllowSingle", js.undefined)
    
    @scala.inline
    def setSetEncode(value: /* encode */ js.UndefOr[Boolean] => Unit): Self = this.set("setEncode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEncode: Self = this.set("setEncode", js.undefined)
    
    @scala.inline
    def setSetEncodeRequest(value: /* encodeRequest */ js.UndefOr[Boolean] => Unit): Self = this.set("setEncodeRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEncodeRequest: Self = this.set("setEncodeRequest", js.undefined)
    
    @scala.inline
    def setSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Unit): Self = this.set("setRootProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRootProperty: Self = this.set("setRootProperty", js.undefined)
  }
}
