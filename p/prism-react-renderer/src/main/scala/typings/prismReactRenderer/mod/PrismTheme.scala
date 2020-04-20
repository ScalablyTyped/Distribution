package typings.prismReactRenderer.mod

import typings.prismReactRenderer.AnonLanguages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismTheme extends js.Object {
  var plain: PrismThemeEntry
  var styles: js.Array[AnonLanguages]
}

object PrismTheme {
  @scala.inline
  def apply(plain: PrismThemeEntry, styles: js.Array[AnonLanguages]): PrismTheme = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismTheme]
  }
}

