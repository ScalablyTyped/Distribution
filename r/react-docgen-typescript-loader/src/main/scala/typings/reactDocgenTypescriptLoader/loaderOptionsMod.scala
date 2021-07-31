package typings.reactDocgenTypescriptLoader

import typings.reactDocgenTypescript.parserMod.Component
import typings.reactDocgenTypescript.parserMod.ComponentNameResolver
import typings.reactDocgenTypescript.parserMod.PropFilter
import typings.reactDocgenTypescript.parserMod.PropItem
import typings.reactDocgenTypescript.reactDocgenTypescriptBooleans.`false`
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderOptionsMod {
  
  trait LoaderOptions extends StObject {
    
    /** Specify TypeScript compiler options. Can not be used with tsconfigPath. */
    var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
    
    /**
      * If a string is returned, then the component will use that name. Else it will fallback to the default logic of parser.
      */
    var componentNameResolver: js.UndefOr[ComponentNameResolver] = js.undefined
    
    /**
      * Specify the docgen collection name to use. All docgen information will
      * be collected into this global object. Set to null to disable.
      *
      * @default STORYBOOK_REACT_CLASSES
      * @see https://github.com/gongreg/react-storybook-addon-docgen
      **/
    var docgenCollectionName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Specify function to filter props.
      * If either skipPropsWithName or skipPropsWithoutDoc will be specified this will not be used.
      */
    var propFilter: js.UndefOr[PropFilter] = js.undefined
    
    /**
      * If set to true, defaultValue to props will be string.
      * @see https://github.com/styleguidist/react-docgen-typescript#parseroptions
      * */
    var savePropValueAsString: js.UndefOr[Boolean] = js.undefined
    
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
      * If set to true, string enums and unions will be converted to docgen enum format.
      * Useful if you use Storybook and want to generate knobs automatically using [addon-smart-knobs](https://github.com/storybookjs/addon-smart-knobs).
      * @see https://github.com/styleguidist/react-docgen-typescript#parseroptions
      * */
    var shouldExtractLiteralValuesFromEnum: js.UndefOr[Boolean] = js.undefined
    
    /** Avoid including docgen information for the prop or props specified. */
    var skipPropsWithName: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /** Avoid including docgen information for props without documentation. */
    var skipPropsWithoutDoc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the location of the tsconfig.json to use. Can not be used with
      * compilerOptions.
      **/
    var tsconfigPath: js.UndefOr[String] = js.undefined
    
    /**
      * Specifiy the name of the property for docgen info prop type.
      *
      * @default "type"
      */
    var typePropName: js.UndefOr[String] = js.undefined
  }
  object LoaderOptions {
    
    @scala.inline
    def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setComponentNameResolver(value: (/* exp */ Symbol, /* source */ SourceFile) => js.UndefOr[String | Null | `false`]): Self = StObject.set(x, "componentNameResolver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComponentNameResolverUndefined: Self = StObject.set(x, "componentNameResolver", js.undefined)
      
      @scala.inline
      def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocgenCollectionNameNull: Self = StObject.set(x, "docgenCollectionName", null)
      
      @scala.inline
      def setDocgenCollectionNameUndefined: Self = StObject.set(x, "docgenCollectionName", js.undefined)
      
      @scala.inline
      def setPropFilter(value: (/* props */ PropItem, /* component */ Component) => Boolean): Self = StObject.set(x, "propFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropFilterUndefined: Self = StObject.set(x, "propFilter", js.undefined)
      
      @scala.inline
      def setSavePropValueAsString(value: Boolean): Self = StObject.set(x, "savePropValueAsString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavePropValueAsStringUndefined: Self = StObject.set(x, "savePropValueAsString", js.undefined)
      
      @scala.inline
      def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDisplayNameUndefined: Self = StObject.set(x, "setDisplayName", js.undefined)
      
      @scala.inline
      def setShouldExtractLiteralValuesFromEnum(value: Boolean): Self = StObject.set(x, "shouldExtractLiteralValuesFromEnum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldExtractLiteralValuesFromEnumUndefined: Self = StObject.set(x, "shouldExtractLiteralValuesFromEnum", js.undefined)
      
      @scala.inline
      def setSkipPropsWithName(value: js.Array[String] | String): Self = StObject.set(x, "skipPropsWithName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPropsWithNameUndefined: Self = StObject.set(x, "skipPropsWithName", js.undefined)
      
      @scala.inline
      def setSkipPropsWithNameVarargs(value: String*): Self = StObject.set(x, "skipPropsWithName", js.Array(value :_*))
      
      @scala.inline
      def setSkipPropsWithoutDoc(value: Boolean): Self = StObject.set(x, "skipPropsWithoutDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPropsWithoutDocUndefined: Self = StObject.set(x, "skipPropsWithoutDoc", js.undefined)
      
      @scala.inline
      def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsconfigPathUndefined: Self = StObject.set(x, "tsconfigPath", js.undefined)
      
      @scala.inline
      def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypePropNameUndefined: Self = StObject.set(x, "typePropName", js.undefined)
    }
  }
}
