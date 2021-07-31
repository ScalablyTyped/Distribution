package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.genericMod.HtmlLabelProps
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.medium
import typings.semanticUiReact.semanticUiReactStrings.percent
import typings.semanticUiReact.semanticUiReactStrings.ratio
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressProgressMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress/Progress", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ProgressProps, ComponentState, js.Any] {
    def this(props: ProgressProps) = this()
    def this(props: ProgressProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress/Progress", JSImport.Default)
  @js.native
  val default: ComponentClass[ProgressProps, ComponentState] = js.native
  
  trait ProgressProps
    extends StObject
       with StrictProgressProps
       with /* key */ StringDictionary[js.Any]
  object ProgressProps {
    
    @scala.inline
    def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
  }
  
  trait StrictProgressProps extends StObject {
    
    /** A progress bar can show activity. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** A progress bar can attach to and show the progress of an element (i.e. Card or Segment). */
    var attached: js.UndefOr[top | bottom] = js.undefined
    
    /** Whether success state should automatically trigger when progress completes. */
    var autoSuccess: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A progress bar can have different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A progress bar be disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A progress bar can show a error state. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** An indicating progress bar visually indicates the current level of progress of a task. */
    var indicating: js.UndefOr[Boolean] = js.undefined
    
    /** A progress bar can have its colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Can be set to either to display progress as percent or ratio. */
    var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.undefined
    
    /** Current percent complete. */
    var percent: js.UndefOr[Double | String] = js.undefined
    
    /** Decimal point precision for calculated progress. */
    var precision: js.UndefOr[Double] = js.undefined
    
    /** A progress bar can contain a text value indicating current progress. */
    var progress: js.UndefOr[Boolean | percent | ratio | value] = js.undefined
    
    /** A progress bar can vary in size. */
    var size: js.UndefOr[tiny | small | medium | large | big] = js.undefined
    
    /** A progress bar can show a success state. */
    var success: js.UndefOr[Boolean] = js.undefined
    
    /** For use with value. Together, these will calculate the percent. Mutually excludes percent. */
    var total: js.UndefOr[Double | String] = js.undefined
    
    /** For use with total. Together, these will calculate the percent. Mutually excludes percent. */
    var value: js.UndefOr[Double | String] = js.undefined
    
    /** A progress bar can show a warning state. */
    var warning: js.UndefOr[Boolean] = js.undefined
  }
  object StrictProgressProps {
    
    @scala.inline
    def apply(): StrictProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictProgressProps]
    }
    
    @scala.inline
    implicit class StrictProgressPropsMutableBuilder[Self <: StrictProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setAutoSuccess(value: Boolean): Self = StObject.set(x, "autoSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSuccessUndefined: Self = StObject.set(x, "autoSuccess", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setIndicating(value: Boolean): Self = StObject.set(x, "indicating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatingUndefined: Self = StObject.set(x, "indicating", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ElementType[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPercent(value: Double | String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setProgress(value: Boolean | percent | ratio | value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setSize(value: tiny | small | medium | large | big): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTotal(value: Double | String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type _To = ComponentClass[ProgressProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `progressProgressMod.foo` */
  override def _to: ComponentClass[ProgressProps, ComponentState] = default
}
