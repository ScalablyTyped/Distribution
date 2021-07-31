package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfiguration extends StObject {
  
  /**
    * The input stream used by the application.
    */
  var input: js.UndefOr[Input[ApplicationApplicationConfigurationSqlApplicationConfigurationInput]] = js.undefined
  
  /**
    * The destination streams used by the application.
    */
  var outputs: js.UndefOr[
    Input[
      js.Array[Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]]
    ]
  ] = js.undefined
  
  /**
    * The reference data source used by the application.
    */
  var referenceDataSource: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource
    ]
  ] = js.undefined
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
    def setInput(value: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setOutputs(
      value: Input[
          js.Array[Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]]
        ]
    ): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setReferenceDataSource(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource
        ]
    ): Self = StObject.set(x, "referenceDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceDataSourceUndefined: Self = StObject.set(x, "referenceDataSource", js.undefined)
  }
}
