package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.reader.IJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArrayReader extends IJson {
  
  /** [Method] Sets the value of successProperty
    * @param successProperty Object The new value.
    */
  @JSName("setSuccessProperty")
  var setSuccessProperty_IArrayReader: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of totalProperty
    * @param totalProperty Object The new value.
    */
  @JSName("setTotalProperty")
  var setTotalProperty_IArrayReader: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[js.Any], Unit]] = js.native
}
object IArrayReader {
  
  @scala.inline
  def apply(): IArrayReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayReader]
  }
  
  @scala.inline
  implicit class IArrayReaderMutableBuilder[Self <: IArrayReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetSuccessProperty(value: /* successProperty */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSuccessProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSuccessPropertyUndefined: Self = StObject.set(x, "setSuccessProperty", js.undefined)
    
    @scala.inline
    def setSetTotalProperty(value: /* totalProperty */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTotalProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTotalPropertyUndefined: Self = StObject.set(x, "setTotalProperty", js.undefined)
  }
}
