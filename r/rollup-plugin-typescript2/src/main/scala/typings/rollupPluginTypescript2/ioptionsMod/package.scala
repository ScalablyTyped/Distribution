package typings.rollupPluginTypescript2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ioptionsMod {
  
  type TransformerFactoryCreator = js.Function1[
    /* ls */ typings.typescript.mod.LanguageService, 
    typings.typescript.mod.CustomTransformers | typings.rollupPluginTypescript2.ioptionsMod.ICustomTransformer
  ]
}
