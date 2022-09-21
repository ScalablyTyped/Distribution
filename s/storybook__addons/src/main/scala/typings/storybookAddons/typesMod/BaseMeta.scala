package typings.storybookAddons.typesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMeta[ComponentType] extends StObject {
  
  /**
    * The primary component for your story.
    *
    * Used by addons for automatic prop table generation and display of other component metadata.
    */
  var component: js.UndefOr[ComponentType] = js.undefined
  
  /**
    * Manually set the id of a story, which in particular is useful if you want to rename stories without breaking permalinks.
    *
    * Storybook will prioritize the id over the title for ID generation, if provided, and will prioritize the story.storyName over the export key for display.
    *
    * @see [Sidebar and URLs](https://storybook.js.org/docs/react/configure/sidebar-and-urls#permalinking-to-stories)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Auxiliary subcomponents that are part of the stories.
    *
    * Used by addons for automatic prop table generation and display of other component metadata.
    *
    * @example
    * import { Button, ButtonGroup } from './components';
    *
    * export default {
    *   ...
    *   subcomponents: { Button, ButtonGroup }
    * }
    *
    * By defining them each component will have its tab in the args table.
    */
  var subcomponents: js.UndefOr[Record[String, ComponentType]] = js.undefined
  
  /**
    * Title of the story which will be presented in the navigation. **Should be unique.**
    *
    * Stories can be organized in a nested structure using "/" as a separator.
    *
    * Since CSF 3.0 this property is optional.
    *
    * @example
    * export default {
    *   ...
    *   title: 'Design System/Atoms/Button'
    * }
    *
    * @see [Story Hierarchy](https://storybook.js.org/docs/basics/writing-stories/#story-hierarchy)
    */
  var title: js.UndefOr[String] = js.undefined
}
object BaseMeta {
  
  inline def apply[ComponentType](): BaseMeta[ComponentType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMeta[ComponentType]]
  }
  
  extension [Self <: BaseMeta[?], ComponentType](x: Self & BaseMeta[ComponentType]) {
    
    inline def setComponent(value: ComponentType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSubcomponents(value: Record[String, ComponentType]): Self = StObject.set(x, "subcomponents", value.asInstanceOf[js.Any])
    
    inline def setSubcomponentsUndefined: Self = StObject.set(x, "subcomponents", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
