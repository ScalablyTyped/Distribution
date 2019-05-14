package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismTheme extends js.Object {
  var plain: PrismThemeEntry
  var styles: js.Array[prismDashReactDashRendererLib.Anon_Languages]
}

object PrismTheme {
  @scala.inline
  def apply(plain: PrismThemeEntry, styles: js.Array[prismDashReactDashRendererLib.Anon_Languages]): PrismTheme = {
    val __obj = js.Dynamic.literal(plain = plain, styles = styles)
  
    __obj.asInstanceOf[PrismTheme]
  }
}

