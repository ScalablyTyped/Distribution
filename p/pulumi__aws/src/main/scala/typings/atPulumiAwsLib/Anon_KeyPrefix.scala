package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyPrefix extends js.Object {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_KeyPrefix {
  @scala.inline
  def apply(prefix: java.lang.String = null, tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null): Anon_KeyPrefix = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_KeyPrefix]
  }
}

