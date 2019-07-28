package typings.riot.riotMod

import typings.std.Element
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
  def this(element: Element) = this()
  def this(element: Element, opts: TagOpts) = this()
}

