package typings.resolveProtobufSchema

import typings.protocolBuffersSchema.typesMod.Schema
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    file: String,
    callback: js.Function2[/* error */ Error | Null, /* schema */ js.UndefOr[Schema], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("resolve-protobuf-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(file: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(file.asInstanceOf[js.Any]).asInstanceOf[Schema]
}
