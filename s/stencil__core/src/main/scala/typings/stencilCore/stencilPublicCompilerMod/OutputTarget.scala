package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilPublicDocsMod.JsonDocs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetAngular
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetCopy
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetCustom
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDist
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCollection
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCustomElements
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCustomElementsBundle
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazy
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistGlobalStyles
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazyLoader
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsJson
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsCustom
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsReadme
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsVscode
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetWww
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetHydrate
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetStats
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistTypes
*/
trait OutputTarget extends StObject
object OutputTarget {
  
  inline def OutputTargetAngular(componentCorePackage: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetAngular = {
    val __obj = js.Dynamic.literal(componentCorePackage = componentCorePackage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("angular")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetAngular]
  }
  
  inline def OutputTargetCopy(dir: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetCopy = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("copy")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetCopy]
  }
  
  inline def OutputTargetCustom(generator: (Config, Any, Any, Any) => js.Promise[Unit], name: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetCustom = {
    val __obj = js.Dynamic.literal(generator = js.Any.fromFunction4(generator), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetCustom]
  }
  
  inline def OutputTargetDist(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDist = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDist]
  }
  
  inline def OutputTargetDistCollection(collectionDir: String, dir: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCollection = {
    val __obj = js.Dynamic.literal(collectionDir = collectionDir.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-collection")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCollection]
  }
  
  inline def OutputTargetDistCustomElements(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCustomElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist-custom-elements")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCustomElements]
  }
  
  inline def OutputTargetDistCustomElementsBundle(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCustomElementsBundle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist-custom-elements-bundle")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCustomElementsBundle]
  }
  
  inline def OutputTargetDistGlobalStyles(file: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistGlobalStyles = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-global-styles")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistGlobalStyles]
  }
  
  inline def OutputTargetDistLazy(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist-lazy")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazy]
  }
  
  inline def OutputTargetDistLazyLoader(cjsDir: String, componentDts: String, dir: String, empty: Boolean, esmDir: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazyLoader = {
    val __obj = js.Dynamic.literal(cjsDir = cjsDir.asInstanceOf[js.Any], componentDts = componentDts.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], esmDir = esmDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-lazy-loader")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazyLoader]
  }
  
  inline def OutputTargetDistTypes(dir: String, typesDir: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistTypes = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], typesDir = typesDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-types")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistTypes]
  }
  
  inline def OutputTargetDocsCustom(generator: (JsonDocs, Config) => Unit | js.Promise[Unit]): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsCustom = {
    val __obj = js.Dynamic.literal(generator = js.Any.fromFunction2(generator))
    __obj.updateDynamic("type")("docs-custom")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsCustom]
  }
  
  inline def OutputTargetDocsJson(file: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsJson = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("docs-json")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsJson]
  }
  
  inline def OutputTargetDocsReadme(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsReadme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("docs-readme")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsReadme]
  }
  
  inline def OutputTargetDocsVscode(file: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsVscode = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("docs-vscode")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDocsVscode]
  }
  
  inline def OutputTargetHydrate(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetHydrate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist-hydrate-script")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetHydrate]
  }
  
  inline def OutputTargetStats(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stats")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetStats]
  }
  
  inline def OutputTargetWww(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetWww = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("www")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetWww]
  }
}
