package typings.storybookAddonNotes.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Parameters extends js.Object
object _Parameters {
  
  @scala.inline
  def TextParameter(text: String): _Parameters = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Parameters]
  }
  
  @scala.inline
  def MarkdownParameter(markdown: String): _Parameters = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Parameters]
  }
  
  @scala.inline
  def DisabledParameter(disable: Boolean): _Parameters = {
    val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Parameters]
  }
}
