package typings.rollupPluginVisualizer

import typings.rollup.mod.GetModuleInfo
import typings.rollupPluginVisualizer.anon.ModuleLengthsidstring
import typings.rollupPluginVisualizer.distPluginModuleMapperMod.ModuleMapper
import typings.rollupPluginVisualizer.distTypesTypesMod.ModuleTree
import typings.rollupPluginVisualizer.distTypesTypesMod.ModuleTreeLeaf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginDataMod {
  
  @JSImport("rollup-plugin-visualizer/dist/plugin/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLinks(startModuleId: String, getModuleInfo: GetModuleInfo, mapper: ModuleMapper): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLinks")(startModuleId.asInstanceOf[js.Any], getModuleInfo.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def buildTree(bundleId: String, modules: js.Array[ModuleLengthsidstring], mapper: ModuleMapper): ModuleTree = (^.asInstanceOf[js.Dynamic].applyDynamic("buildTree")(bundleId.asInstanceOf[js.Any], modules.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[ModuleTree]
  
  inline def mergeTrees(trees: js.Array[ModuleTree | ModuleTreeLeaf]): ModuleTree = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeTrees")(trees.asInstanceOf[js.Any]).asInstanceOf[ModuleTree]
}
