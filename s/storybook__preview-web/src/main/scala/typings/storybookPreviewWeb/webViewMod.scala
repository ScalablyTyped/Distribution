package typings.storybookPreviewWeb

import typings.std.HTMLElement
import typings.std.ReturnType
import typings.storybookPreviewWeb.anon.Immediate
import typings.storybookPreviewWeb.anon.Message
import typings.storybookPreviewWeb.anon.TypeofsetTimeout
import typings.storybookPreviewWeb.storybookPreviewWebStrings.`sb-main-centered`
import typings.storybookPreviewWeb.storybookPreviewWebStrings.`sb-main-fullscreen`
import typings.storybookPreviewWeb.storybookPreviewWebStrings.`sb-main-padded`
import typings.storybookPreviewWeb.storybookPreviewWebStrings.centered
import typings.storybookPreviewWeb.storybookPreviewWebStrings.fullscreen
import typings.storybookPreviewWeb.storybookPreviewWebStrings.padded
import typings.storybookStore.ts39TypesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webViewMod {
  
  @js.native
  sealed trait Mode extends StObject
  @JSImport("@storybook/preview-web/dist/ts3.9/WebView", "Mode")
  @js.native
  object Mode extends StObject {
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Mode
    
    @js.native
    sealed trait MAIN
      extends StObject
         with Mode
    
    @js.native
    sealed trait NOPREVIEW
      extends StObject
         with Mode
    
    @js.native
    sealed trait PREPARING_DOCS
      extends StObject
         with Mode
    
    @js.native
    sealed trait PREPARING_STORY
      extends StObject
         with Mode
  }
  
  @JSImport("@storybook/preview-web/dist/ts3.9/WebView", "WebView")
  @js.native
  open class WebView () extends StObject {
    
    def applyLayout(): Unit = js.native
    def applyLayout(layout: Layout): Unit = js.native
    
    def checkIfLayoutExists(layout: /* keyof @storybook/preview-web.anon.Centered */ centered | fullscreen | padded): Unit = js.native
    
    var currentLayoutClass: js.UndefOr[`sb-main-centered` | `sb-main-fullscreen` | `sb-main-padded` | Null] = js.native
    
    def docsRoot(): HTMLElement = js.native
    
    def prepareForDocs(): HTMLElement = js.native
    
    def prepareForStory(story: Story[Any]): HTMLElement = js.native
    
    var preparingTimeout: ReturnType[TypeofsetTimeout] = js.native
    
    def showDocs(): Unit = js.native
    
    def showErrorDisplay(hasMessageStack: Message): Unit = js.native
    
    def showMain(): Unit = js.native
    
    def showMode(mode: Mode): Unit = js.native
    
    def showNoPreview(): Unit = js.native
    
    def showPreparingDocs(): Unit = js.native
    
    def showPreparingStory(): Unit = js.native
    def showPreparingStory(hasImmediate: Immediate): Unit = js.native
    
    def showStory(): Unit = js.native
    
    def showStoryDuringRender(): Unit = js.native
    
    def storyRoot(): HTMLElement = js.native
    
    var testing: Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.centered
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.fullscreen
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.padded
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.none
  */
  trait Layout extends StObject
}
