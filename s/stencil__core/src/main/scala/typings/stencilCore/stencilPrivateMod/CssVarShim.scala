package typings.stencilCore.stencilPrivateMod

import typings.std.HTMLElement
import typings.std.HTMLLinkElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssVarShim extends StObject {
  
  def addGlobalStyle(styleEl: HTMLStyleElement): Unit
  
  def addLink(linkEl: HTMLLinkElement): js.Promise[Any]
  
  def createHostStyle(hostEl: HTMLElement, templateName: String, cssText: String, isScoped: Boolean): HTMLStyleElement
  
  def i(): js.Promise[Any]
  
  def removeHost(hostEl: HTMLElement): Unit
  
  def updateGlobal(): Unit
  
  def updateHost(hostEl: HTMLElement): Unit
}
object CssVarShim {
  
  inline def apply(
    addGlobalStyle: HTMLStyleElement => Unit,
    addLink: HTMLLinkElement => js.Promise[Any],
    createHostStyle: (HTMLElement, String, String, Boolean) => HTMLStyleElement,
    i: () => js.Promise[Any],
    removeHost: HTMLElement => Unit,
    updateGlobal: () => Unit,
    updateHost: HTMLElement => Unit
  ): CssVarShim = {
    val __obj = js.Dynamic.literal(addGlobalStyle = js.Any.fromFunction1(addGlobalStyle), addLink = js.Any.fromFunction1(addLink), createHostStyle = js.Any.fromFunction4(createHostStyle), i = js.Any.fromFunction0(i), removeHost = js.Any.fromFunction1(removeHost), updateGlobal = js.Any.fromFunction0(updateGlobal), updateHost = js.Any.fromFunction1(updateHost))
    __obj.asInstanceOf[CssVarShim]
  }
  
  extension [Self <: CssVarShim](x: Self) {
    
    inline def setAddGlobalStyle(value: HTMLStyleElement => Unit): Self = StObject.set(x, "addGlobalStyle", js.Any.fromFunction1(value))
    
    inline def setAddLink(value: HTMLLinkElement => js.Promise[Any]): Self = StObject.set(x, "addLink", js.Any.fromFunction1(value))
    
    inline def setCreateHostStyle(value: (HTMLElement, String, String, Boolean) => HTMLStyleElement): Self = StObject.set(x, "createHostStyle", js.Any.fromFunction4(value))
    
    inline def setI(value: () => js.Promise[Any]): Self = StObject.set(x, "i", js.Any.fromFunction0(value))
    
    inline def setRemoveHost(value: HTMLElement => Unit): Self = StObject.set(x, "removeHost", js.Any.fromFunction1(value))
    
    inline def setUpdateGlobal(value: () => Unit): Self = StObject.set(x, "updateGlobal", js.Any.fromFunction0(value))
    
    inline def setUpdateHost(value: HTMLElement => Unit): Self = StObject.set(x, "updateHost", js.Any.fromFunction1(value))
  }
}
