package typings.sixRuntime.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Six")
@js.native
object Six_ extends js.Object {
  
  @js.native
  object plugins extends js.Object {
    
    @js.native
    object dataProvider extends js.Object {
      
      @js.native
      abstract class DataProvider ()
        extends typings.sixRuntime.Six.plugins.dataProvider.DataProvider
      /* static members */
      @js.native
      object DataProvider extends js.Object {
        
        var deps: js.Array[String] = js.native
        
        var retry: Double = js.native
        
        var timeout: Double = js.native
      }
    }
  }
}
