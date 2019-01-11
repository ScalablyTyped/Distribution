package typings
package redomLib.redomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def el(query: redomLib.redomMod.RedomQuery, args: redomLib.redomMod.RedomQueryArgument*): stdLib.HTMLElement = js.native
  def h(query: redomLib.redomMod.RedomQuery, args: redomLib.redomMod.RedomQueryArgument*): stdLib.HTMLElement = js.native
  def html(query: redomLib.redomMod.RedomQuery, args: redomLib.redomMod.RedomQueryArgument*): stdLib.HTMLElement = js.native
  def list(parent: redomLib.redomMod.RedomQuery, View: redomLib.redomMod.RedomComponentConstructor): redomLib.redomMod.List = js.native
  def list(
    parent: redomLib.redomMod.RedomQuery,
    View: redomLib.redomMod.RedomComponentConstructor,
    key: java.lang.String
  ): redomLib.redomMod.List = js.native
  def list(
    parent: redomLib.redomMod.RedomQuery,
    View: redomLib.redomMod.RedomComponentConstructor,
    key: java.lang.String,
    initData: js.Any
  ): redomLib.redomMod.List = js.native
  def listPool(View: redomLib.redomMod.RedomComponentConstructor): redomLib.redomMod.ListPool = js.native
  def listPool(View: redomLib.redomMod.RedomComponentConstructor, key: java.lang.String): redomLib.redomMod.ListPool = js.native
  def listPool(View: redomLib.redomMod.RedomComponentConstructor, key: java.lang.String, initData: js.Any): redomLib.redomMod.ListPool = js.native
  def mount(parent: redomLib.redomMod.RedomElement, child: redomLib.redomMod.RedomElement): redomLib.redomMod.RedomElement = js.native
  def mount(
    parent: redomLib.redomMod.RedomElement,
    child: redomLib.redomMod.RedomElement,
    before: redomLib.redomMod.RedomElement
  ): redomLib.redomMod.RedomElement = js.native
  def place(View: redomLib.redomMod.RedomComponentConstructor): redomLib.redomMod.Place = js.native
  def place(View: redomLib.redomMod.RedomComponentConstructor, initData: js.Any): redomLib.redomMod.Place = js.native
  def router(parent: redomLib.redomMod.RedomQuery, Views: redomLib.redomMod.RouterDictionary): redomLib.redomMod.Router = js.native
  def router(parent: redomLib.redomMod.RedomQuery, Views: redomLib.redomMod.RouterDictionary, initData: js.Any): redomLib.redomMod.Router = js.native
  def s(query: redomLib.redomMod.RedomQuery, args: redomLib.redomMod.RedomQueryArgument*): stdLib.SVGElement = js.native
  def setAttr(view: redomLib.redomMod.RedomElement, arg1: java.lang.String): scala.Unit = js.native
  def setAttr(view: redomLib.redomMod.RedomElement, arg1: java.lang.String, arg2: java.lang.String): scala.Unit = js.native
  def setAttr(view: redomLib.redomMod.RedomElement, arg1: js.Object): scala.Unit = js.native
  def setAttr(view: redomLib.redomMod.RedomElement, arg1: js.Object, arg2: java.lang.String): scala.Unit = js.native
  def setChildren(parent: redomLib.redomMod.RedomElement, children: js.Array[redomLib.redomMod.RedomElement]): scala.Unit = js.native
  def setStyle(view: redomLib.redomMod.RedomElement, arg1: java.lang.String): scala.Unit = js.native
  def setStyle(view: redomLib.redomMod.RedomElement, arg1: java.lang.String, arg2: java.lang.String): scala.Unit = js.native
  def setStyle(view: redomLib.redomMod.RedomElement, arg1: js.Object): scala.Unit = js.native
  def setStyle(view: redomLib.redomMod.RedomElement, arg1: js.Object, arg2: java.lang.String): scala.Unit = js.native
  def svg(query: redomLib.redomMod.RedomQuery, args: redomLib.redomMod.RedomQueryArgument*): stdLib.SVGElement = js.native
  def text(str: java.lang.String): stdLib.Text = js.native
  def unmount(parent: redomLib.redomMod.RedomElement, child: redomLib.redomMod.RedomElement): redomLib.redomMod.RedomElement = js.native
}

