package typings.snyk

import typings.snyk.distLibTypesMod.Contributor
import typings.snyk.distLibTypesMod.MonitorMeta
import typings.snyk.distLibTypesMod.MonitorOptions
import typings.snyk.distLibTypesMod.MonitorResult
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.PolicyOptions
import typings.snyk.distLibTypesMod.ProjectAttributes
import typings.snyk.distLibTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMonitorMod {
  
  @JSImport("snyk/dist/lib/monitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: String
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: String,
    contributors: js.Array[Contributor]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: String,
    contributors: js.Array[Contributor],
    projectAttributes: Unit,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: String,
    contributors: js.Array[Contributor],
    projectAttributes: ProjectAttributes
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: String,
    contributors: js.Array[Contributor],
    projectAttributes: ProjectAttributes,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: String,
    contributors: Unit,
    projectAttributes: Unit,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: String,
    contributors: Unit,
    projectAttributes: ProjectAttributes
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: String,
    contributors: Unit,
    projectAttributes: ProjectAttributes,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: Unit,
    contributors: js.Array[Contributor]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: Unit,
    contributors: js.Array[Contributor],
    projectAttributes: Unit,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: Unit,
    contributors: js.Array[Contributor],
    projectAttributes: ProjectAttributes
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: Unit,
    contributors: js.Array[Contributor],
    projectAttributes: ProjectAttributes,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: Unit,
    contributors: Unit,
    projectAttributes: Unit,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: Unit,
    contributors: Unit,
    projectAttributes: ProjectAttributes
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitor(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options & MonitorOptions & PolicyOptions,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    targetFileRelativePath: Unit,
    contributors: Unit,
    projectAttributes: ProjectAttributes,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: String
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: String,
    contributors: js.Array[Contributor]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: String,
    contributors: js.Array[Contributor],
    projectAttributes: Unit,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: String,
    contributors: js.Array[Contributor],
    projectAttributes: ProjectAttributes
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: String,
    contributors: js.Array[Contributor],
    projectAttributes: ProjectAttributes,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: String,
    contributors: Unit,
    projectAttributes: Unit,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: String,
    contributors: Unit,
    projectAttributes: ProjectAttributes
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: String,
    contributors: Unit,
    projectAttributes: ProjectAttributes,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: Unit,
    contributors: js.Array[Contributor]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: Unit,
    contributors: js.Array[Contributor],
    projectAttributes: Unit,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: Unit,
    contributors: js.Array[Contributor],
    projectAttributes: ProjectAttributes
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: Unit,
    contributors: js.Array[Contributor],
    projectAttributes: ProjectAttributes,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: Unit,
    contributors: Unit,
    projectAttributes: Unit,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: Unit,
    contributors: Unit,
    projectAttributes: ProjectAttributes
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
  inline def monitorDepGraph(
    root: String,
    meta: MonitorMeta,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    options: MonitorOptions & PolicyOptions,
    targetFileRelativePath: Unit,
    contributors: Unit,
    projectAttributes: ProjectAttributes,
    tags: js.Array[Tag]
  ): js.Promise[MonitorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorDepGraph")(root.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], scannedProject.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFileRelativePath.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any], projectAttributes.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorResult]]
}
