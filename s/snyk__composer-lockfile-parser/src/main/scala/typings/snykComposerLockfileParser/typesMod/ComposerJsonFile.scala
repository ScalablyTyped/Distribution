package typings.snykComposerLockfileParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposerJsonFile extends js.Object {
  var extra: ComposerExtras
  var name: String
  var require: ComposerDependencies
  var `require-dev`: js.UndefOr[ComposerDependencies] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ComposerJsonFile {
  @scala.inline
  def apply(
    extra: ComposerExtras,
    name: String,
    require: ComposerDependencies,
    `require-dev`: ComposerDependencies = null,
    version: String = null
  ): ComposerJsonFile = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
    if (`require-dev` != null) __obj.updateDynamic("require-dev")(`require-dev`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposerJsonFile]
  }
}

