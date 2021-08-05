package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.Record
import typings.storybookComponents.anon.OnSelect
import typings.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("@storybook/components/dist/tabs/tabs", "TabBar")
  @js.native
  val TabBar: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/tabs/tabs", "TabWrapper")
  @js.native
  val TabWrapper: FunctionComponent[TabWrapperProps] = js.native
  
  @JSImport("@storybook/components/dist/tabs/tabs", "Tabs")
  @js.native
  val Tabs: FunctionComponent[TabsProps] = js.native
  
  @JSImport("@storybook/components/dist/tabs/tabs", "TabsState")
  @js.native
  class TabsState protected ()
    extends Component[TabsStateProps, TabsStateState, js.Any] {
    def this(props: TabsStateProps) = this()
    
    var handlers: OnSelect = js.native
  }
  /* static members */
  object TabsState {
    
    @JSImport("@storybook/components/dist/tabs/tabs", "TabsState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/components/dist/tabs/tabs", "TabsState.defaultProps")
    @js.native
    def defaultProps: TabsStateProps = js.native
    inline def defaultProps_=(x: TabsStateProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ContentProps extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var bordered: js.UndefOr[Boolean] = js.undefined
  }
  object ContentProps {
    
    inline def apply(): ContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    }
  }
  
  type FuncChildren = js.Function0[Unit]
  
  trait TabWrapperProps extends StObject {
    
    var active: Boolean
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var render: js.UndefOr[js.Function0[Element]] = js.undefined
  }
  object TabWrapperProps {
    
    inline def apply(active: Boolean): TabWrapperProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabWrapperProps]
    }
    
    extension [Self <: TabWrapperProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRender(value: () => Element): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait TabsProps extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var actions: js.UndefOr[OnSelect & (Record[String, js.Any])] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
    
    var tools: js.UndefOr[ReactNode] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setActions(value: OnSelect & (Record[String, js.Any])): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTools(value: ReactNode): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    }
  }
  
  trait TabsStateProps extends StObject {
    
    var absolute: Boolean
    
    var backgroundColor: String
    
    var bordered: Boolean
    
    var children: js.Array[ReactNode | FuncChildren]
    
    var initial: String
  }
  object TabsStateProps {
    
    inline def apply(
      absolute: Boolean,
      backgroundColor: String,
      bordered: Boolean,
      children: js.Array[ReactNode | FuncChildren],
      initial: String
    ): TabsStateProps = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsStateProps]
    }
    
    extension [Self <: TabsStateProps](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[ReactNode | FuncChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (ReactNode | FuncChildren)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabsStateState extends StObject {
    
    var selected: String
  }
  object TabsStateState {
    
    inline def apply(selected: String): TabsStateState = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsStateState]
    }
    
    extension [Self <: TabsStateState](x: Self) {
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait VisuallyHiddenProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object VisuallyHiddenProps {
    
    inline def apply(): VisuallyHiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisuallyHiddenProps]
    }
    
    extension [Self <: VisuallyHiddenProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait WrapperProps extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var bordered: js.UndefOr[Boolean] = js.undefined
  }
  object WrapperProps {
    
    inline def apply(): WrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperProps]
    }
    
    extension [Self <: WrapperProps](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    }
  }
}
