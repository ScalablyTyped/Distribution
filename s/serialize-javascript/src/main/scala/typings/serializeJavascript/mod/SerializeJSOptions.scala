package typings.serializeJavascript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializeJSOptions extends js.Object {
  
  /**
    * This option is to signal serialize() that we do not want serialize JavaScript function.
    * Just treat function like JSON.stringify do, but other features will work as expected.
    */
  var ignoreFunction: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is a signal to serialize() that the object being serialized does not contain any function or regexps values.
    * This enables a hot-path that allows serialization to be over 3x faster.
    * If you're serializing a lot of data, and know its pure JSON, then you can enable this option for a speed-up.
    */
  var isJSON: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is the same as the space argument that can be passed to JSON.stringify.
    * It can be used to add whitespace and indentation to the serialized output to make it more readable.
    */
  var space: js.UndefOr[String | Double] = js.native
  
  /**
    * This option is to signal serialize() that we want to do a straight conversion, without the XSS protection.
    * This options needs to be explicitly set to true. HTML characters and JavaScript line terminators will not be escaped.
    * You will have to roll your own.
    */
  var unsafe: js.UndefOr[Boolean] = js.native
}
object SerializeJSOptions {
  
  @scala.inline
  def apply(): SerializeJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeJSOptions]
  }
  
  @scala.inline
  implicit class SerializeJSOptionsOps[Self <: SerializeJSOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreFunction(value: Boolean): Self = this.set("ignoreFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFunction: Self = this.set("ignoreFunction", js.undefined)
    
    @scala.inline
    def setIsJSON(value: Boolean): Self = this.set("isJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsJSON: Self = this.set("isJSON", js.undefined)
    
    @scala.inline
    def setSpace(value: String | Double): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setUnsafe(value: Boolean): Self = this.set("unsafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe: Self = this.set("unsafe", js.undefined)
  }
}
