package typings.rollupPluginVisualizer

import typings.rollupPluginVisualizer.anon.IsEntry
import typings.rollupPluginVisualizer.distTypesTypesMod.ModuleLengths
import typings.rollupPluginVisualizer.distTypesTypesMod.ModuleMeta
import typings.rollupPluginVisualizer.distTypesTypesMod.ModuleUID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginModuleMapperMod {
  
  @JSImport("rollup-plugin-visualizer/dist/plugin/module-mapper", "ModuleMapper")
  @js.native
  open class ModuleMapper protected () extends StObject {
    def this(projectRoot: String) = this()
    def this(projectRoot: js.RegExp) = this()
    
    def addImportedByLink(targetId: String, sourceId: String): Unit = js.native
    
    def addImportedLink(sourceId: String, targetId: String): Unit = js.native
    def addImportedLink(sourceId: String, targetId: String, dynamic: Boolean): Unit = js.native
    
    def getBundleModuleUid(bundleId: String, moduleId: String): ModuleUID = js.native
    
    def getModuleUid(moduleId: String): ModuleUID = js.native
    
    def getNodeMetas(): Record[ModuleUID, ModuleMeta] = js.native
    
    def getNodeParts(): /* import warning: importer.ImportType#apply Failed type conversion: rollup-plugin-visualizer.rollup-plugin-visualizer/dist/plugin/module-mapper.ModuleMapper['nodeParts'] */ js.Any = js.native
    
    def hasNodePart(bundleId: String, moduleId: String): Boolean = js.native
    
    /* private */ var nodeMetas: Any = js.native
    
    /* private */ var nodeParts: Any = js.native
    
    /* private */ var projectRoot: Any = js.native
    
    def setNodeMeta(moduleId: String, value: IsEntry): Unit = js.native
    
    def setNodePart(bundleId: String, moduleId: String, value: ModuleLengths): ModuleUID = js.native
    
    def trimProjectRootId(moduleId: String): String = js.native
  }
}
