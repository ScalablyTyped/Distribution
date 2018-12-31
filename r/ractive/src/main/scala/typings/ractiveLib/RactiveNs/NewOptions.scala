package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewOptions extends js.Object {
  /*
  	     * @type List of mixed string or Adaptor
  	     */
  var adapt: js.UndefOr[js.Array[java.lang.String | AdaptorPlugin]] = js.undefined
  var adaptors: js.UndefOr[AdaptorPlugins] = js.undefined
  /**
  	     * Default false
  	     * @type boolean or any type that option `el` accepts (HTMLElement or String or jQuery-like collection)
  	     */
  var append: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  var complete: js.UndefOr[js.Function] = js.undefined
  var components: js.UndefOr[ComponentPlugins] = js.undefined
  var computed: js.UndefOr[js.Object] = js.undefined
  // Since 0.5.5
  // TODO: unclear in documantation, should this be in ExtendOptions instead?
  var css: js.UndefOr[java.lang.String] = js.undefined
  /**
  	     * @type Object or Function
  	     */
  // TODO: undocumented type Function
  var data: js.UndefOr[js.Object | js.Function] = js.undefined
  var decorators: js.UndefOr[DecoratorPlugins] = js.undefined
  /**
  	     * @type [open, close]
  	     */
  var delimiters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // TODO: unsure
  var easing: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
  	     * @type HTMLElement or String or jQuery-like collection
  	     */
  var el: js.UndefOr[java.lang.String | stdLib.HTMLElement | js.Any] = js.undefined
  // TODO: undocumented in Initialisation options page
  var events: js.UndefOr[EventPlugins] = js.undefined
  // Since 0.5.5
  // TODO: unclear in documantation
  var interpolators: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  // Default false
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  // Default false
  var magic: js.UndefOr[scala.Boolean] = js.undefined
  // Default true
  var modifyArrays: js.UndefOr[scala.Boolean] = js.undefined
  // Since 0.5.5
  // TODO: unclear in documentation
  // Default false
  var noCSSTransform: js.UndefOr[scala.Boolean] = js.undefined
  // Default false
  var noIntro: js.UndefOr[scala.Boolean] = js.undefined
  // Since 0.6.0
  // TODO: undocumented arguments
  var onchange: js.UndefOr[js.Function1[/* options */ NewOptions, scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var oncomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onconfig: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onconstruct: js.UndefOr[js.Function1[/* options */ NewOptions, scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var ondetach: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var oninit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var oninsert: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onrender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onteardown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onunrender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  // Since 0.6.0
  // TODO: undocumented arguments
  var onupdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // TODO: void?
  /**
  	     * any is same type as template
  	     */
  var partials: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  // Default false
  var preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	     * Default false
  	     */
  var sanitize: js.UndefOr[scala.Boolean | SanitizeOptions] = js.undefined
  /**
  	     * Default ['[[', ']]']
  	     * @type [open, close]
  	     */
  var staticDelimiters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	     * Default ['[[[', ']]]']
  	     * @type [open, close]
  	     */
  var staticTripleDelimiters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Since 0.5.5
  // Default true
  var stripComments: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	     * @type String or (if preparsing "Ractive.parse") Array or Object
  	     */
  var template: js.UndefOr[js.Any] = js.undefined
  var transitions: js.UndefOr[TransitionPlugins] = js.undefined
  // Since 0.7.1
  // Default true
  var transitionsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	     * @type [open, close]
  	     */
  var tripleDelimiters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Default true
  var twoway: js.UndefOr[scala.Boolean] = js.undefined
}

