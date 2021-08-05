package typings.spacePen

import typings.jquery.JQueryStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("space-pen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("space-pen", "$$")
  @js.native
  def $: js.Function1[/* fn */ js.Function, JQuery] = js.native
  
  inline def $_=(x: js.Function1[/* fn */ js.Function, JQuery]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$")(x.asInstanceOf[js.Any])
  
  @JSImport("space-pen", "Builder")
  @js.native
  class Builder () extends StObject {
    
    def buildHtml(): js.Array[js.Any] = js.native
    
    def closeTag(name: String): Unit = js.native
    
    var document: js.Array[js.Any] = js.native
    
    def extractOptions(args: js.Any): js.Any = js.native
    
    def openTag(name: String, attributes: js.Any): Unit = js.native
    
    var postProcessingSteps: js.Array[js.Any] = js.native
    
    def raw(str: String): Unit = js.native
    
    def subview(outletName: js.Any, subview: typings.spacePen.mod.View): Unit = js.native
    
    def tag(name: String, args: js.Any*): Unit = js.native
    
    def text(str: String): Unit = js.native
  }
  
  // same type as View.render's return type.
  @JSImport("space-pen", "$$$")
  @js.native
  def DollarDollarDollar: js.Function1[/* fn */ js.Function, js.Any] = js.native
  
  inline def DollarDollarDollar_=(x: js.Function1[/* fn */ js.Function, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$$")(x.asInstanceOf[js.Any])
  
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
    inline def a(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("a")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def abbr(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("abbr")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def address(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def area(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def article(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("article")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def aside(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("aside")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def audio(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("audio")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def b(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("b")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def base(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def bdi(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bdi")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def bdo(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bdo")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def blockquote(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def body(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def br(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("br")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def buildHtml(fn: js.Function0[Unit]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildHtml")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /* static member */
    @JSImport("space-pen", "View.builderStack")
    @js.native
    def builderStack: js.Array[typings.spacePen.mod.Builder] = js.native
    inline def builderStack_=(x: js.Array[typings.spacePen.mod.Builder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builderStack")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def button(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("button")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def canvas(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def caption(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("caption")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def cite(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cite")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def code(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("code")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def col(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("col")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def colgroup(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("colgroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def command(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("command")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    // please override this method!
    /* static member */
    inline def content(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("content")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def datalist(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("datalist")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def dd(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dd")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def del(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def details(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("details")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def dfn(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dfn")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def div(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("div")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def dl(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dl")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def dt(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dt")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def em(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def embed(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("embed")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def fieldset(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldset")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def figcaption(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("figcaption")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def figure(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("figure")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def footer(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("footer")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def form(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("form")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def h1(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h1")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def h2(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h2")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def h3(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h3")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def h4(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h4")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def h5(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h5")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def h6(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h6")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def head(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def header(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def hgroup(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hgroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def hr(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hr")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def html(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def i(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("i")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def iframe(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("iframe")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def img(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("img")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def input(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def ins(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ins")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def kbd(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("kbd")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def keygen(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("keygen")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def label(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def legend(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def li(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("li")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def link(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def map(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def mark(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def menu(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("menu")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def meta(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def meter(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("meter")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def nav(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("nav")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def noscript(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noscript")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def `object`(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def ol(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ol")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def optgroup(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("optgroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def option(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def output(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def p(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("p")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def param(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def popBuilder(): typings.spacePen.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("popBuilder")().asInstanceOf[typings.spacePen.mod.Builder]
    
    /* static member */
    inline def pre(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pre")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def progress(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("progress")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def pushBuilder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pushBuilder")().asInstanceOf[Unit]
    
    /* static member */
    inline def q(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("q")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def raw(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def render(fn: js.Function0[Unit]): JQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(fn.asInstanceOf[js.Any]).asInstanceOf[JQuery]
    
    /* static member */
    inline def rp(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rp")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def rt(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rt")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def ruby(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ruby")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def s(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def samp(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("samp")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def script(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("script")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def section(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("section")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def select(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def small(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("small")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def source(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def span(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def strong(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strong")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def style(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def sub(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sub")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def subview(name: js.Any, view: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subview")(name.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def summary(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("summary")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def sup(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def table(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def tag(tagName: js.Any, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tag")(tagName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def tbody(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tbody")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def td(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("td")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def text(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def textarea(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def tfoot(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tfoot")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def th(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("th")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def thead(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("thead")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def time(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def title(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("title")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def tr(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tr")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def track(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def u(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("u")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def ul(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ul")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def video(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("video")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def wbrk(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wbrk")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSImport("space-pen", "$")
  @js.native
  def _empty: JQueryStatic = js.native
  
  inline def _empty_=(x: JQueryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$")(x.asInstanceOf[js.Any])
  
  // copy & paste end
  @JSImport("space-pen", "jQuery")
  @js.native
  def jQuery: JQueryStatic = js.native
  inline def jQuery_=(x: JQueryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQuery")(x.asInstanceOf[js.Any])
}
