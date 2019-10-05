package typings.spaceDashPen

import typings.jquery.JQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("space-pen", JSImport.Namespace)
@js.native
object spaceDashPenMod extends js.Object {
  @js.native
  class Builder () extends js.Object {
    var document: js.Array[_] = js.native
    var postProcessingSteps: js.Array[_] = js.native
    def buildHtml(): js.Array[_] = js.native
    def closeTag(name: String): Unit = js.native
    def extractOptions(args: js.Any): js.Any = js.native
    def openTag(name: String, attributes: js.Any): Unit = js.native
    def raw(str: String): Unit = js.native
    def subview(outletName: js.Any, subview: typings.spaceDashPen.spaceDashPenMod.View): Unit = js.native
    def tag(name: String, args: js.Any*): Unit = js.native
    def text(str: String): Unit = js.native
  }
  
  // copy & paste start
  @js.native
  class View protected () extends js.Object {
    def this(args: js.Any*) = this()
    def bindEventHandlers(view: typings.spaceDashPen.spaceDashPenMod.View): Unit = js.native
    def buildHtml(params: js.Any): js.Any = js.native
    def command(eventName: String, handler: js.Any): js.Any = js.native
    def command(eventName: String, selector: js.Any, handler: js.Any): js.Any = js.native
    def command(eventName: String, selector: js.Any, options: js.Any, handler: js.Any): js.Any = js.native
    def end(): js.Any = js.native
    // tag end
    def initialize(view: typings.spaceDashPen.spaceDashPenMod.View, args: js.Any): Unit = js.native
    def preempt(eventName: js.Any, handler: js.Any): js.Any = js.native
    def pushStack(elems: js.Any): js.Any = js.native
    def wireOutlets(view: typings.spaceDashPen.spaceDashPenMod.View): Unit = js.native
  }
  
  @JSName("$")
  var $: JQueryStatic = js.native
  @JSName("$$")
  var $$: js.Function1[/* fn */ js.Function, JQuery] = js.native
  @JSName("$$$")
  var $$$: js.Function1[/* fn */ js.Function, js.Any] = js.native
  // copy & paste end
  var jQuery: JQueryStatic = js.native
  /* static members */
  @js.native
  object View extends js.Object {
    var builderStack: js.Array[typings.spaceDashPen.spaceDashPenMod.Builder] = js.native
    // tag start
    def a(args: js.Any*): js.Any = js.native
    def abbr(args: js.Any*): js.Any = js.native
    def address(args: js.Any*): js.Any = js.native
    def area(args: js.Any*): js.Any = js.native
    def article(args: js.Any*): js.Any = js.native
    def aside(args: js.Any*): js.Any = js.native
    def audio(args: js.Any*): js.Any = js.native
    def b(args: js.Any*): js.Any = js.native
    def base(args: js.Any*): js.Any = js.native
    def bdi(args: js.Any*): js.Any = js.native
    def bdo(args: js.Any*): js.Any = js.native
    def blockquote(args: js.Any*): js.Any = js.native
    def body(args: js.Any*): js.Any = js.native
    def br(args: js.Any*): js.Any = js.native
    def buildHtml(fn: js.Function0[Unit]): js.Array[String] = js.native
    def button(args: js.Any*): js.Any = js.native
    def canvas(args: js.Any*): js.Any = js.native
    def caption(args: js.Any*): js.Any = js.native
    def cite(args: js.Any*): js.Any = js.native
    def code(args: js.Any*): js.Any = js.native
    def col(args: js.Any*): js.Any = js.native
    def colgroup(args: js.Any*): js.Any = js.native
    def command(args: js.Any*): js.Any = js.native
    // please override this method!
    def content(args: js.Any*): Unit = js.native
    def datalist(args: js.Any*): js.Any = js.native
    def dd(args: js.Any*): js.Any = js.native
    def del(args: js.Any*): js.Any = js.native
    def details(args: js.Any*): js.Any = js.native
    def dfn(args: js.Any*): js.Any = js.native
    def div(args: js.Any*): js.Any = js.native
    def dl(args: js.Any*): js.Any = js.native
    def dt(args: js.Any*): js.Any = js.native
    def em(args: js.Any*): js.Any = js.native
    def embed(args: js.Any*): js.Any = js.native
    def fieldset(args: js.Any*): js.Any = js.native
    def figcaption(args: js.Any*): js.Any = js.native
    def figure(args: js.Any*): js.Any = js.native
    def footer(args: js.Any*): js.Any = js.native
    def form(args: js.Any*): js.Any = js.native
    def h1(args: js.Any*): js.Any = js.native
    def h2(args: js.Any*): js.Any = js.native
    def h3(args: js.Any*): js.Any = js.native
    def h4(args: js.Any*): js.Any = js.native
    def h5(args: js.Any*): js.Any = js.native
    def h6(args: js.Any*): js.Any = js.native
    def head(args: js.Any*): js.Any = js.native
    def header(args: js.Any*): js.Any = js.native
    def hgroup(args: js.Any*): js.Any = js.native
    def hr(args: js.Any*): js.Any = js.native
    def html(args: js.Any*): js.Any = js.native
    def i(args: js.Any*): js.Any = js.native
    def iframe(args: js.Any*): js.Any = js.native
    def img(args: js.Any*): js.Any = js.native
    def input(args: js.Any*): js.Any = js.native
    def ins(args: js.Any*): js.Any = js.native
    def kbd(args: js.Any*): js.Any = js.native
    def keygen(args: js.Any*): js.Any = js.native
    def label(args: js.Any*): js.Any = js.native
    def legend(args: js.Any*): js.Any = js.native
    def li(args: js.Any*): js.Any = js.native
    def link(args: js.Any*): js.Any = js.native
    def map(args: js.Any*): js.Any = js.native
    def mark(args: js.Any*): js.Any = js.native
    def menu(args: js.Any*): js.Any = js.native
    def meta(args: js.Any*): js.Any = js.native
    def meter(args: js.Any*): js.Any = js.native
    def nav(args: js.Any*): js.Any = js.native
    def noscript(args: js.Any*): js.Any = js.native
    def `object`(args: js.Any*): js.Any = js.native
    def ol(args: js.Any*): js.Any = js.native
    def optgroup(args: js.Any*): js.Any = js.native
    def option(args: js.Any*): js.Any = js.native
    def output(args: js.Any*): js.Any = js.native
    def p(args: js.Any*): js.Any = js.native
    def param(args: js.Any*): js.Any = js.native
    def popBuilder(): typings.spaceDashPen.spaceDashPenMod.Builder = js.native
    def pre(args: js.Any*): js.Any = js.native
    def progress(args: js.Any*): js.Any = js.native
    def pushBuilder(): Unit = js.native
    def q(args: js.Any*): js.Any = js.native
    def raw(str: String): Unit = js.native
    def render(fn: js.Function0[Unit]): JQuery = js.native
    def rp(args: js.Any*): js.Any = js.native
    def rt(args: js.Any*): js.Any = js.native
    def ruby(args: js.Any*): js.Any = js.native
    def s(args: js.Any*): js.Any = js.native
    def samp(args: js.Any*): js.Any = js.native
    def script(args: js.Any*): js.Any = js.native
    def section(args: js.Any*): js.Any = js.native
    def select(args: js.Any*): js.Any = js.native
    def small(args: js.Any*): js.Any = js.native
    def source(args: js.Any*): js.Any = js.native
    def span(args: js.Any*): js.Any = js.native
    def strong(args: js.Any*): js.Any = js.native
    def style(args: js.Any*): js.Any = js.native
    def sub(args: js.Any*): js.Any = js.native
    def subview(name: js.Any, view: js.Any): Unit = js.native
    def summary(args: js.Any*): js.Any = js.native
    def sup(args: js.Any*): js.Any = js.native
    def table(args: js.Any*): js.Any = js.native
    def tag(tagName: js.Any, args: js.Any*): Unit = js.native
    def tbody(args: js.Any*): js.Any = js.native
    def td(args: js.Any*): js.Any = js.native
    def text(str: String): Unit = js.native
    def textarea(args: js.Any*): js.Any = js.native
    def tfoot(args: js.Any*): js.Any = js.native
    def th(args: js.Any*): js.Any = js.native
    def thead(args: js.Any*): js.Any = js.native
    def time(args: js.Any*): js.Any = js.native
    def title(args: js.Any*): js.Any = js.native
    def tr(args: js.Any*): js.Any = js.native
    def track(args: js.Any*): js.Any = js.native
    def u(args: js.Any*): js.Any = js.native
    def ul(args: js.Any*): js.Any = js.native
    def video(args: js.Any*): js.Any = js.native
    def wbrk(args: js.Any*): js.Any = js.native
  }
  
}

