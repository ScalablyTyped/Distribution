package typings.rmcTabs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.ScrollView
import typings.rmcTabs.anon.Component
import typings.rmcTabs.anon.TabBar
import typings.rmcTabs.anon.TypeofDefaultTabBar
import typings.rmcTabs.libModelsMod.Models.TabData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsDotnativeMod {
  
  @JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
  @js.native
  open class Tabs protected ()
    extends typings.rmcTabs.libTabsDotbaseMod.Tabs[PropsType, StateType] {
    def this(props: PropsType) = this()
    
    var AnimatedScrollView: ScrollView = js.native
    
    def goToTab(index: Double, force: Boolean, animated: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Unit, animated: Boolean): Boolean = js.native
    
    def handleLayout(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.LayoutChangeEvent */ Any
    ): Unit = js.native
    
    def onMomentumScrollEnd(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.NativeSyntheticEvent<RN.NativeScrollEvent> */ Any
    ): Unit = js.native
    
    def onScroll(): Unit = js.native
    def onScroll(
      evt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.NativeSyntheticEvent<RN.NativeScrollEvent> */ Any
    ): Unit = js.native
    
    def renderContent(): Element = js.native
    def renderContent(
      getSubElements: js.Function2[
          /* defaultPrefix */ js.UndefOr[String], 
          /* allPrefix */ js.UndefOr[String], 
          StringDictionary[ReactNode]
        ]
    ): Element = js.native
    
    def scrollTo(index: Double): Unit = js.native
    def scrollTo(index: Double, animated: Boolean): Unit = js.native
    
    var scrollView: Component = js.native
    
    def setScrollView(sv: Any): Unit = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    inline def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PropsType
    extends StObject
       with typings.rmcTabs.libPropsTypeMod.PropsType {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ Any
      ] = js.undefined
    
    var styles: js.UndefOr[TabBar] = js.undefined
  }
  object PropsType {
    
    inline def apply(tabs: js.Array[TabData]): PropsType = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKeyboardShouldPersistTaps(value: Boolean): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: TabBar): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait StateType
    extends typings.rmcTabs.libTabsDotbaseMod.StateType {
    
    var containerWidth: Double = js.native
    
    var scrollValue: Value = js.native
    
    var scrollX: Value = js.native
  }
}
