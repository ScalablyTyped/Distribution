package typings.scrambo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scrambo extends js.Object {
  
  /**
    * Returns an array of random scrambles with the given length
    * for the configured scrambler type.
    * @param number defaults to 1
    */
  def get(): js.Array[String] = js.native
  def get(number: Double): js.Array[String] = js.native
  
  /**
    * Returns the currently configured scramble length.
    */
  def length(): Double = js.native
  /**
    * Sets this instance's scramble length and returns the original instance.
    * @param length
    */
  def length(length: Double): Scrambo = js.native
  
  /**
    * Returns the current seed type of this scrambler.
    */
  def seed(): Double = js.native
  /**
    * Sets this instance's seed and returns the original instance.
    * @param seed
    */
  def seed(seed: Double): Scrambo = js.native
  
  /**
    * Returns the currently configured scrambler type.
    */
  def `type`(): ScrambleType = js.native
  /**
    * Sets this instance's scrambler type and returns the original instance.
    * @param type
    */
  def `type`(`type`: ScrambleType): Scrambo = js.native
}
