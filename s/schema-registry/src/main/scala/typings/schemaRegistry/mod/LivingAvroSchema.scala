package typings.schemaRegistry.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("schema-registry", "LivingAvroSchema")
@js.native
class LivingAvroSchema protected () extends RegistryClient {
  def this(subject: String, version: String, config: RegistryClientConfig) = this()
  
  def fetch(): RegistryRequest = js.native
  def fetch(poll: Boolean): RegistryRequest = js.native
  
  def fromBuffer(buffer: Buffer): js.Any = js.native
  
  def on(args: js.Any*): js.UndefOr[scala.Nothing] = js.native
  
  def removeListener(args: js.Any*): js.UndefOr[scala.Nothing] = js.native
  
  def stop(): js.UndefOr[scala.Nothing] = js.native
  
  def toBuffer(`object`: js.Object): Buffer = js.native
}
