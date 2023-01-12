package typings.rmcTabs

import org.scalablytyped.runtime.StringDictionary
import typings.rcGesture.mod.IGestureStatus
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.rmcTabs.anon.OnPanMove
import typings.rmcTabs.anon.ReadonlychildrenReactNode
import typings.rmcTabs.anon.TypeofDefaultTabBar
import typings.rmcTabs.libModelsMod.Models.TabData
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsMod {
  
  @JSImport("rmc-tabs/lib/Tabs", "StateType")
  @js.native
  open class StateType ()
    extends typings.rmcTabs.libTabsDotbaseMod.StateType {
    
    var contentPos: js.UndefOr[String] = js.native
    
    var isMoving: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("rmc-tabs/lib/Tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends typings.rmcTabs.libTabsDotbaseMod.Tabs[PropsType, StateType] {
    def this(props: PropsType) = this()
    
    def getContentPosByIndex(index: Double, isVertical: Boolean): String = js.native
    def getContentPosByIndex(index: Double, isVertical: Boolean, useLeft: Boolean): String = js.native
    
    def goToTab(index: Double, force: Boolean, usePaged: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Boolean, usePaged: Boolean, props: ReadonlychildrenReactNode): Boolean = js.native
    def goToTab(index: Double, force: Boolean, usePaged: Unit, props: ReadonlychildrenReactNode): Boolean = js.native
    def goToTab(index: Double, force: Unit, usePaged: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Unit, usePaged: Boolean, props: ReadonlychildrenReactNode): Boolean = js.native
    def goToTab(index: Double, force: Unit, usePaged: Unit, props: ReadonlychildrenReactNode): Boolean = js.native
    
    var layout: HTMLDivElement = js.native
    
    var onPan: OnPanMove = js.native
    
    def onSwipe(status: IGestureStatus): Unit = js.native
    
    def renderContent(): Element = js.native
    def renderContent(
      getSubElements: js.Function2[
          /* defaultPrefix */ js.UndefOr[String], 
          /* allPrefix */ js.UndefOr[String], 
          StringDictionary[ReactNode]
        ]
    ): Element = js.native
    
    def setContentLayout(div: HTMLDivElement): Unit = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/Tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/Tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    inline def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/Tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PropsType
    extends StObject
       with typings.rmcTabs.libPropsTypeMod.PropsType {
    
    /** prefix class | default: rmc-tabs */
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object PropsType {
    
    inline def apply(tabs: js.Array[TabData]): PropsType = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
