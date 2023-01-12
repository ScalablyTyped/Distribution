package typings.siesta.Siesta.Test

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
trait IExtJSCore extends StObject {
  
  def Ext(): Any
  
  def clickCQ(selector: String, root: Any, callback: js.Function): Any
  
  def clickComponentQuery(selector: String, root: Any, callback: js.Function): Any
  
  def compositeQuery(selector: String, root: Any, allowEmpty: Boolean): js.Array[HTMLElement]
  
  def cq(selector: String): Any
  
  def cq1(selector: String): Any
  
  def getExt(): Any
  
  def knownBugIn(frameworkVersion: String, fn: js.Function, reason: String): Any
  
  def requireOk(args: Any*): Unit
}
object IExtJSCore {
  
  inline def apply(
    Ext: () => Any,
    clickCQ: (String, Any, js.Function) => Any,
    clickComponentQuery: (String, Any, js.Function) => Any,
    compositeQuery: (String, Any, Boolean) => js.Array[HTMLElement],
    cq: String => Any,
    cq1: String => Any,
    getExt: () => Any,
    knownBugIn: (String, js.Function, String) => Any,
    requireOk: /* repeated */ Any => Unit
  ): IExtJSCore = {
    val __obj = js.Dynamic.literal(Ext = js.Any.fromFunction0(Ext), clickCQ = js.Any.fromFunction3(clickCQ), clickComponentQuery = js.Any.fromFunction3(clickComponentQuery), compositeQuery = js.Any.fromFunction3(compositeQuery), cq = js.Any.fromFunction1(cq), cq1 = js.Any.fromFunction1(cq1), getExt = js.Any.fromFunction0(getExt), knownBugIn = js.Any.fromFunction3(knownBugIn), requireOk = js.Any.fromFunction1(requireOk))
    __obj.asInstanceOf[IExtJSCore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExtJSCore] (val x: Self) extends AnyVal {
    
    inline def setClickCQ(value: (String, Any, js.Function) => Any): Self = StObject.set(x, "clickCQ", js.Any.fromFunction3(value))
    
    inline def setClickComponentQuery(value: (String, Any, js.Function) => Any): Self = StObject.set(x, "clickComponentQuery", js.Any.fromFunction3(value))
    
    inline def setCompositeQuery(value: (String, Any, Boolean) => js.Array[HTMLElement]): Self = StObject.set(x, "compositeQuery", js.Any.fromFunction3(value))
    
    inline def setCq(value: String => Any): Self = StObject.set(x, "cq", js.Any.fromFunction1(value))
    
    inline def setCq1(value: String => Any): Self = StObject.set(x, "cq1", js.Any.fromFunction1(value))
    
    inline def setExt(value: () => Any): Self = StObject.set(x, "Ext", js.Any.fromFunction0(value))
    
    inline def setGetExt(value: () => Any): Self = StObject.set(x, "getExt", js.Any.fromFunction0(value))
    
    inline def setKnownBugIn(value: (String, js.Function, String) => Any): Self = StObject.set(x, "knownBugIn", js.Any.fromFunction3(value))
    
    inline def setRequireOk(value: /* repeated */ Any => Unit): Self = StObject.set(x, "requireOk", js.Any.fromFunction1(value))
  }
}
