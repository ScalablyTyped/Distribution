package typings.reactMovable.typesMod

import typings.react.mod.ReactNode
import typings.reactMovable.AnonChildren
import typings.reactMovable.AnonElements
import typings.reactMovable.AnonIndex
import typings.reactMovable.AnonNewIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ AnonElements, Unit]] = js.undefined
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var values: js.Array[Value]
  var voiceover: IVoiceover
  def onChange(meta: AnonNewIndex): Unit
  def renderItem(params: AnonIndex[Value]): ReactNode
  def renderList(props: AnonChildren): ReactNode
}

object IProps {
  @scala.inline
  def apply[Value](
    lockVertically: Boolean,
    onChange: AnonNewIndex => Unit,
    removableByMove: Boolean,
    renderItem: AnonIndex[Value] => ReactNode,
    renderList: AnonChildren => ReactNode,
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ AnonElements => Unit = null
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1(beforeDrag))
    __obj.asInstanceOf[IProps[Value]]
  }
}

