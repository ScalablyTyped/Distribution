package typings
package sassDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sassDashWebpackDashPluginLibStrings {
  @js.native
  sealed trait development
    extends sassDashWebpackDashPluginLib.sassDashWebpackDashPluginMod.SassPluginNs.NODE_ENV
  
  @js.native
  sealed trait production
    extends sassDashWebpackDashPluginLib.sassDashWebpackDashPluginMod.SassPluginNs.NODE_ENV
  
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  @scala.inline
  def production: production = "production".asInstanceOf[production]
}

