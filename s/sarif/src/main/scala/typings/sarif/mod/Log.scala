package typings.sarif.mod

import typings.sarif.mod.Log.version
import typings.sarif.sarifStrings.`2Dot1Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  /**
    * The URI of the JSON schema corresponding to the version.
    */
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  /**
    * References to external property files that share data between runs.
    */
  var inlineExternalProperties: js.UndefOr[js.Array[ExternalProperties]] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the log file.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The set of runs contained in this log file.
    */
  var runs: js.Array[Run]
  
  /**
    * The SARIF format version of this log file.
    */
  var version: version
}
object Log {
  
  inline def apply(runs: js.Array[Run], version: version): Log = {
    val __obj = js.Dynamic.literal(runs = runs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  extension [Self <: Log](x: Self) {
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def setInlineExternalProperties(value: js.Array[ExternalProperties]): Self = StObject.set(x, "inlineExternalProperties", value.asInstanceOf[js.Any])
    
    inline def setInlineExternalPropertiesUndefined: Self = StObject.set(x, "inlineExternalProperties", js.undefined)
    
    inline def setInlineExternalPropertiesVarargs(value: ExternalProperties*): Self = StObject.set(x, "inlineExternalProperties", js.Array(value*))
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRuns(value: js.Array[Run]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRunsVarargs(value: Run*): Self = StObject.set(x, "runs", js.Array(value*))
    
    inline def setVersion(value: version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
  
  type version = `2Dot1Dot0`
}
