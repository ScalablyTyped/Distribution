package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupWarning extends RollupLogProps {
  
  var chunkName: js.UndefOr[String] = js.native
  
  var cycle: js.UndefOr[js.Array[String]] = js.native
  
  var exportName: js.UndefOr[String] = js.native
  
  var exporter: js.UndefOr[String] = js.native
  
  var guess: js.UndefOr[String] = js.native
  
  var importer: js.UndefOr[String] = js.native
  
  var missing: js.UndefOr[String] = js.native
  
  var modules: js.UndefOr[js.Array[String]] = js.native
  
  var names: js.UndefOr[js.Array[String]] = js.native
  
  var reexporter: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var sources: js.UndefOr[js.Array[String]] = js.native
}
object RollupWarning {
  
  @scala.inline
  def apply(message: String): RollupWarning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWarning]
  }
  
  @scala.inline
  implicit class RollupWarningMutableBuilder[Self <: RollupWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkName(value: String): Self = StObject.set(x, "chunkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkNameUndefined: Self = StObject.set(x, "chunkName", js.undefined)
    
    @scala.inline
    def setCycle(value: js.Array[String]): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    @scala.inline
    def setCycleVarargs(value: String*): Self = StObject.set(x, "cycle", js.Array(value :_*))
    
    @scala.inline
    def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportNameUndefined: Self = StObject.set(x, "exportName", js.undefined)
    
    @scala.inline
    def setExporter(value: String): Self = StObject.set(x, "exporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExporterUndefined: Self = StObject.set(x, "exporter", js.undefined)
    
    @scala.inline
    def setGuess(value: String): Self = StObject.set(x, "guess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuessUndefined: Self = StObject.set(x, "guess", js.undefined)
    
    @scala.inline
    def setImporter(value: String): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    @scala.inline
    def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    @scala.inline
    def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setReexporter(value: String): Self = StObject.set(x, "reexporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReexporterUndefined: Self = StObject.set(x, "reexporter", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
