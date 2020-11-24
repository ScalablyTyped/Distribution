package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseInitOpts[T /* <: Ractive[T] */] extends BaseParseOpts {
  
  /** Adaptors to be applied. */
  var adapt: js.UndefOr[js.Array[Adaptor | String]] = js.native
  
  /** A map of adaptors. */
  var adaptors: js.UndefOr[Registry[Adaptor]] = js.native
  
  /** If set to false, disallow expressions in the template. */
  var allowExpressions: js.UndefOr[Boolean] = js.native
  
  /** If true, this instance can occupy the target element with other existing instances rather than cause them to unrender. */
  var append: js.UndefOr[Boolean] = js.native
  
  /* A map of components */
  var components: js.UndefOr[Registry[Component]] = js.native
  
  /** A map of computations */
  var computed: js.UndefOr[StringDictionary[Computation[T]]] = js.native
  
  /** A map of decorators */
  var decorators: js.UndefOr[Registry[Decorator[T]]] = js.native
  
  /** Whether or not to use event delegation around suitabe iterative sections. Defaults to true. */
  var delegate: js.UndefOr[Boolean] = js.native
  
  /** A map of easings */
  var easing: js.UndefOr[Registry[Easing]] = js.native
  
  /** A map of custom events */
  var events: js.UndefOr[Registry[EventPlugin[T]]] = js.native
  
  /** A map of helper functions */
  var helpers: js.UndefOr[Registry[Helper]] = js.native
  
  /** A map of interpolators for use with animate */
  var interpolators: js.UndefOr[Registry[Interpolator]] = js.native
  
  /** Whether or not twoway bindings default to lazy. */
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  /** Whether or not an element can transition if one of its parent elements is also transitioning. */
  var nestedTransitions: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to skip element intro transitions when the instance is being renered initially. */
  var noIntro: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to skip outro transitions when the instance is being unrendered. */
  var noOutro: js.UndefOr[Boolean] = js.native
  
  /** A map of observers */
  var observe: js.UndefOr[Registry[ObserverCallback[T] | ObserverDescriptor[T]]] = js.native
  
  /** A map of event listeners */
  var on: js.UndefOr[Registry[ListenerCallback[T] | ListenerDescriptor[T]]] = js.native
  
  /** A map of partials */
  var partials: js.UndefOr[Registry[Partial]] = js.native
  
  /** Whether or not to consider instance memners like set when resolving values in the template. */
  var resolveInstanceMembers: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to invalidate computation dependencies when a computed value or one of its children is set. */
  var syncComputedChildren: js.UndefOr[Boolean] = js.native
  
  /** The template to use when rendering. */
  var template: js.UndefOr[Template] = js.native
  
  /** A map of transitions */
  var transitions: js.UndefOr[Registry[Transition]] = js.native
  
  /** Whether or not to use transitions as elements are added and removed from the DOM. */
  var transitionsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to use twoway bindings by default. */
  var twoway: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to issue a warning when an ambiguous reference fails to resolve to the immediate context. */
  var warnAboutAmbiguity: js.UndefOr[Boolean] = js.native
}
object BaseInitOpts {
  
  @scala.inline
  def apply[T /* <: Ractive[T] */](): BaseInitOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseInitOpts[T]]
  }
  
  @scala.inline
  implicit class BaseInitOptsOps[Self <: BaseInitOpts[_], T /* <: Ractive[T] */] (val x: Self with BaseInitOpts[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdaptVarargs(value: (Adaptor | String)*): Self = this.set("adapt", js.Array(value :_*))
    
    @scala.inline
    def setAdapt(value: js.Array[Adaptor | String]): Self = this.set("adapt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapt: Self = this.set("adapt", js.undefined)
    
    @scala.inline
    def setAdaptors(value: Registry[Adaptor]): Self = this.set("adaptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptors: Self = this.set("adaptors", js.undefined)
    
    @scala.inline
    def setAllowExpressions(value: Boolean): Self = this.set("allowExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExpressions: Self = this.set("allowExpressions", js.undefined)
    
    @scala.inline
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setComponents(value: Registry[Component]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setComputed(value: StringDictionary[Computation[T]]): Self = this.set("computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputed: Self = this.set("computed", js.undefined)
    
    @scala.inline
    def setDecorators(value: Registry[Decorator[T]]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    
    @scala.inline
    def setDelegate(value: Boolean): Self = this.set("delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    
    @scala.inline
    def setEasing(value: Registry[Easing]): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEvents(value: Registry[EventPlugin[T]]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setHelpers(value: Registry[Helper]): Self = this.set("helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    
    @scala.inline
    def setInterpolators(value: Registry[Interpolator]): Self = this.set("interpolators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolators: Self = this.set("interpolators", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setNestedTransitions(value: Boolean): Self = this.set("nestedTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedTransitions: Self = this.set("nestedTransitions", js.undefined)
    
    @scala.inline
    def setNoIntro(value: Boolean): Self = this.set("noIntro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoIntro: Self = this.set("noIntro", js.undefined)
    
    @scala.inline
    def setNoOutro(value: Boolean): Self = this.set("noOutro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoOutro: Self = this.set("noOutro", js.undefined)
    
    @scala.inline
    def setObserve(value: Registry[ObserverCallback[T] | ObserverDescriptor[T]]): Self = this.set("observe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserve: Self = this.set("observe", js.undefined)
    
    @scala.inline
    def setOn(value: Registry[ListenerCallback[T] | ListenerDescriptor[T]]): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setPartials(value: Registry[Partial]): Self = this.set("partials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartials: Self = this.set("partials", js.undefined)
    
    @scala.inline
    def setResolveInstanceMembers(value: Boolean): Self = this.set("resolveInstanceMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveInstanceMembers: Self = this.set("resolveInstanceMembers", js.undefined)
    
    @scala.inline
    def setSyncComputedChildren(value: Boolean): Self = this.set("syncComputedChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncComputedChildren: Self = this.set("syncComputedChildren", js.undefined)
    
    @scala.inline
    def setTemplateVarargs(value: js.Any*): Self = this.set("template", js.Array(value :_*))
    
    @scala.inline
    def setTemplateFunction1(value: /* helper */ ParseHelper => String | (js.Array[js.Object | String]) | ParsedTemplate): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplate(value: Template): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTransitions(value: Registry[Transition]): Self = this.set("transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
    
    @scala.inline
    def setTransitionsEnabled(value: Boolean): Self = this.set("transitionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionsEnabled: Self = this.set("transitionsEnabled", js.undefined)
    
    @scala.inline
    def setTwoway(value: Boolean): Self = this.set("twoway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwoway: Self = this.set("twoway", js.undefined)
    
    @scala.inline
    def setWarnAboutAmbiguity(value: Boolean): Self = this.set("warnAboutAmbiguity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnAboutAmbiguity: Self = this.set("warnAboutAmbiguity", js.undefined)
  }
}
