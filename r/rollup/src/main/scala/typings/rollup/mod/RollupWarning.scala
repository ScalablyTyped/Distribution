package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupWarning
  extends StObject
     with RollupLogProps {
  
  var chunkName: js.UndefOr[String] = js.undefined
  
  var cycle: js.UndefOr[js.Array[String]] = js.undefined
  
  var exportName: js.UndefOr[String] = js.undefined
  
  var exporter: js.UndefOr[String] = js.undefined
  
  var guess: js.UndefOr[String] = js.undefined
  
  var importer: js.UndefOr[String] = js.undefined
  
  var missing: js.UndefOr[String] = js.undefined
  
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  var reexporter: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}
object RollupWarning {
  
  inline def apply(message: String): RollupWarning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWarning]
  }
  
  extension [Self <: RollupWarning](x: Self) {
    
    inline def setChunkName(value: String): Self = StObject.set(x, "chunkName", value.asInstanceOf[js.Any])
    
    inline def setChunkNameUndefined: Self = StObject.set(x, "chunkName", js.undefined)
    
    inline def setCycle(value: js.Array[String]): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    inline def setCycleVarargs(value: String*): Self = StObject.set(x, "cycle", js.Array(value*))
    
    inline def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
    
    inline def setExportNameUndefined: Self = StObject.set(x, "exportName", js.undefined)
    
    inline def setExporter(value: String): Self = StObject.set(x, "exporter", value.asInstanceOf[js.Any])
    
    inline def setExporterUndefined: Self = StObject.set(x, "exporter", js.undefined)
    
    inline def setGuess(value: String): Self = StObject.set(x, "guess", value.asInstanceOf[js.Any])
    
    inline def setGuessUndefined: Self = StObject.set(x, "guess", js.undefined)
    
    inline def setImporter(value: String): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setReexporter(value: String): Self = StObject.set(x, "reexporter", value.asInstanceOf[js.Any])
    
    inline def setReexporterUndefined: Self = StObject.set(x, "reexporter", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
