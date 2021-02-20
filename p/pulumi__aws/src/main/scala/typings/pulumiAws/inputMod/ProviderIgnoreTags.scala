package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderIgnoreTags extends StObject {
  
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
  implicit class ProviderIgnoreTagsMutableBuilder[Self <: ProviderIgnoreTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPrefixes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "keyPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixesUndefined: Self = StObject.set(x, "keyPrefixes", js.undefined)
    
    @scala.inline
    def setKeyPrefixesVarargs(value: Input[String]*): Self = StObject.set(x, "keyPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: Input[String]*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
