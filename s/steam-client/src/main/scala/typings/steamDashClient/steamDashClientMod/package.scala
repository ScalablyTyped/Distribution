package typings.steamDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object steamDashClientMod {
  import typings.node.Buffer
  import typings.steamDashClient.Anon_False
  import typings.steamDashClient.steamDashClientNumbers.`false`

  type SendMessage = js.Function3[
    /* header */ Anon_False, 
    /* body */ Buffer | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), 
    /* callback */ js.UndefOr[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | `false`
    ], 
    Unit
  ]
}
