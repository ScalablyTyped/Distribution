package typings.prosemirrorView.mod

import typings.prosemirrorModel.mod.Mark
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetDecorationSpec extends js.Object {
  
  /**
    * When comparing decorations of this type (in order to decide
    * whether it needs to be redrawn), ProseMirror will by default
    * compare the widget DOM node by identity. If you pass a key,
    * that key will be compared instead, which can be useful when
    * you generate decorations on the fly and don't want to store
    * and reuse DOM nodes. Make sure that any widgets with the same
    * key are interchangeable—if widgets differ in, for example,
    * the behavior of some event handler, they should get
    * different keys.
    */
  var key: js.UndefOr[String | Null] = js.native
  
  /**
    * The precise set of marks to draw around the widget.
    */
  var marks: js.UndefOr[js.Array[Mark[_]] | Null] = js.native
  
  /**
    * Controls which side of the document position this widget is
    * associated with. When negative, it is drawn before a cursor
    * at its position, and content inserted at that position ends
    * up after the widget. When zero (the default) or positive, the
    * widget is drawn after the cursor and content inserted there
    * ends up before the widget.
    *
    * When there are multiple widgets at a given position, their
    * `side` values determine the order in which they appear. Those
    * with lower values appear first. The ordering of widgets with
    * the same `side` value is unspecified.
    *
    * When `marks` is null, `side` also determines the marks that
    * the widget is wrapped in—those of the node before when
    * negative, those of the node after when positive.
    */
  var side: js.UndefOr[Double | Null] = js.native
  
  /**
    * Can be used to control which DOM events, when they bubble out
    * of this widget, the editor view should ignore.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ Event, Boolean]) | Null] = js.native
}
object WidgetDecorationSpec {
  
  @scala.inline
  def apply(): WidgetDecorationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetDecorationSpec]
  }
  
  @scala.inline
  implicit class WidgetDecorationSpecOps[Self <: WidgetDecorationSpec] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setMarksVarargs(value: Mark[js.Any]*): Self = this.set("marks", js.Array(value :_*))
    
    @scala.inline
    def setMarks(value: js.Array[Mark[_]]): Self = this.set("marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    
    @scala.inline
    def setMarksNull: Self = this.set("marks", null)
    
    @scala.inline
    def setSide(value: Double): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setSideNull: Self = this.set("side", null)
    
    @scala.inline
    def setStopEvent(value: /* event */ Event => Boolean): Self = this.set("stopEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStopEvent: Self = this.set("stopEvent", js.undefined)
    
    @scala.inline
    def setStopEventNull: Self = this.set("stopEvent", null)
  }
}
