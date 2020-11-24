package typings.storybookAddons.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMeta[ComponentType] extends js.Object {
  
  /**
    * The primary component for your story.
    *
    * Used by addons for automatic prop table generation and display of other component metadata.
    */
  var component: js.UndefOr[ComponentType] = js.native
  
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
  var subcomponents: js.UndefOr[Record[String, ComponentType]] = js.native
  
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
  var title: String = js.native
}
object BaseMeta {
  
  @scala.inline
  def apply[ComponentType](title: String): BaseMeta[ComponentType] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMeta[ComponentType]]
  }
  
  @scala.inline
  implicit class BaseMetaOps[Self <: BaseMeta[_], ComponentType] (val x: Self with BaseMeta[ComponentType]) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ComponentType): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setSubcomponents(value: Record[String, ComponentType]): Self = this.set("subcomponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubcomponents: Self = this.set("subcomponents", js.undefined)
  }
}
