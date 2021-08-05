package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectSettingsMod {
  
  trait ProjectBackend extends StObject {
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ProjectBackend {
    
    inline def apply(): ProjectBackend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectBackend]
    }
    
    extension [Self <: ProjectBackend](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiPulumi.pulumiPulumiStrings.nodejs
    - typings.pulumiPulumi.pulumiPulumiStrings.go
    - typings.pulumiPulumi.pulumiPulumiStrings.python
    - typings.pulumiPulumi.pulumiPulumiStrings.dotnet
  */
  trait ProjectRuntime extends StObject
  object ProjectRuntime {
    
    inline def dotnet: typings.pulumiPulumi.pulumiPulumiStrings.dotnet = "dotnet".asInstanceOf[typings.pulumiPulumi.pulumiPulumiStrings.dotnet]
    
    inline def go: typings.pulumiPulumi.pulumiPulumiStrings.go = "go".asInstanceOf[typings.pulumiPulumi.pulumiPulumiStrings.go]
    
    inline def nodejs: typings.pulumiPulumi.pulumiPulumiStrings.nodejs = "nodejs".asInstanceOf[typings.pulumiPulumi.pulumiPulumiStrings.nodejs]
    
    inline def python: typings.pulumiPulumi.pulumiPulumiStrings.python = "python".asInstanceOf[typings.pulumiPulumi.pulumiPulumiStrings.python]
  }
  
  trait ProjectRuntimeInfo extends StObject {
    
    var name: String
    
    var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object ProjectRuntimeInfo {
    
    inline def apply(name: String): ProjectRuntimeInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectRuntimeInfo]
    }
    
    extension [Self <: ProjectRuntimeInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait ProjectSettings extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var backend: js.UndefOr[ProjectBackend] = js.undefined
    
    var config: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var license: js.UndefOr[String] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var runtime: ProjectRuntimeInfo | ProjectRuntime
    
    var template: js.UndefOr[ProjectTemplate] = js.undefined
    
    var website: js.UndefOr[String] = js.undefined
  }
  object ProjectSettings {
    
    inline def apply(name: String, runtime: ProjectRuntimeInfo | ProjectRuntime): ProjectSettings = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectSettings]
    }
    
    extension [Self <: ProjectSettings](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBackend(value: ProjectBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: ProjectRuntimeInfo | ProjectRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: ProjectTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  trait ProjectTemplate extends StObject {
    
    var config: js.UndefOr[StringDictionary[ProjectTemplateConfigValue]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var important: js.UndefOr[Boolean] = js.undefined
    
    var quickstart: js.UndefOr[String] = js.undefined
  }
  object ProjectTemplate {
    
    inline def apply(): ProjectTemplate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectTemplate]
    }
    
    extension [Self <: ProjectTemplate](x: Self) {
      
      inline def setConfig(value: StringDictionary[ProjectTemplateConfigValue]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setQuickstart(value: String): Self = StObject.set(x, "quickstart", value.asInstanceOf[js.Any])
      
      inline def setQuickstartUndefined: Self = StObject.set(x, "quickstart", js.undefined)
    }
  }
  
  trait ProjectTemplateConfigValue extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var secret: js.UndefOr[Boolean] = js.undefined
  }
  object ProjectTemplateConfigValue {
    
    inline def apply(): ProjectTemplateConfigValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectTemplateConfigValue]
    }
    
    extension [Self <: ProjectTemplateConfigValue](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
}
