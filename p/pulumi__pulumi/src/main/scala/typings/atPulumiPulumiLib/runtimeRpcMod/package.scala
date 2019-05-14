package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeRpcMod {
  type OutputResolvers = stdLib.Record[
    java.lang.String, 
    js.Function3[
      /* value */ js.Any, 
      /* isStable */ scala.Boolean, 
      /* isSecret */ scala.Boolean, 
      scala.Unit
    ]
  ]
}
