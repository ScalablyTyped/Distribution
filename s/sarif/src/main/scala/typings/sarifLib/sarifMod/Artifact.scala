package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  /**
    * The contents of the artifact.
    */
  var contents: js.UndefOr[ArtifactContent] = js.undefined
  /**
    * Specifies the encoding for an artifact object that refers to a text file.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of
    * the artifact produced by the specified hash function.
    */
  var hashes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastModifiedTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The length of the artifact in bytes.
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * The MIME type (RFC 2045) of the artifact.
    */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The offset in bytes of the artifact within its containing artifact.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
    */
  var parentIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the artifact.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The role or roles played by the artifact in the analysis.
    */
  var roles: js.UndefOr[js.Array[sarifLib.sarifMod.ArtifactNs.roles]] = js.undefined
  /**
    * Specifies the source language for any artifact object that refers to a text file that contains source code.
    */
  var sourceLanguage: js.UndefOr[java.lang.String] = js.undefined
}

object Artifact {
  @scala.inline
  def apply(
    contents: ArtifactContent = null,
    encoding: java.lang.String = null,
    hashes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    lastModifiedTimeUtc: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    location: ArtifactLocation = null,
    mimeType: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    parentIndex: scala.Int | scala.Double = null,
    properties: PropertyBag = null,
    roles: js.Array[sarifLib.sarifMod.ArtifactNs.roles] = null,
    sourceLanguage: java.lang.String = null
  ): Artifact = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents)
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

