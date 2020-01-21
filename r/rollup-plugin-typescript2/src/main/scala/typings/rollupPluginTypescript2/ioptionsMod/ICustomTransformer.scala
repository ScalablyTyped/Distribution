package typings.rollupPluginTypescript2.ioptionsMod

import typings.typescript.mod.Bundle
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformationContext
import typings.typescript.mod.Transformer
import typings.typescript.mod.TransformerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomTransformer extends js.Object {
  var after: js.UndefOr[TransformerFactory[SourceFile]] = js.undefined
  var afterDeclarations: js.UndefOr[TransformerFactory[Bundle | SourceFile]] = js.undefined
  var before: js.UndefOr[TransformerFactory[SourceFile]] = js.undefined
}

object ICustomTransformer {
  @scala.inline
  def apply(
    after: /* context */ TransformationContext => Transformer[SourceFile] = null,
    afterDeclarations: /* context */ TransformationContext => Transformer[Bundle | SourceFile] = null,
    before: /* context */ TransformationContext => Transformer[SourceFile] = null
  ): ICustomTransformer = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (afterDeclarations != null) __obj.updateDynamic("afterDeclarations")(js.Any.fromFunction1(afterDeclarations))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    __obj.asInstanceOf[ICustomTransformer]
  }
}

