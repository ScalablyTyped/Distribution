package typings
package rivetsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Biding extends js.Object {
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

object Anon_Biding {
  @scala.inline
  def apply(
    handler: js.Function3[/* context */ js.Any, /* ev */ stdLib.Event, /* biding */ js.Any, scala.Unit] = null,
    prefix: java.lang.String = null,
    preloadData: js.UndefOr[scala.Boolean] = js.undefined,
    rootInterface: java.lang.String = null,
    templateDelimiters: js.Array[java.lang.String] = null
  ): Anon_Biding = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(preloadData)) __obj.updateDynamic("preloadData")(preloadData)
    if (rootInterface != null) __obj.updateDynamic("rootInterface")(rootInterface)
    if (templateDelimiters != null) __obj.updateDynamic("templateDelimiters")(templateDelimiters)
    __obj.asInstanceOf[Anon_Biding]
  }
}

