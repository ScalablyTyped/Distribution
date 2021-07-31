package typings.reactSplitPane

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.PureComponent
import typings.reactSplitPane.anon.PartialSplitPaneState
import typings.reactSplitPane.reactSplitPaneStrings.first
import typings.reactSplitPane.reactSplitPaneStrings.horizontal
import typings.reactSplitPane.reactSplitPaneStrings.second
import typings.reactSplitPane.reactSplitPaneStrings.vertical
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-split-pane", JSImport.Default)
  @js.native
  class default () extends SplitPane
  object default {
    
    @JSImport("react-split-pane", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-split-pane", "default.defaultProps")
    @js.native
    def defaultProps: SplitPaneProps = js.native
    @scala.inline
    def defaultProps_=(x: SplitPaneProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @scala.inline
    def getSizeUpdate(props: SplitPaneProps, state: SplitPaneState): PartialSplitPaneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getSizeUpdate")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialSplitPaneState]
  }
  
  @JSImport("react-split-pane", "Pane")
  @js.native
  class Pane protected ()
    extends PureComponent[PaneProps, js.Object, js.Any] {
    def this(props: PaneProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaneProps, context: js.Any) = this()
  }
  
  trait PaneProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var eleRef: js.UndefOr[js.Function1[/* el */ HTMLDivElement, Unit]] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var split: js.UndefOr[Split] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PaneProps {
    
    @scala.inline
    def apply(): PaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaneProps]
    }
    
    @scala.inline
    implicit class PanePropsMutableBuilder[Self <: PaneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEleRef(value: /* el */ HTMLDivElement => Unit): Self = StObject.set(x, "eleRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEleRefUndefined: Self = StObject.set(x, "eleRef", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: Split): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type Size = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSplitPane.reactSplitPaneStrings.vertical
    - typings.reactSplitPane.reactSplitPaneStrings.horizontal
  */
  trait Split extends StObject
  object Split {
    
    @scala.inline
    def horizontal: typings.reactSplitPane.reactSplitPaneStrings.horizontal = "horizontal".asInstanceOf[typings.reactSplitPane.reactSplitPaneStrings.horizontal]
    
    @scala.inline
    def vertical: typings.reactSplitPane.reactSplitPaneStrings.vertical = "vertical".asInstanceOf[typings.reactSplitPane.reactSplitPaneStrings.vertical]
  }
  
  @js.native
  trait SplitPane
    extends Component[SplitPaneProps, SplitPaneState, js.Any] {
    
    def onMouseDown(event: MouseEvent): Unit = js.native
    
    def onMouseMove(event: MouseEvent): Unit = js.native
    
    def onMouseUp(): Unit = js.native
    
    def onTouchMove(event: TouchEvent): Unit = js.native
    
    def onTouchStart(event: TouchEvent): Unit = js.native
  }
  
  trait SplitPaneProps extends StObject {
    
    var allowResize: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSize: js.UndefOr[Size] = js.undefined
    
    var maxSize: js.UndefOr[Size] = js.undefined
    
    var minSize: js.UndefOr[Size] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.undefined
    
    var onDragFinished: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.undefined
    
    var onDragStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onResizerClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onResizerDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var pane1Style: js.UndefOr[CSSProperties] = js.undefined
    
    var pane2Style: js.UndefOr[CSSProperties] = js.undefined
    
    var paneStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var primary: js.UndefOr[first | second] = js.undefined
    
    var resizerClassName: js.UndefOr[String] = js.undefined
    
    var resizerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var split: js.UndefOr[vertical | horizontal] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SplitPaneProps {
    
    @scala.inline
    def apply(): SplitPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitPaneProps]
    }
    
    @scala.inline
    implicit class SplitPanePropsMutableBuilder[Self <: SplitPaneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSize(value: Size): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setMinSize(value: Size): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* newSize */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDragFinished(value: /* newSize */ Double => Unit): Self = StObject.set(x, "onDragFinished", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragFinishedUndefined: Self = StObject.set(x, "onDragFinished", js.undefined)
      
      @scala.inline
      def setOnDragStarted(value: () => Unit): Self = StObject.set(x, "onDragStarted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragStartedUndefined: Self = StObject.set(x, "onDragStarted", js.undefined)
      
      @scala.inline
      def setOnResizerClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onResizerClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizerClickUndefined: Self = StObject.set(x, "onResizerClick", js.undefined)
      
      @scala.inline
      def setOnResizerDoubleClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onResizerDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizerDoubleClickUndefined: Self = StObject.set(x, "onResizerDoubleClick", js.undefined)
      
      @scala.inline
      def setPane1Style(value: CSSProperties): Self = StObject.set(x, "pane1Style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPane1StyleUndefined: Self = StObject.set(x, "pane1Style", js.undefined)
      
      @scala.inline
      def setPane2Style(value: CSSProperties): Self = StObject.set(x, "pane2Style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPane2StyleUndefined: Self = StObject.set(x, "pane2Style", js.undefined)
      
      @scala.inline
      def setPaneStyle(value: CSSProperties): Self = StObject.set(x, "paneStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaneStyleUndefined: Self = StObject.set(x, "paneStyle", js.undefined)
      
      @scala.inline
      def setPrimary(value: first | second): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setResizerClassName(value: String): Self = StObject.set(x, "resizerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizerClassNameUndefined: Self = StObject.set(x, "resizerClassName", js.undefined)
      
      @scala.inline
      def setResizerStyle(value: CSSProperties): Self = StObject.set(x, "resizerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizerStyleUndefined: Self = StObject.set(x, "resizerStyle", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: vertical | horizontal): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SplitPaneState extends StObject {
    
    var active: Boolean
    
    var resized: Boolean
  }
  object SplitPaneState {
    
    @scala.inline
    def apply(active: Boolean, resized: Boolean): SplitPaneState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], resized = resized.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitPaneState]
    }
    
    @scala.inline
    implicit class SplitPaneStateMutableBuilder[Self <: SplitPaneState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResized(value: Boolean): Self = StObject.set(x, "resized", value.asInstanceOf[js.Any])
    }
  }
}
