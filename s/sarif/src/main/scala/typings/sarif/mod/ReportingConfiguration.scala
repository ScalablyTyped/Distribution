package typings.sarif.mod

import typings.sarif.mod.ReportingConfiguration.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingConfiguration extends StObject {
  
  /**
    * Specifies whether the report may be produced during the scan.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the failure level for the report.
    */
  var level: js.UndefOr[level] = js.undefined
  
  /**
    * Contains configuration information specific to a report.
    */
  var parameters: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the reporting configuration.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * Specifies the relative priority of the report. Used for analysis output only.
    */
  var rank: js.UndefOr[Double] = js.undefined
}
object ReportingConfiguration {
  
  inline def apply(): ReportingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingConfiguration]
  }
  
  extension [Self <: ReportingConfiguration](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLevel(value: level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setParameters(value: PropertyBag): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.none
    - typings.sarif.sarifStrings.note
    - typings.sarif.sarifStrings.warning
    - typings.sarif.sarifStrings.error
  */
  trait level extends StObject
  object level {
    
    inline def error: typings.sarif.sarifStrings.error = "error".asInstanceOf[typings.sarif.sarifStrings.error]
    
    inline def none: typings.sarif.sarifStrings.none = "none".asInstanceOf[typings.sarif.sarifStrings.none]
    
    inline def note: typings.sarif.sarifStrings.note = "note".asInstanceOf[typings.sarif.sarifStrings.note]
    
    inline def warning: typings.sarif.sarifStrings.warning = "warning".asInstanceOf[typings.sarif.sarifStrings.warning]
  }
}
