package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends StObject {
  
  var index: js.UndefOr[Double] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var tabbarId: js.UndefOr[String] = js.native
}
object Index {
  
  @scala.inline
  def apply(): Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnPostChange(value: () => Unit): Self = StObject.set(x, "onPostChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPostChangeUndefined: Self = StObject.set(x, "onPostChange", js.undefined)
    
    @scala.inline
    def setTabbarId(value: String): Self = StObject.set(x, "tabbarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabbarIdUndefined: Self = StObject.set(x, "tabbarId", js.undefined)
  }
}
