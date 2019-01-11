package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val settings: riotLib.riotMod.Settings = js.native
  val util: riotLib.riotMod.Util = js.native
  val version: java.lang.String = js.native
  def compile(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def compile(tag: java.lang.String): java.lang.String = js.native
  def compile(tag: java.lang.String, skipExecution: scala.Boolean): java.lang.String = js.native
  def compile(url: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def mixin(mixinName: java.lang.String, mixinObject: riotLib.riotMod.TagMixin): scala.Unit = js.native
  def mixin(mixinObject: riotLib.riotMod.TagMixin): scala.Unit = js.native
  def mount(selector: java.lang.String): js.Array[riotLib.riotMod.TagInstance] = js.native
  def mount(selector: java.lang.String, opts: riotLib.riotMod.TagOpts): js.Array[riotLib.riotMod.TagInstance] = js.native
  def mount(selector: java.lang.String, tagName: java.lang.String): js.Array[riotLib.riotMod.TagInstance] = js.native
  def mount(selector: java.lang.String, tagName: java.lang.String, opts: riotLib.riotMod.TagOpts): js.Array[riotLib.riotMod.TagInstance] = js.native
  def mount(selector: stdLib.Element, tagName: java.lang.String): js.Array[riotLib.riotMod.TagInstance] = js.native
  def mount(selector: stdLib.Element, tagName: java.lang.String, opts: riotLib.riotMod.TagOpts): js.Array[riotLib.riotMod.TagInstance] = js.native
  def observable(): riotLib.riotMod.Observable = js.native
  def observable(el: js.Any): riotLib.riotMod.Observable = js.native
  def render(tagName: java.lang.String): java.lang.String = js.native
  def render(tagName: java.lang.String, opts: riotLib.riotMod.TagOpts): java.lang.String = js.native
  def renderAsync(tagName: java.lang.String): js.Promise[java.lang.String] = js.native
  def renderAsync(tagName: java.lang.String, opts: riotLib.riotMod.TagOpts): js.Promise[java.lang.String] = js.native
  def require(tagPath: java.lang.String): java.lang.String = js.native
  def require(tagPath: java.lang.String, opts: js.Any): java.lang.String = js.native
  def tag[T /* <: riotLib.riotMod.TagInterface */](tagName: java.lang.String, html: java.lang.String): java.lang.String = js.native
  def tag[T /* <: riotLib.riotMod.TagInterface */](tagName: java.lang.String, html: java.lang.String, css: java.lang.String): java.lang.String = js.native
  def tag[T /* <: riotLib.riotMod.TagInterface */](tagName: java.lang.String, html: java.lang.String, css: java.lang.String, attrs: java.lang.String): java.lang.String = js.native
  def tag[T /* <: riotLib.riotMod.TagInterface */](
    tagName: java.lang.String,
    html: java.lang.String,
    css: java.lang.String,
    attrs: java.lang.String,
    constructor: js.ThisFunction1[/* this */ T, /* opts */ js.UndefOr[riotLib.riotMod.TagOpts], scala.Unit]
  ): java.lang.String = js.native
  def tag[T /* <: riotLib.riotMod.TagInterface */](
    tagName: java.lang.String,
    html: scala.Boolean,
    constructor: js.ThisFunction1[/* this */ T, /* opts */ js.UndefOr[riotLib.riotMod.TagOpts], scala.Unit]
  ): java.lang.String = js.native
  def unregister(tagName: java.lang.String): scala.Unit = js.native
  def update(): js.Array[riotLib.riotMod.TagInstance] = js.native
}

