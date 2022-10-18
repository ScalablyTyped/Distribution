package typings.schematicsAngular

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityGenerateFromFilesMod {
  
  @JSImport("@schematics/angular/utility/generate-from-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateFromFiles(options: GenerateFromFilesOptions): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFromFiles")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  inline def generateFromFiles(
    options: GenerateFromFilesOptions,
    extraTemplateValues: Record[String, String | (js.Function1[/* v */ String, String])]
  ): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFromFiles")(options.asInstanceOf[js.Any], extraTemplateValues.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  trait GenerateFromFilesOptions extends StObject {
    
    var flat: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[String] = js.undefined
    
    var skipTests: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateFromFilesOptions {
    
    inline def apply(name: String): GenerateFromFilesOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateFromFilesOptions]
    }
    
    extension [Self <: GenerateFromFilesOptions](x: Self) {
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
      
      inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
    }
  }
}
