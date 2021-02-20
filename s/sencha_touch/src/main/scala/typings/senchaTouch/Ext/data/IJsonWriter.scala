package typings.senchaTouch.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonWriter
  extends typings.senchaTouch.Ext.data.writer.IWriter {
  
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
object IJsonWriter {
  
  @scala.inline
  def apply(): IJsonWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonWriter]
  }
  
  @scala.inline
  implicit class IJsonWriterMutableBuilder[Self <: IJsonWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSingle(value: Boolean): Self = StObject.set(x, "allowSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSingleUndefined: Self = StObject.set(x, "allowSingle", js.undefined)
    
    @scala.inline
    def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setGetAllowSingle(value: () => Boolean): Self = StObject.set(x, "getAllowSingle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowSingleUndefined: Self = StObject.set(x, "getAllowSingle", js.undefined)
    
    @scala.inline
    def setGetEncode(value: () => Boolean): Self = StObject.set(x, "getEncode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEncodeRequest(value: () => Boolean): Self = StObject.set(x, "getEncodeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEncodeRequestUndefined: Self = StObject.set(x, "getEncodeRequest", js.undefined)
    
    @scala.inline
    def setGetEncodeUndefined: Self = StObject.set(x, "getEncode", js.undefined)
    
    @scala.inline
    def setGetRootProperty(value: () => String): Self = StObject.set(x, "getRootProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootPropertyUndefined: Self = StObject.set(x, "getRootProperty", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootProperty(value: String): Self = StObject.set(x, "rootProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPropertyUndefined: Self = StObject.set(x, "rootProperty", js.undefined)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSetAllowSingle(value: /* allowSingle */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowSingle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowSingleUndefined: Self = StObject.set(x, "setAllowSingle", js.undefined)
    
    @scala.inline
    def setSetEncode(value: /* encode */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEncode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEncodeRequest(value: /* encodeRequest */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEncodeRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEncodeRequestUndefined: Self = StObject.set(x, "setEncodeRequest", js.undefined)
    
    @scala.inline
    def setSetEncodeUndefined: Self = StObject.set(x, "setEncode", js.undefined)
    
    @scala.inline
    def setSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRootProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRootPropertyUndefined: Self = StObject.set(x, "setRootProperty", js.undefined)
  }
}
