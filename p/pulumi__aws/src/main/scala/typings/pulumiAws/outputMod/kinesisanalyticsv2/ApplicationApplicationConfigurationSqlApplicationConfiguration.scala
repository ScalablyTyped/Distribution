package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfiguration extends StObject {
  
  /**
    * The input stream used by the application.
    */
  var input: js.UndefOr[ApplicationApplicationConfigurationSqlApplicationConfigurationInput] = js.undefined
  
  /**
    * The destination streams used by the application.
    */
  var outputs: js.UndefOr[js.Array[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]] = js.undefined
  
  /**
    * The reference data source used by the application.
    */
  var referenceDataSource: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource
  ] = js.undefined
}
object ApplicationApplicationConfigurationSqlApplicationConfiguration {
  
  inline def apply(): ApplicationApplicationConfigurationSqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfiguration](x: Self) {
    
    inline def setInput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOutputs(value: js.Array[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: ApplicationApplicationConfigurationSqlApplicationConfigurationOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    inline def setReferenceDataSource(value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource): Self = StObject.set(x, "referenceDataSource", value.asInstanceOf[js.Any])
    
    inline def setReferenceDataSourceUndefined: Self = StObject.set(x, "referenceDataSource", js.undefined)
  }
}
