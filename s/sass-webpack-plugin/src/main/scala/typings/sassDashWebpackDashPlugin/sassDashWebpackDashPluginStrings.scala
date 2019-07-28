package typings.sassDashWebpackDashPlugin

import typings.sassDashWebpackDashPlugin.sassDashWebpackDashPluginMod.NODE_ENV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sassDashWebpackDashPluginStrings {
  @js.native
  sealed trait development extends NODE_ENV
  
  @js.native
  sealed trait production extends NODE_ENV
  
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  @scala.inline
  def production: production = "production".asInstanceOf[production]
}

