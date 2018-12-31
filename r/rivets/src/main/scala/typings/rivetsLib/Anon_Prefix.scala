package typings
package rivetsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prefix extends js.Object {
  // Augment the event handler of the on-* binder
  var handler: js.UndefOr[
    js.Function3[/* context */ js.Any, /* ev */ stdLib.Event, /* biding */ js.Any, scala.Unit]
  ] = js.undefined
  // Attribute prefix in templates
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  // Preload templates with initial data on bind
  var preloadData: js.UndefOr[scala.Boolean] = js.undefined
  // Root sightglass interface for keypaths
  var rootInterface: js.UndefOr[java.lang.String] = js.undefined
  // Template delimiters for text bindings
  var templateDelimiters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

