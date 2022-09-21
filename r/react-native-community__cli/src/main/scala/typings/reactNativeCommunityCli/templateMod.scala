package typings.reactNativeCommunityCli

import typings.execa.mod.ExecaChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("@react-native-community/cli/build/commands/init/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyTemplate(templateName: String, templateDir: String, templateSourceDir: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyTemplate")(templateName.asInstanceOf[js.Any], templateDir.asInstanceOf[js.Any], templateSourceDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def executePostInitScript(templateName: String, postInitScript: String, templateSourceDir: String): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executePostInitScript")(templateName.asInstanceOf[js.Any], postInitScript.asInstanceOf[js.Any], templateSourceDir.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
  
  inline def getTemplateConfig(templateName: String, templateSourceDir: String): TemplateConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateConfig")(templateName.asInstanceOf[js.Any], templateSourceDir.asInstanceOf[js.Any])).asInstanceOf[TemplateConfig]
  
  inline def installTemplatePackage(templateName: String, root: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify execa.ExecaReturns */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("installTemplatePackage")(templateName.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify execa.ExecaReturns */ Any
  ]]
  inline def installTemplatePackage(templateName: String, root: String, npm: Boolean): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify execa.ExecaReturns */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("installTemplatePackage")(templateName.asInstanceOf[js.Any], root.asInstanceOf[js.Any], npm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify execa.ExecaReturns */ Any
  ]]
  
  trait TemplateConfig extends StObject {
    
    var placeholderName: String
    
    var postInitScript: js.UndefOr[String] = js.undefined
    
    var templateDir: String
    
    var titlePlaceholder: js.UndefOr[String] = js.undefined
  }
  object TemplateConfig {
    
    inline def apply(placeholderName: String, templateDir: String): TemplateConfig = {
      val __obj = js.Dynamic.literal(placeholderName = placeholderName.asInstanceOf[js.Any], templateDir = templateDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateConfig]
    }
    
    extension [Self <: TemplateConfig](x: Self) {
      
      inline def setPlaceholderName(value: String): Self = StObject.set(x, "placeholderName", value.asInstanceOf[js.Any])
      
      inline def setPostInitScript(value: String): Self = StObject.set(x, "postInitScript", value.asInstanceOf[js.Any])
      
      inline def setPostInitScriptUndefined: Self = StObject.set(x, "postInitScript", js.undefined)
      
      inline def setTemplateDir(value: String): Self = StObject.set(x, "templateDir", value.asInstanceOf[js.Any])
      
      inline def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
    }
  }
}
