package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddons.storybookAddonsStrings.centered
import typings.storybookAddons.storybookAddonsStrings.fullscreen
import typings.storybookAddons.storybookAddonsStrings.none_
import typings.storybookAddons.storybookAddonsStrings.padded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters
  extends /* key */ StringDictionary[js.Any] {
  
  var docsOnly: js.UndefOr[Boolean] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  /** The layout property defines basic styles added to the preview body where the story is rendered. If you pass 'none', no styles are applied. */
  var layout: js.UndefOr[centered | fullscreen | padded | none_] = js.native
  
  var options: js.UndefOr[OptionsParameter] = js.native
}
object Parameters {
  
  @scala.inline
  def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsOnlyUndefined: Self = StObject.set(x, "docsOnly", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setLayout(value: centered | fullscreen | padded | none_): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setOptions(value: OptionsParameter): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
