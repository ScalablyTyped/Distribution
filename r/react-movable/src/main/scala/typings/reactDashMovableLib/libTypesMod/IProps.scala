package typings
package reactDashMovableLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ reactDashMovableLib.Anon_Elements, scala.Unit]] = js.undefined
  var lockVertically: scala.Boolean
  var removableByMove: scala.Boolean
  var transitionDuration: scala.Double
  var values: js.Array[Value]
  var voiceover: IVoiceover
  def onChange(meta: reactDashMovableLib.Anon_NewIndex): scala.Unit
  def renderItem(params: reactDashMovableLib.Anon_Index[Value]): reactLib.reactMod.ReactNode
  def renderList(props: reactDashMovableLib.Anon_Children): reactLib.reactMod.ReactNode
}

object IProps {
  @scala.inline
  def apply[Value](
    lockVertically: scala.Boolean,
    onChange: reactDashMovableLib.Anon_NewIndex => scala.Unit,
    removableByMove: scala.Boolean,
    renderItem: reactDashMovableLib.Anon_Index[Value] => reactLib.reactMod.ReactNode,
    renderList: reactDashMovableLib.Anon_Children => reactLib.reactMod.ReactNode,
    transitionDuration: scala.Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ reactDashMovableLib.Anon_Elements => scala.Unit = null
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically, onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove, renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration, values = values, voiceover = voiceover)
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1(beforeDrag))
    __obj.asInstanceOf[IProps[Value]]
  }
}

