package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IXTemplateCompiler extends IXTemplateParser {
  /** [Method] This method is called to process lt tpl case action gt
  		* @param action Object
  		*/
  @JSName("doCase")
  var doCase_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl elseif action gt
  		* @param action Object
  		* @param actions Object
  		*/
  @JSName("doElseIf")
  var doElseIf_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl gt
  		* @param type Object
  		* @param actions Object
  		*/
  @JSName("doEnd")
  var doEnd_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] This method is called to process text
  		* @param text Object
  		*/
  @JSName("doEval")
  var doEval_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl exec action gt
  		* @param action Object
  		* @param actions Object
  		*/
  @JSName("doExec")
  var doExec_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] This method is called to process expressions like  expr
  		* @param expr Object
  		*/
  @JSName("doExpr")
  var doExpr_IXTemplateCompiler: js.UndefOr[js.Function1[/* expr */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl for action gt
  		* @param action Object
  		* @param actions Object
  		*/
  @JSName("doFor")
  var doFor_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl if action gt
  		* @param action Object
  		* @param actions Object
  		*/
  @JSName("doIf")
  var doIf_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl switch action gt
  		* @param action Object
  		*/
  @JSName("doSwitch")
  var doSwitch_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method is called to process simple tags like tag
  		* @param tag Object
  		*/
  @JSName("doTag")
  var doTag_IXTemplateCompiler: js.UndefOr[js.Function1[/* tag */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method is called to process a piece of raw text from the tpl
  		* @param text Object
  		*/
  @JSName("doText")
  var doText_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

