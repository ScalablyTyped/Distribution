package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfiguration extends StObject {
  
  /**
    * The input stream used by the application.
    */
  var input: js.UndefOr[ApplicationApplicationConfigurationSqlApplicationConfigurationInput] = js.native
  
  /**
    * The destination streams used by the application.
    */
  var outputs: js.UndefOr[js.Array[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]] = js.native
  
  /**
    * The reference data source used by the application.
    */
  var referenceDataSource: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource
  ] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfiguration {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationSqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setOutputs(value: js.Array[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: ApplicationApplicationConfigurationSqlApplicationConfigurationOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setReferenceDataSource(value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource): Self = StObject.set(x, "referenceDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceDataSourceUndefined: Self = StObject.set(x, "referenceDataSource", js.undefined)
  }
}
