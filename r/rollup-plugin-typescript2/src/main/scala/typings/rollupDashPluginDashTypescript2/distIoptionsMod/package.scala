package typings.rollupDashPluginDashTypescript2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distIoptionsMod {
  import typings.typescript.typescriptMod.CustomTransformers
  import typings.typescript.typescriptMod.LanguageService

  type TransformerFactoryCreator = js.Function1[/* ls */ LanguageService, CustomTransformers | ICustomTransformer]
}
