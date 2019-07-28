package typings.sarif.sarifMod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.sarifMod.ArtifactNs.roles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  /**
    * The contents of the artifact.
    */
  var contents: js.UndefOr[ArtifactContent] = js.undefined
  /**
    * A short description of the artifact.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * Specifies the encoding for an artifact object that refers to a text file.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of
    * the artifact produced by the specified hash function.
    */
  var hashes: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastModifiedTimeUtc: js.UndefOr[String] = js.undefined
  /**
    * The length of the artifact in bytes.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * The MIME type (RFC 2045) of the artifact.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * The offset in bytes of the artifact within its containing artifact.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
    */
  var parentIndex: js.UndefOr[Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the artifact.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The role or roles played by the artifact in the analysis.
    */
  var roles: js.UndefOr[js.Array[typings.sarif.sarifMod.ArtifactNs.roles]] = js.undefined
  /**
    * Specifies the source language for any artifact object that refers to a text file that contains source code.
    */
  var sourceLanguage: js.UndefOr[String] = js.undefined
}

object Artifact {
  @scala.inline
  def apply(
    contents: ArtifactContent = null,
    description: Message = null,
    encoding: String = null,
    hashes: StringDictionary[String] = null,
    lastModifiedTimeUtc: String = null,
    length: Int | Double = null,
    location: ArtifactLocation = null,
    mimeType: String = null,
    offset: Int | Double = null,
    parentIndex: Int | Double = null,
    properties: PropertyBag = null,
    roles: js.Array[roles] = null,
    sourceLanguage: String = null
  ): Artifact = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (hashes != null) __obj.updateDynamic("hashes")(hashes)
    if (lastModifiedTimeUtc != null) __obj.updateDynamic("lastModifiedTimeUtc")(lastModifiedTimeUtc)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (parentIndex != null) __obj.updateDynamic("parentIndex")(parentIndex.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (sourceLanguage != null) __obj.updateDynamic("sourceLanguage")(sourceLanguage)
    __obj.asInstanceOf[Artifact]
  }
}

