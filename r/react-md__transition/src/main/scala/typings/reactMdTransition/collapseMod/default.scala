package typings.reactMdTransition.collapseMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/transition/types/Collapse", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * The `Collapse` component is used to transition a child element in and
    * out of view by animating it's `max-height`. This means that the child must
    * either be an HTMLElement or a component that forwards the `ref` to an
    * HTMLElement and applies the `style`, `className`, and `hidden` props to an
    * HTMLElement.
    *
    * Note: This component **should not be used for `position: absolute` or
    * `position: fixed` elements**. Instead, the `ScaleTransition` or just a simple
    * `transform` transition should be used instead. Animating `max-height`,
    * `padding-top`, and `padding-bottom` is much less performant than `transform`
    * transition since it forces DOM repaints.
    */
  def apply(
    hasChildrenCollapsedClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseProps
  ): ReactElement | Null = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Any = js.native
    var className: js.Any = js.native
    var collapsed: js.Any = js.native
    var minHeight: js.Any = js.native
    var minPaddingBottom: js.Any = js.native
    var minPaddingTop: js.Any = js.native
    var onEnter: js.Any = js.native
    var onEntered: js.Any = js.native
    var onEntering: js.Any = js.native
    var onExit: js.Any = js.native
    var onExited: js.Any = js.native
    var onExiting: js.Any = js.native
    var style: js.Any = js.native
    var temporary: js.Any = js.native
    var timeout: js.Any = js.native
  }
  
}

