package typings.resolveProtobufSchema

import typings.protocolBuffersSchema.typesMod.Schema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("resolve-protobuf-schema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(
    file: String,
    callback: js.Function2[/* error */ Error | Null, /* schema */ js.UndefOr[Schema], Unit]
  ): Unit = js.native
  
  def sync(file: String): Schema = js.native
}
