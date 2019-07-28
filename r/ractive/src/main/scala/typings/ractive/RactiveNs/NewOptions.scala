package typings.ractive.RactiveNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewOptions extends js.Object {
  /*
  	     * @type List of mixed string or Adaptor
  	     */
  var adapt: js.UndefOr[js.Array[String | AdaptorPlugin]] = js.undefined
  var adaptors: js.UndefOr[AdaptorPlugins] = js.undefined
  /**
  	     * Default false
  	     * @type boolean or any type that option `el` accepts (HTMLElement or String or jQuery-like collection)
  	     */
  var append: js.UndefOr[Boolean | js.Any] = js.undefined
  var complete: js.UndefOr[js.Function] = js.undefined
  var components: js.UndefOr[ComponentPlugins] = js.undefined
  var computed: js.UndefOr[js.Object] = js.undefined
  // Since 0.5.5
  // TODO: unclear in documantation, should this be in ExtendOptions instead?
  var css: js.UndefOr[String] = js.undefined
  /**
  	     * @type Object or Function
  	     */
  // TODO: undocumented type Function
  var data: js.UndefOr[js.Object | js.Function] = js.undefined
  var decorators: js.UndefOr[DecoratorPlugins] = js.undefined
  /**
  	     * @type [open, close]
  	     */
  var delimiters: js.UndefOr[js.Array[String]] = js.undefined
  // TODO: unsure
  var easing: js.UndefOr[String | js.Function] = js.undefined
  /**
  	     * @type HTMLElement or String or jQuery-like collection
  	     */
  var el: js.UndefOr[String | HTMLElement | js.Any] = js.undefined
  // TODO: undocumented in Initialisation options page
  var events: js.UndefOr[EventPlugins] = js.undefined
  // Since 0.5.5
  // TODO: unclear in documantation
  var interpolators: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  // Default false
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  // Default false
  var magic: js.UndefOr[Boolean] = js.undefined
  // Default true
  var modifyArrays: js.UndefOr[Boolean] = js.undefined
  // Since 0.5.5
  // TODO: unclear in documentation
  // Default false
  var noCSSTransform: js.UndefOr[Boolean] = js.undefined
  // Default false
  var noIntro: js.UndefOr[Boolean] = js.undefined
  // Since 0.6.0
  // TODO: undocumented arguments
  var onchange: js.UndefOr[js.Function1[/* options */ NewOptions, Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var oncomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onconfig: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onconstruct: js.UndefOr[js.Function1[/* options */ NewOptions, Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var ondetach: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var oninit: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var oninsert: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onrender: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onteardown: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onunrender: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onupdate: js.UndefOr[js.Function0[Unit]] = js.undefined
   // TODO: void?
  /**
  	     * any is same type as template
  	     */
  var partials: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  // Default false
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
  	     * Default false
  	     */
  var sanitize: js.UndefOr[Boolean | SanitizeOptions] = js.undefined
  /**
  	     * Default ['[[', ']]']
  	     * @type [open, close]
  	     */
  var staticDelimiters: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	     * Default ['[[[', ']]]']
  	     * @type [open, close]
  	     */
  var staticTripleDelimiters: js.UndefOr[js.Array[String]] = js.undefined
  // Since 0.5.5
  // Default true
  var stripComments: js.UndefOr[Boolean] = js.undefined
  /**
  	     * @type String or (if preparsing "Ractive.parse") Array or Object
  	     */
  var template: js.UndefOr[js.Any] = js.undefined
  var transitions: js.UndefOr[TransitionPlugins] = js.undefined
  // Since 0.7.1
  // Default true
  var transitionsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	     * @type [open, close]
  	     */
  var tripleDelimiters: js.UndefOr[js.Array[String]] = js.undefined
  // Default true
  var twoway: js.UndefOr[Boolean] = js.undefined
}

object NewOptions {
  @scala.inline
  def apply(
    adapt: js.Array[String | AdaptorPlugin] = null,
    adaptors: AdaptorPlugins = null,
    append: Boolean | js.Any = null,
    complete: js.Function = null,
    components: ComponentPlugins = null,
    computed: js.Object = null,
    css: String = null,
    data: js.Object | js.Function = null,
    decorators: DecoratorPlugins = null,
    delimiters: js.Array[String] = null,
    easing: String | js.Function = null,
    el: String | HTMLElement | js.Any = null,
    events: EventPlugins = null,
    interpolators: StringDictionary[js.Any] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    magic: js.UndefOr[Boolean] = js.undefined,
    modifyArrays: js.UndefOr[Boolean] = js.undefined,
    noCSSTransform: js.UndefOr[Boolean] = js.undefined,
    noIntro: js.UndefOr[Boolean] = js.undefined,
    onchange: /* options */ NewOptions => Unit = null,
    oncomplete: () => Unit = null,
    onconfig: () => Unit = null,
    onconstruct: /* options */ NewOptions => Unit = null,
    ondetach: () => Unit = null,
    oninit: () => Unit = null,
    oninsert: () => Unit = null,
    onrender: () => Unit = null,
    onteardown: () => Unit = null,
    onunrender: () => Unit = null,
    onupdate: () => Unit = null,
    partials: StringDictionary[js.Any] = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    sanitize: Boolean | SanitizeOptions = null,
    staticDelimiters: js.Array[String] = null,
    staticTripleDelimiters: js.Array[String] = null,
    stripComments: js.UndefOr[Boolean] = js.undefined,
    template: js.Any = null,
    transitions: TransitionPlugins = null,
    transitionsEnabled: js.UndefOr[Boolean] = js.undefined,
    tripleDelimiters: js.Array[String] = null,
    twoway: js.UndefOr[Boolean] = js.undefined
  ): NewOptions = {
    val __obj = js.Dynamic.literal()
    if (adapt != null) __obj.updateDynamic("adapt")(adapt)
    if (adaptors != null) __obj.updateDynamic("adaptors")(adaptors)
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (components != null) __obj.updateDynamic("components")(components)
    if (computed != null) __obj.updateDynamic("computed")(computed)
    if (css != null) __obj.updateDynamic("css")(css)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (interpolators != null) __obj.updateDynamic("interpolators")(interpolators)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(magic)) __obj.updateDynamic("magic")(magic)
    if (!js.isUndefined(modifyArrays)) __obj.updateDynamic("modifyArrays")(modifyArrays)
    if (!js.isUndefined(noCSSTransform)) __obj.updateDynamic("noCSSTransform")(noCSSTransform)
    if (!js.isUndefined(noIntro)) __obj.updateDynamic("noIntro")(noIntro)
    if (onchange != null) __obj.updateDynamic("onchange")(js.Any.fromFunction1(onchange))
    if (oncomplete != null) __obj.updateDynamic("oncomplete")(js.Any.fromFunction0(oncomplete))
    if (onconfig != null) __obj.updateDynamic("onconfig")(js.Any.fromFunction0(onconfig))
    if (onconstruct != null) __obj.updateDynamic("onconstruct")(js.Any.fromFunction1(onconstruct))
    if (ondetach != null) __obj.updateDynamic("ondetach")(js.Any.fromFunction0(ondetach))
    if (oninit != null) __obj.updateDynamic("oninit")(js.Any.fromFunction0(oninit))
    if (oninsert != null) __obj.updateDynamic("oninsert")(js.Any.fromFunction0(oninsert))
    if (onrender != null) __obj.updateDynamic("onrender")(js.Any.fromFunction0(onrender))
    if (onteardown != null) __obj.updateDynamic("onteardown")(js.Any.fromFunction0(onteardown))
    if (onunrender != null) __obj.updateDynamic("onunrender")(js.Any.fromFunction0(onunrender))
    if (onupdate != null) __obj.updateDynamic("onupdate")(js.Any.fromFunction0(onupdate))
    if (partials != null) __obj.updateDynamic("partials")(partials)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (sanitize != null) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (staticDelimiters != null) __obj.updateDynamic("staticDelimiters")(staticDelimiters)
    if (staticTripleDelimiters != null) __obj.updateDynamic("staticTripleDelimiters")(staticTripleDelimiters)
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments)
    if (template != null) __obj.updateDynamic("template")(template)
    if (transitions != null) __obj.updateDynamic("transitions")(transitions)
    if (!js.isUndefined(transitionsEnabled)) __obj.updateDynamic("transitionsEnabled")(transitionsEnabled)
    if (tripleDelimiters != null) __obj.updateDynamic("tripleDelimiters")(tripleDelimiters)
    if (!js.isUndefined(twoway)) __obj.updateDynamic("twoway")(twoway)
    __obj.asInstanceOf[NewOptions]
  }
}

