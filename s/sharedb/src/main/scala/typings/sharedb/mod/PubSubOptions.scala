package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubSubOptions extends StObject {
  
  var prefix: js.UndefOr[String] = js.native
}
object PubSubOptions {
  
  @scala.inline
  def apply(): PubSubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubSubOptions]
  }
  
  @scala.inline
  implicit class PubSubOptionsMutableBuilder[Self <: PubSubOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
