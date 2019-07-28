package typings.reactDashRte.reactDashRteMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportOptions extends js.Object {
  var blockRenderers: js.UndefOr[StringDictionary[BlockRenderer]] = js.undefined
  var blockStyleFn: js.UndefOr[BlockStyleFn] = js.undefined
  var entityStyleFn: js.UndefOr[EntityStyleFn] = js.undefined
  var inlineStyles: js.UndefOr[StringDictionary[RenderConfig]] = js.undefined
}

object ExportOptions {
  @scala.inline
  def apply(
    blockRenderers: StringDictionary[BlockRenderer] = null,
    blockStyleFn: BlockStyleFn = null,
    entityStyleFn: EntityStyleFn = null,
    inlineStyles: StringDictionary[RenderConfig] = null
  ): ExportOptions = {
    val __obj = js.Dynamic.literal()
    if (blockRenderers != null) __obj.updateDynamic("blockRenderers")(blockRenderers)
    if (blockStyleFn != null) __obj.updateDynamic("blockStyleFn")(blockStyleFn)
    if (entityStyleFn != null) __obj.updateDynamic("entityStyleFn")(entityStyleFn)
    if (inlineStyles != null) __obj.updateDynamic("inlineStyles")(inlineStyles)
    __obj.asInstanceOf[ExportOptions]
  }
}

