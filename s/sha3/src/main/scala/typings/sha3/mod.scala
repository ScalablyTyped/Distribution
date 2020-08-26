package typings.sha3

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.sha3.sha3Numbers.`224`
import typings.sha3.sha3Numbers.`256`
import typings.sha3.sha3Numbers.`384`
import typings.sha3.sha3Numbers.`512`
import typings.sha3.sha3Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha3", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Hasher extends js.Object {
    def digest(): Buffer = js.native
    def digest(encoding: BufferEncoding): String = js.native
    @JSName("digest")
    def digest_binary(encoding: binary): Buffer = js.native
    def reset(): this.type = js.native
    def update(data: String): this.type = js.native
    def update(data: String, encoding: BufferEncoding): this.type = js.native
    def update(data: Buffer): this.type = js.native
  }
  
  @js.native
  class SHA3 () extends Hasher
  
  @js.native
  class default () extends SHA3
  
  val Keccak: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
  val SHA3Hash: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
  val SHAKE: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
  /* static members */
  @js.native
  object SHA3 extends js.Object {
    var SHA3Hash: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var SHA3Hash: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
  }
  
}

