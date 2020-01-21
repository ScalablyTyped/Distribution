package typings.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectValueProps extends js.Object {
  /**
    * The object to describe.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
}

object ObjectValueProps {
  @scala.inline
  def apply(`object`: js.Any = null, styles: js.Object = null): ObjectValueProps = {
    val __obj = js.Dynamic.literal()
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValueProps]
  }
}

