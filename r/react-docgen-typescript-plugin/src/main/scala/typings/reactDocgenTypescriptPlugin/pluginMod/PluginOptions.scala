package typings.reactDocgenTypescriptPlugin.pluginMod

import typings.reactDocgenTypescript.parserMod.Component
import typings.reactDocgenTypescript.parserMod.ComponentNameResolver
import typings.reactDocgenTypescript.parserMod.PropFilter
import typings.reactDocgenTypescript.parserMod.PropItem
import typings.reactDocgenTypescript.parserMod.StaticPropFilter
import typings.reactDocgenTypescript.reactDocgenTypescriptBooleans.`false`
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-docgen-typescript.react-docgen-typescript.ParserOptions & react-docgen-typescript-plugin.react-docgen-typescript-plugin/dist/plugin.LoaderOptions & react-docgen-typescript-plugin.react-docgen-typescript-plugin/dist/plugin.TypescriptOptions & {  exclude :std.Array<string> | undefined,   include :std.Array<string> | undefined} */
@js.native
trait PluginOptions extends js.Object {
  
  /** Specify TypeScript compiler options. Can not be used with tsconfigPath. */
  var compilerOptions: js.UndefOr[CompilerOptions] = js.native
  
  var componentNameResolver: js.UndefOr[ComponentNameResolver] = js.native
  
  /**
    * Specify the docgen collection name to use. All docgen information will
    * be collected into this global object. Set to null to disable.
    *
    * @default STORYBOOK_REACT_CLASSES
    * @see https://github.com/gongreg/react-storybook-addon-docgen
    **/
  var docgenCollectionName: js.UndefOr[String | Null] = js.native
  
  /** Glob patterns to ignore */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /** Glob patterns to include. defaults to ts|tsx */
  var include: js.UndefOr[js.Array[String]] = js.native
  
  var propFilter: js.UndefOr[StaticPropFilter | PropFilter] = js.native
  
  var savePropValueAsString: js.UndefOr[Boolean] = js.native
  
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
  var setDisplayName: js.UndefOr[Boolean] = js.native
  
  var shouldExtractLiteralValuesFromEnum: js.UndefOr[Boolean] = js.native
  
  var shouldExtractValuesFromUnion: js.UndefOr[Boolean] = js.native
  
  var shouldRemoveUndefinedFromOptional: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the location of the tsconfig.json to use. Can not be used with
    * compilerOptions.
    **/
  var tsconfigPath: js.UndefOr[String] = js.native
  
  /**
    * Specify the name of the property for docgen info prop type.
    *
    * @default "type"
    */
  var typePropName: js.UndefOr[String] = js.native
}
object PluginOptions {
  
  @scala.inline
  def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    
    @scala.inline
    def setComponentNameResolver(value: (/* exp */ Symbol, /* source */ SourceFile) => js.UndefOr[String | Null | `false`]): Self = this.set("componentNameResolver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComponentNameResolver: Self = this.set("componentNameResolver", js.undefined)
    
    @scala.inline
    def setDocgenCollectionName(value: String): Self = this.set("docgenCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocgenCollectionName: Self = this.set("docgenCollectionName", js.undefined)
    
    @scala.inline
    def setDocgenCollectionNameNull: Self = this.set("docgenCollectionName", null)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setPropFilterFunction2(value: (/* props */ PropItem, /* component */ Component) => Boolean): Self = this.set("propFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPropFilter(value: StaticPropFilter | PropFilter): Self = this.set("propFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropFilter: Self = this.set("propFilter", js.undefined)
    
    @scala.inline
    def setSavePropValueAsString(value: Boolean): Self = this.set("savePropValueAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavePropValueAsString: Self = this.set("savePropValueAsString", js.undefined)
    
    @scala.inline
    def setSetDisplayName(value: Boolean): Self = this.set("setDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDisplayName: Self = this.set("setDisplayName", js.undefined)
    
    @scala.inline
    def setShouldExtractLiteralValuesFromEnum(value: Boolean): Self = this.set("shouldExtractLiteralValuesFromEnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldExtractLiteralValuesFromEnum: Self = this.set("shouldExtractLiteralValuesFromEnum", js.undefined)
    
    @scala.inline
    def setShouldExtractValuesFromUnion(value: Boolean): Self = this.set("shouldExtractValuesFromUnion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldExtractValuesFromUnion: Self = this.set("shouldExtractValuesFromUnion", js.undefined)
    
    @scala.inline
    def setShouldRemoveUndefinedFromOptional(value: Boolean): Self = this.set("shouldRemoveUndefinedFromOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRemoveUndefinedFromOptional: Self = this.set("shouldRemoveUndefinedFromOptional", js.undefined)
    
    @scala.inline
    def setTsconfigPath(value: String): Self = this.set("tsconfigPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTsconfigPath: Self = this.set("tsconfigPath", js.undefined)
    
    @scala.inline
    def setTypePropName(value: String): Self = this.set("typePropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypePropName: Self = this.set("typePropName", js.undefined)
  }
}
