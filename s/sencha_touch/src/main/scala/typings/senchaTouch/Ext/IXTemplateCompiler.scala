package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXTemplateCompiler
  extends StObject
     with IXTemplateParser {
  
  /** [Method] This method is called to process lt tpl case action gt
    * @param action Object
    */
  @JSName("doCase")
  var doCase_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl elseif action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doElseIf")
  var doElseIf_IXTemplateCompiler: js.UndefOr[js.Function2[/* action */ js.UndefOr[Any], /* actions */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl gt
    * @param type Object
    * @param actions Object
    */
  @JSName("doEnd")
  var doEnd_IXTemplateCompiler: js.UndefOr[js.Function2[/* type */ js.UndefOr[Any], /* actions */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process text
    * @param text Object
    */
  @JSName("doEval")
  var doEval_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl exec action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doExec")
  var doExec_IXTemplateCompiler: js.UndefOr[js.Function2[/* action */ js.UndefOr[Any], /* actions */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process expressions like  expr
    * @param expr Object
    */
  @JSName("doExpr")
  var doExpr_IXTemplateCompiler: js.UndefOr[js.Function1[/* expr */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl for action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doFor")
  var doFor_IXTemplateCompiler: js.UndefOr[js.Function2[/* action */ js.UndefOr[Any], /* actions */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl if action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doIf")
  var doIf_IXTemplateCompiler: js.UndefOr[js.Function2[/* action */ js.UndefOr[Any], /* actions */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process lt tpl switch action gt
    * @param action Object
    */
  @JSName("doSwitch")
  var doSwitch_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process simple tags like tag
    * @param tag Object
    */
  @JSName("doTag")
  var doTag_IXTemplateCompiler: js.UndefOr[js.Function1[/* tag */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called to process a piece of raw text from the tpl
    * @param text Object
    */
  @JSName("doText")
  var doText_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[Any], Unit]] = js.undefined
}
object IXTemplateCompiler {
  
  inline def apply(): IXTemplateCompiler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplateCompiler]
  }
  
  extension [Self <: IXTemplateCompiler](x: Self) {
    
    inline def setDoCase(value: /* action */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "doCase", js.Any.fromFunction1(value))
    
    inline def setDoCaseUndefined: Self = StObject.set(x, "doCase", js.undefined)
    
    inline def setDoElseIf(value: (/* action */ js.UndefOr[Any], /* actions */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "doElseIf", js.Any.fromFunction2(value))
    
    inline def setDoElseIfUndefined: Self = StObject.set(x, "doElseIf", js.undefined)
    
    inline def setDoEnd(value: (/* type */ js.UndefOr[Any], /* actions */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "doEnd", js.Any.fromFunction2(value))
    
    inline def setDoEndUndefined: Self = StObject.set(x, "doEnd", js.undefined)
    
    inline def setDoEval(value: /* text */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "doEval", js.Any.fromFunction1(value))
    
    inline def setDoEvalUndefined: Self = StObject.set(x, "doEval", js.undefined)
    
    inline def setDoExec(value: (/* action */ js.UndefOr[Any], /* actions */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "doExec", js.Any.fromFunction2(value))
    
    inline def setDoExecUndefined: Self = StObject.set(x, "doExec", js.undefined)
    
    inline def setDoExpr(value: /* expr */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "doExpr", js.Any.fromFunction1(value))
    
    inline def setDoExprUndefined: Self = StObject.set(x, "doExpr", js.undefined)
    
    inline def setDoFor(value: (/* action */ js.UndefOr[Any], /* actions */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "doFor", js.Any.fromFunction2(value))
    
    inline def setDoForUndefined: Self = StObject.set(x, "doFor", js.undefined)
    
    inline def setDoIf(value: (/* action */ js.UndefOr[Any], /* actions */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "doIf", js.Any.fromFunction2(value))
    
    inline def setDoIfUndefined: Self = StObject.set(x, "doIf", js.undefined)
    
    inline def setDoSwitch(value: /* action */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "doSwitch", js.Any.fromFunction1(value))
    
    inline def setDoSwitchUndefined: Self = StObject.set(x, "doSwitch", js.undefined)
    
    inline def setDoTag(value: /* tag */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "doTag", js.Any.fromFunction1(value))
    
    inline def setDoTagUndefined: Self = StObject.set(x, "doTag", js.undefined)
    
    inline def setDoText(value: /* text */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "doText", js.Any.fromFunction1(value))
    
    inline def setDoTextUndefined: Self = StObject.set(x, "doText", js.undefined)
  }
}
