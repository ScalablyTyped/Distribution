package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultProvenance extends StObject {
  
  /**
    * An array of physicalLocation objects which specify the portions of an analysis tool's output that a converter
    * transformed into the result.
    */
  var conversionSources: js.UndefOr[js.Array[PhysicalLocation]] = js.undefined
  
  /**
    * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first
    * detected.
    */
  var firstDetectionRunGuid: js.UndefOr[String] = js.undefined
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See "Date/time
    * properties" in the SARIF spec for the required format.
    */
  var firstDetectionTimeUtc: js.UndefOr[String] = js.undefined
  
  /**
    * The index within the run.invocations array of the invocation object which describes the tool invocation that
    * detected the result.
    */
  var invocationIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most
    * recently detected.
    */
  var lastDetectionRunGuid: js.UndefOr[String] = js.undefined
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastDetectionTimeUtc: js.UndefOr[String] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object ResultProvenance {
  
  inline def apply(): ResultProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultProvenance]
  }
  
  extension [Self <: ResultProvenance](x: Self) {
    
    inline def setConversionSources(value: js.Array[PhysicalLocation]): Self = StObject.set(x, "conversionSources", value.asInstanceOf[js.Any])
    
    inline def setConversionSourcesUndefined: Self = StObject.set(x, "conversionSources", js.undefined)
    
    inline def setConversionSourcesVarargs(value: PhysicalLocation*): Self = StObject.set(x, "conversionSources", js.Array(value :_*))
    
    inline def setFirstDetectionRunGuid(value: String): Self = StObject.set(x, "firstDetectionRunGuid", value.asInstanceOf[js.Any])
    
    inline def setFirstDetectionRunGuidUndefined: Self = StObject.set(x, "firstDetectionRunGuid", js.undefined)
    
    inline def setFirstDetectionTimeUtc(value: String): Self = StObject.set(x, "firstDetectionTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setFirstDetectionTimeUtcUndefined: Self = StObject.set(x, "firstDetectionTimeUtc", js.undefined)
    
    inline def setInvocationIndex(value: Double): Self = StObject.set(x, "invocationIndex", value.asInstanceOf[js.Any])
    
    inline def setInvocationIndexUndefined: Self = StObject.set(x, "invocationIndex", js.undefined)
    
    inline def setLastDetectionRunGuid(value: String): Self = StObject.set(x, "lastDetectionRunGuid", value.asInstanceOf[js.Any])
    
    inline def setLastDetectionRunGuidUndefined: Self = StObject.set(x, "lastDetectionRunGuid", js.undefined)
    
    inline def setLastDetectionTimeUtc(value: String): Self = StObject.set(x, "lastDetectionTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setLastDetectionTimeUtcUndefined: Self = StObject.set(x, "lastDetectionTimeUtc", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
