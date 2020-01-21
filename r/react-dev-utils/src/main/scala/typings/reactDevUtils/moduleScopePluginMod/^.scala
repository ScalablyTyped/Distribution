package typings.reactDevUtils.moduleScopePluginMod

import typings.webpack.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This Webpack plugin ensures that relative imports from app's source
  * directories don't reach outside of it.
  */
@JSImport("react-dev-utils/ModuleScopePlugin", JSImport.Namespace)
@js.native
class ^ protected () extends Plugin {
  def this(appSrc: String) = this()
  def this(appSrc: js.Array[String]) = this()
  def this(appSrc: String, allowedFiles: js.Array[String]) = this()
  def this(appSrc: js.Array[String], allowedFiles: js.Array[String]) = this()
}

