package typings
package steamDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object steamDashClientMod {
  type SendMessage = js.Function3[
    /* header */ steamDashClientLib.Anon_False, 
    /* body */ nodeLib.Buffer | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), 
    /* callback */ js.UndefOr[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | steamDashClientLib.steamDashClientLibNumbers.`false`
    ], 
    scala.Unit
  ]
}
