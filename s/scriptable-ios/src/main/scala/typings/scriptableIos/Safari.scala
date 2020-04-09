package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Presents a website._
  * @see https://docs.scriptable.app/safari
  */
@JSGlobal("Safari")
@js.native
object Safari extends js.Object {
  /**
    * _Presents a website._
    *
    * Presents a website in the Safari app, thus leaving the current app.
    * @param url - URL of website to present.
    * @see https://docs.scriptable.app/safari/#open
    */
  def open(url: String): Unit = js.native
  /**
    * _Presents a website in-app._
    *
    * Presents a website without leaving the app. To present a website and leave the app, take a look at the Application type.
    * @param url - URL of website to present.
    * @param fullscreen - Optional. Set to true to display the web view in fullsceen. This only has an effect when used within the app. Defaults to true.
    * @see https://docs.scriptable.app/safari/#openinapp
    */
  def openInApp(url: String): js.Promise[Unit] = js.native
  def openInApp(url: String, fullscreen: Boolean): js.Promise[Unit] = js.native
}

