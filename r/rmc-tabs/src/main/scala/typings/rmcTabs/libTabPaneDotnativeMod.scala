package typings.rmcTabs

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabPaneDotnativeMod {
  
  @JSImport("rmc-tabs/lib/TabPane.native", "TabPane")
  @js.native
  open class TabPane protected ()
    extends PureComponent[PropsType, js.Object, Any] {
    def this(props: PropsType) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsType, context: Any) = this()
  }
  
  trait PropsType extends StObject {
    
    var active: Boolean
    
    var key: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ Any
      ] = js.undefined
  }
  object PropsType {
    
    inline def apply(active: Boolean): PropsType = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
