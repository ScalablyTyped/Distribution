package typings.atPulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeRpcMod {
  import typings.std.Record

  type OutputResolvers = Record[
    String, 
    js.Function3[/* value */ js.Any, /* isStable */ Boolean, /* isSecret */ Boolean, Unit]
  ]
}
