package typings.reduxPersistTransformEncrypt.mod

import typings.reduxPersist.typesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist-transform-encrypt", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[State, Raw](config: EncryptorConfig): Transform[State, Raw, _, _] = js.native
}

