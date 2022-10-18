package typings.snyk

import typings.snyk.distLibTypesMod.MonitorOptions
import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPrintDepsMod {
  
  @JSImport("snyk/dist/lib/print-deps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maybePrintDepGraph(
    options: MonitorOptions,
    depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("maybePrintDepGraph")(options.asInstanceOf[js.Any], depGraph.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def maybePrintDepGraph(
    options: Options,
    depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("maybePrintDepGraph")(options.asInstanceOf[js.Any], depGraph.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def maybePrintDepTree(
    options: MonitorOptions,
    rootPackage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify legacyApi.DepTree */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybePrintDepTree")(options.asInstanceOf[js.Any], rootPackage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def maybePrintDepTree(
    options: Options,
    rootPackage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify legacyApi.DepTree */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybePrintDepTree")(options.asInstanceOf[js.Any], rootPackage.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
