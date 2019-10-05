package typings.shaDotJs

import org.scalablytyped.runtime.Instantiable0
import typings.node.cryptoMod.Hash
import typings.shaDotJs.shaDotJsMod.HashStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha.js", JSImport.Namespace)
@js.native
object shaDotJsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.shaDotJs.shaDotJsStrings.sha
    - typings.shaDotJs.shaDotJsStrings.sha1
    - typings.shaDotJs.shaDotJsStrings.sha224
    - typings.shaDotJs.shaDotJsStrings.sha256
    - typings.shaDotJs.shaDotJsStrings.sha384
    - typings.shaDotJs.shaDotJsStrings.sha512
  */
  trait Algorithm extends js.Object
  
  @js.native
  trait HashStatic extends Instantiable0[Hash]
  
  @js.native
  class sha () extends Hash
  
  @js.native
  class sha1 () extends Hash
  
  @js.native
  class sha224 () extends Hash
  
  @js.native
  class sha256 () extends Hash
  
  @js.native
  class sha384 () extends Hash
  
  @js.native
  class sha512 () extends Hash
  
  val sha: HashStatic = js.native
  val sha1: HashStatic = js.native
  val sha224: HashStatic = js.native
  val sha256: HashStatic = js.native
  val sha384: HashStatic = js.native
  val sha512: HashStatic = js.native
  def apply(algorithm: String): Hash = js.native
}

