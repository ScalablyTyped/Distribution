package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareDBSourceOptions extends StObject {
  
  var source: js.UndefOr[Boolean] = js.native
}
object ShareDBSourceOptions {
  
  @scala.inline
  def apply(): ShareDBSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareDBSourceOptions]
  }
  
  @scala.inline
  implicit class ShareDBSourceOptionsMutableBuilder[Self <: ShareDBSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
