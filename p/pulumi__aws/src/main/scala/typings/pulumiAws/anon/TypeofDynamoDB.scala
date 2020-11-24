package typings.pulumiAws.anon

import org.scalablytyped.runtime.Instantiable0
import typings.awsSdk.mod.DynamoDB.DocumentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDynamoDB extends js.Object {
  
  val Converter: TypeofConverter = js.native
  
  val DocumentClient: Instantiable0[typings.awsSdk.mod.DynamoDB.DocumentClient] = js.native
  
  val Types: this.type = js.native
}
object TypeofDynamoDB {
  
  @scala.inline
  def apply(Converter: TypeofConverter, DocumentClient: Instantiable0[DocumentClient], Types: TypeofDynamoDB): TypeofDynamoDB = {
    val __obj = js.Dynamic.literal(Converter = Converter.asInstanceOf[js.Any], DocumentClient = DocumentClient.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDynamoDB]
  }
  
  @scala.inline
  implicit class TypeofDynamoDBOps[Self <: TypeofDynamoDB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConverter(value: TypeofConverter): Self = this.set("Converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentClient(value: Instantiable0[DocumentClient]): Self = this.set("DocumentClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: TypeofDynamoDB): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
