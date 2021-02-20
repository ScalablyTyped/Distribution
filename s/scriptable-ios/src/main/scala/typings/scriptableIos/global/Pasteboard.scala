package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Copy and paste strings or images._
  * @see https://docs.scriptable.app/pasteboard
  */
object Pasteboard {
  
  /**
    * _Copies a string to the pasteboard._
    * @param string - The string to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copy
    */
  @JSGlobal("Pasteboard.copy")
  @js.native
  def copy(string: String): Unit = js.native
  
  /**
    * _Copies an image to the pasteboard._
    * @param image - The image to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copyimage
    */
  @JSGlobal("Pasteboard.copyImage")
  @js.native
  def copyImage(image: typings.scriptableIos.Image): Unit = js.native
  
  /**
    * _Copies a string to the pasteboard._
    * @param string - The string to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copystring
    */
  @JSGlobal("Pasteboard.copyString")
  @js.native
  def copyString(string: String): Unit = js.native
  
  /**
    * _Pastes a string from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#paste
    */
  @JSGlobal("Pasteboard.paste")
  @js.native
  def paste(): String = js.native
  
  /**
    * _Pastes an image from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#pasteimage
    */
  @JSGlobal("Pasteboard.pasteImage")
  @js.native
  def pasteImage(): typings.scriptableIos.Image = js.native
  
  /**
    * _Pastes a string from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#pastestring
    */
  @JSGlobal("Pasteboard.pasteString")
  @js.native
  def pasteString(): String = js.native
}
