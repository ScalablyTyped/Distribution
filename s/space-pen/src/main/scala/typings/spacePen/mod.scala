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
  open class Builder () extends StObject {
    
    def buildHtml(): js.Array[Any] = js.native
    
    def closeTag(name: String): Unit = js.native
    
    var document: js.Array[Any] = js.native
    
    def extractOptions(args: Any): Any = js.native
    
    def openTag(name: String, attributes: Any): Unit = js.native
    
    var postProcessingSteps: js.Array[Any] = js.native
    
    def raw(str: String): Unit = js.native
    
    def subview(outletName: Any, subview: typings.spacePen.mod.View): Unit = js.native
    
    def tag(name: String, args: Any*): Unit = js.native
    
    def text(str: String): Unit = js.native
  }
  
  // same type as View.render's return type.
  @JSImport("space-pen", "$$$")
  @js.native
  def DollarDollarDollar: js.Function1[/* fn */ js.Function, Any] = js.native
  
  inline def DollarDollarDollar_=(x: js.Function1[/* fn */ js.Function, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$$")(x.asInstanceOf[js.Any])
  
  // copy & paste start
  @JSImport("space-pen", "View")
  @js.native
  open class View protected () extends StObject {
    def this(args: Any*) = this()
    
    def bindEventHandlers(view: typings.spacePen.mod.View): Unit = js.native
    
    def buildHtml(params: Any): Any = js.native
    
    def command(eventName: String, handler: Any): Any = js.native
    def command(eventName: String, selector: Any, handler: Any): Any = js.native
    def command(eventName: String, selector: Any, options: Any, handler: Any): Any = js.native
    
    def end(): Any = js.native
    
    // tag end
    def initialize(view: typings.spacePen.mod.View, args: Any): Unit = js.native
    
    def preempt(eventName: Any, handler: Any): Any = js.native
    
    def pushStack(elems: Any): Any = js.native
    
    def wireOutlets(view: typings.spacePen.mod.View): Unit = js.native
  }
  object View {
    
    @JSImport("space-pen", "View")
    @js.native
    val ^ : js.Any = js.native
    
    // tag start
    /* static member */
    inline def a(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("a")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def abbr(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("abbr")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def address(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def area(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def article(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("article")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def aside(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("aside")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def audio(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("audio")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def b(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("b")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def base(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def bdi(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bdi")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def bdo(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bdo")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def blockquote(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def body(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def br(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("br")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def buildHtml(fn: js.Function0[Unit]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildHtml")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /* static member */
    @JSImport("space-pen", "View.builderStack")
    @js.native
    def builderStack: js.Array[typings.spacePen.mod.Builder] = js.native
    inline def builderStack_=(x: js.Array[typings.spacePen.mod.Builder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builderStack")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def button(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("button")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def canvas(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def caption(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("caption")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def cite(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cite")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def code(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("code")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def col(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("col")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def colgroup(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("colgroup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def command(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("command")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    // please override this method!
    /* static member */
    inline def content(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("content")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def datalist(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("datalist")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def dd(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dd")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def del(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def details(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("details")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def dfn(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dfn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def div(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("div")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def dl(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dl")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def dt(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dt")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def em(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def embed(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("embed")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def fieldset(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldset")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def figcaption(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("figcaption")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def figure(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("figure")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def footer(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("footer")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def form(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("form")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def h1(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h1")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def h2(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h2")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def h3(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h3")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def h4(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h4")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def h5(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h5")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def h6(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("h6")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def head(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def header(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def hgroup(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hgroup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def hr(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hr")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def html(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def i(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("i")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def iframe(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("iframe")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def img(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("img")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def input(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def ins(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ins")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def kbd(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("kbd")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def keygen(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("keygen")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def label(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def legend(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def li(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("li")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def link(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def map(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def mark(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def menu(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("menu")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def meta(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def meter(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("meter")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def nav(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("nav")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def noscript(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noscript")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def `object`(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def ol(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ol")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def optgroup(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("optgroup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def option(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def output(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def p(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("p")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def param(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def popBuilder(): typings.spacePen.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("popBuilder")().asInstanceOf[typings.spacePen.mod.Builder]
    
    /* static member */
    inline def pre(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pre")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def progress(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("progress")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def pushBuilder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pushBuilder")().asInstanceOf[Unit]
    
    /* static member */
    inline def q(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("q")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def raw(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def render(fn: js.Function0[Unit]): JQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(fn.asInstanceOf[js.Any]).asInstanceOf[JQuery]
    
    /* static member */
    inline def rp(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rp")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def rt(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rt")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def ruby(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ruby")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def s(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def samp(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("samp")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def script(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("script")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def section(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("section")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def select(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def small(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("small")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def source(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def span(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def strong(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strong")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def style(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def sub(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sub")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def subview(name: Any, view: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subview")(name.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def summary(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("summary")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def sup(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def table(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def tag(tagName: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")(List(tagName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /* static member */
    inline def tbody(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tbody")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def td(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("td")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def text(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def textarea(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def tfoot(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tfoot")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def th(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("th")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def thead(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("thead")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def time(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def title(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("title")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def tr(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tr")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def track(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def u(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("u")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def ul(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ul")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def video(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("video")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def wbrk(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wbrk")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
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
