package typings.snyk

import typings.snyk.distLibTypesMod.MonitorMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMonitorUtilsMod {
  
  @JSImport("snyk/dist/lib/monitor/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNameDepGraph(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any,
    meta: MonitorMeta
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNameDepGraph")(scannedProject.asInstanceOf[js.Any], depGraph.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getNameDepTree(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    depTree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepTree */ Any,
    meta: MonitorMeta
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNameDepTree")(scannedProject.asInstanceOf[js.Any], depTree.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getProjectName(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    meta: MonitorMeta
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectName")(scannedProject.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getTargetFile(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTargetFile")(scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
