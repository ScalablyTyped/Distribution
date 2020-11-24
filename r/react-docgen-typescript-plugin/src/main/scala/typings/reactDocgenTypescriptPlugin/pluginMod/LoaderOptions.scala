package typings.reactDocgenTypescriptPlugin.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderOptions extends js.Object {
  
  /**
    * Specify the docgen collection name to use. All docgen information will
    * be collected into this global object. Set to null to disable.
    *
    * @default STORYBOOK_REACT_CLASSES
    * @see https://github.com/gongreg/react-storybook-addon-docgen
    **/
  var docgenCollectionName: js.UndefOr[String | Null] = js.native
  
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
  
  /**
    * Specify the name of the property for docgen info prop type.
    *
    * @default "type"
    */
  var typePropName: js.UndefOr[String] = js.native
}
object LoaderOptions {
  
  @scala.inline
  def apply(): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptions]
  }
  
  @scala.inline
  implicit class LoaderOptionsOps[Self <: LoaderOptions] (val x: Self) extends AnyVal {
    
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
    def setDocgenCollectionName(value: String): Self = this.set("docgenCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocgenCollectionName: Self = this.set("docgenCollectionName", js.undefined)
    
    @scala.inline
    def setDocgenCollectionNameNull: Self = this.set("docgenCollectionName", null)
    
    @scala.inline
    def setSetDisplayName(value: Boolean): Self = this.set("setDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDisplayName: Self = this.set("setDisplayName", js.undefined)
    
    @scala.inline
    def setTypePropName(value: String): Self = this.set("typePropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypePropName: Self = this.set("typePropName", js.undefined)
  }
}
