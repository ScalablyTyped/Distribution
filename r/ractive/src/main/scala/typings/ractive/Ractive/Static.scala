package typings.ractive.Ractive

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends Instantiable1[/* options */ NewOptions, typings.ractive.Ractive.Ractive] {
  // Since 0.7.1
  var DEBUG: Boolean = js.native
  // Undocumented method
  var Promise: typings.ractive.Ractive.Promise = js.native
  // TODO: undocumented
  var adaptors: AdaptorPlugins = js.native
  // TODO: undocumented
  var components: ComponentPlugins = js.native
  // TODO: undocumented
  var decorators: DecoratorPlugins = js.native
  var defaults: DefaultsOptions = js.native
  var easing: StringDictionary[js.Function1[/* x */ Double, Double]] = js.native
  // TODO: undocumented
  var events: EventPlugins = js.native
  // TODO: missing static properties documentation
  var partials: StringDictionary[js.Any] = js.native
  // TODO: missing static properties documentation
  var transitions: TransitionPlugins = js.native
  def extend(options: ExtendOptions): Static = js.native
  // Since 0.7.1
  def getNodeInfo(node: HTMLElement): NodeInfo = js.native
  def parse(template: String): js.Any = js.native
  def parse(template: String, options: ParseOptions): js.Any = js.native
}

