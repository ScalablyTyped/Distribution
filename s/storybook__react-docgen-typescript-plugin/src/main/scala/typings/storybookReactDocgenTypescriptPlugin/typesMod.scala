package typings.storybookReactDocgenTypescriptPlugin

import typings.storybookReactDocgenTypescriptPlugin.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait LoaderOptions extends StObject {
    
    /**
      * Specify the docgen collection name to use. All docgen information will
      * be collected into this global object. Set to null to disable.
      *
      * @default STORYBOOK_REACT_CLASSES
      * @see https://github.com/gongreg/react-storybook-addon-docgen
      **/
    var docgenCollectionName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Automatically set the component's display name. If you want to set display
      * names yourself or are using another plugin to do this, you should disable
      * this option.
      *
      * ```
      * class MyComponent extends React.Component {
      * ...
      * }
      *
      * MyComponent.displayName = "MyComponent";
      * ```
      *
      * @default true
      */
    var setDisplayName: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the name of the property for docgen info prop type.
      *
      * @default "type"
      */
    var typePropName: js.UndefOr[String] = js.undefined
  }
  object LoaderOptions {
    
    inline def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    extension [Self <: LoaderOptions](x: Self) {
      
      inline def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      inline def setDocgenCollectionNameNull: Self = StObject.set(x, "docgenCollectionName", null)
      
      inline def setDocgenCollectionNameUndefined: Self = StObject.set(x, "docgenCollectionName", js.undefined)
      
      inline def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      inline def setSetDisplayNameUndefined: Self = StObject.set(x, "setDisplayName", js.undefined)
      
      inline def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
      
      inline def setTypePropNameUndefined: Self = StObject.set(x, "typePropName", js.undefined)
    }
  }
  
  trait Module extends StObject {
    
    var _source: Value
    
    var built: js.UndefOr[Boolean] = js.undefined
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var rawRequest: js.UndefOr[String] = js.undefined
    
    var request: String
    
    var userRequest: String
  }
  object Module {
    
    inline def apply(_source: Value, request: String, userRequest: String): Module = {
      val __obj = js.Dynamic.literal(_source = _source.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], userRequest = userRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setBuilt(value: Boolean): Self = StObject.set(x, "built", value.asInstanceOf[js.Any])
      
      inline def setBuiltUndefined: Self = StObject.set(x, "built", js.undefined)
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setRawRequest(value: String): Self = StObject.set(x, "rawRequest", value.asInstanceOf[js.Any])
      
      inline def setRawRequestUndefined: Self = StObject.set(x, "rawRequest", js.undefined)
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setUserRequest(value: String): Self = StObject.set(x, "userRequest", value.asInstanceOf[js.Any])
      
      inline def set_source(value: Value): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    }
  }
}
