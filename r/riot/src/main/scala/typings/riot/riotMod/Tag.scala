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

@JSImport("riot", "tag")
@js.native
object tag extends js.Object {
  def apply[T /* <: TagInterface */](tagName: String, html: String): String = js.native
  def apply[T /* <: TagInterface */](tagName: String, html: String, css: String): String = js.native
  def apply[T /* <: TagInterface */](tagName: String, html: String, css: String, attrs: String): String = js.native
  def apply[T /* <: TagInterface */](
    tagName: String,
    html: String,
    css: String,
    attrs: String,
    constructor: js.ThisFunction1[/* this */ T, /* opts */ js.UndefOr[TagOpts], Unit]
  ): String = js.native
  def apply[T /* <: TagInterface */](
    tagName: String,
    html: Boolean,
    constructor: js.ThisFunction1[/* this */ T, /* opts */ js.UndefOr[TagOpts], Unit]
  ): String = js.native
}

