package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXTemplateCompiler extends IXTemplateParser {
  /** [Method] This method is called to process lt tpl case action gt
    * @param action Object
    */
  @JSName("doCase")
  var doCase_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process lt tpl elseif action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doElseIf")
  var doElseIf_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl gt
    * @param type Object
    * @param actions Object
    */
  @JSName("doEnd")
  var doEnd_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process text
    * @param text Object
    */
  @JSName("doEval")
  var doEval_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process lt tpl exec action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doExec")
  var doExec_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process expressions like  expr
    * @param expr Object
    */
  @JSName("doExpr")
  var doExpr_IXTemplateCompiler: js.UndefOr[js.Function1[/* expr */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process lt tpl for action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doFor")
  var doFor_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl if action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doIf")
  var doIf_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl switch action gt
    * @param action Object
    */
  @JSName("doSwitch")
  var doSwitch_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process simple tags like tag
    * @param tag Object
    */
  @JSName("doTag")
  var doTag_IXTemplateCompiler: js.UndefOr[js.Function1[/* tag */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process a piece of raw text from the tpl
    * @param text Object
    */
  @JSName("doText")
  var doText_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[js.Any], Unit]] = js.native
}

object IXTemplateCompiler {
  @scala.inline
  def apply(): IXTemplateCompiler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplateCompiler]
  }
  @scala.inline
  implicit class IXTemplateCompilerOps[Self <: IXTemplateCompiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDoCase(value: /* action */ js.UndefOr[js.Any] => Unit): Self = this.set("doCase", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoCase: Self = this.set("doCase", js.undefined)
    @scala.inline
    def setDoElseIf(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doElseIf", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDoElseIf: Self = this.set("doElseIf", js.undefined)
    @scala.inline
    def setDoEnd(value: (/* type */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDoEnd: Self = this.set("doEnd", js.undefined)
    @scala.inline
    def setDoEval(value: /* text */ js.UndefOr[js.Any] => Unit): Self = this.set("doEval", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoEval: Self = this.set("doEval", js.undefined)
    @scala.inline
    def setDoExec(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doExec", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDoExec: Self = this.set("doExec", js.undefined)
    @scala.inline
    def setDoExpr(value: /* expr */ js.UndefOr[js.Any] => Unit): Self = this.set("doExpr", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoExpr: Self = this.set("doExpr", js.undefined)
    @scala.inline
    def setDoFor(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doFor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDoFor: Self = this.set("doFor", js.undefined)
    @scala.inline
    def setDoIf(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doIf", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDoIf: Self = this.set("doIf", js.undefined)
    @scala.inline
    def setDoSwitch(value: /* action */ js.UndefOr[js.Any] => Unit): Self = this.set("doSwitch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoSwitch: Self = this.set("doSwitch", js.undefined)
    @scala.inline
    def setDoTag(value: /* tag */ js.UndefOr[js.Any] => Unit): Self = this.set("doTag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoTag: Self = this.set("doTag", js.undefined)
    @scala.inline
    def setDoText(value: /* text */ js.UndefOr[js.Any] => Unit): Self = this.set("doText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoText: Self = this.set("doText", js.undefined)
  }
  
}

