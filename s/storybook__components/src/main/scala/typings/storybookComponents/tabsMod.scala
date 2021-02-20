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
import scala.scalajs.js.`|`
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
    @scala.inline
    def defaultProps_=(x: TabsStateProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ContentProps extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.native
    
    var bordered: js.UndefOr[Boolean] = js.native
  }
  object ContentProps {
    
    @scala.inline
    def apply(): ContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentProps]
    }
    
    @scala.inline
    implicit class ContentPropsMutableBuilder[Self <: ContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    }
  }
  
  type FuncChildren = js.Function0[Unit]
  
  @js.native
  trait TabWrapperProps extends StObject {
    
    var active: Boolean = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var render: js.UndefOr[js.Function0[Element]] = js.native
  }
  object TabWrapperProps {
    
    @scala.inline
    def apply(active: Boolean): TabWrapperProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabWrapperProps]
    }
    
    @scala.inline
    implicit class TabWrapperPropsMutableBuilder[Self <: TabWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setRender(value: () => Element): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  @js.native
  trait TabsProps extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.native
    
    var actions: js.UndefOr[OnSelect with (Record[String, _])] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[String] = js.native
    
    var tools: js.UndefOr[ReactNode] = js.native
  }
  object TabsProps {
    
    @scala.inline
    def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setActions(value: OnSelect with (Record[String, _])): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTools(value: ReactNode): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    }
  }
  
  @js.native
  trait TabsStateProps extends StObject {
    
    var absolute: Boolean = js.native
    
    var backgroundColor: String = js.native
    
    var bordered: Boolean = js.native
    
    var children: js.Array[ReactNode | FuncChildren] = js.native
    
    var initial: String = js.native
  }
  object TabsStateProps {
    
    @scala.inline
    def apply(
      absolute: Boolean,
      backgroundColor: String,
      bordered: Boolean,
      children: js.Array[ReactNode | FuncChildren],
      initial: String
    ): TabsStateProps = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsStateProps]
    }
    
    @scala.inline
    implicit class TabsStatePropsMutableBuilder[Self <: TabsStateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode | FuncChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: (ReactNode | FuncChildren)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabsStateState extends StObject {
    
    var selected: String = js.native
  }
  object TabsStateState {
    
    @scala.inline
    def apply(selected: String): TabsStateState = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsStateState]
    }
    
    @scala.inline
    implicit class TabsStateStateMutableBuilder[Self <: TabsStateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VisuallyHiddenProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
  }
  object VisuallyHiddenProps {
    
    @scala.inline
    def apply(): VisuallyHiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisuallyHiddenProps]
    }
    
    @scala.inline
    implicit class VisuallyHiddenPropsMutableBuilder[Self <: VisuallyHiddenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  @js.native
  trait WrapperProps extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.native
    
    var bordered: js.UndefOr[Boolean] = js.native
  }
  object WrapperProps {
    
    @scala.inline
    def apply(): WrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperProps]
    }
    
    @scala.inline
    implicit class WrapperPropsMutableBuilder[Self <: WrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    }
  }
}
