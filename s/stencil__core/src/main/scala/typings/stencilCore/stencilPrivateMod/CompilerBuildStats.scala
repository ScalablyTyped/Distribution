package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.BuildEs5
import typings.stencilCore.anon.Bundles
import typings.stencilCore.anon.Commonjs
import typings.stencilCore.anon.Name
import typings.stencilCore.anon.Source
import typings.stencilCore.stencilPublicCompilerMod.BuildResultsComponentGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerBuildStats extends StObject {
  
  var app: Bundles
  
  var collections: js.Array[Source]
  
  var compiler: Name
  
  var componentGraph: BuildResultsComponentGraph
  
  var components: js.Array[BuildComponent]
  
  var entries: js.Array[EntryModule]
  
  var formats: Commonjs
  
  var options: BuildEs5
  
  var rollupResults: RollupResults
  
  var sourceGraph: js.UndefOr[BuildSourceGraph] = js.undefined
  
  var timestamp: String
}
object CompilerBuildStats {
  
  inline def apply(
    app: Bundles,
    collections: js.Array[Source],
    compiler: Name,
    componentGraph: BuildResultsComponentGraph,
    components: js.Array[BuildComponent],
    entries: js.Array[EntryModule],
    formats: Commonjs,
    options: BuildEs5,
    rollupResults: RollupResults,
    timestamp: String
  ): CompilerBuildStats = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], componentGraph = componentGraph.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rollupResults = rollupResults.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerBuildStats]
  }
  
  extension [Self <: CompilerBuildStats](x: Self) {
    
    inline def setApp(value: Bundles): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setCollections(value: js.Array[Source]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsVarargs(value: Source*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setCompiler(value: Name): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setComponentGraph(value: BuildResultsComponentGraph): Self = StObject.set(x, "componentGraph", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: js.Array[BuildComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: BuildComponent*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setEntries(value: js.Array[EntryModule]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: EntryModule*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setFormats(value: Commonjs): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: BuildEs5): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRollupResults(value: RollupResults): Self = StObject.set(x, "rollupResults", value.asInstanceOf[js.Any])
    
    inline def setSourceGraph(value: BuildSourceGraph): Self = StObject.set(x, "sourceGraph", value.asInstanceOf[js.Any])
    
    inline def setSourceGraphUndefined: Self = StObject.set(x, "sourceGraph", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
