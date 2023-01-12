package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.Artifact.roles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
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
object Artifact {
  
  inline def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
    
    inline def setContents(value: ArtifactContent): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHashes(value: StringDictionary[String]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setLastModifiedTimeUtc(value: String): Self = StObject.set(x, "lastModifiedTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUtcUndefined: Self = StObject.set(x, "lastModifiedTimeUtc", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocation(value: ArtifactLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setParentIndex(value: Double): Self = StObject.set(x, "parentIndex", value.asInstanceOf[js.Any])
    
    inline def setParentIndexUndefined: Self = StObject.set(x, "parentIndex", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRoles(value: js.Array[roles]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: roles*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSourceLanguage(value: String): Self = StObject.set(x, "sourceLanguage", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageUndefined: Self = StObject.set(x, "sourceLanguage", js.undefined)
  }
  
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
    - typings.sarif.sarifStrings.`extension`
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
  trait roles extends StObject
  object roles {
    
    inline def added: typings.sarif.sarifStrings.added = "added".asInstanceOf[typings.sarif.sarifStrings.added]
    
    inline def analysisTarget: typings.sarif.sarifStrings.analysisTarget = "analysisTarget".asInstanceOf[typings.sarif.sarifStrings.analysisTarget]
    
    inline def attachment: typings.sarif.sarifStrings.attachment = "attachment".asInstanceOf[typings.sarif.sarifStrings.attachment]
    
    inline def debugOutputFile: typings.sarif.sarifStrings.debugOutputFile = "debugOutputFile".asInstanceOf[typings.sarif.sarifStrings.debugOutputFile]
    
    inline def deleted: typings.sarif.sarifStrings.deleted = "deleted".asInstanceOf[typings.sarif.sarifStrings.deleted]
    
    inline def directory: typings.sarif.sarifStrings.directory = "directory".asInstanceOf[typings.sarif.sarifStrings.directory]
    
    inline def driver: typings.sarif.sarifStrings.driver = "driver".asInstanceOf[typings.sarif.sarifStrings.driver]
    
    inline def `extension`: typings.sarif.sarifStrings.`extension` = "extension".asInstanceOf[typings.sarif.sarifStrings.`extension`]
    
    inline def memoryContents: typings.sarif.sarifStrings.memoryContents = "memoryContents".asInstanceOf[typings.sarif.sarifStrings.memoryContents]
    
    inline def modified: typings.sarif.sarifStrings.modified = "modified".asInstanceOf[typings.sarif.sarifStrings.modified]
    
    inline def policy: typings.sarif.sarifStrings.policy = "policy".asInstanceOf[typings.sarif.sarifStrings.policy]
    
    inline def referencedOnCommandLine: typings.sarif.sarifStrings.referencedOnCommandLine = "referencedOnCommandLine".asInstanceOf[typings.sarif.sarifStrings.referencedOnCommandLine]
    
    inline def renamed: typings.sarif.sarifStrings.renamed = "renamed".asInstanceOf[typings.sarif.sarifStrings.renamed]
    
    inline def responseFile: typings.sarif.sarifStrings.responseFile = "responseFile".asInstanceOf[typings.sarif.sarifStrings.responseFile]
    
    inline def resultFile: typings.sarif.sarifStrings.resultFile = "resultFile".asInstanceOf[typings.sarif.sarifStrings.resultFile]
    
    inline def standardStream: typings.sarif.sarifStrings.standardStream = "standardStream".asInstanceOf[typings.sarif.sarifStrings.standardStream]
    
    inline def taxonomy: typings.sarif.sarifStrings.taxonomy = "taxonomy".asInstanceOf[typings.sarif.sarifStrings.taxonomy]
    
    inline def toolSpecifiedConfiguration: typings.sarif.sarifStrings.toolSpecifiedConfiguration = "toolSpecifiedConfiguration".asInstanceOf[typings.sarif.sarifStrings.toolSpecifiedConfiguration]
    
    inline def tracedFile: typings.sarif.sarifStrings.tracedFile = "tracedFile".asInstanceOf[typings.sarif.sarifStrings.tracedFile]
    
    inline def translation: typings.sarif.sarifStrings.translation = "translation".asInstanceOf[typings.sarif.sarifStrings.translation]
    
    inline def uncontrolled: typings.sarif.sarifStrings.uncontrolled = "uncontrolled".asInstanceOf[typings.sarif.sarifStrings.uncontrolled]
    
    inline def unmodified: typings.sarif.sarifStrings.unmodified = "unmodified".asInstanceOf[typings.sarif.sarifStrings.unmodified]
    
    inline def userSpecifiedConfiguration: typings.sarif.sarifStrings.userSpecifiedConfiguration = "userSpecifiedConfiguration".asInstanceOf[typings.sarif.sarifStrings.userSpecifiedConfiguration]
  }
}
