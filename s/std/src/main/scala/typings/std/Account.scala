package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////
/// DOM APIs
/////////////////////////////
trait Account extends js.Object {
  var displayName: java.lang.String
  var id: java.lang.String
  var imageURL: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rpDisplayName: java.lang.String
}

object Account {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    id: java.lang.String,
    rpDisplayName: java.lang.String,
    imageURL: java.lang.String = null,
    name: java.lang.String = null
  ): Account = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rpDisplayName = rpDisplayName.asInstanceOf[js.Any])
    if (imageURL != null) __obj.updateDynamic("imageURL")(imageURL.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

