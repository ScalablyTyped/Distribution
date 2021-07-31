package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickAttrsMod {
  
  @JSImport("rc-util/lib/pickAttrs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  @scala.inline
  def default(props: js.Object, ariaOnly: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], ariaOnly.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def default(props: js.Object, ariaOnly: PickConfig): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], ariaOnly.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait PickConfig extends StObject {
    
    var aria: js.UndefOr[Boolean] = js.undefined
    
    var attr: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[Boolean] = js.undefined
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
