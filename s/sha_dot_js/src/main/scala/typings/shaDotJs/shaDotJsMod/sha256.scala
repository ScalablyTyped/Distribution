package typings.shaDotJs.shaDotJsMod

import org.scalablytyped.runtime.TopLevel
import typings.node.cryptoMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha.js", "sha256")
@js.native
class sha256 () extends Hash

@JSImport("sha.js", "sha256")
@js.native
object sha256 extends TopLevel[HashStatic]

