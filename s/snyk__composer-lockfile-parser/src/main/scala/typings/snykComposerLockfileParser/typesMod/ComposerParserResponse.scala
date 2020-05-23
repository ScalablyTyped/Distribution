package typings.snykComposerLockfileParser.typesMod

import typings.snykComposerLockfileParser.snykComposerLockfileParserStrings.composerColon0Dot0Dot1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposerParserResponse extends js.Object {
  var dependencies: DepTreeDependencies
  var hasDevDependencies: Boolean
  var name: String
  var packageFormatVersion: composerColon0Dot0Dot1
  var version: String
}

object ComposerParserResponse {
  @scala.inline
  def apply(
    dependencies: DepTreeDependencies,
    hasDevDependencies: Boolean,
    name: String,
    packageFormatVersion: composerColon0Dot0Dot1,
    version: String
  ): ComposerParserResponse = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], hasDevDependencies = hasDevDependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageFormatVersion = packageFormatVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposerParserResponse]
  }
}

