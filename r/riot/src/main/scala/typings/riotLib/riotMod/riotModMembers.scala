package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", JSImport.Namespace)
@js.native
object riotModMembers extends js.Object {
  val settings: Settings = js.native
  val util: Util = js.native
  val version: java.lang.String = js.native
  def compile(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def compile(tag: java.lang.String): java.lang.String = js.native
  def compile(tag: java.lang.String, skipExecution: scala.Boolean): java.lang.String = js.native
  def compile(url: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def mixin(mixinName: java.lang.String, mixinObject: TagMixin): scala.Unit = js.native
  def mixin(mixinObject: TagMixin): scala.Unit = js.native
  def mount(selector: java.lang.String): js.Array[TagInstance] = js.native
  def mount(selector: java.lang.String, opts: TagOpts): js.Array[TagInstance] = js.native
  def mount(selector: java.lang.String, tagName: java.lang.String): js.Array[TagInstance] = js.native
  def mount(selector: java.lang.String, tagName: java.lang.String, opts: TagOpts): js.Array[TagInstance] = js.native
  def mount(selector: stdLib.Element, tagName: java.lang.String): js.Array[TagInstance] = js.native
  def mount(selector: stdLib.Element, tagName: java.lang.String, opts: TagOpts): js.Array[TagInstance] = js.native
  def observable(): Observable = js.native
  def observable(el: js.Any): Observable = js.native
  def render(tagName: java.lang.String): java.lang.String = js.native
  def render(tagName: java.lang.String, opts: TagOpts): java.lang.String = js.native
  def renderAsync(tagName: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def renderAsync(tagName: java.lang.String, opts: TagOpts): stdLib.Promise[java.lang.String] = js.native
  def require(tagPath: java.lang.String): java.lang.String = js.native
  def require(tagPath: java.lang.String, opts: js.Any): java.lang.String = js.native
  def tag[T /* <: TagInterface */](tagName: java.lang.String, html: java.lang.String): java.lang.String = js.native
  def tag[T /* <: TagInterface */](tagName: java.lang.String, html: java.lang.String, css: java.lang.String): java.lang.String = js.native
  def tag[T /* <: TagInterface */](tagName: java.lang.String, html: java.lang.String, css: java.lang.String, attrs: java.lang.String): java.lang.String = js.native
  def tag[T /* <: TagInterface */](
    tagName: java.lang.String,
    html: java.lang.String,
    css: java.lang.String,
    attrs: java.lang.String,
    constructor: js.ThisFunction1[/* this */ T, /* opts */ js.UndefOr[TagOpts], scala.Unit]
  ): java.lang.String = js.native
  def tag[T /* <: TagInterface */](
    tagName: java.lang.String,
    html: scala.Boolean,
    constructor: js.ThisFunction1[/* this */ T, /* opts */ js.UndefOr[TagOpts], scala.Unit]
  ): java.lang.String = js.native
  def unregister(tagName: java.lang.String): scala.Unit = js.native
  def update(): js.Array[TagInstance] = js.native
}

