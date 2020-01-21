package typings.slate.mod

import typings.immutable.Immutable.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableOptions extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var downward: js.UndefOr[Boolean] = js.undefined
  var includeBlocks: js.UndefOr[Boolean] = js.undefined
  var includeDocument: js.UndefOr[Boolean] = js.undefined
  var includeInlines: js.UndefOr[Boolean] = js.undefined
  var includeRoot: js.UndefOr[Boolean] = js.undefined
  var includeTarget: js.UndefOr[Boolean] = js.undefined
  var includeTargetAncestors: js.UndefOr[Boolean] = js.undefined
  var includeTexts: js.UndefOr[Boolean] = js.undefined
  var `match`: js.UndefOr[js.Function2[/* node */ Node, /* path */ List[Double], Boolean | Null]] = js.undefined
  var path: js.UndefOr[Path] = js.undefined
  var range: js.UndefOr[RangeProperties | RangeJSON | Range] = js.undefined
  var upward: js.UndefOr[Boolean] = js.undefined
}

object IterableOptions {
  @scala.inline
  def apply(
    direction: String = null,
    downward: js.UndefOr[Boolean] = js.undefined,
    includeBlocks: js.UndefOr[Boolean] = js.undefined,
    includeDocument: js.UndefOr[Boolean] = js.undefined,
    includeInlines: js.UndefOr[Boolean] = js.undefined,
    includeRoot: js.UndefOr[Boolean] = js.undefined,
    includeTarget: js.UndefOr[Boolean] = js.undefined,
    includeTargetAncestors: js.UndefOr[Boolean] = js.undefined,
    includeTexts: js.UndefOr[Boolean] = js.undefined,
    `match`: (/* node */ Node, /* path */ List[Double]) => Boolean | Null = null,
    path: Path = null,
    range: RangeProperties | RangeJSON | Range = null,
    upward: js.UndefOr[Boolean] = js.undefined
  ): IterableOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(downward)) __obj.updateDynamic("downward")(downward.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBlocks)) __obj.updateDynamic("includeBlocks")(includeBlocks.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDocument)) __obj.updateDynamic("includeDocument")(includeDocument.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInlines)) __obj.updateDynamic("includeInlines")(includeInlines.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRoot)) __obj.updateDynamic("includeRoot")(includeRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTarget)) __obj.updateDynamic("includeTarget")(includeTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTargetAncestors)) __obj.updateDynamic("includeTargetAncestors")(includeTargetAncestors.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTexts)) __obj.updateDynamic("includeTexts")(includeTexts.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(upward)) __obj.updateDynamic("upward")(upward.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableOptions]
  }
}

