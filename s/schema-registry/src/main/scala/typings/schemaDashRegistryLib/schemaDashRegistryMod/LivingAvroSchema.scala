package typings
package schemaDashRegistryLib.schemaDashRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-registry", "LivingAvroSchema")
@js.native
class LivingAvroSchema protected () extends RegistryClient {
  def this(subject: java.lang.String, version: java.lang.String, config: RegistryClientConfig) = this()
  def fetch(): RegistryRequest = js.native
  def fetch(poll: scala.Boolean): RegistryRequest = js.native
  def fromBuffer(buffer: nodeLib.Buffer): js.Any = js.native
  def on(args: js.Any*): js.UndefOr[scala.Nothing] = js.native
  def removeListener(args: js.Any*): js.UndefOr[scala.Nothing] = js.native
  def stop(): js.UndefOr[scala.Nothing] = js.native
  def toBuffer(`object`: js.Object): nodeLib.Buffer = js.native
}

