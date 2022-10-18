package typings.snyk

import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsGetExtraProjectCountMod {
  
  @JSImport("snyk/dist/lib/plugins/get-extra-project-count", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExtraProjectCount(
    root: String,
    options: Options,
    inspectResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ): js.Promise[js.UndefOr[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtraProjectCount")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inspectResult.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Double]]]
}
