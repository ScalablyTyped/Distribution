package typings.reactLazylog

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactLazylog.anon.PartialLineProps
import typings.reactLazylog.anon.Text
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("react-lazylog/build/Line", JSImport.Default)
  @js.native
  class default ()
    extends Component[LineProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/Line", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/Line", "default.defaultProps")
    @js.native
    def defaultProps: PartialLineProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialLineProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type Line = Component[LineProps, js.Object, js.Any]
  
  @js.native
  trait LineProps extends StObject {
    
    var data: js.Array[Text] = js.native
    
    var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.native
    
    var highlight: js.UndefOr[Boolean] = js.native
    
    var number: Double = js.native
    
    var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.native
    
    /**
      * This is never called
      * https://github.com/mozilla-frontend-infra/react-lazylog/issues/18
      */
    var onRowClick: js.UndefOr[js.Function0[_]] = js.native
    
    var rowHeight: Double = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object LineProps {
    
    @scala.inline
    def apply(data: js.Array[Text], number: Double, rowHeight: Double): LineProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    @scala.inline
    implicit class LinePropsMutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Text]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Text*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFormatPart(value: /* text */ String => ReactNode): Self = StObject.set(x, "formatPart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatPartUndefined: Self = StObject.set(x, "formatPart", js.undefined)
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLineNumberClick(value: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLineNumberClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLineNumberClickUndefined: Self = StObject.set(x, "onLineNumberClick", js.undefined)
      
      @scala.inline
      def setOnRowClick(value: () => _): Self = StObject.set(x, "onRowClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
