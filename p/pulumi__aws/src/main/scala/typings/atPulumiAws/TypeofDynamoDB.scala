package typings.atPulumiAws

import org.scalablytyped.runtime.Instantiable0
import typings.awsDashSdk.awsDashSdkMod.DynamoDB.DocumentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofDynamoDB extends js.Object {
  var Converter: js.Any | TypeofClassConverter
  var DocumentClient: js.Any | Instantiable0[typings.awsDashSdk.awsDashSdkMod.DynamoDB.DocumentClient]
  val Types: this.type
}

object TypeofDynamoDB {
  @scala.inline
  def apply(
    Converter: TypeofClassConverter,
    DocumentClient: Instantiable0[DocumentClient],
    Types: TypeofDynamoDB
  ): TypeofDynamoDB = {
    val __obj = js.Dynamic.literal(Converter = Converter, DocumentClient = DocumentClient, Types = Types)
  
    __obj.asInstanceOf[TypeofDynamoDB]
  }
}

