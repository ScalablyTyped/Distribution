package typings.riot.riotMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val settings: Settings = js.native
  val util: Util = js.native
  val version: String = js.native
  def compile(callback: js.Function0[Unit]): Unit = js.native
  def compile(tag: String): String = js.native
  def compile(tag: String, skipExecution: Boolean): String = js.native
  def compile(url: String, callback: js.Function0[Unit]): Unit = js.native
  def mixin(mixinName: String, mixinObject: TagMixin): Unit = js.native
  def mixin(mixinObject: TagMixin): Unit = js.native
  def mount(selector: String): js.Array[TagInstance] = js.native
  def mount(selector: String, opts: TagOpts): js.Array[TagInstance] = js.native
  def mount(selector: String, tagName: String): js.Array[TagInstance] = js.native
  def mount(selector: String, tagName: String, opts: TagOpts): js.Array[TagInstance] = js.native
  def mount(selector: Element, tagName: String): js.Array[TagInstance] = js.native
  def mount(selector: Element, tagName: String, opts: TagOpts): js.Array[TagInstance] = js.native
  def observable(): Observable = js.native
  def observable(el: js.Any): Observable = js.native
  def render(tagName: String): String = js.native
  def render(tagName: String, opts: TagOpts): String = js.native
  def renderAsync(tagName: String): js.Promise[String] = js.native
  def renderAsync(tagName: String, opts: TagOpts): js.Promise[String] = js.native
  def require(tagPath: String): String = js.native
  def require(tagPath: String, opts: js.Any): String = js.native
  def tag[T /* <: TagInterface */](tagName: String, html: String): String = js.native
  def tag[T /* <: TagInterface */](tagName: String, html: String, css: String): String = js.native
  def tag[T /* <: TagInterface */](tagName: String, html: String, css: String, attrs: String): String = js.native
  def tag[T /* <: TagInterface */](
    tagName: String,
    html: String,
    css: String,
    attrs: String,
    constructor: js.ThisFunction1[/* this */ T, /* opts */ js.UndefOr[TagOpts], Unit]
  ): String = js.native
  def tag[T /* <: TagInterface */](
    tagName: String,
    html: Boolean,
    constructor: js.ThisFunction1[/* this */ T, /* opts */ js.UndefOr[TagOpts], Unit]
  ): String = js.native
  def unregister(tagName: String): Unit = js.native
  def update(): js.Array[TagInstance] = js.native
}

