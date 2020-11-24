package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderIgnoreTags extends js.Object {
  
  var keyPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  var keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ProviderIgnoreTags {
  
  @scala.inline
  def apply(): ProviderIgnoreTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderIgnoreTags]
  }
  
  @scala.inline
  implicit class ProviderIgnoreTagsOps[Self <: ProviderIgnoreTags] (val x: Self) extends AnyVal {
    
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
    def setKeyPrefixesVarargs(value: Input[String]*): Self = this.set("keyPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setKeyPrefixes(value: Input[js.Array[Input[String]]]): Self = this.set("keyPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPrefixes: Self = this.set("keyPrefixes", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: Input[String]*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: Input[js.Array[Input[String]]]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
}
