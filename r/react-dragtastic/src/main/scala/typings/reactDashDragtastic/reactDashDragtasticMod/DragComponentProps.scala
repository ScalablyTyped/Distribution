package typings.reactDashDragtastic.reactDashDragtasticMod

import typings.react.reactMod.ReactNode
import typings.reactDashDragtastic.Anon_IsOverAccepted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragComponentProps extends js.Object {
  /** A boolean determining whether or not the DragComponent should always render. Defaults to false. */
  var alwaysRender: js.UndefOr[Boolean] = js.undefined
  /* A string corresponding to the id property of the <Draggable/> zone that should trigger this component to start rendering. */
  var `for`: js.UndefOr[Id] = js.undefined
  /** A function which will be called every time a user drags. */
  var onDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.undefined
  def children(arg: State with Anon_IsOverAccepted): ReactNode
}

object DragComponentProps {
  @scala.inline
  def apply(
    children: State with Anon_IsOverAccepted => ReactNode,
    alwaysRender: js.UndefOr[Boolean] = js.undefined,
    `for`: Id = null,
    onDrag: () => Unit = null,
    subscribeTo: js.Array[String] = null
  ): DragComponentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(alwaysRender)) __obj.updateDynamic("alwaysRender")(alwaysRender)
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction0(onDrag))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo)
    __obj.asInstanceOf[DragComponentProps]
  }
}

