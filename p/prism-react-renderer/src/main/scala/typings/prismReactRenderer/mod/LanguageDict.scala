package typings.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ lang in prism-react-renderer.prism-react-renderer.Language ]: prism-react-renderer.prism-react-renderer.PrismGrammar} */
@js.native
trait LanguageDict extends js.Object {
  var actionscript: PrismGrammar = js.native
  var bash: PrismGrammar = js.native
  var c: PrismGrammar = js.native
  var clike: PrismGrammar = js.native
  var coffeescript: PrismGrammar = js.native
  var cpp: PrismGrammar = js.native
  var css: PrismGrammar = js.native
  var `css-extr`: PrismGrammar = js.native
  var diff: PrismGrammar = js.native
  var git: PrismGrammar = js.native
  var go: PrismGrammar = js.native
  var graphql: PrismGrammar = js.native
  var handlebars: PrismGrammar = js.native
  var javascript: PrismGrammar = js.native
  var json: PrismGrammar = js.native
  var jsx: PrismGrammar = js.native
  var less: PrismGrammar = js.native
  var makefile: PrismGrammar = js.native
  var markdown: PrismGrammar = js.native
  var markup: PrismGrammar = js.native
  var objectivec: PrismGrammar = js.native
  var ocaml: PrismGrammar = js.native
  var python: PrismGrammar = js.native
  var reason: PrismGrammar = js.native
  var sass: PrismGrammar = js.native
  var scss: PrismGrammar = js.native
  var sql: PrismGrammar = js.native
  var stylus: PrismGrammar = js.native
  var tsx: PrismGrammar = js.native
  var typescript: PrismGrammar = js.native
  var wasm: PrismGrammar = js.native
  var yaml: PrismGrammar = js.native
}

object LanguageDict {
  @scala.inline
  def apply(
    actionscript: PrismGrammar,
    bash: PrismGrammar,
    c: PrismGrammar,
    clike: PrismGrammar,
    coffeescript: PrismGrammar,
    cpp: PrismGrammar,
    css: PrismGrammar,
    `css-extr`: PrismGrammar,
    diff: PrismGrammar,
    git: PrismGrammar,
    go: PrismGrammar,
    graphql: PrismGrammar,
    handlebars: PrismGrammar,
    javascript: PrismGrammar,
    json: PrismGrammar,
    jsx: PrismGrammar,
    less: PrismGrammar,
    makefile: PrismGrammar,
    markdown: PrismGrammar,
    markup: PrismGrammar,
    objectivec: PrismGrammar,
    ocaml: PrismGrammar,
    python: PrismGrammar,
    reason: PrismGrammar,
    sass: PrismGrammar,
    scss: PrismGrammar,
    sql: PrismGrammar,
    stylus: PrismGrammar,
    tsx: PrismGrammar,
    typescript: PrismGrammar,
    wasm: PrismGrammar,
    yaml: PrismGrammar
  ): LanguageDict = {
    val __obj = js.Dynamic.literal(actionscript = actionscript.asInstanceOf[js.Any], bash = bash.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], clike = clike.asInstanceOf[js.Any], coffeescript = coffeescript.asInstanceOf[js.Any], cpp = cpp.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], go = go.asInstanceOf[js.Any], graphql = graphql.asInstanceOf[js.Any], handlebars = handlebars.asInstanceOf[js.Any], javascript = javascript.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], jsx = jsx.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], makefile = makefile.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], objectivec = objectivec.asInstanceOf[js.Any], ocaml = ocaml.asInstanceOf[js.Any], python = python.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], stylus = stylus.asInstanceOf[js.Any], tsx = tsx.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], wasm = wasm.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.updateDynamic("css-extr")(`css-extr`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDict]
  }
  @scala.inline
  implicit class LanguageDictOps[Self <: LanguageDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionscript(value: PrismGrammar): Self = this.set("actionscript", value.asInstanceOf[js.Any])
    @scala.inline
    def setBash(value: PrismGrammar): Self = this.set("bash", value.asInstanceOf[js.Any])
    @scala.inline
    def setC(value: PrismGrammar): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def setClike(value: PrismGrammar): Self = this.set("clike", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoffeescript(value: PrismGrammar): Self = this.set("coffeescript", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpp(value: PrismGrammar): Self = this.set("cpp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCss(value: PrismGrammar): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCss-extr`(value: PrismGrammar): Self = this.set("css-extr", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiff(value: PrismGrammar): Self = this.set("diff", value.asInstanceOf[js.Any])
    @scala.inline
    def setGit(value: PrismGrammar): Self = this.set("git", value.asInstanceOf[js.Any])
    @scala.inline
    def setGo(value: PrismGrammar): Self = this.set("go", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphql(value: PrismGrammar): Self = this.set("graphql", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandlebars(value: PrismGrammar): Self = this.set("handlebars", value.asInstanceOf[js.Any])
    @scala.inline
    def setJavascript(value: PrismGrammar): Self = this.set("javascript", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: PrismGrammar): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsx(value: PrismGrammar): Self = this.set("jsx", value.asInstanceOf[js.Any])
    @scala.inline
    def setLess(value: PrismGrammar): Self = this.set("less", value.asInstanceOf[js.Any])
    @scala.inline
    def setMakefile(value: PrismGrammar): Self = this.set("makefile", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkdown(value: PrismGrammar): Self = this.set("markdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkup(value: PrismGrammar): Self = this.set("markup", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectivec(value: PrismGrammar): Self = this.set("objectivec", value.asInstanceOf[js.Any])
    @scala.inline
    def setOcaml(value: PrismGrammar): Self = this.set("ocaml", value.asInstanceOf[js.Any])
    @scala.inline
    def setPython(value: PrismGrammar): Self = this.set("python", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: PrismGrammar): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setSass(value: PrismGrammar): Self = this.set("sass", value.asInstanceOf[js.Any])
    @scala.inline
    def setScss(value: PrismGrammar): Self = this.set("scss", value.asInstanceOf[js.Any])
    @scala.inline
    def setSql(value: PrismGrammar): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylus(value: PrismGrammar): Self = this.set("stylus", value.asInstanceOf[js.Any])
    @scala.inline
    def setTsx(value: PrismGrammar): Self = this.set("tsx", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypescript(value: PrismGrammar): Self = this.set("typescript", value.asInstanceOf[js.Any])
    @scala.inline
    def setWasm(value: PrismGrammar): Self = this.set("wasm", value.asInstanceOf[js.Any])
    @scala.inline
    def setYaml(value: PrismGrammar): Self = this.set("yaml", value.asInstanceOf[js.Any])
  }
  
}

