package typings.rivets

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Biding extends js.Object {
  // Augment the event handler of the on-* binder
  var handler: js.UndefOr[js.Function3[/* context */ js.Any, /* ev */ Event, /* biding */ js.Any, Unit]] = js.undefined
  // Attribute prefix in templates
  var prefix: js.UndefOr[String] = js.undefined
  // Preload templates with initial data on bind
  var preloadData: js.UndefOr[Boolean] = js.undefined
  // Root sightglass interface for keypaths
  var rootInterface: js.UndefOr[String] = js.undefined
  // Template delimiters for text bindings
  var templateDelimiters: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Biding {
  @scala.inline
  def apply(
    handler: (/* context */ js.Any, /* ev */ Event, /* biding */ js.Any) => Unit = null,
    prefix: String = null,
    preloadData: js.UndefOr[Boolean] = js.undefined,
    rootInterface: String = null,
    templateDelimiters: js.Array[String] = null
  ): Anon_Biding = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction3(handler))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(preloadData)) __obj.updateDynamic("preloadData")(preloadData)
    if (rootInterface != null) __obj.updateDynamic("rootInterface")(rootInterface)
    if (templateDelimiters != null) __obj.updateDynamic("templateDelimiters")(templateDelimiters)
    __obj.asInstanceOf[Anon_Biding]
  }
}

