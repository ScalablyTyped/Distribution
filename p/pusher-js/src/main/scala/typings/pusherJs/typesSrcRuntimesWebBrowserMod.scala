package typings.pusherJs

import typings.pusherJs.typesSrcRuntimesWebDomJsonpRequestMod.default
import typings.pusherJs.typesSrcRuntimesWebDomScriptReceiverFactoryMod.ScriptReceiverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcRuntimesWebBrowserMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractRuntime * / any */ @js.native
  trait Browser extends StObject {
    
    var DependenciesReceivers: ScriptReceiverFactory = js.native
    
    var ScriptReceivers: ScriptReceiverFactory = js.native
    
    var auth_callbacks: Any = js.native
    
    def createJSONPRequest(url: String, data: Any): default = js.native
    
    def createMicrosoftXHR(): Any = js.native
    
    def createScriptRequest(src: String): typings.pusherJs.typesSrcRuntimesWebDomScriptRequestMod.default = js.native
    
    def createXMLHttpRequest(): Any = js.native
    
    def getDocument(): Any = js.native
    
    def isXDRSupported(): Boolean = js.native
    def isXDRSupported(useTLS: Boolean): Boolean = js.native
    
    var nextAuthCallbackID: Double = js.native
    
    def onDocumentBody(callback: js.Function): Any = js.native
  }
}
