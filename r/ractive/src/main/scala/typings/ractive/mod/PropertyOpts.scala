package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ractive.ractiveBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyOpts[T /* <: Ractive[T] */] extends StObject {
  
  /** Adaptors to be applied. */
  var adapt: js.UndefOr[js.Array[Adaptor | String]] = js.undefined
  
  /** A map of adaptors. */
  var adaptors: js.UndefOr[Registry[Adaptor]] = js.undefined
  
  /** If set to false, disallow expressions in the template. */
  var allowExpressions: js.UndefOr[Boolean] = js.undefined
  
  /** If true, this instance can occupy the target element with other existing instances rather than cause them to unrender. */
  var append: js.UndefOr[Boolean] = js.undefined
  
  /** True if this instance is being constructed as a component, which also means it will be initialized after the constructor. */
  var component: js.UndefOr[`true`] = js.undefined
  
  /* A map of components */
  var components: js.UndefOr[Registry[Component]] = js.undefined
  
  /** A map of computations */
  var computed: js.UndefOr[StringDictionary[Computation[T]]] = js.undefined
  
  /** A map of decorators */
  var decorators: js.UndefOr[Registry[Decorator[T]]] = js.undefined
  
  /** Whether or not to use event delegation around suitable iterative sections. Defaults to true. */
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
  
  /** Whether or not to skip element intro transitions when the instance is being rendered initially. */
  var noIntro: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to skip outro transitions when the instance is being unrendered. */
  var noOutro: js.UndefOr[Boolean] = js.undefined
  
  /** A lifecycle event that is called when the instance is rendered and all the transitions have completed. */
  var oncomplete: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /** A lifecycle event that is called when an instance is constructed and all initialization options have been processed. */
  var onconfig: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /**
  	 * A lifecycle event that is called when an instance is constructed but before any initialization option has been processed.
  	 * Accepts the instance's initialization options as argument.
  	 */
  var onconstruct: js.UndefOr[js.ThisFunction1[/* this */ T, /* opts */ InitOpts[Ractive[Ractive[Any]]], Unit]] = js.undefined
  
  /**
  	 * A lifecycle event that is called whenever `ractive.detach()` is called.
  	 * Note that `ractive.insert()` implicitly calls `ractive.detach()` if needed.
  	 */
  var ondetach: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /** A lifecycle event that is called when an instance is constructed and is ready to be rendered. */
  var oninit: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /** A lifecycle event that is called when ractive.insert() is called. */
  var oninsert: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /** A lifecycle event that is called when the instance is rendered but before transitions start. */
  var onrender: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /** A lifecycle event that is called when an instance is constructed and is ready to be rendered. */
  var onteardown: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /** A lifecycle event that is called when an instance is constructed and is ready to be rendered. */
  var onunrender: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /** A lifecycle event that is called when ractive.update() is called. */
  var onupdate: js.UndefOr[js.ThisFunction0[/* this */ T, Unit]] = js.undefined
  
  /** A map of partials */
  var partials: js.UndefOr[Registry[Partial]] = js.undefined
  
  /** Whether or not to consider instance members like set when resolving values in the template. */
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
object PropertyOpts {
  
  inline def apply[T /* <: Ractive[T] */](): PropertyOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyOpts[T]]
  }
  
  extension [Self <: PropertyOpts[?], T /* <: Ractive[T] */](x: Self & PropertyOpts[T]) {
    
    inline def setAdapt(value: js.Array[Adaptor | String]): Self = StObject.set(x, "adapt", value.asInstanceOf[js.Any])
    
    inline def setAdaptUndefined: Self = StObject.set(x, "adapt", js.undefined)
    
    inline def setAdaptVarargs(value: (Adaptor | String)*): Self = StObject.set(x, "adapt", js.Array(value*))
    
    inline def setAdaptors(value: Registry[Adaptor]): Self = StObject.set(x, "adaptors", value.asInstanceOf[js.Any])
    
    inline def setAdaptorsUndefined: Self = StObject.set(x, "adaptors", js.undefined)
    
    inline def setAllowExpressions(value: Boolean): Self = StObject.set(x, "allowExpressions", value.asInstanceOf[js.Any])
    
    inline def setAllowExpressionsUndefined: Self = StObject.set(x, "allowExpressions", js.undefined)
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setComponent(value: `true`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
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
    
    inline def setOncomplete(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "oncomplete", value.asInstanceOf[js.Any])
    
    inline def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
    
    inline def setOnconfig(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "onconfig", value.asInstanceOf[js.Any])
    
    inline def setOnconfigUndefined: Self = StObject.set(x, "onconfig", js.undefined)
    
    inline def setOnconstruct(value: js.ThisFunction1[/* this */ T, /* opts */ InitOpts[Ractive[Ractive[Any]]], Unit]): Self = StObject.set(x, "onconstruct", value.asInstanceOf[js.Any])
    
    inline def setOnconstructUndefined: Self = StObject.set(x, "onconstruct", js.undefined)
    
    inline def setOndetach(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "ondetach", value.asInstanceOf[js.Any])
    
    inline def setOndetachUndefined: Self = StObject.set(x, "ondetach", js.undefined)
    
    inline def setOninit(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "oninit", value.asInstanceOf[js.Any])
    
    inline def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
    
    inline def setOninsert(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "oninsert", value.asInstanceOf[js.Any])
    
    inline def setOninsertUndefined: Self = StObject.set(x, "oninsert", js.undefined)
    
    inline def setOnrender(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "onrender", value.asInstanceOf[js.Any])
    
    inline def setOnrenderUndefined: Self = StObject.set(x, "onrender", js.undefined)
    
    inline def setOnteardown(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "onteardown", value.asInstanceOf[js.Any])
    
    inline def setOnteardownUndefined: Self = StObject.set(x, "onteardown", js.undefined)
    
    inline def setOnunrender(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "onunrender", value.asInstanceOf[js.Any])
    
    inline def setOnunrenderUndefined: Self = StObject.set(x, "onunrender", js.undefined)
    
    inline def setOnupdate(value: js.ThisFunction0[/* this */ T, Unit]): Self = StObject.set(x, "onupdate", value.asInstanceOf[js.Any])
    
    inline def setOnupdateUndefined: Self = StObject.set(x, "onupdate", js.undefined)
    
    inline def setPartials(value: Registry[Partial]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
    
    inline def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    
    inline def setResolveInstanceMembers(value: Boolean): Self = StObject.set(x, "resolveInstanceMembers", value.asInstanceOf[js.Any])
    
    inline def setResolveInstanceMembersUndefined: Self = StObject.set(x, "resolveInstanceMembers", js.undefined)
    
    inline def setSyncComputedChildren(value: Boolean): Self = StObject.set(x, "syncComputedChildren", value.asInstanceOf[js.Any])
    
    inline def setSyncComputedChildrenUndefined: Self = StObject.set(x, "syncComputedChildren", js.undefined)
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction1(value: /* helper */ ParseHelper => String | (js.Array[js.Object | String]) | ParsedTemplate): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateVarargs(value: Any*): Self = StObject.set(x, "template", js.Array(value*))
    
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
