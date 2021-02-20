package typings.reactNativeGoby.mod

import typings.reactNativeGoby.mod.Goby.CheckFrequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GobyOptions extends SyncOptions {
  
  /**
    * Specifies when you would like to synchronize updates with the Goby server.
    * Defaults to goby.CheckFrequency.ON_APP_START.
    */
  var checkFrequency: CheckFrequency = js.native
}
object GobyOptions {
  
  @scala.inline
  def apply(checkFrequency: CheckFrequency): GobyOptions = {
    val __obj = js.Dynamic.literal(checkFrequency = checkFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[GobyOptions]
  }
  
  @scala.inline
  implicit class GobyOptionsMutableBuilder[Self <: GobyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckFrequency(value: CheckFrequency): Self = StObject.set(x, "checkFrequency", value.asInstanceOf[js.Any])
  }
}
