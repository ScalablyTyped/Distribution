package typings.reactNativeTags.mod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsProps extends js.Object {
  
  var containerStyle: js.UndefOr[ViewStyle] = js.native
  
  var createTagOnReturn: js.UndefOr[Boolean] = js.native
  
  /**
    * Triggers new tag creation
    */
  var createTagOnString: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Remove the tag when pressed
    */
  var deleteTagOnPress: js.UndefOr[Boolean] = js.native
  
  /**
    * Initial tags
    * ```javascript
    * initialTags={["dog", "cat", "chicken"]}
    * ```
    */
  var initialTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The input element's text
    */
  var initialText: js.UndefOr[String] = js.native
  
  var inputContainerStyle: js.UndefOr[TextStyle] = js.native
  
  var inputStyle: js.UndefOr[TextStyle] = js.native
  
  /**
    * The max number of tags that can be entered
    */
  var maxNumberOfTags: js.UndefOr[Double] = js.native
  
  /**
    * Fires when tags are added or removed
    * ```javascript
    * onChangeTags={(tags) => console.warn(tags)}
    * ```
    */
  var onChangeTags: js.UndefOr[js.Function1[/* tags */ js.Array[String], Unit]] = js.native
  
  /**
    * Fires when tags are pressed
    */
  var onTagPress: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* tagLabel */ String, 
      /* event */ js.Any, 
      /* deleted */ Boolean, 
      Unit
    ]
  ] = js.native
  
  /**
    * Tags cannot be modified
    */
  var readonly: js.UndefOr[Boolean] = js.native
  
  /**
    * Manage the rendering of your own Tag
    * * tag - text of the tag
    * * index - position in the array of tags
    * * onPress - Removes the tag if deleteTagsOnPress and readonly is false
    * ```javascript
    * renderTag={({ tag, index, onPress }) => (
    *   <TouchableOpacity key={`${tag}-${index}`} onPress={onPress}>
    *     <Text>{tag}</Text>
    *   </TouchableOpacity>
    * )}
    * ```
    */
  def renderTag(tag: RenderTag): Unit = js.native
  
  var style: js.UndefOr[ViewStyle] = js.native
  
  var tagContainerStyle: js.UndefOr[ViewStyle] = js.native
  
  var tagTextStyle: js.UndefOr[TextStyle] = js.native
  
  /**
    * Forward props to the textInput
    * ```javascript
    * textInputProps={{
    *   placeholder: "Any type of animal"
    * }}
    * ```
    */
  var textInputProps: js.UndefOr[TextInputProps] = js.native
}
object TagsProps {
  
  @scala.inline
  def apply(renderTag: RenderTag => Unit): TagsProps = {
    val __obj = js.Dynamic.literal(renderTag = js.Any.fromFunction1(renderTag))
    __obj.asInstanceOf[TagsProps]
  }
  
  @scala.inline
  implicit class TagsPropsOps[Self <: TagsProps] (val x: Self) extends AnyVal {
    
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
    def setRenderTag(value: RenderTag => Unit): Self = this.set("renderTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainerStyle(value: ViewStyle): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setCreateTagOnReturn(value: Boolean): Self = this.set("createTagOnReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTagOnReturn: Self = this.set("createTagOnReturn", js.undefined)
    
    @scala.inline
    def setCreateTagOnStringVarargs(value: String*): Self = this.set("createTagOnString", js.Array(value :_*))
    
    @scala.inline
    def setCreateTagOnString(value: js.Array[String]): Self = this.set("createTagOnString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTagOnString: Self = this.set("createTagOnString", js.undefined)
    
    @scala.inline
    def setDeleteTagOnPress(value: Boolean): Self = this.set("deleteTagOnPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTagOnPress: Self = this.set("deleteTagOnPress", js.undefined)
    
    @scala.inline
    def setInitialTagsVarargs(value: String*): Self = this.set("initialTags", js.Array(value :_*))
    
    @scala.inline
    def setInitialTags(value: js.Array[String]): Self = this.set("initialTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialTags: Self = this.set("initialTags", js.undefined)
    
    @scala.inline
    def setInitialText(value: String): Self = this.set("initialText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialText: Self = this.set("initialText", js.undefined)
    
    @scala.inline
    def setInputContainerStyle(value: TextStyle): Self = this.set("inputContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputContainerStyle: Self = this.set("inputContainerStyle", js.undefined)
    
    @scala.inline
    def setInputStyle(value: TextStyle): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setMaxNumberOfTags(value: Double): Self = this.set("maxNumberOfTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumberOfTags: Self = this.set("maxNumberOfTags", js.undefined)
    
    @scala.inline
    def setOnChangeTags(value: /* tags */ js.Array[String] => Unit): Self = this.set("onChangeTags", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeTags: Self = this.set("onChangeTags", js.undefined)
    
    @scala.inline
    def setOnTagPress(
      value: (/* index */ Double, /* tagLabel */ String, /* event */ js.Any, /* deleted */ Boolean) => Unit
    ): Self = this.set("onTagPress", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnTagPress: Self = this.set("onTagPress", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTagContainerStyle(value: ViewStyle): Self = this.set("tagContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagContainerStyle: Self = this.set("tagContainerStyle", js.undefined)
    
    @scala.inline
    def setTagTextStyle(value: TextStyle): Self = this.set("tagTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagTextStyle: Self = this.set("tagTextStyle", js.undefined)
    
    @scala.inline
    def setTextInputProps(value: TextInputProps): Self = this.set("textInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInputProps: Self = this.set("textInputProps", js.undefined)
  }
}
