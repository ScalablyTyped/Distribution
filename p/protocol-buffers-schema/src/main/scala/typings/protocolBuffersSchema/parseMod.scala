package typings.protocolBuffersSchema

import typings.node.Buffer
import typings.protocolBuffersSchema.typesMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("protocol-buffers-schema/parse", JSImport.Namespace)
  @js.native
  def apply(buffer: String): Schema = js.native
  @JSImport("protocol-buffers-schema/parse", JSImport.Namespace)
  @js.native
  def apply(buffer: Buffer): Schema = js.native
  
  @JSImport("protocol-buffers-schema/parse", "parse")
  @js.native
  def parse(buffer: String): Schema = js.native
  @JSImport("protocol-buffers-schema/parse", "parse")
  @js.native
  def parse(buffer: Buffer): Schema = js.native
  
  @JSImport("protocol-buffers-schema/parse", "stringify")
  @js.native
  def stringify(schema: Schema): String = js.native
}
