package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends ScalablyTyped.runtime.Instantiable1[/* options */ NewOptions, Ractive] {
  // Since 0.7.1
  var DEBUG: scala.Boolean = js.native
  // Undocumented method
  var Promise: Promise = js.native
  // TODO: undocumented
  var adaptors: AdaptorPlugins = js.native
  // TODO: undocumented
  var components: ComponentPlugins = js.native
  // TODO: undocumented
  var decorators: DecoratorPlugins = js.native
  var defaults: DefaultsOptions = js.native
  var easing: ScalablyTyped.runtime.StringDictionary[js.Function1[/* x */ scala.Double, scala.Double]] = js.native
  // TODO: undocumented
  var events: EventPlugins = js.native
  // TODO: missing static properties documentation
  var partials: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  // TODO: missing static properties documentation
  var transitions: TransitionPlugins = js.native
  def extend(options: ExtendOptions): Static = js.native
  // Since 0.7.1
  def getNodeInfo(node: stdLib.HTMLElement): NodeInfo = js.native
  def parse(template: java.lang.String): js.Any = js.native
  def parse(template: java.lang.String, options: ParseOptions): js.Any = js.native
}

