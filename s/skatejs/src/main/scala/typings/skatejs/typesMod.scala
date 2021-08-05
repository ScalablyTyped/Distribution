package typings.skatejs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.CustomEvent
import typings.std.CustomEventInit
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.Node
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("skatejs/types", "CustomElement")
  @js.native
  class CustomElement ()
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var adoptedCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    def attributeChangedCallback(name: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: String, newValue: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: Null, newValue: String): Unit = js.native
    
    def connectedCallback(): Unit = js.native
    
    /* CompleteClass */
    var contentEditable: String = js.native
    
    def disconnectedCallback(): Unit = js.native
    
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
  }
  /* static members */
  object CustomElement {
    
    @JSImport("skatejs/types", "CustomElement.observedAttributes")
    @js.native
    val observedAttributes: js.Array[String] = js.native
  }
  
  @JSImport("skatejs/types", "WithChildren")
  @js.native
  class WithChildren ()
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    def childrenUpdated(): Unit = js.native
    
    /* CompleteClass */
    var contentEditable: String = js.native
    
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - scala.Any because Already inherited
  - typings.std.Node because Already inherited
  - scala.AnyRef because Already inherited
  - typings.std.Slottable because Already inherited
  - typings.std.ParentNode because Already inherited
  - typings.std.NonDocumentTypeChildNode because Already inherited
  - typings.std.InnerHTML because Already inherited
  - typings.std.ChildNode because Already inherited
  - typings.std.Animatable because Already inherited
  - js.Any because Already inherited
  - typings.std.HTMLOrSVGElement because Already inherited
  - typings.std.GlobalEventHandlers because Already inherited
  - typings.std.ElementContentEditable because Already inherited
  - typings.std.ElementCSSInlineStyle because Already inherited
  - typings.std.DocumentAndElementEventHandlers because Already inherited
  - typings.std.Element because Already inherited
  - js.Object because Already inherited
  - typings.std.HTMLElement because Already inherited
  - typings.skatejs.typesMod.WithContext because Inheritance from two classes. Inlined context
  - typings.skatejs.typesMod.WithUpdate because Inheritance from two classes. Inlined props, state, updating, updating, updating, updating, shouldUpdate, shouldUpdate, shouldUpdate, shouldUpdate, triggerUpdate
  - typings.skatejs.typesMod.WithRenderer because Inheritance from two classes. Inlined renderRoot, updated, updated, updated, updated, rendering, render, render, render, render, renderer, renderer, renderer, rendered
  - typings.skatejs.typesMod.WithLifecycle because Inheritance from two classes. Inlined connecting, connected, disconnecting, disconnected
  - typings.skatejs.typesMod.WithChildren because Inheritance from two classes. Inlined childrenUpdated */ @JSImport("skatejs/types", "WithComponent")
  @js.native
  class WithComponent[P, S, C] ()
    extends CustomElement
       with Renderer[Mixed | Null] {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def childrenUpdated(): Unit = js.native
    
    def connected(): Unit = js.native
    
    def connecting(): Unit = js.native
    
    var context: C = js.native
    
    def disconnected(): Unit = js.native
    
    def disconnecting(): Unit = js.native
    
    // Special hack for own components type checking.
    // It works in combination with ElementAttributesProperty. It placed in jsx.d.ts.
    // more detail, see: https://www.typescriptlang.org/docs/handbook/jsx.html
    //               and https://github.com/skatejs/skatejs/pull/952#issuecomment-264500153
    val props: P = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    def render(): Mixed | Null = js.native
    def render(props: Unit, state: Mixed): Mixed | Null = js.native
    def render(props: Mixed): Mixed | Null = js.native
    def render(props: Mixed, state: Mixed): Mixed | Null = js.native
    
    // getter for turning off ShadowDOM
    def renderRoot: this.type | Mixed = js.native
    
    // called after render
    var rendered: js.UndefOr[js.Function0[Unit]] = js.native
    
    // Default renderer, returns string returned from render and adds it to root via innerHTML
    // -> override to get own renderer
    def renderer(root: Element, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
    def renderer(root: Node, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
    def renderer(root: ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
    
    // called before render
    var rendering: js.UndefOr[js.Function0[Unit]] = js.native
    
    // Called to check whether or not the component should call updated(), much like React's shouldComponentUpdate().
    def shouldUpdate(): Boolean = js.native
    def shouldUpdate(props: P): Boolean = js.native
    def shouldUpdate(props: P, state: S): Boolean = js.native
    def shouldUpdate(props: Unit, state: S): Boolean = js.native
    
    var state: S = js.native
    
    // manually force update
    def triggerUpdate(): Unit = js.native
    
    def updated(): Unit = js.native
    def updated(props: Unit, state: Mixed): Unit = js.native
    def updated(props: Mixed): Unit = js.native
    def updated(props: Mixed, state: Mixed): Unit = js.native
    
    // Called when props have been set regardless of if they've changed. much like React's componentWillReceiveProps().
    def updating(): Unit = js.native
    def updating(props: P): Unit = js.native
    def updating(props: P, state: S): Unit = js.native
    def updating(props: Unit, state: S): Unit = js.native
  }
  /* static members */
  object WithComponent {
    
    @JSImport("skatejs/types", "WithComponent.observedAttributes")
    @js.native
    val observedAttributes: js.Array[String] = js.native
  }
  
  @JSImport("skatejs/types", "WithContext")
  @js.native
  class WithContext[C] ()
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    /* CompleteClass */
    var contentEditable: String = js.native
    
    var context: C = js.native
    
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
  }
  
  @JSImport("skatejs/types", "WithLifecycle")
  @js.native
  class WithLifecycle ()
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    def connected(): Unit = js.native
    
    def connecting(): Unit = js.native
    
    /* CompleteClass */
    var contentEditable: String = js.native
    
    def disconnected(): Unit = js.native
    
    def disconnecting(): Unit = js.native
    
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
  }
  
  @JSImport("skatejs/types", "WithRenderer")
  @js.native
  class WithRenderer[O] ()
    extends StObject
       with HTMLElement
       with Renderer[O] {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    /* CompleteClass */
    var contentEditable: String = js.native
    
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    def render(): O = js.native
    def render(props: Unit, state: Mixed): O = js.native
    def render(props: Mixed): O = js.native
    def render(props: Mixed, state: Mixed): O = js.native
    
    // getter for turning off ShadowDOM
    def renderRoot: this.type | Mixed = js.native
    
    // called after render
    var rendered: js.UndefOr[js.Function0[Unit]] = js.native
    
    // Default renderer, returns string returned from render and adds it to root via innerHTML
    // -> override to get own renderer
    def renderer(root: Element, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
    def renderer(root: Node, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
    def renderer(root: ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
    
    // called before render
    var rendering: js.UndefOr[js.Function0[Unit]] = js.native
    
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
    
    def updated(): Unit = js.native
    def updated(props: Unit, state: Mixed): Unit = js.native
    def updated(props: Mixed): Unit = js.native
    def updated(props: Mixed, state: Mixed): Unit = js.native
  }
  
  @JSImport("skatejs/types", "WithUpdate")
  @js.native
  class WithUpdate[P, S] ()
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    /* CompleteClass */
    var contentEditable: String = js.native
    
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    // Special hack for own components type checking.
    // It works in combination with ElementAttributesProperty. It placed in jsx.d.ts.
    // more detail, see: https://www.typescriptlang.org/docs/handbook/jsx.html
    //               and https://github.com/skatejs/skatejs/pull/952#issuecomment-264500153
    val props: P = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    // Called to check whether or not the component should call updated(), much like React's shouldComponentUpdate().
    def shouldUpdate(): Boolean = js.native
    def shouldUpdate(props: P): Boolean = js.native
    def shouldUpdate(props: P, state: S): Boolean = js.native
    def shouldUpdate(props: Unit, state: S): Boolean = js.native
    
    var state: S = js.native
    
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
    
    // manually force update
    def triggerUpdate(): Unit = js.native
    
    // Called if shouldUpdate returned true, much like React's componentWillUpdate()
    def updated(): Unit = js.native
    def updated(props: Unit, state: Mixed): Unit = js.native
    def updated(props: Mixed): Unit = js.native
    def updated(props: Mixed, state: Mixed): Unit = js.native
    
    // Called when props have been set regardless of if they've changed. much like React's componentWillReceiveProps().
    def updating(): Unit = js.native
    def updating(props: P): Unit = js.native
    def updating(props: P, state: S): Unit = js.native
    def updating(props: Unit, state: S): Unit = js.native
  }
  
  type ComponentProps[T, E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: skatejs.skatejs/types.PropOptions<T[P]>}
    */ typings.skatejs.skatejsStrings.ComponentProps & TopLevel[T]
  
  @js.native
  trait ComposedCustomEvent
    extends StObject
       with CustomEvent[js.Any]
  
  type Constructor[T] = Instantiable1[/* args (repeated) */ js.Any, T]
  
  trait EventOptions
    extends StObject
       with CustomEventInit[js.Any]
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
  }
  
  type HTMLElementClass = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTMLElement */ js.Any
  
  type Maybe[T] = js.UndefOr[T | Null]
  
  type Mixed = js.Object
  
  trait PropOptions[T] extends StObject {
    
    var default: js.UndefOr[T] = js.undefined
    
    var attribute: js.UndefOr[PropOptionsAttribute] = js.undefined
    
    var coerce: js.UndefOr[js.Function1[/* value */ js.Any, Maybe[T]]] = js.undefined
    
    var deserialize: js.UndefOr[js.Function1[/* value */ String | Null, Maybe[T]]] = js.undefined
    
    var serialize: js.UndefOr[js.Function1[/* value */ Maybe[T], String | Null]] = js.undefined
  }
  object PropOptions {
    
    inline def apply[T](): PropOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropOptions[T]]
    }
    
    extension [Self <: PropOptions[?], T](x: Self & PropOptions[T]) {
      
      inline def setAttribute(value: PropOptionsAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setCoerce(value: /* value */ js.Any => Maybe[T]): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDeserialize(value: /* value */ String | Null => Maybe[T]): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setSerialize(value: /* value */ Maybe[T] => String | Null): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
  
  type PropOptionsAttribute = PropOptionsAttributeIdentifier | PropOptionsAttributeIdentifierMap
  
  type PropOptionsAttributeIdentifier = Boolean | String
  
  trait PropOptionsAttributeIdentifierMap extends StObject {
    
    var source: js.UndefOr[PropOptionsAttributeIdentifier] = js.undefined
    
    var target: js.UndefOr[PropOptionsAttributeIdentifier] = js.undefined
  }
  object PropOptionsAttributeIdentifierMap {
    
    inline def apply(): PropOptionsAttributeIdentifierMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropOptionsAttributeIdentifierMap]
    }
    
    extension [Self <: PropOptionsAttributeIdentifierMap](x: Self) {
      
      inline def setSource(value: PropOptionsAttributeIdentifier): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: PropOptionsAttributeIdentifier): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait Renderer[O] extends StObject {
    
    def renderer(root: Element, html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]): Unit = js.native
    def renderer(root: Node, html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]): Unit = js.native
    def renderer(
      root: ShadowRoot,
      html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]
    ): Unit = js.native
  }
}
