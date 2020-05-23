package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseInitOpts[T /* <: Ractive[T] */] extends BaseParseOpts {
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
  @scala.inline
  def apply[T](
    adapt: js.Array[Adaptor | String] = null,
    adaptors: Registry[Adaptor] = null,
    allowExpressions: js.UndefOr[Boolean] = js.undefined,
    append: js.UndefOr[Boolean] = js.undefined,
    components: Registry[Component] = null,
    computed: StringDictionary[Computation[T]] = null,
    contextLines: js.UndefOr[Double] = js.undefined,
    csp: js.UndefOr[Boolean] = js.undefined,
    decorators: Registry[Decorator[T]] = null,
    delegate: js.UndefOr[Boolean] = js.undefined,
    delimiters: ParseDelimiters = null,
    easing: Registry[Easing] = null,
    events: Registry[EventPlugin[T]] = null,
    helpers: Registry[Helper] = null,
    interpolators: Registry[Interpolator] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    nestedTransitions: js.UndefOr[Boolean] = js.undefined,
    noIntro: js.UndefOr[Boolean] = js.undefined,
    noOutro: js.UndefOr[Boolean] = js.undefined,
    observe: Registry[ObserverCallback[T] | ObserverDescriptor[T]] = null,
    on: Registry[ListenerCallback[T] | ListenerDescriptor[T]] = null,
    partials: Registry[Partial] = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    resolveInstanceMembers: js.UndefOr[Boolean] = js.undefined,
    sanitize: Boolean | SanitizeOpts = null,
    staticDelimiters: ParseDelimiters = null,
    staticTripleDelimiters: ParseDelimiters = null,
    stripComments: js.UndefOr[Boolean] = js.undefined,
    syncComputedChildren: js.UndefOr[Boolean] = js.undefined,
    template: Template = null,
    transitions: Registry[Transition] = null,
    transitionsEnabled: js.UndefOr[Boolean] = js.undefined,
    tripleDelimiters: ParseDelimiters = null,
    twoway: js.UndefOr[Boolean] = js.undefined,
    warnAboutAmbiguity: js.UndefOr[Boolean] = js.undefined
  ): BaseInitOpts[T] = {
    val __obj = js.Dynamic.literal()
    if (adapt != null) __obj.updateDynamic("adapt")(adapt.asInstanceOf[js.Any])
    if (adaptors != null) __obj.updateDynamic("adaptors")(adaptors.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExpressions)) __obj.updateDynamic("allowExpressions")(allowExpressions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.get.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (computed != null) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (!js.isUndefined(contextLines)) __obj.updateDynamic("contextLines")(contextLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(csp)) __obj.updateDynamic("csp")(csp.get.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (!js.isUndefined(delegate)) __obj.updateDynamic("delegate")(delegate.get.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (helpers != null) __obj.updateDynamic("helpers")(helpers.asInstanceOf[js.Any])
    if (interpolators != null) __obj.updateDynamic("interpolators")(interpolators.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedTransitions)) __obj.updateDynamic("nestedTransitions")(nestedTransitions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noIntro)) __obj.updateDynamic("noIntro")(noIntro.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noOutro)) __obj.updateDynamic("noOutro")(noOutro.get.asInstanceOf[js.Any])
    if (observe != null) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (partials != null) __obj.updateDynamic("partials")(partials.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveInstanceMembers)) __obj.updateDynamic("resolveInstanceMembers")(resolveInstanceMembers.get.asInstanceOf[js.Any])
    if (sanitize != null) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (staticDelimiters != null) __obj.updateDynamic("staticDelimiters")(staticDelimiters.asInstanceOf[js.Any])
    if (staticTripleDelimiters != null) __obj.updateDynamic("staticTripleDelimiters")(staticTripleDelimiters.asInstanceOf[js.Any])
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(syncComputedChildren)) __obj.updateDynamic("syncComputedChildren")(syncComputedChildren.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionsEnabled)) __obj.updateDynamic("transitionsEnabled")(transitionsEnabled.get.asInstanceOf[js.Any])
    if (tripleDelimiters != null) __obj.updateDynamic("tripleDelimiters")(tripleDelimiters.asInstanceOf[js.Any])
    if (!js.isUndefined(twoway)) __obj.updateDynamic("twoway")(twoway.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warnAboutAmbiguity)) __obj.updateDynamic("warnAboutAmbiguity")(warnAboutAmbiguity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseInitOpts[T]]
  }
}

