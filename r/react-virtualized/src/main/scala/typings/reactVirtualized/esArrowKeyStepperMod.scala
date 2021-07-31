package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.Disabled
import typings.reactVirtualized.esGridMod.RenderedSection
import typings.reactVirtualized.reactVirtualizedStrings.cells
import typings.reactVirtualized.reactVirtualizedStrings.edges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esArrowKeyStepperMod {
  
  @JSImport("react-virtualized/dist/es/ArrowKeyStepper", "ArrowKeyStepper")
  @js.native
  class ArrowKeyStepper protected ()
    extends PureComponent[ArrowKeyStepperProps, ScrollIndices, js.Any] {
    def this(props: ArrowKeyStepperProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ArrowKeyStepperProps, context: js.Any) = this()
  }
  /* static members */
  object ArrowKeyStepper {
    
    @JSImport("react-virtualized/dist/es/ArrowKeyStepper", "ArrowKeyStepper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/ArrowKeyStepper", "ArrowKeyStepper.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ArrowKeyStepperProps
    extends StObject
       with /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    def children(props: ChildProps): ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var columnCount: Double
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isControlled: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[edges | cells] = js.undefined
    
    var onScrollToChange: js.UndefOr[js.Function1[/* params */ ScrollIndices, Unit]] = js.undefined
    
    var rowCount: Double
    
    var scrollToColumn: js.UndefOr[Double] = js.undefined
    
    var scrollToRow: js.UndefOr[Double] = js.undefined
  }
  object ArrowKeyStepperProps {
    
    @scala.inline
    def apply(children: ChildProps => ReactNode, columnCount: Double, rowCount: Double): ArrowKeyStepperProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowKeyStepperProps]
    }
    
    @scala.inline
    implicit class ArrowKeyStepperPropsMutableBuilder[Self <: ArrowKeyStepperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ChildProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsControlled(value: Boolean): Self = StObject.set(x, "isControlled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsControlledUndefined: Self = StObject.set(x, "isControlled", js.undefined)
      
      @scala.inline
      def setMode(value: edges | cells): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnScrollToChange(value: /* params */ ScrollIndices => Unit): Self = StObject.set(x, "onScrollToChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollToChangeUndefined: Self = StObject.set(x, "onScrollToChange", js.undefined)
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToColumn(value: Double): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToColumnUndefined: Self = StObject.set(x, "scrollToColumn", js.undefined)
      
      @scala.inline
      def setScrollToRow(value: Double): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToRowUndefined: Self = StObject.set(x, "scrollToRow", js.undefined)
    }
  }
  
  trait ChildProps extends StObject {
    
    def onSectionRendered(params: RenderedSection): Unit
    
    var scrollToColumn: Double
    
    var scrollToRow: Double
  }
  object ChildProps {
    
    @scala.inline
    def apply(onSectionRendered: RenderedSection => Unit, scrollToColumn: Double, scrollToRow: Double): ChildProps = {
      val __obj = js.Dynamic.literal(onSectionRendered = js.Any.fromFunction1(onSectionRendered), scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildProps]
    }
    
    @scala.inline
    implicit class ChildPropsMutableBuilder[Self <: ChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnSectionRendered(value: RenderedSection => Unit): Self = StObject.set(x, "onSectionRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToColumn(value: Double): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToRow(value: Double): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
    }
  }
  
  type OnSectionRenderedParams = RenderedSection
  
  type ScrollIndexes = ScrollIndices
  
  trait ScrollIndices extends StObject {
    
    var scrollToColumn: Double
    
    var scrollToRow: Double
  }
  object ScrollIndices {
    
    @scala.inline
    def apply(scrollToColumn: Double, scrollToRow: Double): ScrollIndices = {
      val __obj = js.Dynamic.literal(scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollIndices]
    }
    
    @scala.inline
    implicit class ScrollIndicesMutableBuilder[Self <: ScrollIndices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollToColumn(value: Double): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToRow(value: Double): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
    }
  }
}
