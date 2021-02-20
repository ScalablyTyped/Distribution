package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickAttrsMod {
  
  @JSImport("rc-util/lib/pickAttrs", JSImport.Default)
  @js.native
  def default(props: js.Object): js.Object = js.native
  @JSImport("rc-util/lib/pickAttrs", JSImport.Default)
  @js.native
  def default(props: js.Object, ariaOnly: Boolean): js.Object = js.native
  @JSImport("rc-util/lib/pickAttrs", JSImport.Default)
  @js.native
  def default(props: js.Object, ariaOnly: PickConfig): js.Object = js.native
  
  @js.native
  trait PickConfig extends StObject {
    
    var aria: js.UndefOr[Boolean] = js.native
    
    var attr: js.UndefOr[Boolean] = js.native
    
    var data: js.UndefOr[Boolean] = js.native
  }
  object PickConfig {
    
    @scala.inline
    def apply(): PickConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickConfig]
    }
    
    @scala.inline
    implicit class PickConfigMutableBuilder[Self <: PickConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setAttr(value: Boolean): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      @scala.inline
      def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
