package typings
package rssLib.rssMod.NodeRSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlOptions extends js.Object {
  /**
    * What to use as a tab. Defaults to no tabs (compressed).
    * For example you can use '\t' for tab character, or ' '
    * for two-space tabs. If you set it to true it will use
    * four spaces.
    */
  var indent: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object XmlOptions {
  @scala.inline
  def apply(indent: scala.Boolean | java.lang.String = null): XmlOptions = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlOptions]
  }
}

