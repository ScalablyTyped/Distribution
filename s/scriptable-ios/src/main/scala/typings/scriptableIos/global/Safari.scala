package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents a website._
  * @see https://docs.scriptable.app/safari
  */
object Safari {
  
  /**
    * _Presents a website._
    *
    * Presents a website in the Safari app, thus leaving the current app.
    * @param url - URL of website to present.
    * @see https://docs.scriptable.app/safari/#open
    */
  @JSGlobal("Safari.open")
  @js.native
  def open(url: String): Unit = js.native
  
  /**
    * _Presents a website in-app._
    *
    * Presents a website without leaving the app.
    * @param url - URL of website to present.
    * @param fullscreen - Optional. Set to true to display the web view in fullsceen. This only has an effect when used within the app. Defaults to true.
    * @see https://docs.scriptable.app/safari/#openinapp
    */
  @JSGlobal("Safari.openInApp")
  @js.native
  def openInApp(url: String): js.Promise[Unit] = js.native
  @JSGlobal("Safari.openInApp")
  @js.native
  def openInApp(url: String, fullscreen: Boolean): js.Promise[Unit] = js.native
}
