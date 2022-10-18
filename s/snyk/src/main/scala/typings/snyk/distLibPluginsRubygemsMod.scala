package typings.snyk

import typings.snyk.distLibPluginsTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsRubygemsMod {
  
  @JSImport("snyk/dist/lib/plugins/rubygems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inspect(root: String, targetFile: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiProjectResult */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(root.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiProjectResult */ Any
  ]]
  inline def inspect(root: String, targetFile: String, options: Options): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiProjectResult */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(root.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiProjectResult */ Any
  ]]
}
