package typings.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFetchOptions extends StObject {
  
  /** Whether expecting a binary response */
  var binary: js.UndefOr[Boolean] = js.native
  
  /** If `true`, forces the use of XMLHttpRequest */
  var xhr: js.UndefOr[Boolean] = js.native
}
object IFetchOptions {
  
  @scala.inline
  def apply(): IFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFetchOptions]
  }
  
  @scala.inline
  implicit class IFetchOptionsMutableBuilder[Self <: IFetchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
