package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.Artifact.roles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact_ extends js.Object {
  /**
    * The contents of the artifact.
    */
  var contents: js.UndefOr[ArtifactContent] = js.native
  /**
    * A short description of the artifact.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * Specifies the encoding for an artifact object that refers to a text file.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of
    * the artifact produced by the specified hash function.
    */
  var hashes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastModifiedTimeUtc: js.UndefOr[String] = js.native
  /**
    * The length of the artifact in bytes.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.native
  /**
    * The MIME type (RFC 2045) of the artifact.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The offset in bytes of the artifact within its containing artifact.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
    */
  var parentIndex: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the artifact.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The role or roles played by the artifact in the analysis.
    */
  var roles: js.UndefOr[js.Array[roles]] = js.native
  /**
    * Specifies the source language for any artifact object that refers to a text file that contains source code.
    */
  var sourceLanguage: js.UndefOr[String] = js.native
}

object Artifact_ {
  @scala.inline
  def apply(): Artifact_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact_]
  }
  @scala.inline
  implicit class Artifact_Ops[Self <: Artifact_] (val x: Self) extends AnyVal {
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
    def setContents(value: ArtifactContent): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setHashes(value: StringDictionary[String]): Self = this.set("hashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashes: Self = this.set("hashes", js.undefined)
    @scala.inline
    def setLastModifiedTimeUtc(value: String): Self = this.set("lastModifiedTimeUtc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimeUtc: Self = this.set("lastModifiedTimeUtc", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLocation(value: ArtifactLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setParentIndex(value: Double): Self = this.set("parentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentIndex: Self = this.set("parentIndex", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRolesVarargs(value: roles*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[roles]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    @scala.inline
    def setSourceLanguage(value: String): Self = this.set("sourceLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceLanguage: Self = this.set("sourceLanguage", js.undefined)
  }
  
}

