package typings.pulumiPulumi.stackSettingsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSettings extends js.Object {
  
  var config: js.UndefOr[StringDictionary[StackSettingsConfigValue]] = js.native
  
  var encryptedKey: js.UndefOr[String] = js.native
  
  var encryptionSalt: js.UndefOr[String] = js.native
  
  var secretsProvider: js.UndefOr[String] = js.native
}
object StackSettings {
  
  @scala.inline
  def apply(): StackSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSettings]
  }
  
  @scala.inline
  implicit class StackSettingsOps[Self <: StackSettings] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: StringDictionary[StackSettingsConfigValue]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setEncryptedKey(value: String): Self = this.set("encryptedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedKey: Self = this.set("encryptedKey", js.undefined)
    
    @scala.inline
    def setEncryptionSalt(value: String): Self = this.set("encryptionSalt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionSalt: Self = this.set("encryptionSalt", js.undefined)
    
    @scala.inline
    def setSecretsProvider(value: String): Self = this.set("secretsProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretsProvider: Self = this.set("secretsProvider", js.undefined)
  }
}
