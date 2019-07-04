package typings
package resolveDashProtobufDashSchemaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve-protobuf-schema", JSImport.Namespace)
@js.native
object resolveDashProtobufDashSchemaMod extends js.Object {
  def apply(
    file: java.lang.String,
    callback: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* schema */ js.UndefOr[protocolDashBuffersDashSchemaLib.typesMod.Schema], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sync(file: java.lang.String): protocolDashBuffersDashSchemaLib.typesMod.Schema = js.native
}

