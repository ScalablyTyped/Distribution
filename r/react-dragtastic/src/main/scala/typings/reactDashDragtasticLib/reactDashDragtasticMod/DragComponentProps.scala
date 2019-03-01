package typings
package reactDashDragtasticLib.reactDashDragtasticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragComponentProps extends js.Object {
  /** A boolean determining whether or not the DragComponent should always render. Defaults to false. */
  var alwaysRender: js.UndefOr[scala.Boolean] = js.undefined
  /* A string corresponding to the id property of the <Draggable/> zone that should trigger this component to start rendering. */
  var `for`: js.UndefOr[Id] = js.undefined
  /** A function which will be called every time a user drags. */
  var onDrag: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  def children(arg: State with reactDashDragtasticLib.Anon_IsOverAccepted): reactLib.reactMod.ReactNs.ReactNode
}

object DragComponentProps {
  @scala.inline
  def apply(
    children: js.Function1[
      State with reactDashDragtasticLib.Anon_IsOverAccepted, 
      reactLib.reactMod.ReactNs.ReactNode
    ],
    alwaysRender: js.UndefOr[scala.Boolean] = js.undefined,
    `for`: Id = null,
    onDrag: js.Function0[scala.Unit] = null,
    subscribeTo: js.Array[java.lang.String] = null
  ): DragComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (!js.isUndefined(alwaysRender)) __obj.updateDynamic("alwaysRender")(alwaysRender)
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo)
    __obj.asInstanceOf[DragComponentProps]
  }
}

