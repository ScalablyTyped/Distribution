package typings.prosemirrorView.anon

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorView.mod.DOMNode
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /**
  Specs may have arbitrary additional properties.
  */
/* key */ StringDictionary[Any] {
  
  /**
    Called when the widget decoration is removed as a result of
    mapping
    */
  var destroy: js.UndefOr[js.Function1[/* node */ DOMNode, Unit]] = js.undefined
  
  /**
    When set (defaults to false), selection changes inside the
    widget are ignored, and don't cause ProseMirror to try and
    re-sync the selection with its selection state.
    */
  var ignoreSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
    When comparing decorations of this type (in order to decide
    whether it needs to be redrawn), ProseMirror will by default
    compare the widget DOM node by identity. If you pass a key,
    that key will be compared instead, which can be useful when
    you generate decorations on the fly and don't want to store
    and reuse DOM nodes. Make sure that any widgets with the same
    key are interchangeable—if widgets differ in, for example,
    the behavior of some event handler, they should get
    different keys.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    The precise set of marks to draw around the widget.
    */
  var marks: js.UndefOr[js.Array[Mark]] = js.undefined
  
  /**
    Controls which side of the document position this widget is
    associated with. When negative, it is drawn before a cursor
    at its position, and content inserted at that position ends
    up after the widget. When zero (the default) or positive, the
    widget is drawn after the cursor and content inserted there
    ends up before the widget.
    
    When there are multiple widgets at a given position, their
    `side` values determine the order in which they appear. Those
    with lower values appear first. The ordering of widgets with
    the same `side` value is unspecified.
    
    When `marks` is null, `side` also determines the marks that
    the widget is wrapped in—those of the node before when
    negative, those of the node after when positive.
    */
  var side: js.UndefOr[Double] = js.undefined
  
  /**
    Can be used to control which DOM events, when they bubble out
    of this widget, the editor view should ignore.
    */
  var stopEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setDestroy(value: /* node */ DOMNode => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setIgnoreSelection(value: Boolean): Self = StObject.set(x, "ignoreSelection", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSelectionUndefined: Self = StObject.set(x, "ignoreSelection", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMarks(value: js.Array[Mark]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setMarksVarargs(value: Mark*): Self = StObject.set(x, "marks", js.Array(value*))
    
    inline def setSide(value: Double): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setStopEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "stopEvent", js.Any.fromFunction1(value))
    
    inline def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
  }
}
