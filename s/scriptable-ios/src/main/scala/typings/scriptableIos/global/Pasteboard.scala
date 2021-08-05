package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Copy and paste strings or images._
  * @see https://docs.scriptable.app/pasteboard
  */
object Pasteboard {
  
  @JSGlobal("Pasteboard")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Copies a string to the pasteboard._
    * @param string - The string to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copy
    */
  inline def copy(string: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Copies an image to the pasteboard._
    * @param image - The image to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copyimage
    */
  inline def copyImage(image: typings.scriptableIos.Image): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyImage")(image.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Copies a string to the pasteboard._
    * @param string - The string to copy to the pasteboard.
    * @see https://docs.scriptable.app/pasteboard/#copystring
    */
  inline def copyString(string: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyString")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Pastes a string from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#paste
    */
  inline def paste(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")().asInstanceOf[String]
  
  /**
    * _Pastes an image from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#pasteimage
    */
  inline def pasteImage(): typings.scriptableIos.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteImage")().asInstanceOf[typings.scriptableIos.Image]
  
  /**
    * _Pastes a string from the pasteboard._
    * @see https://docs.scriptable.app/pasteboard/#pastestring
    */
  inline def pasteString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteString")().asInstanceOf[String]
}
