package typings.sarif.sarifMod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.sarifMod.Artifact.roles
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
  var roles: js.UndefOr[js.Array[roles]] = js.undefined
  /**
    * Specifies the source language for any artifact object that refers to a text file that contains source code.
    */
  var sourceLanguage: js.UndefOr[String] = js.undefined
}

@JSImport("sarif", "Artifact")
@js.native
object Artifact extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.analysisTarget
    - typings.sarif.sarifStrings.attachment
    - typings.sarif.sarifStrings.responseFile
    - typings.sarif.sarifStrings.resultFile
    - typings.sarif.sarifStrings.standardStream
    - typings.sarif.sarifStrings.tracedFile
    - typings.sarif.sarifStrings.unmodified
    - typings.sarif.sarifStrings.modified
    - typings.sarif.sarifStrings.added
    - typings.sarif.sarifStrings.deleted
    - typings.sarif.sarifStrings.renamed
    - typings.sarif.sarifStrings.uncontrolled
    - typings.sarif.sarifStrings.driver
    - typings.sarif.sarifStrings.extension
    - typings.sarif.sarifStrings.translation
    - typings.sarif.sarifStrings.taxonomy
    - typings.sarif.sarifStrings.policy
    - typings.sarif.sarifStrings.referencedOnCommandLine
    - typings.sarif.sarifStrings.memoryContents
    - typings.sarif.sarifStrings.directory
    - typings.sarif.sarifStrings.userSpecifiedConfiguration
    - typings.sarif.sarifStrings.toolSpecifiedConfiguration
    - typings.sarif.sarifStrings.debugOutputFile
  */
  trait roles extends js.Object
  
}

