package typings.siesta.Siesta.Test

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
trait IExtJSCore extends StObject {
  
  def Ext(): js.Any
  
  def clickCQ(selector: String, root: js.Any, callback: js.Function): js.Any
  
  def clickComponentQuery(selector: String, root: js.Any, callback: js.Function): js.Any
  
  def compositeQuery(selector: String, root: js.Any, allowEmpty: Boolean): js.Array[HTMLElement]
  
  def cq(selector: String): js.Any
  
  def cq1(selector: String): js.Any
  
  def getExt(): js.Any
  
  def knownBugIn(frameworkVersion: String, fn: js.Function, reason: String): js.Any
  
  def requireOk(args: js.Any*): Unit
}
object IExtJSCore {
  
  @scala.inline
  def apply(
    Ext: () => js.Any,
    clickCQ: (String, js.Any, js.Function) => js.Any,
    clickComponentQuery: (String, js.Any, js.Function) => js.Any,
    compositeQuery: (String, js.Any, Boolean) => js.Array[HTMLElement],
    cq: String => js.Any,
    cq1: String => js.Any,
    getExt: () => js.Any,
    knownBugIn: (String, js.Function, String) => js.Any,
    requireOk: /* repeated */ js.Any => Unit
  ): IExtJSCore = {
    val __obj = js.Dynamic.literal(Ext = js.Any.fromFunction0(Ext), clickCQ = js.Any.fromFunction3(clickCQ), clickComponentQuery = js.Any.fromFunction3(clickComponentQuery), compositeQuery = js.Any.fromFunction3(compositeQuery), cq = js.Any.fromFunction1(cq), cq1 = js.Any.fromFunction1(cq1), getExt = js.Any.fromFunction0(getExt), knownBugIn = js.Any.fromFunction3(knownBugIn), requireOk = js.Any.fromFunction1(requireOk))
    __obj.asInstanceOf[IExtJSCore]
  }
  
  @scala.inline
  implicit class IExtJSCoreMutableBuilder[Self <: IExtJSCore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickCQ(value: (String, js.Any, js.Function) => js.Any): Self = StObject.set(x, "clickCQ", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClickComponentQuery(value: (String, js.Any, js.Function) => js.Any): Self = StObject.set(x, "clickComponentQuery", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompositeQuery(value: (String, js.Any, Boolean) => js.Array[HTMLElement]): Self = StObject.set(x, "compositeQuery", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCq(value: String => js.Any): Self = StObject.set(x, "cq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCq1(value: String => js.Any): Self = StObject.set(x, "cq1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExt(value: () => js.Any): Self = StObject.set(x, "Ext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExt(value: () => js.Any): Self = StObject.set(x, "getExt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKnownBugIn(value: (String, js.Function, String) => js.Any): Self = StObject.set(x, "knownBugIn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRequireOk(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "requireOk", js.Any.fromFunction1(value))
  }
}
