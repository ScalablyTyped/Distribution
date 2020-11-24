package typings.sqsProducer.mod

import typings.node.Buffer
import typings.sqsProducer.sqsProducerStrings.Binary
import typings.sqsProducer.sqsProducerStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProducerMessageAttribute extends js.Object {
  
  var BinaryValue: js.UndefOr[Buffer] = js.native
  
  var DataType: String | Binary = js.native
  
  var StringValue: js.UndefOr[java.lang.String] = js.native
}
object ProducerMessageAttribute {
  
  @scala.inline
  def apply(DataType: String | Binary): ProducerMessageAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessageAttribute]
  }
  
  @scala.inline
  implicit class ProducerMessageAttributeOps[Self <: ProducerMessageAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataType(value: String | Binary): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValue(value: Buffer): Self = this.set("BinaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryValue: Self = this.set("BinaryValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: java.lang.String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("StringValue", js.undefined)
  }
}
