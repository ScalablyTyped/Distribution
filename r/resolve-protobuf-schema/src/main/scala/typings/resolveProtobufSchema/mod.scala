package typings.resolveProtobufSchema

import typings.protocolBuffersSchema.typesMod.Schema
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resolve-protobuf-schema", JSImport.Namespace)
  @js.native
  def apply(
    file: String,
    callback: js.Function2[/* error */ Error | Null, /* schema */ js.UndefOr[Schema], Unit]
  ): Unit = js.native
  
  @JSImport("resolve-protobuf-schema", "sync")
  @js.native
  def sync(file: String): Schema = js.native
}
