package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ractive.ractiveBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOpts[T /* <: Ractive[T] */] extends BaseInitOpts[T] {
  /** If true, this instance can occupy the target element with other existing instances rather than cause them to unrender. Cannot be used with enhance. */
  @JSName("append")
  var append_InitOpts: js.UndefOr[`true`] = js.undefined
  /** Initiial data for this instance. */
  var data: js.UndefOr[Data | DataFn[T]] = js.undefined
  /** The target element into which to render this instance. */
  var el: js.UndefOr[Target] = js.undefined
  /** If true, this instance will try to reuse DOM nodes found in its target rather than discarding and replacing them. Cannot be used with append. */
  var enhance: js.UndefOr[`true`] = js.undefined
  /** The target element into which to render this instance. */
  var target: js.UndefOr[Target] = js.undefined
  /** An array of plugins to apply to the instance. */
  var use: js.UndefOr[js.Array[PluginInstance]] = js.undefined
}

object InitOpts {
  @scala.inline
  def apply[/* <: typings.ractive.mod.Ractive[T] */ T](
    adapt: js.Array[Adaptor | String] = null,
    adaptors: Registry[Adaptor] = null,
    allowExpressions: js.UndefOr[Boolean] = js.undefined,
    append: `true` = null,
    components: Registry[Component] = null,
    computed: StringDictionary[Computation[T]] = null,
    contextLines: js.UndefOr[Double] = js.undefined,
    csp: js.UndefOr[Boolean] = js.undefined,
    data: Data | DataFn[T] = null,
    decorators: Registry[Decorator[T]] = null,
    delegate: js.UndefOr[Boolean] = js.undefined,
    delimiters: ParseDelimiters = null,
    easing: Registry[Easing] = null,
    el: Target = null,
    enhance: `true` = null,
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
    target: Target = null,
    template: Template = null,
    transitions: Registry[Transition] = null,
    transitionsEnabled: js.UndefOr[Boolean] = js.undefined,
    tripleDelimiters: ParseDelimiters = null,
    twoway: js.UndefOr[Boolean] = js.undefined,
    use: js.Array[PluginInstance] = null,
    warnAboutAmbiguity: js.UndefOr[Boolean] = js.undefined
  ): InitOpts[T] = {
    val __obj = js.Dynamic.literal()
    if (adapt != null) __obj.updateDynamic("adapt")(adapt.asInstanceOf[js.Any])
    if (adaptors != null) __obj.updateDynamic("adaptors")(adaptors.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExpressions)) __obj.updateDynamic("allowExpressions")(allowExpressions.get.asInstanceOf[js.Any])
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (computed != null) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (!js.isUndefined(contextLines)) __obj.updateDynamic("contextLines")(contextLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(csp)) __obj.updateDynamic("csp")(csp.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (!js.isUndefined(delegate)) __obj.updateDynamic("delegate")(delegate.get.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (enhance != null) __obj.updateDynamic("enhance")(enhance.asInstanceOf[js.Any])
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
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionsEnabled)) __obj.updateDynamic("transitionsEnabled")(transitionsEnabled.get.asInstanceOf[js.Any])
    if (tripleDelimiters != null) __obj.updateDynamic("tripleDelimiters")(tripleDelimiters.asInstanceOf[js.Any])
    if (!js.isUndefined(twoway)) __obj.updateDynamic("twoway")(twoway.get.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (!js.isUndefined(warnAboutAmbiguity)) __obj.updateDynamic("warnAboutAmbiguity")(warnAboutAmbiguity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOpts[T]]
  }
}

