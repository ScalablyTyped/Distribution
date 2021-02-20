package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientPagingControls extends StObject {
  
  /** ClientPagingControls limit */
  var limit: js.UndefOr[Double | Null] = js.native
  
  /** ClientPagingControls start */
  var start: js.UndefOr[String | Null] = js.native
}
object IClientPagingControls {
  
  @scala.inline
  def apply(): IClientPagingControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientPagingControls]
  }
  
  @scala.inline
  implicit class IClientPagingControlsMutableBuilder[Self <: IClientPagingControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitNull: Self = StObject.set(x, "limit", null)
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNull: Self = StObject.set(x, "start", null)
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
