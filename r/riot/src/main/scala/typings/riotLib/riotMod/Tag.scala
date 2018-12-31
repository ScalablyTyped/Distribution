package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "Tag")
@js.native
abstract class Tag protected () extends TagInterface {
  /**
    * Tag constructor
    * @param element DOM element to mount tag on
    * @param opts Tag opts
    */
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, opts: TagOpts) = this()
}

