package typings.spacePen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Builder")
  @js.native
  open class Builder ()
    extends StObject
       with typings.spacePen.Builder {
    
    /* CompleteClass */
    override def buildHtml(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def closeTag(name: String): Unit = js.native
    
    /* CompleteClass */
    var document: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def extractOptions(args: Any): Any = js.native
    
    /* CompleteClass */
    override def openTag(name: String, attributes: Any): Unit = js.native
    
    /* CompleteClass */
    var postProcessingSteps: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def raw(str: String): Unit = js.native
    
    /* CompleteClass */
    override def subview(outletName: Any, subview: typings.spacePen.View): Unit = js.native
    
    /* CompleteClass */
    override def tag(name: String, args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def text(str: String): Unit = js.native
  }
  
  @JSGlobal("View")
  @js.native
  open class View protected ()
    extends StObject
       with typings.spacePen.View {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    override def bindEventHandlers(view: typings.spacePen.View): Unit = js.native
    
    /* CompleteClass */
    override def buildHtml(params: Any): Any = js.native
    
    /* CompleteClass */
    override def command(commandName: Any, selector: Any, options: Any, handler: Any): Any = js.native
    
    /* CompleteClass */
    override def end(): Any = js.native
    
    // tag end
    /* CompleteClass */
    override def initialize(view: typings.spacePen.View, args: Any): Unit = js.native
    
    /* CompleteClass */
    override def preempt(eventName: Any, handler: Any): Any = js.native
    
    /* CompleteClass */
    override def pushStack(elems: Any): Any = js.native
    
    /* CompleteClass */
    override def wireOutlets(view: typings.spacePen.View): Unit = js.native
  }
  object View {
    
    @JSGlobal("View")
    @js.native
    val ^ : js.Any = js.native
    
    // tag start
    /* static member */
    inline def a(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("a")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def abbr(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abbr")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def address(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def area(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def article(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("article")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def aside(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("aside")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def audio(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("audio")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def b(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("b")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def base(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("base")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def bdi(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bdi")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def bdo(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bdo")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def blockquote(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def body(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def br(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("br")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def buildHtml(fn: js.Function0[Unit]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildHtml")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /* static member */
    @JSGlobal("View.builderStack")
    @js.native
    def builderStack: js.Array[typings.spacePen.Builder] = js.native
    inline def builderStack_=(x: js.Array[typings.spacePen.Builder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builderStack")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def button(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("button")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def canvas(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def caption(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("caption")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def cite(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cite")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def code(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("code")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def col(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("col")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def colgroup(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("colgroup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def command(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("command")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    // please override this method!
    /* static member */
    inline def content(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("content")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def datalist(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("datalist")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def dd(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dd")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def del(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def details(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("details")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def dfn(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dfn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def div(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("div")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def dl(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dl")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def dt(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dt")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def em(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def embed(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("embed")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def fieldset(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldset")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def figcaption(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("figcaption")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def figure(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("figure")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def footer(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("footer")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def form(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("form")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def h1(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("h1")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def h2(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("h2")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def h3(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("h3")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def h4(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("h4")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def h5(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("h5")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def h6(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("h6")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def head(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def header(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def hgroup(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hgroup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def hr(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hr")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def html(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def i(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("i")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def iframe(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("iframe")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def img(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("img")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def input(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def ins(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ins")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def kbd(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("kbd")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def keygen(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keygen")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def label(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def legend(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def li(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("li")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def link(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def map(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def mark(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def menu(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("menu")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def meta(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def meter(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("meter")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def nav(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nav")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def noscript(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noscript")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def `object`(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def ol(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ol")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def optgroup(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optgroup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def option(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def output(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def p(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("p")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def param(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def popBuilder(): typings.spacePen.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("popBuilder")().asInstanceOf[typings.spacePen.Builder]
    
    /* static member */
    inline def pre(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pre")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def progress(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("progress")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def pushBuilder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pushBuilder")().asInstanceOf[Unit]
    
    /* static member */
    inline def q(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("q")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def raw(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def render(fn: js.Function0[Unit]): JQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(fn.asInstanceOf[js.Any]).asInstanceOf[JQuery]
    
    /* static member */
    inline def rp(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rp")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def rt(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rt")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def ruby(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ruby")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def s(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def samp(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("samp")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def script(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("script")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def section(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("section")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def select(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def small(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("small")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def source(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def span(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def strong(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("strong")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def style(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def sub(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sub")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def subview(name: Any, view: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subview")(name.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def summary(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("summary")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def sup(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def table(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def tag(tagName: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")(List(tagName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /* static member */
    inline def tbody(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tbody")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def td(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("td")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def text(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def textarea(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def tfoot(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tfoot")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def th(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("th")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def thead(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("thead")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def time(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def title(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("title")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def tr(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tr")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def track(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def u(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("u")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def ul(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ul")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def video(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("video")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def wbrk(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wbrk")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
}
