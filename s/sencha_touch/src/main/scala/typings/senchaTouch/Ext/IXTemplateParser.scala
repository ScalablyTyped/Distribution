package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXTemplateParser extends IBase {
  
  /** [Method] This method is called to process lt tpl case action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doCase: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] This method is called to process lt tpl default gt */
  var doDefault: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] This method is called to process lt tpl else gt */
  var doElse: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] This method is called to process lt tpl elseif action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doElseIf: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] This method is called to process lt tpl gt
    * @param type String The type of action that is being ended.
    * @param actions Object The other actions keyed by the attribute name (such as 'exec').
    */
  var doEnd: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] This method is called to process text
    * @param text String
    */
  var doEval: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] This method is called to process lt tpl exec action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name.
    */
  var doExec: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] This method is called to process expressions like  expr
    * @param expr String The body of the expression (inside "{[" and "]}").
    */
  var doExpr: js.UndefOr[js.Function1[/* expr */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] This method is called to process lt tpl for action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doFor: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] This method is called to process lt tpl if action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doIf: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] This method is called to process lt tpl switch action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doSwitch: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] This method is called to process simple tags like tag
    * @param tag String
    */
  var doTag: js.UndefOr[js.Function1[/* tag */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] This method is called to process a piece of raw text from the tpl
    * @param text String
    */
  var doText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] This method is called to process an empty lt tpl gt */
  var doTpl: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Number) */
  var level: js.UndefOr[Double] = js.native
}
object IXTemplateParser {
  
  @scala.inline
  def apply(): IXTemplateParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplateParser]
  }
  
  @scala.inline
  implicit class IXTemplateParserOps[Self <: IXTemplateParser] (val x: Self) extends AnyVal {
    
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
    def setDoCase(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doCase", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoCase: Self = this.set("doCase", js.undefined)
    
    @scala.inline
    def setDoDefault(value: () => Unit): Self = this.set("doDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDoDefault: Self = this.set("doDefault", js.undefined)
    
    @scala.inline
    def setDoElse(value: () => Unit): Self = this.set("doElse", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDoElse: Self = this.set("doElse", js.undefined)
    
    @scala.inline
    def setDoElseIf(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doElseIf", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoElseIf: Self = this.set("doElseIf", js.undefined)
    
    @scala.inline
    def setDoEnd(value: (/* type */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoEnd: Self = this.set("doEnd", js.undefined)
    
    @scala.inline
    def setDoEval(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = this.set("doEval", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoEval: Self = this.set("doEval", js.undefined)
    
    @scala.inline
    def setDoExec(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doExec", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoExec: Self = this.set("doExec", js.undefined)
    
    @scala.inline
    def setDoExpr(value: /* expr */ js.UndefOr[java.lang.String] => Unit): Self = this.set("doExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoExpr: Self = this.set("doExpr", js.undefined)
    
    @scala.inline
    def setDoFor(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoFor: Self = this.set("doFor", js.undefined)
    
    @scala.inline
    def setDoIf(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doIf", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoIf: Self = this.set("doIf", js.undefined)
    
    @scala.inline
    def setDoSwitch(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = this.set("doSwitch", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoSwitch: Self = this.set("doSwitch", js.undefined)
    
    @scala.inline
    def setDoTag(value: /* tag */ js.UndefOr[java.lang.String] => Unit): Self = this.set("doTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoTag: Self = this.set("doTag", js.undefined)
    
    @scala.inline
    def setDoText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = this.set("doText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoText: Self = this.set("doText", js.undefined)
    
    @scala.inline
    def setDoTpl(value: () => Unit): Self = this.set("doTpl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDoTpl: Self = this.set("doTpl", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
}
