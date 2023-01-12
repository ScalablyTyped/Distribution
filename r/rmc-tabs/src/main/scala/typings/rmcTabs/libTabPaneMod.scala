package typings.rmcTabs

import typings.react.mod.PureComponent
import typings.rmcTabs.anon.FixX
import typings.rmcTabs.anon.PropsTypechildrenReactNod
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabPaneMod {
  
  @JSImport("rmc-tabs/lib/TabPane", "TabPane")
  @js.native
  open class TabPane protected ()
    extends PureComponent[PropsType, js.Object, Any] {
    def this(props: PropsType) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsType, context: Any) = this()
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MTabPane(nextProps: PropsTypechildrenReactNod): Unit = js.native
    
    var layout: HTMLDivElement = js.native
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
    
    def setLayout(div: HTMLDivElement): Unit = js.native
  }
  /* static members */
  object TabPane {
    
    @JSImport("rmc-tabs/lib/TabPane", "TabPane")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/TabPane", "TabPane.defaultProps")
    @js.native
    def defaultProps: FixX = js.native
    inline def defaultProps_=(x: FixX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PropsType extends StObject {
    
    var active: Boolean
    
    var className: js.UndefOr[String] = js.undefined
    
    var fixX: js.UndefOr[Boolean] = js.undefined
    
    var fixY: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
  }
  object PropsType {
    
    inline def apply(active: Boolean): PropsType = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFixX(value: Boolean): Self = StObject.set(x, "fixX", value.asInstanceOf[js.Any])
      
      inline def setFixXUndefined: Self = StObject.set(x, "fixX", js.undefined)
      
      inline def setFixY(value: Boolean): Self = StObject.set(x, "fixY", value.asInstanceOf[js.Any])
      
      inline def setFixYUndefined: Self = StObject.set(x, "fixY", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
