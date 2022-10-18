package typings.snyk

import typings.snyk.distLibPluginsRubygemsInspectorsMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsRubygemsInspectorsGemspecMod {
  
  @JSImport("snyk/dist/lib/plugins/rubygems/inspectors/gemspec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canHandle(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canHandle")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def gatherSpecs(root: String, target: String): js.Promise[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatherSpecs")(root.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Spec]]
}
