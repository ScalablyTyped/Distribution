package typings.storybookAddonInfo

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeModule
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.std.ReturnType
import typings.storybookAddonInfo.anon.DefaultValue
import typings.storybookAddonInfo.anon.ParametersinfoOptions
import typings.storybookAddonInfo.storybookAddonInfoBooleans.`false`
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setDefaults(newDefaults: Options): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(newDefaults.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  @scala.inline
  def withInfo(): js.Function1[
    /* storyFn */ StoryFn[js.Any], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInfo")().asInstanceOf[js.Function1[
    /* storyFn */ StoryFn[js.Any], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ]]
  @scala.inline
  def withInfo(textOrOptions: String): js.Function1[
    /* storyFn */ StoryFn[js.Any], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInfo")(textOrOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* storyFn */ StoryFn[js.Any], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ]]
  @scala.inline
  def withInfo(textOrOptions: Options): js.Function1[
    /* storyFn */ StoryFn[js.Any], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInfo")(textOrOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* storyFn */ StoryFn[js.Any], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ]]
  @scala.inline
  def withInfo[A](story: StoryFn[A], context: StoryContext): ReturnType[DecoratorFunction[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withInfo")(story.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReturnType[DecoratorFunction[A]]]
  
  trait Options extends StObject {
    
    var TableComponent: js.UndefOr[ComponentType[TableComponentOptionProps]] = js.undefined
    
    var components: js.UndefOr[StringDictionary[ComponentType[js.Any]]] = js.undefined
    
    var excludedPropTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated "marksyConf" option has been renamed to "components"
      */
    var marksyConf: js.UndefOr[js.Object] = js.undefined
    
    var maxPropArrayLength: js.UndefOr[Double] = js.undefined
    
    var maxPropObjectKeys: js.UndefOr[Double] = js.undefined
    
    var maxPropStringLength: js.UndefOr[Double] = js.undefined
    
    var maxPropsIntoLine: js.UndefOr[Double] = js.undefined
    
    var propTables: js.UndefOr[js.Array[ComponentType[js.Any]] | `false`] = js.undefined
    
    var propTablesExclude: js.UndefOr[js.Array[ComponentType[js.Any]]] = js.undefined
    
    var source: js.UndefOr[Boolean] = js.undefined
    
    var styles: js.UndefOr[js.Object] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: StringDictionary[ComponentType[js.Any]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setExcludedPropTypes(value: js.Array[String]): Self = StObject.set(x, "excludedPropTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedPropTypesUndefined: Self = StObject.set(x, "excludedPropTypes", js.undefined)
      
      @scala.inline
      def setExcludedPropTypesVarargs(value: String*): Self = StObject.set(x, "excludedPropTypes", js.Array(value :_*))
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setMarksyConf(value: js.Object): Self = StObject.set(x, "marksyConf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksyConfUndefined: Self = StObject.set(x, "marksyConf", js.undefined)
      
      @scala.inline
      def setMaxPropArrayLength(value: Double): Self = StObject.set(x, "maxPropArrayLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropArrayLengthUndefined: Self = StObject.set(x, "maxPropArrayLength", js.undefined)
      
      @scala.inline
      def setMaxPropObjectKeys(value: Double): Self = StObject.set(x, "maxPropObjectKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropObjectKeysUndefined: Self = StObject.set(x, "maxPropObjectKeys", js.undefined)
      
      @scala.inline
      def setMaxPropStringLength(value: Double): Self = StObject.set(x, "maxPropStringLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropStringLengthUndefined: Self = StObject.set(x, "maxPropStringLength", js.undefined)
      
      @scala.inline
      def setMaxPropsIntoLine(value: Double): Self = StObject.set(x, "maxPropsIntoLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropsIntoLineUndefined: Self = StObject.set(x, "maxPropsIntoLine", js.undefined)
      
      @scala.inline
      def setPropTables(value: js.Array[ComponentType[js.Any]] | `false`): Self = StObject.set(x, "propTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropTablesExclude(value: js.Array[ComponentType[js.Any]]): Self = StObject.set(x, "propTablesExclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropTablesExcludeUndefined: Self = StObject.set(x, "propTablesExclude", js.undefined)
      
      @scala.inline
      def setPropTablesExcludeVarargs(value: ComponentType[js.Any]*): Self = StObject.set(x, "propTablesExclude", js.Array(value :_*))
      
      @scala.inline
      def setPropTablesUndefined: Self = StObject.set(x, "propTables", js.undefined)
      
      @scala.inline
      def setPropTablesVarargs(value: ComponentType[js.Any]*): Self = StObject.set(x, "propTables", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTableComponent(value: ComponentType[TableComponentOptionProps]): Self = StObject.set(x, "TableComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableComponentUndefined: Self = StObject.set(x, "TableComponent", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait TableComponentOptionProps extends StObject {
    
    var propDefinitions: js.Array[DefaultValue]
  }
  object TableComponentOptionProps {
    
    @scala.inline
    def apply(propDefinitions: js.Array[DefaultValue]): TableComponentOptionProps = {
      val __obj = js.Dynamic.literal(propDefinitions = propDefinitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableComponentOptionProps]
    }
    
    @scala.inline
    implicit class TableComponentOptionPropsMutableBuilder[Self <: TableComponentOptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPropDefinitions(value: js.Array[DefaultValue]): Self = StObject.set(x, "propDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropDefinitionsVarargs(value: DefaultValue*): Self = StObject.set(x, "propDefinitions", js.Array(value :_*))
    }
  }
  
  trait WrapStoryProps extends StObject {
    
    var context: js.UndefOr[js.Object] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var storyFn: js.UndefOr[StoryFn[js.Any]] = js.undefined
  }
  object WrapStoryProps {
    
    @scala.inline
    def apply(): WrapStoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapStoryProps]
    }
    
    @scala.inline
    implicit class WrapStoryPropsMutableBuilder[Self <: WrapStoryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStoryFn(value: StoryFn[js.Any]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => js.Any): Self = StObject.set(x, "storyFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => js.Any): Self = StObject.set(x, "storyFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStoryFnUndefined: Self = StObject.set(x, "storyFn", js.undefined)
    }
  }
  
  /* augmented module */
  object storybookAddonsAugmentingMod {
    
    trait ClientStoryApi[StoryFnReturnType] extends StObject {
      
      def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType]
      
      def addParameters(parameter: ParametersinfoOptions): StoryApi[StoryFnReturnType]
      
      def storiesOf(kind: String, module: NodeModule): StoryApi[StoryFnReturnType]
    }
    object ClientStoryApi {
      
      @scala.inline
      def apply[StoryFnReturnType](
        addDecorator: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType],
        addParameters: ParametersinfoOptions => StoryApi[StoryFnReturnType],
        storiesOf: (String, NodeModule) => StoryApi[StoryFnReturnType]
      ): ClientStoryApi[StoryFnReturnType] = {
        val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), storiesOf = js.Any.fromFunction2(storiesOf))
        __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
      }
      
      @scala.inline
      implicit class ClientStoryApiMutableBuilder[Self <: ClientStoryApi[?], StoryFnReturnType] (val x: Self & ClientStoryApi[StoryFnReturnType]) extends AnyVal {
        
        @scala.inline
        def setAddDecorator(value: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addDecorator", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAddParameters(value: ParametersinfoOptions => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addParameters", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStoriesOf(value: (String, NodeModule) => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "storiesOf", js.Any.fromFunction2(value))
      }
    }
  }
}
