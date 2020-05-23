package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Copy and paste strings or images._
  * @see https://docs.scriptable.app/pasteboard
  */
@JSGlobal("Pasteboard")
@js.native
object Pasteboard extends js.Object {
  /**
    * _Copies a string to the pasteboard._
    * @param string - The string to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copy
    */
  def copy(string: String): Unit = js.native
  /**
    * _Copies an image to the pasteboard._
    * @param image - The image to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copyimage
    */
  def copyImage(image: typings.scriptableIos.Image): Unit = js.native
  /**
    * _Copies a string to the pasteboard._
    * @param string - The string to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copystring
    */
  def copyString(string: String): Unit = js.native
  /**
    * _Pastes a string from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#paste
    */
  def paste(): String = js.native
  /**
    * _Pastes an image from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#pasteimage
    */
  def pasteImage(): typings.scriptableIos.Image = js.native
  /**
    * _Pastes a string from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#pastestring
    */
  def pasteString(): String = js.native
}

