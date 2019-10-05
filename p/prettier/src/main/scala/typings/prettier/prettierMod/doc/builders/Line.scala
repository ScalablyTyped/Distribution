package typings.prettier.prettierMod.doc.builders

import org.scalablytyped.runtime.TopLevel
import typings.prettier.prettierStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends _Doc {
  var hard: js.UndefOr[Boolean] = js.undefined
  var literal: js.UndefOr[Boolean] = js.undefined
  var soft: js.UndefOr[Boolean] = js.undefined
  var `type`: line
}

object Line {
  @scala.inline
  def apply(
    `type`: line,
    hard: js.UndefOr[Boolean] = js.undefined,
    literal: js.UndefOr[Boolean] = js.undefined,
    soft: js.UndefOr[Boolean] = js.undefined
  ): Line = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(hard)) __obj.updateDynamic("hard")(hard)
    if (!js.isUndefined(literal)) __obj.updateDynamic("literal")(literal)
    if (!js.isUndefined(soft)) __obj.updateDynamic("soft")(soft)
    __obj.asInstanceOf[Line]
  }
}

@JSImport("prettier", "doc.builders.line")
@js.native
object line extends TopLevel[Line]

