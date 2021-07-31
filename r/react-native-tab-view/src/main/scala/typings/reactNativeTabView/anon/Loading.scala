package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loading extends StObject {
  
  var loading: Boolean
}
object Loading {
  
  @scala.inline
  def apply(loading: Boolean): Loading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loading]
  }
  
  @scala.inline
  implicit class LoadingMutableBuilder[Self <: Loading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
