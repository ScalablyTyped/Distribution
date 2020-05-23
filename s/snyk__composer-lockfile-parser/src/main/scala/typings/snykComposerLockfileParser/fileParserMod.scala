package typings.snykComposerLockfileParser

import typings.snykComposerLockfileParser.typesMod.ComposerJsonFile
import typings.snykComposerLockfileParser.typesMod.ComposerLockFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/composer-lockfile-parser/dist/parsers/file-parser", JSImport.Namespace)
@js.native
object fileParserMod extends js.Object {
  @js.native
  class FileParser () extends js.Object
  
  /* static members */
  @js.native
  object FileParser extends js.Object {
    def parseLockFile(lockFileContent: String): ComposerLockFile = js.native
    def parseManifestFile(manifestFileContent: String): ComposerJsonFile = js.native
  }
  
}

