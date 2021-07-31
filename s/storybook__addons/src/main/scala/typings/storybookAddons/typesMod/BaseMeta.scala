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
    * @example
    * export default {
    *   ...
    *   title: 'Design System/Atoms/Button'
    * }
    *
    * @see [Story Hierarchy](https://storybook.js.org/docs/basics/writing-stories/#story-hierarchy)
    */
  var title: String
}
object BaseMeta {
  
  @scala.inline
  def apply[ComponentType](title: String): BaseMeta[ComponentType] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMeta[ComponentType]]
  }
  
  @scala.inline
  implicit class BaseMetaMutableBuilder[Self <: BaseMeta[?], ComponentType] (val x: Self & BaseMeta[ComponentType]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ComponentType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setSubcomponents(value: Record[String, ComponentType]): Self = StObject.set(x, "subcomponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubcomponentsUndefined: Self = StObject.set(x, "subcomponents", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
