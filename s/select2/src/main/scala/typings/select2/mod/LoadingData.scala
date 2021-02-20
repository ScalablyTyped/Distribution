package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingData extends StObject {
  
  var element: js.UndefOr[scala.Nothing] = js.native
  
  var id: js.UndefOr[scala.Nothing] = js.native
  
  var loading: Boolean = js.native
  
  var text: String = js.native
}
object LoadingData {
  
  @scala.inline
  def apply(loading: Boolean, text: String): LoadingData = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingData]
  }
  
  @scala.inline
  implicit class LoadingDataMutableBuilder[Self <: LoadingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
