package typings.sequelize.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hash of attributes to describe your search, accepting any field names. See `WhereOptions` for details.
  */
trait AnyWhereOptions
  extends /* field */ StringDictionary[js.Array[WhereOptions[_]] | js.Object]

object AnyWhereOptions {
  @scala.inline
  def apply(StringDictionary: /* field */ StringDictionary[js.Array[WhereOptions[_]] | js.Object] = null): AnyWhereOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnyWhereOptions]
  }
}

