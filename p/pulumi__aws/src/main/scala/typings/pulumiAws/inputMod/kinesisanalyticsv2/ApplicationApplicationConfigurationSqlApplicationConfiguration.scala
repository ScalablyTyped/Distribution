package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfiguration extends js.Object {
  
  /**
    * The input stream used by the application.
    */
  var input: js.UndefOr[Input[ApplicationApplicationConfigurationSqlApplicationConfigurationInput]] = js.native
  
  /**
    * The destination streams used by the application.
    */
  var outputs: js.UndefOr[
    Input[
      js.Array[Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]]
    ]
  ] = js.native
  
  /**
    * The reference data source used by the application.
    */
  var referenceDataSource: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource
    ]
  ] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfiguration {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationSqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInput(value: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationInput]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]*): Self = this.set("outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(
      value: Input[
          js.Array[Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]]
        ]
    ): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    
    @scala.inline
    def setReferenceDataSource(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource
        ]
    ): Self = this.set("referenceDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceDataSource: Self = this.set("referenceDataSource", js.undefined)
  }
}
