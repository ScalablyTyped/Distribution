package typings.snykCocoapodsLockfileParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in @snyk/cocoapods-lockfile-parser.@snyk/cocoapods-lockfile-parser/dist/types.ExternalSourceInfoKey ]:? string} */
trait ExternalSourceInfo extends js.Object {
  @JSName(":branch")
  var Colonbranch: js.UndefOr[String] = js.undefined
  @JSName(":commit")
  var Coloncommit: js.UndefOr[String] = js.undefined
  @JSName(":git")
  var Colongit: js.UndefOr[String] = js.undefined
  @JSName(":path")
  var Colonpath: js.UndefOr[String] = js.undefined
  @JSName(":podspec")
  var Colonpodspec: js.UndefOr[String] = js.undefined
  @JSName(":tag")
  var Colontag: js.UndefOr[String] = js.undefined
}

object ExternalSourceInfo {
  @scala.inline
  def apply(
    Colonbranch: String = null,
    Coloncommit: String = null,
    Colongit: String = null,
    Colonpath: String = null,
    Colonpodspec: String = null,
    Colontag: String = null
  ): ExternalSourceInfo = {
    val __obj = js.Dynamic.literal()
    if (Colonbranch != null) __obj.updateDynamic(":branch")(Colonbranch.asInstanceOf[js.Any])
    if (Coloncommit != null) __obj.updateDynamic(":commit")(Coloncommit.asInstanceOf[js.Any])
    if (Colongit != null) __obj.updateDynamic(":git")(Colongit.asInstanceOf[js.Any])
    if (Colonpath != null) __obj.updateDynamic(":path")(Colonpath.asInstanceOf[js.Any])
    if (Colonpodspec != null) __obj.updateDynamic(":podspec")(Colonpodspec.asInstanceOf[js.Any])
    if (Colontag != null) __obj.updateDynamic(":tag")(Colontag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalSourceInfo]
  }
}

