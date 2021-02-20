package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.reactDraggable.anon.PartialDraggableProps
import typings.reactDraggable.mod.DraggableProps
import typings.reactDraggable.mod.default
import typings.std.HTMLDivElement
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggersMod {
  
  @JSImport("@storybook/ui/dist/components/layout/draggers", "Draggable")
  @js.native
  class Draggable protected () extends default {
    def this(props: PartialDraggableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PartialDraggableProps, context: js.Any) = this()
  }
  /* static members */
  object Draggable {
    
    @JSImport("@storybook/ui/dist/components/layout/draggers", "Draggable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/draggers", "Draggable.defaultProps")
    @js.native
    def defaultProps: DraggableProps = js.native
    @scala.inline
    def defaultProps_=(x: DraggableProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/layout/draggers", "Handle")
  @js.native
  val Handle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    typings.storybookUi.anon.Axis, 
    Theme
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.storybookUiStrings.x
    - typings.storybookUi.storybookUiStrings.y
  */
  trait Axis extends StObject
  object Axis {
    
    @scala.inline
    def x: typings.storybookUi.storybookUiStrings.x = "x".asInstanceOf[typings.storybookUi.storybookUiStrings.x]
    
    @scala.inline
    def y: typings.storybookUi.storybookUiStrings.y = "y".asInstanceOf[typings.storybookUi.storybookUiStrings.y]
  }
}
