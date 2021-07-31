package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXTemplateParser
  extends StObject
     with IBase {
  
  /** [Method] This method is called to process lt tpl case action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doCase: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] This method is called to process lt tpl default gt */
  var doDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl else gt */
  var doElse: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl elseif action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doElseIf: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] This method is called to process lt tpl gt
    * @param type String The type of action that is being ended.
    * @param actions Object The other actions keyed by the attribute name (such as 'exec').
    */
  var doEnd: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] This method is called to process text
    * @param text String
    */
  var doEval: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl exec action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name.
    */
  var doExec: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] This method is called to process expressions like  expr
    * @param expr String The body of the expression (inside "{[" and "]}").
    */
  var doExpr: js.UndefOr[js.Function1[/* expr */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl for action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doFor: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] This method is called to process lt tpl if action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doIf: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] This method is called to process lt tpl switch action gt
    * @param action String
    * @param actions Object Other actions keyed by the attribute name (such as 'exec').
    */
  var doSwitch: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] This method is called to process simple tags like tag
    * @param tag String
    */
  var doTag: js.UndefOr[js.Function1[/* tag */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] This method is called to process a piece of raw text from the tpl
    * @param text String
    */
  var doText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] This method is called to process an empty lt tpl gt */
  var doTpl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Number) */
  var level: js.UndefOr[Double] = js.undefined
}
object IXTemplateParser {
  
  @scala.inline
  def apply(): IXTemplateParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplateParser]
  }
  
  @scala.inline
  implicit class IXTemplateParserMutableBuilder[Self <: IXTemplateParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoCase(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doCase", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoCaseUndefined: Self = StObject.set(x, "doCase", js.undefined)
    
    @scala.inline
    def setDoDefault(value: () => Unit): Self = StObject.set(x, "doDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoDefaultUndefined: Self = StObject.set(x, "doDefault", js.undefined)
    
    @scala.inline
    def setDoElse(value: () => Unit): Self = StObject.set(x, "doElse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoElseIf(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doElseIf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoElseIfUndefined: Self = StObject.set(x, "doElseIf", js.undefined)
    
    @scala.inline
    def setDoElseUndefined: Self = StObject.set(x, "doElse", js.undefined)
    
    @scala.inline
    def setDoEnd(value: (/* type */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoEndUndefined: Self = StObject.set(x, "doEnd", js.undefined)
    
    @scala.inline
    def setDoEval(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "doEval", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoEvalUndefined: Self = StObject.set(x, "doEval", js.undefined)
    
    @scala.inline
    def setDoExec(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doExec", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoExecUndefined: Self = StObject.set(x, "doExec", js.undefined)
    
    @scala.inline
    def setDoExpr(value: /* expr */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "doExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoExprUndefined: Self = StObject.set(x, "doExpr", js.undefined)
    
    @scala.inline
    def setDoFor(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoForUndefined: Self = StObject.set(x, "doFor", js.undefined)
    
    @scala.inline
    def setDoIf(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doIf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoIfUndefined: Self = StObject.set(x, "doIf", js.undefined)
    
    @scala.inline
    def setDoSwitch(value: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doSwitch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoSwitchUndefined: Self = StObject.set(x, "doSwitch", js.undefined)
    
    @scala.inline
    def setDoTag(value: /* tag */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "doTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoTagUndefined: Self = StObject.set(x, "doTag", js.undefined)
    
    @scala.inline
    def setDoText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "doText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoTextUndefined: Self = StObject.set(x, "doText", js.undefined)
    
    @scala.inline
    def setDoTpl(value: () => Unit): Self = StObject.set(x, "doTpl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoTplUndefined: Self = StObject.set(x, "doTpl", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
