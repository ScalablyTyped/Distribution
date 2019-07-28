package typings.reactDashResponsive.reactDashResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryTypes extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var aural: js.UndefOr[Boolean] = js.undefined
  var braille: js.UndefOr[Boolean] = js.undefined
  var embossed: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[Boolean] = js.undefined
  var handheld: js.UndefOr[Boolean] = js.undefined
  var print: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[Boolean] = js.undefined
  var screen: js.UndefOr[Boolean] = js.undefined
  var tty: js.UndefOr[Boolean] = js.undefined
  var tv: js.UndefOr[Boolean] = js.undefined
}

object MediaQueryTypes {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    aural: js.UndefOr[Boolean] = js.undefined,
    braille: js.UndefOr[Boolean] = js.undefined,
    embossed: js.UndefOr[Boolean] = js.undefined,
    grid: js.UndefOr[Boolean] = js.undefined,
    handheld: js.UndefOr[Boolean] = js.undefined,
    print: js.UndefOr[Boolean] = js.undefined,
    projection: js.UndefOr[Boolean] = js.undefined,
    screen: js.UndefOr[Boolean] = js.undefined,
    tty: js.UndefOr[Boolean] = js.undefined,
    tv: js.UndefOr[Boolean] = js.undefined
  ): MediaQueryTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(aural)) __obj.updateDynamic("aural")(aural)
    if (!js.isUndefined(braille)) __obj.updateDynamic("braille")(braille)
    if (!js.isUndefined(embossed)) __obj.updateDynamic("embossed")(embossed)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (!js.isUndefined(handheld)) __obj.updateDynamic("handheld")(handheld)
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    if (!js.isUndefined(projection)) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(screen)) __obj.updateDynamic("screen")(screen)
    if (!js.isUndefined(tty)) __obj.updateDynamic("tty")(tty)
    if (!js.isUndefined(tv)) __obj.updateDynamic("tv")(tv)
    __obj.asInstanceOf[MediaQueryTypes]
  }
}

