package typings.pulumiAws.outputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointMongodbSettings extends js.Object {
  /**
    * Authentication mechanism to access the MongoDB source endpoint. Defaults to `default`.
    */
  var authMechanism: js.UndefOr[String] = js.native
  /**
    * Authentication database name. Not used when `authType` is `no`. Defaults to `admin`.
    */
  var authSource: js.UndefOr[String] = js.native
  /**
    * Authentication type to access the MongoDB source endpoint. Defaults to `password`.
    */
  var authType: js.UndefOr[String] = js.native
  /**
    * Number of documents to preview to determine the document organization. Use this setting when `nestingLevel` is set to `one`. Defaults to `1000`.
    */
  var docsToInvestigate: js.UndefOr[String] = js.native
  /**
    * Document ID. Use this setting when `nestingLevel` is set to `none`. Defaults to `false`.
    */
  var extractDocId: js.UndefOr[String] = js.native
  /**
    * Specifies either document or table mode. Defaults to `none`. Valid values are `one` (table mode) and `none` (document mode).
    */
  var nestingLevel: js.UndefOr[String] = js.native
}

object EndpointMongodbSettings {
  @scala.inline
  def apply(): EndpointMongodbSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointMongodbSettings]
  }
  @scala.inline
  implicit class EndpointMongodbSettingsOps[Self <: EndpointMongodbSettings] (val x: Self) extends AnyVal {
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
    def setAuthMechanism(value: String): Self = this.set("authMechanism", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthMechanism: Self = this.set("authMechanism", js.undefined)
    @scala.inline
    def setAuthSource(value: String): Self = this.set("authSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthSource: Self = this.set("authSource", js.undefined)
    @scala.inline
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
    @scala.inline
    def setDocsToInvestigate(value: String): Self = this.set("docsToInvestigate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocsToInvestigate: Self = this.set("docsToInvestigate", js.undefined)
    @scala.inline
    def setExtractDocId(value: String): Self = this.set("extractDocId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractDocId: Self = this.set("extractDocId", js.undefined)
    @scala.inline
    def setNestingLevel(value: String): Self = this.set("nestingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingLevel: Self = this.set("nestingLevel", js.undefined)
  }
  
}

