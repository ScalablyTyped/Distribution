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

@js.native
trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ Elements, Unit]] = js.native
  var container: js.UndefOr[Element | Null] = js.native
  var lockVertically: Boolean = js.native
  var removableByMove: Boolean = js.native
  var transitionDuration: Double = js.native
  var values: js.Array[Value] = js.native
  var voiceover: IVoiceover = js.native
  def onChange(meta: NewIndex): Unit = js.native
  def renderItem(params: Index[Value]): ReactNode = js.native
  def renderList(props: Children): ReactNode = js.native
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
    voiceover: IVoiceover
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps[Value]]
  }
  @scala.inline
  implicit class IPropsOps[Self <: IProps[_], Value] (val x: Self with IProps[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLockVertically(value: Boolean): Self = this.set("lockVertically", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: NewIndex => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovableByMove(value: Boolean): Self = this.set("removableByMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderItem(value: Index[Value] => ReactNode): Self = this.set("renderItem", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderList(value: Children => ReactNode): Self = this.set("renderList", js.Any.fromFunction1(value))
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Value*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Value]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceover(value: IVoiceover): Self = this.set("voiceover", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeDrag(value: /* params */ Elements => Unit): Self = this.set("beforeDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeDrag: Self = this.set("beforeDrag", js.undefined)
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
  }
  
}

