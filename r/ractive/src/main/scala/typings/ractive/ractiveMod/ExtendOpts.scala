package typings.ractive.ractiveMod

import org.scalablytyped.runtime.StringDictionary
import typings.ractive.Anon_Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendOpts[T /* <: Ractive[T] */] extends BaseInitOpts[T] {
  /** A list of attributes to be reserved by a component. Any additional attributes are collected into the extra-attributes partial. */
  var attributes: js.UndefOr[js.Array[String] | Anon_Optional] = js.undefined
  /** The css to add to the page when the first instance of this component is rendered. */
  var css: js.UndefOr[String | CssFn] = js.undefined
  /** Default data to be supplied to any css functions. */
  var cssData: js.UndefOr[ValueMap] = js.undefined
  /** The id to use when transforming css to be scoped. Defaults to a random guid. */
  var cssId: js.UndefOr[String] = js.undefined
  /** A function supplying the default data for instances of this component. */
  var data: js.UndefOr[DataFn[T]] = js.undefined
  /** Whether or not data and plugins can be pulled from parent instances. Defaults to false. */
  var isolated: js.UndefOr[Boolean] = js.undefined
  /** If true, css selectors will not be scoped using the cssId of this component. */
  var noCssTransform: js.UndefOr[Boolean] = js.undefined
  /** An array of plugins to apply to the component. */
  var use: js.UndefOr[js.Array[PluginExtend]] = js.undefined
}

object ExtendOpts {
  @scala.inline
  def apply[T /* <: Ractive[T] */](
    adapt: js.Array[Adaptor | String] = null,
    adaptors: Registry[Adaptor] = null,
    allowExpressions: js.UndefOr[Boolean] = js.undefined,
    append: js.UndefOr[Boolean] = js.undefined,
    attributes: js.Array[String] | Anon_Optional = null,
    components: Registry[Component] = null,
    computed: StringDictionary[Computation[T]] = null,
    contextLines: Int | Double = null,
    csp: js.UndefOr[Boolean] = js.undefined,
    css: String | CssFn = null,
    cssData: ValueMap = null,
    cssId: String = null,
    data: DataFn[T] = null,
    decorators: Registry[Decorator[T]] = null,
    delegate: js.UndefOr[Boolean] = js.undefined,
    delimiters: ParseDelimiters = null,
    easing: Registry[Easing] = null,
    events: Registry[EventPlugin[T]] = null,
    helpers: Registry[Helper] = null,
    interpolators: Registry[Interpolator] = null,
    isolated: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    nestedTransitions: js.UndefOr[Boolean] = js.undefined,
    noCssTransform: js.UndefOr[Boolean] = js.undefined,
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
    use: js.Array[PluginExtend] = null,
    warnAboutAmbiguity: js.UndefOr[Boolean] = js.undefined
  ): ExtendOpts[T] = {
    val __obj = js.Dynamic.literal()
    if (adapt != null) __obj.updateDynamic("adapt")(adapt)
    if (adaptors != null) __obj.updateDynamic("adaptors")(adaptors)
    if (!js.isUndefined(allowExpressions)) __obj.updateDynamic("allowExpressions")(allowExpressions)
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components)
    if (computed != null) __obj.updateDynamic("computed")(computed)
    if (contextLines != null) __obj.updateDynamic("contextLines")(contextLines.asInstanceOf[js.Any])
    if (!js.isUndefined(csp)) __obj.updateDynamic("csp")(csp)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (cssData != null) __obj.updateDynamic("cssData")(cssData)
    if (cssId != null) __obj.updateDynamic("cssId")(cssId)
    if (data != null) __obj.updateDynamic("data")(data)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(delegate)) __obj.updateDynamic("delegate")(delegate)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (events != null) __obj.updateDynamic("events")(events)
    if (helpers != null) __obj.updateDynamic("helpers")(helpers)
    if (interpolators != null) __obj.updateDynamic("interpolators")(interpolators)
    if (!js.isUndefined(isolated)) __obj.updateDynamic("isolated")(isolated)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(nestedTransitions)) __obj.updateDynamic("nestedTransitions")(nestedTransitions)
    if (!js.isUndefined(noCssTransform)) __obj.updateDynamic("noCssTransform")(noCssTransform)
    if (!js.isUndefined(noIntro)) __obj.updateDynamic("noIntro")(noIntro)
    if (!js.isUndefined(noOutro)) __obj.updateDynamic("noOutro")(noOutro)
    if (observe != null) __obj.updateDynamic("observe")(observe)
    if (on != null) __obj.updateDynamic("on")(on)
    if (partials != null) __obj.updateDynamic("partials")(partials)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (!js.isUndefined(resolveInstanceMembers)) __obj.updateDynamic("resolveInstanceMembers")(resolveInstanceMembers)
    if (sanitize != null) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (staticDelimiters != null) __obj.updateDynamic("staticDelimiters")(staticDelimiters)
    if (staticTripleDelimiters != null) __obj.updateDynamic("staticTripleDelimiters")(staticTripleDelimiters)
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments)
    if (!js.isUndefined(syncComputedChildren)) __obj.updateDynamic("syncComputedChildren")(syncComputedChildren)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions)
    if (!js.isUndefined(transitionsEnabled)) __obj.updateDynamic("transitionsEnabled")(transitionsEnabled)
    if (tripleDelimiters != null) __obj.updateDynamic("tripleDelimiters")(tripleDelimiters)
    if (!js.isUndefined(twoway)) __obj.updateDynamic("twoway")(twoway)
    if (use != null) __obj.updateDynamic("use")(use)
    if (!js.isUndefined(warnAboutAmbiguity)) __obj.updateDynamic("warnAboutAmbiguity")(warnAboutAmbiguity)
    __obj.asInstanceOf[ExtendOpts[T]]
  }
}

