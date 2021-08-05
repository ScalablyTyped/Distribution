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
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.messageContentMod.MessageContentProps
import typings.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typings.semanticUiReact.messageItemMod.MessageItemProps
import typings.semanticUiReact.messageListMod.MessageListProps
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMessageMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/Message", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[MessageProps, ComponentState, js.Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/Message", JSImport.Default)
  @js.native
  val default: MessageComponent = js.native
  
  @js.native
  trait MessageComponent
    extends StObject
       with ComponentClass[MessageProps, ComponentState] {
    
    var Content: StatelessComponent[MessageContentProps] = js.native
    
    var Header: StatelessComponent[MessageHeaderProps] = js.native
    
    var Item: StatelessComponent[MessageItemProps] = js.native
    
    var List: StatelessComponent[MessageListProps] = js.native
  }
  
  trait MessageProps
    extends StObject
       with StrictMessageProps
       with /* key */ StringDictionary[js.Any]
  object MessageProps {
    
    inline def apply(): MessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiReact.semanticUiReactStrings.mini
    - typings.semanticUiReact.semanticUiReactStrings.tiny
    - typings.semanticUiReact.semanticUiReactStrings.small
    - typings.semanticUiReact.semanticUiReactStrings.large
    - typings.semanticUiReact.semanticUiReactStrings.big
    - typings.semanticUiReact.semanticUiReactStrings.huge
    - typings.semanticUiReact.semanticUiReactStrings.massive
  */
  trait MessageSizeProp extends StObject
  object MessageSizeProp {
    
    inline def big: typings.semanticUiReact.semanticUiReactStrings.big = "big".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.big]
    
    inline def huge: typings.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.huge]
    
    inline def large: typings.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.large]
    
    inline def massive: typings.semanticUiReact.semanticUiReactStrings.massive = "massive".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.massive]
    
    inline def mini: typings.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.mini]
    
    inline def small: typings.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.small]
    
    inline def tiny: typings.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  trait StrictMessageProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** A message can be formatted to attach itself to other content. */
    var attached: js.UndefOr[Boolean | bottom | top] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A message can be formatted to be different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** A message can only take up the width of its content. */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A message may be formatted to display a negative message. Same as `negative`. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** A message can float above content that it is related to. */
    var floating: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for MessageHeader. */
    var header: js.UndefOr[SemanticShorthandItem[MessageHeaderProps]] = js.undefined
    
    /** A message can be hidden. */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** Add an icon by icon name or pass an <Icon /.> */
    var icon: js.UndefOr[js.Any | Boolean] = js.undefined
    
    /** A message may be formatted to display information. */
    var info: js.UndefOr[Boolean] = js.undefined
    
    /** Array shorthand items for the MessageList. Mutually exclusive with children. */
    var list: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.undefined
    
    /** A message may be formatted to display a negative message. Same as `error`. */
    var negative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A message that the user can choose to hide.
      * Called when the user clicks the "x" icon. This also adds the "x" icon.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onDismiss: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ MessageProps, Unit]
      ] = js.undefined
    
    /** A message may be formatted to display a positive message.  Same as `success`. */
    var positive: js.UndefOr[Boolean] = js.undefined
    
    /** A message can have different sizes. */
    var size: js.UndefOr[MessageSizeProp] = js.undefined
    
    /** A message may be formatted to display a positive message.  Same as `positive`. */
    var success: js.UndefOr[Boolean] = js.undefined
    
    /** A message can be set to visible to force itself to be shown. */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** A message may be formatted to display warning messages. */
    var warning: js.UndefOr[Boolean] = js.undefined
  }
  object StrictMessageProps {
    
    inline def apply(): StrictMessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMessageProps]
    }
    
    extension [Self <: StrictMessageProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: Boolean | bottom | top): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[MessageHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType[MessageHeaderProps], MessageHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIcon(value: js.Any | Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setList(value: SemanticShorthandCollection[MessageItemProps]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: SemanticShorthandItem[MessageItemProps]*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      inline def setOnDismiss(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ MessageProps) => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction2(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setSize(value: MessageSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type _To = MessageComponent
  
  /* This means you don't have to write `default`, but can instead just say `messageMessageMod.foo` */
  override def _to: MessageComponent = default
}
