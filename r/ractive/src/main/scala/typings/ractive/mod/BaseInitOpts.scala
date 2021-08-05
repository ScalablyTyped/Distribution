package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseInitOpts[T /* <: Ractive[T] */]
  extends StObject
     with BaseParseOpts {
  
  /** Adaptors to be applied. */
  var adapt: js.UndefOr[js.Array[Adaptor | String]] = js.undefined
  
  /** A map of adaptors. */
  var adaptors: js.UndefOr[Registry[Adaptor]] = js.undefined
  
  /** If set to false, disallow expressions in the template. */
  var allowExpressions: js.UndefOr[Boolean] = js.undefined
  
  /** If true, this instance can occupy the target element with other existing instances rather than cause them to unrender. */
  var append: js.UndefOr[Boolean] = js.undefined
  
  /* A map of components */
  var components: js.UndefOr[Registry[Component]] = js.undefined
  
  /** A map of computations */
  var computed: js.UndefOr[StringDictionary[Computation[T]]] = js.undefined
  
  /** A map of decorators */
  var decorators: js.UndefOr[Registry[Decorator[T]]] = js.undefined
  
  /** Whether or not to use event delegation around suitabe iterative sections. Defaults to true. */
  var delegate: js.UndefOr[Boolean] = js.undefined
  
  /** A map of easings */
  var easing: js.UndefOr[Registry[Easing]] = js.undefined
  
  /** A map of custom events */
  var events: js.UndefOr[Registry[EventPlugin[T]]] = js.undefined
  
  /** A map of helper functions */
  var helpers: js.UndefOr[Registry[Helper]] = js.undefined
  
  /** A map of interpolators for use with animate */
  var interpolators: js.UndefOr[Registry[Interpolator]] = js.undefined
  
  /** Whether or not twoway bindings default to lazy. */
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not an element can transition if one of its parent elements is also transitioning. */
  var nestedTransitions: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to skip element intro transitions when the instance is being renered initially. */
  var noIntro: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to skip outro transitions when the instance is being unrendered. */
  var noOutro: js.UndefOr[Boolean] = js.undefined
  
  /** A map of observers */
  var observe: js.UndefOr[Registry[ObserverCallback[T] | ObserverDescriptor[T]]] = js.undefined
  
  /** A map of event listeners */
  var on: js.UndefOr[Registry[ListenerCallback[T] | ListenerDescriptor[T]]] = js.undefined
  
  /** A map of partials */
  var partials: js.UndefOr[Registry[Partial]] = js.undefined
  
  /** Whether or not to consider instance memners like set when resolving values in the template. */
  var resolveInstanceMembers: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to invalidate computation dependencies when a computed value or one of its children is set. */
  var syncComputedChildren: js.UndefOr[Boolean] = js.undefined
  
  /** The template to use when rendering. */
  var template: js.UndefOr[Template] = js.undefined
  
  /** A map of transitions */
  var transitions: js.UndefOr[Registry[Transition]] = js.undefined
  
  /** Whether or not to use transitions as elements are added and removed from the DOM. */
  var transitionsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to use twoway bindings by default. */
  var twoway: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to issue a warning when an ambiguous reference fails to resolve to the immediate context. */
  var warnAboutAmbiguity: js.UndefOr[Boolean] = js.undefined
}
object BaseInitOpts {
  
  inline def apply[T /* <: Ractive[T] */](): BaseInitOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseInitOpts[T]]
  }
  
  extension [Self <: BaseInitOpts[?], T /* <: Ractive[T] */](x: Self & BaseInitOpts[T]) {
    
    inline def setAdapt(value: js.Array[Adaptor | String]): Self = StObject.set(x, "adapt", value.asInstanceOf[js.Any])
    
    inline def setAdaptUndefined: Self = StObject.set(x, "adapt", js.undefined)
    
    inline def setAdaptVarargs(value: (Adaptor | String)*): Self = StObject.set(x, "adapt", js.Array(value :_*))
    
    inline def setAdaptors(value: Registry[Adaptor]): Self = StObject.set(x, "adaptors", value.asInstanceOf[js.Any])
    
    inline def setAdaptorsUndefined: Self = StObject.set(x, "adaptors", js.undefined)
    
    inline def setAllowExpressions(value: Boolean): Self = StObject.set(x, "allowExpressions", value.asInstanceOf[js.Any])
    
    inline def setAllowExpressionsUndefined: Self = StObject.set(x, "allowExpressions", js.undefined)
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setComponents(value: Registry[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComputed(value: StringDictionary[Computation[T]]): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setDecorators(value: Registry[Decorator[T]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDelegate(value: Boolean): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setEasing(value: Registry[Easing]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEvents(value: Registry[EventPlugin[T]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setHelpers(value: Registry[Helper]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    inline def setInterpolators(value: Registry[Interpolator]): Self = StObject.set(x, "interpolators", value.asInstanceOf[js.Any])
    
    inline def setInterpolatorsUndefined: Self = StObject.set(x, "interpolators", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setNestedTransitions(value: Boolean): Self = StObject.set(x, "nestedTransitions", value.asInstanceOf[js.Any])
    
    inline def setNestedTransitionsUndefined: Self = StObject.set(x, "nestedTransitions", js.undefined)
    
    inline def setNoIntro(value: Boolean): Self = StObject.set(x, "noIntro", value.asInstanceOf[js.Any])
    
    inline def setNoIntroUndefined: Self = StObject.set(x, "noIntro", js.undefined)
    
    inline def setNoOutro(value: Boolean): Self = StObject.set(x, "noOutro", value.asInstanceOf[js.Any])
    
    inline def setNoOutroUndefined: Self = StObject.set(x, "noOutro", js.undefined)
    
    inline def setObserve(value: Registry[ObserverCallback[T] | ObserverDescriptor[T]]): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
    inline def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
    
    inline def setOn(value: Registry[ListenerCallback[T] | ListenerDescriptor[T]]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPartials(value: Registry[Partial]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
    
    inline def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    
    inline def setResolveInstanceMembers(value: Boolean): Self = StObject.set(x, "resolveInstanceMembers", value.asInstanceOf[js.Any])
    
    inline def setResolveInstanceMembersUndefined: Self = StObject.set(x, "resolveInstanceMembers", js.undefined)
    
    inline def setSyncComputedChildren(value: Boolean): Self = StObject.set(x, "syncComputedChildren", value.asInstanceOf[js.Any])
    
    inline def setSyncComputedChildrenUndefined: Self = StObject.set(x, "syncComputedChildren", js.undefined)
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction1(value: /* helper */ ParseHelper => String | (js.Array[js.Object | String]) | ParsedTemplate): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateVarargs(value: js.Any*): Self = StObject.set(x, "template", js.Array(value :_*))
    
    inline def setTransitions(value: Registry[Transition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsEnabled(value: Boolean): Self = StObject.set(x, "transitionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setTransitionsEnabledUndefined: Self = StObject.set(x, "transitionsEnabled", js.undefined)
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setTwoway(value: Boolean): Self = StObject.set(x, "twoway", value.asInstanceOf[js.Any])
    
    inline def setTwowayUndefined: Self = StObject.set(x, "twoway", js.undefined)
    
    inline def setWarnAboutAmbiguity(value: Boolean): Self = StObject.set(x, "warnAboutAmbiguity", value.asInstanceOf[js.Any])
    
    inline def setWarnAboutAmbiguityUndefined: Self = StObject.set(x, "warnAboutAmbiguity", js.undefined)
  }
}
