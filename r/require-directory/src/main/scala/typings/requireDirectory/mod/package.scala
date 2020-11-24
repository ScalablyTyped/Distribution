package typings.requireDirectory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * @description function that checks path for whitelisting/blacklisting
    * @param path path of required module
    * @returns true if path have to be whitelisted/blacklisted, false otherwise
    */
  type CheckPathFn = js.Function1[/* path */ java.lang.String, scala.Boolean]
}
