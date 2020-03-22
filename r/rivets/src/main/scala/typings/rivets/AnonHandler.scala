package typings.rivets

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler extends js.Object {
  // Augment the event handler of the on-* binder
  var handler: js.UndefOr[js.Function3[/* context */ js.Any, /* ev */ Event_, /* biding */ js.Any, Unit]] = js.undefined
  // Attribute prefix in templates
  var prefix: js.UndefOr[String] = js.undefined
  // Preload templates with initial data on bind
  var preloadData: js.UndefOr[Boolean] = js.undefined
  // Root sightglass interface for keypaths
  var rootInterface: js.UndefOr[String] = js.undefined
  // Template delimiters for text bindings
  var templateDelimiters: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonHandler {
  @scala.inline
  def apply(
    handler: (/* context */ js.Any, /* ev */ Event_, /* biding */ js.Any) => Unit = null,
    prefix: String = null,
    preloadData: js.UndefOr[Boolean] = js.undefined,
    rootInterface: String = null,
    templateDelimiters: js.Array[String] = null
  ): AnonHandler = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction3(handler))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadData)) __obj.updateDynamic("preloadData")(preloadData.asInstanceOf[js.Any])
    if (rootInterface != null) __obj.updateDynamic("rootInterface")(rootInterface.asInstanceOf[js.Any])
    if (templateDelimiters != null) __obj.updateDynamic("templateDelimiters")(templateDelimiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandler]
  }
}

