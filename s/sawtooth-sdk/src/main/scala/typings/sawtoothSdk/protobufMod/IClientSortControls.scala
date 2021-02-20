package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientSortControls extends StObject {
  
  /** ClientSortControls keys */
  var keys: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientSortControls reverse */
  var reverse: js.UndefOr[Boolean | Null] = js.native
}
object IClientSortControls {
  
  @scala.inline
  def apply(): IClientSortControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientSortControls]
  }
  
  @scala.inline
  implicit class IClientSortControlsMutableBuilder[Self <: IClientSortControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysNull: Self = StObject.set(x, "keys", null)
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseNull: Self = StObject.set(x, "reverse", null)
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
