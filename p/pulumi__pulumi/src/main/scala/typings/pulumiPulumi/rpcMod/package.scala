package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rpcMod {
  
  type OutputResolvers = typings.std.Record[
    java.lang.String, 
    js.Function5[
      /* value */ js.Any, 
      /* isStable */ scala.Boolean, 
      /* isSecret */ scala.Boolean, 
      /* deps */ js.UndefOr[js.Array[typings.pulumiPulumi.resourceMod.Resource]], 
      /* err */ js.UndefOr[typings.std.Error], 
      scala.Unit
    ]
  ]
}
