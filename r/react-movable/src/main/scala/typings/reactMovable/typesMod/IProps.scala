package typings.reactMovable.typesMod

import typings.react.mod.ReactNode
import typings.reactMovable.anon.Children
import typings.reactMovable.anon.Elements
import typings.reactMovable.anon.Index
import typings.reactMovable.anon.NewIndex
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ Elements, Unit]] = js.undefined
  var container: js.UndefOr[Element | Null] = js.undefined
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var values: js.Array[Value]
  var voiceover: IVoiceover
  def onChange(meta: NewIndex): Unit
  def renderItem(params: Index[Value]): ReactNode
  def renderList(props: Children): ReactNode
}

object IProps {
  @scala.inline
  def apply[Value](
    lockVertically: Boolean,
    onChange: NewIndex => Unit,
    removableByMove: Boolean,
    renderItem: Index[Value] => ReactNode,
    renderList: Children => ReactNode,
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ Elements => Unit = null,
    container: js.UndefOr[Null | Element] = js.undefined
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1(beforeDrag))
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps[Value]]
  }
}

