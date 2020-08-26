package typings.relayRuntime.relayConcreteNodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestParameters extends js.Object {
  val cacheID: js.UndefOr[String | Null] = js.native
   // 'mutation' | 'query' | 'subscription';
  val id: js.UndefOr[String | Null] = js.native
  val metadata: StringDictionary[js.Any] = js.native
  val name: String = js.native
  val operationKind: String = js.native
  val text: js.UndefOr[String | Null] = js.native
}

object RequestParameters {
  @scala.inline
  def apply(metadata: StringDictionary[js.Any], name: String, operationKind: String): RequestParameters = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
  @scala.inline
  implicit class RequestParametersOps[Self <: RequestParameters] (val x: Self) extends AnyVal {
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
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationKind(value: String): Self = this.set("operationKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheID(value: String): Self = this.set("cacheID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheID: Self = this.set("cacheID", js.undefined)
    @scala.inline
    def setCacheIDNull: Self = this.set("cacheID", null)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
  
}

