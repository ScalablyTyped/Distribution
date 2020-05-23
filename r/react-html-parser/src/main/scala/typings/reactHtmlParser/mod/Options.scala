package typings.reactHtmlParser.mod

import typings.domhandler.mod.DomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var decodeEntities: js.UndefOr[Boolean] = js.undefined
  var preprocessNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[DomElement], _]] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    decodeEntities: js.UndefOr[Boolean] = js.undefined,
    preprocessNodes: /* nodes */ js.Array[DomElement] => _ = null,
    transform: Transform = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities.get.asInstanceOf[js.Any])
    if (preprocessNodes != null) __obj.updateDynamic("preprocessNodes")(js.Any.fromFunction1(preprocessNodes))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

