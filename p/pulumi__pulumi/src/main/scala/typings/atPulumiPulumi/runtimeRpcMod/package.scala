package typings.atPulumiPulumi

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeRpcMod {
  type OutputResolvers = Record[
    String, 
    js.Function3[/* value */ js.Any, /* isStable */ Boolean, /* isSecret */ Boolean, Unit]
  ]
}
