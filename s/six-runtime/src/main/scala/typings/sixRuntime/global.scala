package typings.sixRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Six_ {
    
    object plugins {
      
      object dataProvider {
        
        @JSGlobal("Six.plugins.dataProvider.DataProvider")
        @js.native
        abstract class DataProvider ()
          extends typings.sixRuntime.Six.plugins.dataProvider.DataProvider
        object DataProvider {
          
          @JSGlobal("Six.plugins.dataProvider.DataProvider")
          @js.native
          val ^ : js.Any = js.native
          
          /* static member */
          @JSGlobal("Six.plugins.dataProvider.DataProvider.deps")
          @js.native
          def deps: js.Array[String] = js.native
          @scala.inline
          def deps_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deps")(x.asInstanceOf[js.Any])
          
          /* static member */
          @JSGlobal("Six.plugins.dataProvider.DataProvider.retry")
          @js.native
          def retry: Double = js.native
          @scala.inline
          def retry_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("retry")(x.asInstanceOf[js.Any])
          
          /* static member */
          @JSGlobal("Six.plugins.dataProvider.DataProvider.timeout")
          @js.native
          def timeout: Double = js.native
          @scala.inline
          def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  @JSGlobal("six")
  @js.native
  val six: Six = js.native
}
