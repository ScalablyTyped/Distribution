package typings.rasha.rashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rasha", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // JWK-to-PEM
  def export(opts: ExportOptions): js.Promise[String] = js.native
  def generate(opts: GenerateOptions): js.Promise[RsaKeys] = js.native
  // PEM-to-JWK
  def `import`(opts: ImportOptions): js.Promise[Jwk] = js.native
  def thumbprint(jwk: Jwk): js.Promise[_] = js.native
}

