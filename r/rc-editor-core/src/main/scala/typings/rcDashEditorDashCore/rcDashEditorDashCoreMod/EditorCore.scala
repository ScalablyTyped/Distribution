package typings.rcDashEditorDashCore.rcDashEditorDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorCore extends js.Object {
  var context: js.Any
  var props: js.Any
  var refs: js.Any
  var state: js.Any
  def forceUpdate(): js.Any
  def render(): js.Any
  def setState(): js.Any
}

@JSImport("rc-editor-core", "EditorCore")
@js.native
class EditorCoreCls () extends EditorCore {
  /* CompleteClass */
  override var context: js.Any = js.native
  /* CompleteClass */
  override var props: js.Any = js.native
  /* CompleteClass */
  override var refs: js.Any = js.native
  /* CompleteClass */
  override var state: js.Any = js.native
  /* CompleteClass */
  override def forceUpdate(): js.Any = js.native
  /* CompleteClass */
  override def render(): js.Any = js.native
  /* CompleteClass */
  override def setState(): js.Any = js.native
}

object EditorCore {
  @scala.inline
  def apply(
    context: js.Any,
    forceUpdate: () => js.Any,
    props: js.Any,
    refs: js.Any,
    render: () => js.Any,
    setState: () => js.Any,
    state: js.Any
  ): EditorCore = {
    val __obj = js.Dynamic.literal(context = context, forceUpdate = js.Any.fromFunction0(forceUpdate), props = props, refs = refs, render = js.Any.fromFunction0(render), setState = js.Any.fromFunction0(setState), state = state)
  
    __obj.asInstanceOf[EditorCore]
  }
}

