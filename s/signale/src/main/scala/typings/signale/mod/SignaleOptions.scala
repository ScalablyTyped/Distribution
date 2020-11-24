package typings.signale.mod

import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.Date
import typings.std.Map
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignaleOptions[TTypes /* <: String */] extends js.Object {
  
  /** Sets the configuration of an instance overriding any existing global or local configuration. */
  var config: js.UndefOr[SignaleConfig] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var interactive: js.UndefOr[Boolean] = js.native
  
  var logLevel: js.UndefOr[String] = js.native
  
  /**
    * Name of the scope.
    */
  var scope: js.UndefOr[String] = js.native
  
  var secrets: js.UndefOr[js.Array[String | Double]] = js.native
  
  /**
    * Destination to which the data is written, can be any valid
    * [Writable stream](https://nodejs.org/api/stream.html#stream_writable_streams).
    */
  var stream: js.UndefOr[WriteStream | js.Array[WriteStream]] = js.native
  
  var timers: js.UndefOr[Map[String, Date]] = js.native
  
  /**
    * Holds the configuration of the custom and default loggers.
    */
  var types: js.UndefOr[Partial[Record[TTypes, CommandType]]] = js.native
}
object SignaleOptions {
  
  @scala.inline
  def apply[TTypes /* <: String */](): SignaleOptions[TTypes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignaleOptions[TTypes]]
  }
  
  @scala.inline
  implicit class SignaleOptionsOps[Self <: SignaleOptions[_], TTypes /* <: String */] (val x: Self with SignaleOptions[TTypes]) extends AnyVal {
    
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
    def setConfig(value: SignaleConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: (String | Double)*): Self = this.set("secrets", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: js.Array[String | Double]): Self = this.set("secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecrets: Self = this.set("secrets", js.undefined)
    
    @scala.inline
    def setStreamVarargs(value: WriteStream*): Self = this.set("stream", js.Array(value :_*))
    
    @scala.inline
    def setStream(value: WriteStream | js.Array[WriteStream]): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setTimers(value: Map[String, Date]): Self = this.set("timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimers: Self = this.set("timers", js.undefined)
    
    @scala.inline
    def setTypes(value: Partial[Record[TTypes, CommandType]]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
