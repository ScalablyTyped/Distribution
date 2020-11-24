package typings.sonarJs.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tiny library for detecting when a browser is scrolled to the bottom of a web page.
  *
  * You could use this, for example, on a blog to show a popover when a reader has finished a post,
  * letting them know they can receive new posts by email if they submit their email address.
  */
@JSImport("sonar-js", JSImport.Namespace)
@js.native
class ^ protected () extends Sonar {
  def this(window: Window) = this()
}
