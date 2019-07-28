package typings.rename.renameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Specification extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var dirname: js.UndefOr[String] = js.undefined
  var extname: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object Specification {
  @scala.inline
  def apply(
    basename: String = null,
    dirname: String = null,
    extname: String = null,
    prefix: String = null,
    suffix: String = null
  ): Specification = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[Specification]
  }
}

