package typings.shaJs.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.cryptoMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha.js", "sha")
@js.native
class sha () extends Hash

@JSImport("sha.js", "sha")
@js.native
object sha extends TopLevel[HashStatic]

