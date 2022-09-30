package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a keyboard-like input device.
  */
@js.native
trait Keyboard extends StObject {
  
  /** `true` if Caps Lock is active, otherwise `false`. */
  val capsLock: Boolean = js.native
  
  /**
    * Get the printable string representation of a keyboard key, if one exists.
    * @param key A member of `Key` specifying the keyboard key.
    * @param shifted `true` for a shifted version of the key (i.e. pretend `Shift` is pressed).
    * @returns The printable string representation of the key, or an empty string for non-printable
    *          keys.
    */
  def charOf(key: Key): String = js.native
  def charOf(key: Key, shifted: Boolean): String = js.native
  
  /** Clear any keys from the keyboard queue that haven't yet been retrieved with `getKey`. */
  def clearQueue(): Unit = js.native
  
  /**
    * Get the next key in the keyboard queue. The key is removed from the queue.
    * @returns The next key in the keyboard queue, or `null` if the queue was empty.
    */
  def getKey(): Key | Null = js.native
  
  /**
    * Get a Boolean value indicating whether a given key is currently pressed down.
    * @param key A member of `Key` naming the keyboard key to check.
    * @returns `true` if the key is currently pressed, otherwise `false`.
    */
  def isPressed(key: Key): Boolean = js.native
  
  /** `true` if Num Lock is active, otherwise false. */
  val numLock: Boolean = js.native
  
  /** `true` if Scroll Lock is active, otherwise false. Not all keyboards support Scroll Lock. */
  val scrollLock: Boolean = js.native
}
