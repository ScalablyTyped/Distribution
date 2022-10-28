package typings.rollupPluginVisualizer

import org.scalablytyped.runtime.StringDictionary
import typings.rollupPluginVisualizer.anon.Brotli
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  @JSImport("rollup-plugin-visualizer/dist/types/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isModuleTree(mod: ModuleTree): /* is rollup-plugin-visualizer.rollup-plugin-visualizer/dist/types/types.ModuleTree */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleTree")(mod.asInstanceOf[js.Any]).asInstanceOf[/* is rollup-plugin-visualizer.rollup-plugin-visualizer/dist/types/types.ModuleTree */ Boolean]
  inline def isModuleTree(mod: ModuleTreeLeaf): /* is rollup-plugin-visualizer.rollup-plugin-visualizer/dist/types/types.ModuleTree */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleTree")(mod.asInstanceOf[js.Any]).asInstanceOf[/* is rollup-plugin-visualizer.rollup-plugin-visualizer/dist/types/types.ModuleTree */ Boolean]
  
  type BundleId = String
  
  trait ModuleImport extends StObject {
    
    var dynamic: js.UndefOr[Boolean] = js.undefined
    
    var uid: ModuleUID
  }
  object ModuleImport {
    
    inline def apply(uid: ModuleUID): ModuleImport = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImport]
    }
    
    extension [Self <: ModuleImport](x: Self) {
      
      inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      inline def setUid(value: ModuleUID): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleLengths extends StObject {
    
    var brotliLength: Double
    
    var gzipLength: Double
    
    var renderedLength: Double
  }
  object ModuleLengths {
    
    inline def apply(brotliLength: Double, gzipLength: Double, renderedLength: Double): ModuleLengths = {
      val __obj = js.Dynamic.literal(brotliLength = brotliLength.asInstanceOf[js.Any], gzipLength = gzipLength.asInstanceOf[js.Any], renderedLength = renderedLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleLengths]
    }
    
    extension [Self <: ModuleLengths](x: Self) {
      
      inline def setBrotliLength(value: Double): Self = StObject.set(x, "brotliLength", value.asInstanceOf[js.Any])
      
      inline def setGzipLength(value: Double): Self = StObject.set(x, "gzipLength", value.asInstanceOf[js.Any])
      
      inline def setRenderedLength(value: Double): Self = StObject.set(x, "renderedLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleMeta extends StObject {
    
    var id: String
    
    var imported: js.Array[ModuleImport]
    
    var importedBy: js.Array[ModuleImport]
    
    var isEntry: js.UndefOr[Boolean] = js.undefined
    
    var isExternal: js.UndefOr[Boolean] = js.undefined
    
    var moduleParts: Record[BundleId, ModuleUID]
  }
  object ModuleMeta {
    
    inline def apply(
      id: String,
      imported: js.Array[ModuleImport],
      importedBy: js.Array[ModuleImport],
      moduleParts: Record[BundleId, ModuleUID]
    ): ModuleMeta = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], importedBy = importedBy.asInstanceOf[js.Any], moduleParts = moduleParts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleMeta]
    }
    
    extension [Self <: ModuleMeta](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImported(value: js.Array[ModuleImport]): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
      
      inline def setImportedBy(value: js.Array[ModuleImport]): Self = StObject.set(x, "importedBy", value.asInstanceOf[js.Any])
      
      inline def setImportedByVarargs(value: ModuleImport*): Self = StObject.set(x, "importedBy", js.Array(value*))
      
      inline def setImportedVarargs(value: ModuleImport*): Self = StObject.set(x, "imported", js.Array(value*))
      
      inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
      
      inline def setIsEntryUndefined: Self = StObject.set(x, "isEntry", js.undefined)
      
      inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      inline def setIsExternalUndefined: Self = StObject.set(x, "isExternal", js.undefined)
      
      inline def setModuleParts(value: Record[BundleId, ModuleUID]): Self = StObject.set(x, "moduleParts", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModulePart
    extends StObject
       with ModuleLengths {
    
    var mainUid: ModuleUID
  }
  object ModulePart {
    
    inline def apply(brotliLength: Double, gzipLength: Double, mainUid: ModuleUID, renderedLength: Double): ModulePart = {
      val __obj = js.Dynamic.literal(brotliLength = brotliLength.asInstanceOf[js.Any], gzipLength = gzipLength.asInstanceOf[js.Any], mainUid = mainUid.asInstanceOf[js.Any], renderedLength = renderedLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModulePart]
    }
    
    extension [Self <: ModulePart](x: Self) {
      
      inline def setMainUid(value: ModuleUID): Self = StObject.set(x, "mainUid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleTree extends StObject {
    
    var children: js.Array[ModuleTree | ModuleTreeLeaf]
    
    var name: String
  }
  object ModuleTree {
    
    inline def apply(children: js.Array[ModuleTree | ModuleTreeLeaf], name: String): ModuleTree = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleTree]
    }
    
    extension [Self <: ModuleTree](x: Self) {
      
      inline def setChildren(value: js.Array[ModuleTree | ModuleTreeLeaf]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (ModuleTree | ModuleTreeLeaf)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleTreeLeaf extends StObject {
    
    var name: String
    
    var uid: ModuleUID
  }
  object ModuleTreeLeaf {
    
    inline def apply(name: String, uid: ModuleUID): ModuleTreeLeaf = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleTreeLeaf]
    }
    
    extension [Self <: ModuleTreeLeaf](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUid(value: ModuleUID): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleUID = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.renderedLength
    - typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.gzipLength
    - typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.brotliLength
  */
  trait SizeKey extends StObject
  object SizeKey {
    
    inline def brotliLength: typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.brotliLength = "brotliLength".asInstanceOf[typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.brotliLength]
    
    inline def gzipLength: typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.gzipLength = "gzipLength".asInstanceOf[typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.gzipLength]
    
    inline def renderedLength: typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.renderedLength = "renderedLength".asInstanceOf[typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.renderedLength]
  }
  
  trait VisualizerData extends StObject {
    
    var env: StringDictionary[Any]
    
    var nodeMetas: Record[ModuleUID, ModuleMeta]
    
    var nodeParts: Record[ModuleUID, ModulePart]
    
    var options: Brotli
    
    var tree: ModuleTree
    
    var version: Double
  }
  object VisualizerData {
    
    inline def apply(
      env: StringDictionary[Any],
      nodeMetas: Record[ModuleUID, ModuleMeta],
      nodeParts: Record[ModuleUID, ModulePart],
      options: Brotli,
      tree: ModuleTree,
      version: Double
    ): VisualizerData = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], nodeMetas = nodeMetas.asInstanceOf[js.Any], nodeParts = nodeParts.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisualizerData]
    }
    
    extension [Self <: VisualizerData](x: Self) {
      
      inline def setEnv(value: StringDictionary[Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setNodeMetas(value: Record[ModuleUID, ModuleMeta]): Self = StObject.set(x, "nodeMetas", value.asInstanceOf[js.Any])
      
      inline def setNodeParts(value: Record[ModuleUID, ModulePart]): Self = StObject.set(x, "nodeParts", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Brotli): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTree(value: ModuleTree): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
