package typings.protocolDashBuffersDashSchema

import typings.node.Buffer
import typings.protocolDashBuffersDashSchema.typesMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protocol-buffers-schema", JSImport.Namespace)
@js.native
object protocolDashBuffersDashSchemaMod extends js.Object {
  def apply(buffer: Buffer | String): Schema = js.native
  def parse(buffer: String): Schema = js.native
  def parse(buffer: Buffer): Schema = js.native
  def stringify(schema: Schema): String = js.native
}

