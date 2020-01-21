package typings.reactRte.mod

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
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
    blockStyleFn: /* block */ ContentBlock => RenderConfig = null,
    entityStyleFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any => RenderConfig = null,
    inlineStyles: StringDictionary[RenderConfig] = null
  ): ExportOptions = {
    val __obj = js.Dynamic.literal()
    if (blockRenderers != null) __obj.updateDynamic("blockRenderers")(blockRenderers.asInstanceOf[js.Any])
    if (blockStyleFn != null) __obj.updateDynamic("blockStyleFn")(js.Any.fromFunction1(blockStyleFn))
    if (entityStyleFn != null) __obj.updateDynamic("entityStyleFn")(js.Any.fromFunction1(entityStyleFn))
    if (inlineStyles != null) __obj.updateDynamic("inlineStyles")(inlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportOptions]
  }
}

