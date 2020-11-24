package typings.storybookUi.containerMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.SFC
import typings.reactDraggable.mod.DraggableData
import typings.reactDraggable.mod.DraggableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Layout
  extends TopLevel[
      SFC[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_helper.AddOptionalTo<Pick<LayoutProps & React.RefAttributes<Layout>, 'ref' | 'key'> & Partial<Pick<LayoutProps & React.RefAttributes<Layout>, 'children' | 'theme' | 'viewMode' | 'options' | 'bounds' | 'panelCount' | 'docsOnly'>> & Partial<Pick<Partial<LayoutProps>, never>>, 'theme'> */ js.Any
      ]
    ]
