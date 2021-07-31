package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.stepContentMod.StepContentProps
import typings.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import typings.semanticUiReact.stepGroupMod.StepGroupProps
import typings.semanticUiReact.stepTitleMod.StepTitleProps
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepStepMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/Step", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[StepProps, ComponentState, js.Any] {
    def this(props: StepProps) = this()
    def this(props: StepProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/Step", JSImport.Default)
  @js.native
  val default: StepComponent = js.native
  
  @js.native
  trait StepComponent
    extends StObject
       with ComponentClass[StepProps, ComponentState] {
    
    var Content: StatelessComponent[StepContentProps] = js.native
    
    var Description: StatelessComponent[StepDescriptionProps] = js.native
    
    var Group: StatelessComponent[StepGroupProps] = js.native
    
    var Title: StatelessComponent[StepTitleProps] = js.native
  }
  
  trait StepProps
    extends StObject
       with StrictStepProps
       with /* key */ StringDictionary[js.Any]
  object StepProps {
    
    @scala.inline
    def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
  }
  
  trait StrictStepProps extends StObject {
    
    /** A step can be highlighted as active. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A step can show that a user has completed it. */
    var completed: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for StepDescription. */
    var description: js.UndefOr[SemanticShorthandItem[StepDescriptionProps]] = js.undefined
    
    /** Show that the Loader is inactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Render as an `a` tag instead of a `div` and adds the href attribute. */
    var href: js.UndefOr[String] = js.undefined
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
    
    /** A step can be link. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called on click. When passed, the component will render as an `a`.
      * tag by default instead of a `div`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
          /* data */ StepProps, 
          Unit
        ]
      ] = js.undefined
    
    /** A step can show a ordered sequence of steps. Passed from StepGroup. */
    var ordered: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for StepTitle. */
    var title: js.UndefOr[SemanticShorthandItem[StepTitleProps]] = js.undefined
  }
  object StrictStepProps {
    
    @scala.inline
    def apply(): StrictStepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStepProps]
    }
    
    @scala.inline
    implicit class StrictStepPropsMutableBuilder[Self <: StrictStepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDescription(value: SemanticShorthandItem[StepDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction3(
        value: (/* component */ ElementType[StepDescriptionProps], StepDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ StepProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      @scala.inline
      def setTitle(value: SemanticShorthandItem[StepTitleProps]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction3(
        value: (/* component */ ElementType[StepTitleProps], StepTitleProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "title", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = StepComponent
  
  /* This means you don't have to write `default`, but can instead just say `stepStepMod.foo` */
  override def _to: StepComponent = default
}
