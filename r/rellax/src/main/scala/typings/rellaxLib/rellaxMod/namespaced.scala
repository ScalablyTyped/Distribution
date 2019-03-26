package typings
package rellaxLib.rellaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rellax", JSImport.Namespace)
@js.native
/**
  * Inits and starts the Parallax animations
  * @param el Single element or string with selector of elements
  * @param options Options
  */
class namespaced ()
  extends rellaxLib.rellaxMod.RellaxNs.RellaxInstance {
  def this(el: java.lang.String) = this()
  def this(el: stdLib.Element) = this()
  def this(el: java.lang.String, options: rellaxLib.rellaxMod.RellaxNs.RellaxOptions) = this()
  def this(el: stdLib.Element, options: rellaxLib.rellaxMod.RellaxNs.RellaxOptions) = this()
  /**
    * Rellax elements
    */
  /* CompleteClass */
  override var elms: stdLib.NodeListOf[stdLib.Element] | js.Array[stdLib.Element] = js.native
  /**
    * Options
    */
  /* CompleteClass */
  override var options: rellaxLib.rellaxMod.RellaxNs.RellaxOptions = js.native
  /**
    * End Rellax and reset parallax elements to their original positions
    */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
    * Destroy and create again parallax with previous settings
    */
  /* CompleteClass */
  override def refresh(): scala.Unit = js.native
}

