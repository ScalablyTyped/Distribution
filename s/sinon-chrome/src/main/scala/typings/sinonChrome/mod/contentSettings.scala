package typings.sinonChrome.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentSettings {
  
  @JSImport("sinon-chrome", "contentSettings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "contentSettings.cookies")
  @js.native
  def cookies: StubbedContentSetting = js.native
  @scala.inline
  def cookies_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookies")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.images")
  @js.native
  def images: StubbedContentSetting = js.native
  @scala.inline
  def images_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("images")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.javascript")
  @js.native
  def javascript: StubbedContentSetting = js.native
  @scala.inline
  def javascript_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("javascript")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.notifications")
  @js.native
  def notifications: StubbedContentSetting = js.native
  @scala.inline
  def notifications_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifications")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.plugins")
  @js.native
  def plugins: StubbedContentSetting = js.native
  @scala.inline
  def plugins_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.popups")
  @js.native
  def popups: StubbedContentSetting = js.native
  @scala.inline
  def popups_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popups")(x.asInstanceOf[js.Any])
  
  @js.native
  trait StubbedContentSetting extends StObject {
    
    // Methods
    def clear(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("clear")
    var clear_Original: SinonChromeStub = js.native
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    
    // Methods
    def getResourceIdentifiers(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("getResourceIdentifiers")
    var getResourceIdentifiers_Original: SinonChromeStub = js.native
    
    @JSName("get")
    var get_Original: SinonChromeStub = js.native
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("set")
    var set_Original: SinonChromeStub = js.native
  }
}
