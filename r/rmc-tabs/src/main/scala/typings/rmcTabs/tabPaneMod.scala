package typings.rmcTabs

import typings.react.mod.PureComponent
import typings.rmcTabs.anon.FixX
import typings.rmcTabs.anon.PropsTypechildrenReactNod
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPaneMod {
  
  @JSImport("rmc-tabs/lib/TabPane", "TabPane")
  @js.native
  class TabPane protected ()
    extends PureComponent[PropsType, js.Object, js.Any] {
    def this(props: PropsType) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsType, context: js.Any) = this()
    
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
    @scala.inline
    def defaultProps_=(x: FixX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropsType extends StObject {
    
    var active: Boolean = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var fixX: js.UndefOr[Boolean] = js.native
    
    var fixY: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(active: Boolean): PropsType = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFixX(value: Boolean): Self = StObject.set(x, "fixX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixXUndefined: Self = StObject.set(x, "fixX", js.undefined)
      
      @scala.inline
      def setFixY(value: Boolean): Self = StObject.set(x, "fixY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixYUndefined: Self = StObject.set(x, "fixY", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
