package typings.slate.slateMod

import typings.immutable.immutableMod.List
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
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(downward)) __obj.updateDynamic("downward")(downward)
    if (!js.isUndefined(includeBlocks)) __obj.updateDynamic("includeBlocks")(includeBlocks)
    if (!js.isUndefined(includeDocument)) __obj.updateDynamic("includeDocument")(includeDocument)
    if (!js.isUndefined(includeInlines)) __obj.updateDynamic("includeInlines")(includeInlines)
    if (!js.isUndefined(includeRoot)) __obj.updateDynamic("includeRoot")(includeRoot)
    if (!js.isUndefined(includeTarget)) __obj.updateDynamic("includeTarget")(includeTarget)
    if (!js.isUndefined(includeTargetAncestors)) __obj.updateDynamic("includeTargetAncestors")(includeTargetAncestors)
    if (!js.isUndefined(includeTexts)) __obj.updateDynamic("includeTexts")(includeTexts)
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(upward)) __obj.updateDynamic("upward")(upward)
    __obj.asInstanceOf[IterableOptions]
  }
}

