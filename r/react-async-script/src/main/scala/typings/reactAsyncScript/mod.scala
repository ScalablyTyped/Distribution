package typings.reactAsyncScript

import org.scalablytyped.runtime.StringDictionary
import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.ComponentType
import typings.reactAsyncScript.anon.AsyncScriptOnLoad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The Higher order Component function
    *
    * @param url
    * @param options
    */
  inline def apply(url: String): js.Function1[
    /* Component */ ComponentType[Any], 
    ComponentType[Any & (NonReactStatics[ComponentType[Any], js.Object]) & AsyncScriptOnLoad]
  ] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* Component */ ComponentType[Any], 
    ComponentType[Any & (NonReactStatics[ComponentType[Any], js.Object]) & AsyncScriptOnLoad]
  ]]
  inline def apply(url: String, options: Options): js.Function1[
    /* Component */ ComponentType[Any], 
    ComponentType[Any & (NonReactStatics[ComponentType[Any], js.Object]) & AsyncScriptOnLoad]
  ] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* Component */ ComponentType[Any], 
    ComponentType[Any & (NonReactStatics[ComponentType[Any], js.Object]) & AsyncScriptOnLoad]
  ]]
  
  @JSImport("react-async-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var callbackName: js.UndefOr[String] = js.undefined
    
    var globalName: js.UndefOr[String] = js.undefined
    
    var removeOnUnmount: js.UndefOr[Boolean] = js.undefined
    
    var scriptId: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setCallbackName(value: String): Self = StObject.set(x, "callbackName", value.asInstanceOf[js.Any])
      
      inline def setCallbackNameUndefined: Self = StObject.set(x, "callbackName", js.undefined)
      
      inline def setGlobalName(value: String): Self = StObject.set(x, "globalName", value.asInstanceOf[js.Any])
      
      inline def setGlobalNameUndefined: Self = StObject.set(x, "globalName", js.undefined)
      
      inline def setRemoveOnUnmount(value: Boolean): Self = StObject.set(x, "removeOnUnmount", value.asInstanceOf[js.Any])
      
      inline def setRemoveOnUnmountUndefined: Self = StObject.set(x, "removeOnUnmount", js.undefined)
      
      inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    }
  }
}
