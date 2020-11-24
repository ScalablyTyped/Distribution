package typings.sonarJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tiny library for detecting when a browser is scrolled to the bottom of a web page.
  *
  * You could use this, for example, on a blog to show a popover when a reader has finished a post,
  * letting them know they can receive new posts by email if they submit their email address.
  */
@js.native
trait Sonar extends js.Object {
  
  def ping(range: Double): Unit = js.native
  def ping(range: Double, bottomFoundCallback: js.UndefOr[scala.Nothing], bottomLostCallback: SonarCallback): Unit = js.native
  def ping(range: Double, bottomFoundCallback: SonarCallback): Unit = js.native
  def ping(range: Double, bottomFoundCallback: SonarCallback, bottomLostCallback: SonarCallback): Unit = js.native
  
  def stop(): Unit = js.native
  
  var withinRangeOfPageBottom: js.UndefOr[Boolean] = js.native
}
