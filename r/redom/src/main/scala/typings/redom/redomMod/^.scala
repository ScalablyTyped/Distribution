package typings.redom.redomMod

import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def el(query: RedomQuery, args: RedomQueryArgument*): HTMLElement = js.native
  def h(query: RedomQuery, args: RedomQueryArgument*): HTMLElement = js.native
  def html(query: RedomQuery, args: RedomQueryArgument*): HTMLElement = js.native
  def list(parent: RedomQuery, View: RedomComponentConstructor): List = js.native
  def list(parent: RedomQuery, View: RedomComponentConstructor, key: String): List = js.native
  def list(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): List = js.native
  def listPool(View: RedomComponentConstructor): ListPool = js.native
  def listPool(View: RedomComponentConstructor, key: String): ListPool = js.native
  def listPool(View: RedomComponentConstructor, key: String, initData: js.Any): ListPool = js.native
  def mount(parent: RedomElement, child: RedomElement): RedomElement = js.native
  def mount(parent: RedomElement, child: RedomElement, before: RedomElement): RedomElement = js.native
  def place(View: RedomComponentConstructor): Place = js.native
  def place(View: RedomComponentConstructor, initData: js.Any): Place = js.native
  def router(parent: RedomQuery, Views: RouterDictionary): Router = js.native
  def router(parent: RedomQuery, Views: RouterDictionary, initData: js.Any): Router = js.native
  def s(query: RedomQuery, args: RedomQueryArgument*): SVGElement = js.native
  def setAttr(view: RedomElement, arg1: String): Unit = js.native
  def setAttr(view: RedomElement, arg1: String, arg2: String): Unit = js.native
  def setAttr(view: RedomElement, arg1: js.Object): Unit = js.native
  def setAttr(view: RedomElement, arg1: js.Object, arg2: String): Unit = js.native
  def setChildren(parent: RedomElement, children: js.Array[RedomElement]): Unit = js.native
  def setStyle(view: RedomElement, arg1: String): Unit = js.native
  def setStyle(view: RedomElement, arg1: String, arg2: String): Unit = js.native
  def setStyle(view: RedomElement, arg1: js.Object): Unit = js.native
  def setStyle(view: RedomElement, arg1: js.Object, arg2: String): Unit = js.native
  def svg(query: RedomQuery, args: RedomQueryArgument*): SVGElement = js.native
  def text(str: String): Text = js.native
  def unmount(parent: RedomElement, child: RedomElement): RedomElement = js.native
}

