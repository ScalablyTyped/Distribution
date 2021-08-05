package typings.reactNativeGoby.mod

import typings.reactNativeGoby.mod.Goby.CheckFrequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GobyOptions
  extends StObject
     with SyncOptions {
  
  /**
    * Specifies when you would like to synchronize updates with the Goby server.
    * Defaults to goby.CheckFrequency.ON_APP_START.
    */
  var checkFrequency: CheckFrequency
}
object GobyOptions {
  
  inline def apply(checkFrequency: CheckFrequency): GobyOptions = {
    val __obj = js.Dynamic.literal(checkFrequency = checkFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[GobyOptions]
  }
  
  extension [Self <: GobyOptions](x: Self) {
    
    inline def setCheckFrequency(value: CheckFrequency): Self = StObject.set(x, "checkFrequency", value.asInstanceOf[js.Any])
  }
}
