package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule/config", JSImport.Namespace)
@js.native
object deploymentOnlyModuleConfigMod extends js.Object {
  
  @js.native
  class Config protected () extends js.Object {
    def this(name: String) = this()
    
    /**
      * fullKey turns a simple configuration key into a fully resolved one, by prepending the bag's name.
      *
      * @param key The key to lookup.
      */
    var fullKey: js.Any = js.native
    
    /**
      * get loads an optional configuration value by its key, or undefined if it doesn't exist.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def get(key: String): js.UndefOr[String] = js.native
    
    /**
      * name is the configuration bag's logical name and uniquely identifies it.  The default is the name of the current
      * project.
      */
    val name: String = js.native
  }
}
