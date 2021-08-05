package typings.storybookUi

import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.reactDraggable.mod.DraggableData
import typings.reactDraggable.mod.DraggableEvent
import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.Align
import typings.storybookUi.anon.BasePanelRenderPropsalign
import typings.storybookUi.anon.BasePanelRenderPropsdocsO
import typings.storybookUi.anon.BasePanelRenderPropshidde
import typings.storybookUi.anon.Hidden
import typings.storybookUi.anon.IsFullscreen
import typings.storybookUi.anon.IsToolshown
import typings.storybookUi.anon.Left
import typings.storybookUi.storybookUiBooleans.`false`
import typings.storybookUi.storybookUiStrings.nav
import typings.storybookUi.storybookUiStrings.panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @js.native
  trait Layout
    extends Component[LayoutProps, LayoutState, js.Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLayout(prevProps: LayoutProps, prevState: LayoutState): Unit = js.native
    
    def resizeNav(e: DraggableEvent, data: DraggableData): Unit = js.native
    
    def resizePanel(e: DraggableEvent, data: DraggableData): Unit = js.native
    
    def setDragNav(): Unit = js.native
    
    def setDragPanel(): Unit = js.native
    
    def unsetDrag(): Unit = js.native
  }
  @JSImport("@storybook/ui/dist/components/layout/container", "Layout")
  @js.native
  val Layout: SFC[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_helper.AddOptionalTo<Pick<LayoutProps & React.RefAttributes<Layout>, 'ref' | 'key'> & Partial<Pick<LayoutProps & React.RefAttributes<Layout>, 'children' | 'theme' | 'viewMode' | 'options' | 'bounds' | 'panelCount' | 'docsOnly'>> & Partial<Pick<Partial<LayoutProps>, never>>, 'theme'> */ js.Any
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/container", "Main")
  @js.native
  val Main: FunctionComponent[IsFullscreen] = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/container", "Panel")
  @js.native
  val Panel: FunctionComponent[Align] = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/container", "Preview")
  @js.native
  val Preview: FunctionComponent[Hidden] = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/container", "Sidebar")
  @js.native
  val Sidebar: FunctionComponent[Hidden] = js.native
  
  trait BasePanelRenderProps extends StObject {
    
    var animate: Boolean
    
    var isFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var position: Bounds
    
    var viewMode: js.UndefOr[ViewMode & js.UndefOr[String]] = js.undefined
  }
  object BasePanelRenderProps {
    
    inline def apply(animate: Boolean, position: Bounds): BasePanelRenderProps = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePanelRenderProps]
    }
    
    extension [Self <: BasePanelRenderProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
      
      inline def setIsFullscreenUndefined: Self = StObject.set(x, "isFullscreen", js.undefined)
      
      inline def setPosition(value: Bounds): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  trait Bounds extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object Bounds {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): Bounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    extension [Self <: Bounds](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coordinates extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Coordinates {
    
    inline def apply(x: Double, y: Double): Coordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinates]
    }
    
    extension [Self <: Coordinates](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutProps extends StObject {
    
    var bounds: Left
    
    def children(data: LayoutRenderProps): ReactNode
    
    var docsOnly: Boolean
    
    var options: IsToolshown
    
    var panelCount: Double
    
    var theme: Theme
    
    var viewMode: ViewMode & js.UndefOr[String]
  }
  object LayoutProps {
    
    inline def apply(
      bounds: Left,
      children: LayoutRenderProps => ReactNode,
      docsOnly: Boolean,
      options: IsToolshown,
      panelCount: Double,
      theme: Theme,
      viewMode: ViewMode & js.UndefOr[String]
    ): LayoutProps = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), docsOnly = docsOnly.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutProps]
    }
    
    extension [Self <: LayoutProps](x: Self) {
      
      inline def setBounds(value: Left): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: LayoutRenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IsToolshown): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPanelCount(value: Double): Self = StObject.set(x, "panelCount", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutRenderProps extends StObject {
    
    var mainProps: BasePanelRenderProps
    
    var navProps: BasePanelRenderPropshidde
    
    var panelProps: BasePanelRenderPropsalign
    
    var previewProps: BasePanelRenderPropsdocsO
  }
  object LayoutRenderProps {
    
    inline def apply(
      mainProps: BasePanelRenderProps,
      navProps: BasePanelRenderPropshidde,
      panelProps: BasePanelRenderPropsalign,
      previewProps: BasePanelRenderPropsdocsO
    ): LayoutRenderProps = {
      val __obj = js.Dynamic.literal(mainProps = mainProps.asInstanceOf[js.Any], navProps = navProps.asInstanceOf[js.Any], panelProps = panelProps.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutRenderProps]
    }
    
    extension [Self <: LayoutRenderProps](x: Self) {
      
      inline def setMainProps(value: BasePanelRenderProps): Self = StObject.set(x, "mainProps", value.asInstanceOf[js.Any])
      
      inline def setNavProps(value: BasePanelRenderPropshidde): Self = StObject.set(x, "navProps", value.asInstanceOf[js.Any])
      
      inline def setPanelProps(value: BasePanelRenderPropsalign): Self = StObject.set(x, "panelProps", value.asInstanceOf[js.Any])
      
      inline def setPreviewProps(value: BasePanelRenderPropsdocsO): Self = StObject.set(x, "previewProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutState extends StObject {
    
    var isDragging: nav | panel | `false`
    
    var resizerNav: Coordinates
    
    var resizerPanel: Coordinates
  }
  object LayoutState {
    
    inline def apply(isDragging: nav | panel | `false`, resizerNav: Coordinates, resizerPanel: Coordinates): LayoutState = {
      val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], resizerNav = resizerNav.asInstanceOf[js.Any], resizerPanel = resizerPanel.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutState]
    }
    
    extension [Self <: LayoutState](x: Self) {
      
      inline def setIsDragging(value: nav | panel | `false`): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setResizerNav(value: Coordinates): Self = StObject.set(x, "resizerNav", value.asInstanceOf[js.Any])
      
      inline def setResizerPanel(value: Coordinates): Self = StObject.set(x, "resizerPanel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.storybookUiStrings.right
    - typings.storybookUi.storybookUiStrings.bottom
  */
  trait PanelPosition extends StObject
  object PanelPosition {
    
    inline def bottom: typings.storybookUi.storybookUiStrings.bottom = "bottom".asInstanceOf[typings.storybookUi.storybookUiStrings.bottom]
    
    inline def right: typings.storybookUi.storybookUiStrings.right = "right".asInstanceOf[typings.storybookUi.storybookUiStrings.right]
  }
}
