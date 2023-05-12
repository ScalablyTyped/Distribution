package typings.storybookCsf.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryContextForEnhancers[TRenderer /* <: Renderer */, TArgs]
  extends StObject
     with StoryIdentifier {
  
  var argTypes: StrictArgTypes[TArgs]
  
  var component: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.TAny['component'] */ js.Any
  ] = js.undefined
  
  var initialArgs: TArgs
  
  var parameters: Parameters
  
  var subcomponents: js.UndefOr[
    Record[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.TAny['component'] */ js.Any
    ]
  ] = js.undefined
}
object StoryContextForEnhancers {
  
  inline def apply[TRenderer /* <: Renderer */, TArgs](
    argTypes: StrictArgTypes[TArgs],
    componentId: ComponentId,
    id: StoryId,
    initialArgs: TArgs,
    kind: ComponentTitle,
    name: StoryName,
    parameters: Parameters,
    story: StoryName,
    tags: js.Array[Tag],
    title: ComponentTitle
  ): StoryContextForEnhancers[TRenderer, TArgs] = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialArgs = initialArgs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryContextForEnhancers[TRenderer, TArgs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoryContextForEnhancers[?, ?], TRenderer /* <: Renderer */, TArgs] (val x: Self & (StoryContextForEnhancers[TRenderer, TArgs])) extends AnyVal {
    
    inline def setArgTypes(value: StrictArgTypes[TArgs]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setComponent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.TAny['component'] */ js.Any
    ): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setInitialArgs(value: TArgs): Self = StObject.set(x, "initialArgs", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setSubcomponents(
      value: Record[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.TAny['component'] */ js.Any
        ]
    ): Self = StObject.set(x, "subcomponents", value.asInstanceOf[js.Any])
    
    inline def setSubcomponentsUndefined: Self = StObject.set(x, "subcomponents", js.undefined)
  }
}
