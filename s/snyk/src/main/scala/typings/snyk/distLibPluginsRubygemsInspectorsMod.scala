package typings.snyk

import typings.snyk.anon.Typeofgemfile
import typings.snyk.distLibPluginsRubygemsInspectorsTryGetSpecMod.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsRubygemsInspectorsMod {
  
  @JSImport("snyk/dist/lib/plugins/rubygems/inspectors", "inspectors")
  @js.native
  val inspectors: js.Array[Typeofgemfile] = js.native
  
  trait Spec extends StObject {
    
    var files: Files
    
    var packageName: String
    
    var targetFile: String
  }
  object Spec {
    
    inline def apply(files: Files, packageName: String, targetFile: String): Spec = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spec]
    }
    
    extension [Self <: Spec](x: Self) {
      
      inline def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    }
  }
}
