package typings.spacePen

import typings.jquery.JQueryStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("space-pen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("space-pen", "$$")
  @js.native
  def $: js.Function1[/* fn */ js.Function, JQuery] = js.native
  
  @scala.inline
  def $_=(x: js.Function1[/* fn */ js.Function, JQuery]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$")(x.asInstanceOf[js.Any])
  
  @JSImport("space-pen", "Builder")
  @js.native
  class Builder () extends StObject {
    
    def buildHtml(): js.Array[_] = js.native
    
    def closeTag(name: String): Unit = js.native
    
    var document: js.Array[_] = js.native
    
    def extractOptions(args: js.Any): js.Any = js.native
    
    def openTag(name: String, attributes: js.Any): Unit = js.native
    
    var postProcessingSteps: js.Array[_] = js.native
    
    def raw(str: String): Unit = js.native
    
    def subview(outletName: js.Any, subview: typings.spacePen.mod.View): Unit = js.native
    
    def tag(name: String, args: js.Any*): Unit = js.native
    
    def text(str: String): Unit = js.native
  }
  
  // same type as View.render's return type.
  @JSImport("space-pen", "$$$")
  @js.native
  def DollarDollarDollar: js.Function1[/* fn */ js.Function, js.Any] = js.native
  
  @scala.inline
  def DollarDollarDollar_=(x: js.Function1[/* fn */ js.Function, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$$")(x.asInstanceOf[js.Any])
  
  // copy & paste start
  @JSImport("space-pen", "View")
  @js.native
  class View protected () extends StObject {
    def this(args: js.Any*) = this()
    
    def bindEventHandlers(view: typings.spacePen.mod.View): Unit = js.native
    
    def buildHtml(params: js.Any): js.Any = js.native
    
    def command(eventName: String, handler: js.Any): js.Any = js.native
    def command(eventName: String, selector: js.Any, handler: js.Any): js.Any = js.native
    def command(eventName: String, selector: js.Any, options: js.Any, handler: js.Any): js.Any = js.native
    
    def end(): js.Any = js.native
    
    // tag end
    def initialize(view: typings.spacePen.mod.View, args: js.Any): Unit = js.native
    
    def preempt(eventName: js.Any, handler: js.Any): js.Any = js.native
    
    def pushStack(elems: js.Any): js.Any = js.native
    
    def wireOutlets(view: typings.spacePen.mod.View): Unit = js.native
  }
  object View {
    
    @JSImport("space-pen", "View")
    @js.native
    val ^ : js.Any = js.native
    
    // tag start
    /* static member */
    @JSImport("space-pen", "View.a")
    @js.native
    def a(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.abbr")
    @js.native
    def abbr(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.address")
    @js.native
    def address(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.area")
    @js.native
    def area(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.article")
    @js.native
    def article(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.aside")
    @js.native
    def aside(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.audio")
    @js.native
    def audio(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.b")
    @js.native
    def b(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.base")
    @js.native
    def base(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.bdi")
    @js.native
    def bdi(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.bdo")
    @js.native
    def bdo(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.blockquote")
    @js.native
    def blockquote(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.body")
    @js.native
    def body(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.br")
    @js.native
    def br(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.buildHtml")
    @js.native
    def buildHtml(fn: js.Function0[Unit]): js.Array[String] = js.native
    
    /* static member */
    @JSImport("space-pen", "View.builderStack")
    @js.native
    def builderStack: js.Array[typings.spacePen.mod.Builder] = js.native
    @scala.inline
    def builderStack_=(x: js.Array[typings.spacePen.mod.Builder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builderStack")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("space-pen", "View.button")
    @js.native
    def button(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.canvas")
    @js.native
    def canvas(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.caption")
    @js.native
    def caption(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.cite")
    @js.native
    def cite(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.code")
    @js.native
    def code(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.col")
    @js.native
    def col(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.colgroup")
    @js.native
    def colgroup(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.command")
    @js.native
    def command(args: js.Any*): js.Any = js.native
    
    // please override this method!
    /* static member */
    @JSImport("space-pen", "View.content")
    @js.native
    def content(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("space-pen", "View.datalist")
    @js.native
    def datalist(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.dd")
    @js.native
    def dd(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.del")
    @js.native
    def del(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.details")
    @js.native
    def details(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.dfn")
    @js.native
    def dfn(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.div")
    @js.native
    def div(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.dl")
    @js.native
    def dl(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.dt")
    @js.native
    def dt(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.em")
    @js.native
    def em(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.embed")
    @js.native
    def embed(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.fieldset")
    @js.native
    def fieldset(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.figcaption")
    @js.native
    def figcaption(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.figure")
    @js.native
    def figure(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.footer")
    @js.native
    def footer(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.form")
    @js.native
    def form(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.h1")
    @js.native
    def h1(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.h2")
    @js.native
    def h2(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.h3")
    @js.native
    def h3(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.h4")
    @js.native
    def h4(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.h5")
    @js.native
    def h5(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.h6")
    @js.native
    def h6(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.head")
    @js.native
    def head(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.header")
    @js.native
    def header(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.hgroup")
    @js.native
    def hgroup(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.hr")
    @js.native
    def hr(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.html")
    @js.native
    def html(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.i")
    @js.native
    def i(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.iframe")
    @js.native
    def iframe(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.img")
    @js.native
    def img(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.input")
    @js.native
    def input(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.ins")
    @js.native
    def ins(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.kbd")
    @js.native
    def kbd(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.keygen")
    @js.native
    def keygen(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.label")
    @js.native
    def label(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.legend")
    @js.native
    def legend(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.li")
    @js.native
    def li(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.link")
    @js.native
    def link(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.map")
    @js.native
    def map(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.mark")
    @js.native
    def mark(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.menu")
    @js.native
    def menu(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.meta")
    @js.native
    def meta(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.meter")
    @js.native
    def meter(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.nav")
    @js.native
    def nav(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.noscript")
    @js.native
    def noscript(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.ol")
    @js.native
    def ol(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.optgroup")
    @js.native
    def optgroup(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.option")
    @js.native
    def option(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.output")
    @js.native
    def output(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.p")
    @js.native
    def p(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.param")
    @js.native
    def param(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.popBuilder")
    @js.native
    def popBuilder(): typings.spacePen.mod.Builder = js.native
    
    /* static member */
    @JSImport("space-pen", "View.pre")
    @js.native
    def pre(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.progress")
    @js.native
    def progress(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.pushBuilder")
    @js.native
    def pushBuilder(): Unit = js.native
    
    /* static member */
    @JSImport("space-pen", "View.q")
    @js.native
    def q(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.raw")
    @js.native
    def raw(str: String): Unit = js.native
    
    /* static member */
    @JSImport("space-pen", "View.render")
    @js.native
    def render(fn: js.Function0[Unit]): JQuery = js.native
    
    /* static member */
    @JSImport("space-pen", "View.rp")
    @js.native
    def rp(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.rt")
    @js.native
    def rt(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.ruby")
    @js.native
    def ruby(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.s")
    @js.native
    def s(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.samp")
    @js.native
    def samp(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.script")
    @js.native
    def script(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.section")
    @js.native
    def section(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.select")
    @js.native
    def select(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.small")
    @js.native
    def small(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.source")
    @js.native
    def source(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.span")
    @js.native
    def span(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.strong")
    @js.native
    def strong(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.style")
    @js.native
    def style(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.sub")
    @js.native
    def sub(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.subview")
    @js.native
    def subview(name: js.Any, view: js.Any): Unit = js.native
    
    /* static member */
    @JSImport("space-pen", "View.summary")
    @js.native
    def summary(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.sup")
    @js.native
    def sup(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.table")
    @js.native
    def table(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.tag")
    @js.native
    def tag(tagName: js.Any, args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("space-pen", "View.tbody")
    @js.native
    def tbody(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.td")
    @js.native
    def td(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.text")
    @js.native
    def text(str: String): Unit = js.native
    
    /* static member */
    @JSImport("space-pen", "View.textarea")
    @js.native
    def textarea(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.tfoot")
    @js.native
    def tfoot(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.th")
    @js.native
    def th(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.thead")
    @js.native
    def thead(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.time")
    @js.native
    def time(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.title")
    @js.native
    def title(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.tr")
    @js.native
    def tr(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.track")
    @js.native
    def track(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.u")
    @js.native
    def u(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.ul")
    @js.native
    def ul(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.video")
    @js.native
    def video(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.wbrk")
    @js.native
    def wbrk(args: js.Any*): js.Any = js.native
    
    /* static member */
    @JSImport("space-pen", "View.object")
    @js.native
    def `object`(args: js.Any*): js.Any = js.native
  }
  
  @JSImport("space-pen", "$")
  @js.native
  def _empty: JQueryStatic = js.native
  
  @scala.inline
  def _empty_=(x: JQueryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$")(x.asInstanceOf[js.Any])
  
  // copy & paste end
  @JSImport("space-pen", "jQuery")
  @js.native
  def jQuery: JQueryStatic = js.native
  @scala.inline
  def jQuery_=(x: JQueryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQuery")(x.asInstanceOf[js.Any])
}
