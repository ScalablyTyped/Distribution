package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents a website._
  * @see https://docs.scriptable.app/safari
  */
object Safari {
  
  @JSGlobal("Safari")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Presents a website._
    *
    * Presents a website in the Safari app, thus leaving the current app.
    * @param url - URL of website to present.
    * @see https://docs.scriptable.app/safari/#open
    */
  @scala.inline
  def open(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Presents a website in-app._
    *
    * Presents a website without leaving the app.
    * @param url - URL of website to present.
    * @param fullscreen - Optional. Set to true to display the web view in fullsceen. This only has an effect when used within the app. Defaults to true.
    * @see https://docs.scriptable.app/safari/#openinapp
    */
  @scala.inline
  def openInApp(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openInApp")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def openInApp(url: String, fullscreen: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openInApp")(url.asInstanceOf[js.Any], fullscreen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
